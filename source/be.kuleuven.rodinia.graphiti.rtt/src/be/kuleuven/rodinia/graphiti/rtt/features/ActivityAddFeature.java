package be.kuleuven.rodinia.graphiti.rtt.features;

import org.eclipse.graphiti.features.IDirectEditingInfo;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.impl.AbstractAddShapeFeature;
import org.eclipse.graphiti.mm.algorithms.Ellipse;
import org.eclipse.graphiti.mm.algorithms.Polyline;
import org.eclipse.graphiti.mm.algorithms.RoundedRectangle;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.algorithms.styles.Orientation;
import org.eclipse.graphiti.mm.pictograms.BoxRelativeAnchor;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.services.IPeCreateService;

import be.kueleuven.rodinia.model.rtt.Activity;
import be.kuleuven.rodinia.graphiti.rtt.util.StyleUtil;

public class ActivityAddFeature extends AbstractAddShapeFeature{
	
	public ActivityAddFeature(IFeatureProvider fp) {
		super(fp);
	}

	@Override
	public boolean canAdd(IAddContext context) {
		if (context.getNewObject() instanceof Activity) {
			if (context.getTargetContainer() instanceof Diagram) {
				return true;
			}
		}
		return false;
	}

	@Override
	public PictogramElement add(IAddContext context) {
        Activity addedClass = (Activity) context.getNewObject();
        Diagram targetDiagram = (Diagram) context.getTargetContainer();
 
        // CONTAINER SHAPE WITH ROUNDED RECTANGLE
        IPeCreateService peCreateService = Graphiti.getPeCreateService();
        ContainerShape containerShape =
             peCreateService.createContainerShape(targetDiagram, true);
 
        // define a default size for the shape
        int width = 100;
        int height = 50;
        IGaService gaService = Graphiti.getGaService();
        RoundedRectangle roundedRectangle; // need to access it later
 
        {
            // create and set graphics algorithm
            roundedRectangle =
                gaService.createRoundedRectangle(containerShape, 5, 5);
            roundedRectangle.setStyle(StyleUtil.getStyleForActivity(getDiagram()));
            roundedRectangle.setLineWidth(2);
            gaService.setLocationAndSize(roundedRectangle,
                context.getX(), context.getY(), width, height);
 
            // if added Class has no resource we add it to the resource
            // of the diagram
            // in a real scenario the business model would have its own resource
            if (addedClass.eResource() == null) {
                     getDiagram().eResource().getContents().add(addedClass);
            }
            // create link and wire it
            link(containerShape, addedClass);
        }
 
        // SHAPE WITH LINE
        {
            // create shape for line
            Shape shape = peCreateService.createShape(containerShape, false);
 
            // create and set graphics algorithm
            Polyline polyline =
                gaService.createPolyline(shape, new int[] { 0, 20, width, 20 });
            polyline.setStyle(StyleUtil.getStyleForActivity(getDiagram()));
            polyline.setLineWidth(2);
        }
 
        // SHAPE WITH TEXT
        {
            // create shape for text
            Shape shape = peCreateService.createShape(containerShape, false);
 
            // create and set text graphics algorithm
            Text text = gaService.createText(shape, addedClass.getName());
            text.setStyle(StyleUtil.getStyleForText(getDiagram()));
            text.setHorizontalAlignment(Orientation.ALIGNMENT_CENTER );
            // vertical alignment has as default value "center"
            text.setFont(gaService.manageDefaultFont(getDiagram(), false, true));
            gaService.setLocationAndSize(text, 0, 0, width, 20);
 
            // create link and wire it
            link(shape, addedClass);
        }
        
        {
            // create shape for text
            Shape shape = peCreateService.createShape(containerShape, false);
        	
	        // create an box relative anchor at middle-right
	        final BoxRelativeAnchor boxAnchor =
	             peCreateService.createBoxRelativeAnchor(shape);
	       
	        boxAnchor.setRelativeWidth(1.0);
	        boxAnchor.setRelativeHeight(0.38); //use golden section
	        boxAnchor.setUseAnchorLocationAsConnectionEndpoint(true);
	        boxAnchor.setReferencedGraphicsAlgorithm(roundedRectangle);
	
	        // assign a rectangle graphics algorithm for the box relative anchor
	        // note, that the rectangle is inside the border of the rectangle shape
	        final Ellipse ellipse = gaService.createEllipse(shape);     
	        ellipse.setStyle(StyleUtil.getStyleForActivity(getDiagram()));
	        ellipse.setLineWidth(2);
	        // anchor is located on the right border of the visible rectangle
	        // and touches the border of the invisible rectangle
	        gaService.setLocationAndSize(ellipse, -12, -15, 12, 12);
	        link(boxAnchor, addedClass);
        }
        
        layoutPictogramElement(containerShape);
        
        final IDirectEditingInfo directEditingInfo = getFeatureProvider().getDirectEditingInfo();
        // set container shape for direct editing after object creation
        directEditingInfo.setMainPictogramElement(containerShape);
 
        return containerShape;
	}

}

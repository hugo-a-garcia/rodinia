package be.kuleuven.rodinia.graphiti.rtt.features;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.impl.AbstractAddShapeFeature;
import org.eclipse.graphiti.mm.algorithms.RoundedRectangle;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.algorithms.styles.Orientation;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
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
			if (context.getTargetContainer() instanceof ContainerShape) {
				return true;
			}
		}
		return false;
	}

	@Override
	public PictogramElement add(IAddContext context) {
		
		final int width = context.getWidth() <= 0 ? 100 : context.getWidth();
	    //final int height = context.getHeight() <= 0 ? 50 : context.getHeight();
	        
	 
		final Activity addedClass = (Activity) context.getNewObject();
        final ContainerShape targetDiagram =  context.getTargetContainer();
  
        // CONTAINER SHAPE WITH ROUNDED RECTANGLE
        final IPeCreateService peCreateService = Graphiti.getPeCreateService();
        final ContainerShape containerShape =
            peCreateService.createContainerShape(targetDiagram, true);

        IGaService gaService = Graphiti.getGaService();
        RoundedRectangle roundedRectangle; // need to access it later       
 
        {
            // create and set graphics algorithm
            roundedRectangle = gaService.createRoundedRectangle(containerShape, 5, 5);
            roundedRectangle.setStyle(StyleUtil.getStyleForActivity(getDiagram()));
            roundedRectangle.setLineWidth(2);
            roundedRectangle.setTransparency(0.5);
			//final Object target = getBusinessObjectForPictogramElement(context.getTargetContainer());
            
            gaService.setLocationAndSize(roundedRectangle,10, 19, width-20, 24);
            // if added Class has no resource we add it to the resource
            // of the diagram
            // in a real scenario the business model would have its own resource
            if (addedClass.eResource() == null) {
                     getDiagram().eResource().getContents().add(addedClass);
            }
            
            // create link and wire it
            link(containerShape, addedClass);
        }
        
        // SHAPE WITH TEXT
        {
            // create shape for text
            Shape shape = peCreateService.createShape(containerShape, false);
 
            // create and set text graphics algorithm
            Text text = gaService.createText(shape, addedClass.getName());
            text.setStyle(StyleUtil.getStyleForText(getDiagram()));
            // vertical alignment has as default value "center"
            gaService.setLocationAndSize(text, 5, 0, width-22, 20);
            text.setHorizontalAlignment(Orientation.ALIGNMENT_LEFT );
 
            // create link and wire it
            link(shape, addedClass);
        }
        
        layoutPictogramElement(containerShape);
        
        //final IDirectEditingInfo directEditingInfo = getFeatureProvider().getDirectEditingInfo();
        // set container shape for direct editing after object creation
        //directEditingInfo.setMainPictogramElement(containerShape);
        
        return containerShape;
	}

}

package be.kuleuven.rodinia.graphiti.rtt.features;

import org.eclipse.graphiti.features.IDirectEditingInfo;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.impl.AbstractAddShapeFeature;
import org.eclipse.graphiti.mm.algorithms.Polyline;
import org.eclipse.graphiti.mm.algorithms.Rectangle;
import org.eclipse.graphiti.mm.algorithms.RoundedRectangle;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.algorithms.styles.Font;
import org.eclipse.graphiti.mm.algorithms.styles.Orientation;
import org.eclipse.graphiti.mm.pictograms.ChopboxAnchor;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.services.IPeCreateService;

import be.kueleuven.rodinia.model.rtt.TaskContext;
import be.kuleuven.rodinia.graphiti.rtt.util.StyleUtil;

public class TaskContextAddFeature extends AbstractAddShapeFeature {

	public TaskContextAddFeature(IFeatureProvider fp) {
		super(fp);
	}

	@Override
	public boolean canAdd(IAddContext context) {
		if (context.getNewObject() instanceof TaskContext) {
			if (context.getTargetContainer() instanceof Diagram) {
				return true;
			}
		}
		return false;
	}

	@Override
	public PictogramElement add(IAddContext context) {
        final TaskContext addedClass = (TaskContext) context.getNewObject();
        final Diagram targetDiagram = (Diagram) context.getTargetContainer();
  
        // CONTAINER SHAPE WITH ROUNDED RECTANGLE
        final IPeCreateService peCreateService = Graphiti.getPeCreateService();
        final ContainerShape containerShape =
            peCreateService.createContainerShape(targetDiagram, true);
  
        // check whether the context has a size (e.g. from a create feature)
        // otherwise define a default size for the shape
        final int width = context.getWidth() <= 0 ? 100 : context.getWidth();
        final int height = context.getHeight() <= 0 ? 50 : context.getHeight();
        
        @SuppressWarnings("unused")
		final int intWidth = width - 10;
        @SuppressWarnings("unused")
		final int intX = context.getX() + 5;

        IGaService gaService = Graphiti.getGaService();
        RoundedRectangle roundedRectangle; // need to access it later
        Rectangle bla;
        
        
        //the invisble shape were everything is in
        {
        	bla = gaService.createPlainRectangle(containerShape);
            bla.setStyle(StyleUtil.getStyleForTaskContext(getDiagram()));
            bla.setLineWidth(1);
            bla.setTransparency(1.0);
            gaService.setLocationAndSize(bla,
                context.getX(), context.getY(), width, height);
            bla.setLineVisible(false);
            
            link(containerShape, addedClass);
        }
 
        {
        	Shape shape = peCreateService.createShape(containerShape, false);
        	
            // create and set graphics algorithm
            roundedRectangle =
                gaService.createRoundedRectangle(shape, 5, 5);
            roundedRectangle.setStyle(StyleUtil.getStyleForTaskContext(getDiagram()));
            roundedRectangle.setLineWidth(2);
            gaService.setLocationAndSize(roundedRectangle,
                10, 0, width-20, height-0);
            roundedRectangle.setLineVisible(true);
 
            // if added Class has no resource we add it to the resource
            // of the diagram
            // in a real scenario the business model would have its own resource
            if (addedClass.eResource() == null) {
                     getDiagram().eResource().getContents().add(addedClass);
            }
            // create link and wire it
            link(shape, addedClass);
        }
 
        // SHAPE WITH LINE
        {
            // create shape for line
            Shape shape = peCreateService.createShape(containerShape, false);
 
            // create and set graphics algorithm
            Polyline polyline =
                gaService.createPolyline(shape, new int[] { 10, 20, width, 20 });
            polyline.setStyle(StyleUtil.getStyleForTaskContext(getDiagram()));
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
            gaService.setLocationAndSize(text, 8, 0, width-16, 20);
 
            // create link and wire it
            link(shape, addedClass);
        }
        
        
        // SHAPE WITH Rectangle endport box left
        {
            // create shape for text
            Shape shape = peCreateService.createContainerShape(containerShape, false);
            
            // create and set text graphics algorithm
            Rectangle rectangle = gaService.createPlainRectangle(shape);
            rectangle.setStyle(StyleUtil.getStyleForTaskContext(getDiagram()));
            rectangle.setLineWidth(2);
            rectangle.setTransparency(1.0);
            gaService.setLocationAndSize(rectangle, 10, 20, ((width/2)-(width/10)) + 10, height-26);
            
            // create link and wire it
            ChopboxAnchor boxAnchor = peCreateService.createChopboxAnchor(shape);
            boxAnchor.setReferencedGraphicsAlgorithm(rectangle);
            link(shape, addedClass);
        }
        
        // SHAPE WITH Rectangle endport box right
        {
            // create shape for text
            Shape shape = peCreateService.createContainerShape(containerShape, false);
 
            // create and set text graphics algorithm
            Rectangle rectangle2 = gaService.createPlainRectangle(shape);
            rectangle2.setStyle(StyleUtil.getStyleForTaskContext(getDiagram()));
            rectangle2.setLineWidth(2);
            rectangle2.setTransparency(1.0);
            gaService.setLocationAndSize(rectangle2, (width/2) + 10 , 20, ((width/2)-(width/10)) - 10, height-26);
            
            // create link and wire it
            ChopboxAnchor boxAnchor = peCreateService.createChopboxAnchor(shape);
            boxAnchor.setReferencedGraphicsAlgorithm(rectangle2);
            link(shape, addedClass);
        }
        
        // SHAPE WITH Rectangle activity box
        {
            // create shape for rectangel
            Shape shape = peCreateService.createContainerShape(containerShape, false);
            
            // create and set text graphics algorithm
            Rectangle rectangle3 = gaService.createPlainRectangle(shape);
            rectangle3.setStyle(StyleUtil.getStyleForTaskContext(getDiagram()));
            rectangle3.setLineWidth(2);
            rectangle3.setTransparency(0.0);
            gaService.setLocationAndSize(rectangle3, 10 , 19, width-20, 25);
            
            // create link and wire it
            ChopboxAnchor boxAnchor = peCreateService.createChopboxAnchor(shape);
            boxAnchor.setReferencedGraphicsAlgorithm(rectangle3);
            
            Text text = gaService.createText(rectangle3, "act");
            text.setStyle(StyleUtil.getStyleForTextTip(getDiagram()));
            text.setHorizontalAlignment(Orientation.ALIGNMENT_RIGHT );
            // vertical alignment has as default value "center"
            text.setFont(gaService.manageDefaultFont(getDiagram(), false, true));
            gaService.setLocationAndSize(text, 10, 0, width-35, 20);
            
            link(shape, addedClass);
        }
        
     // SHAPE WITH Rectangle values box
        {
            // create shape for rectangel
            Shape shape = peCreateService.createContainerShape(containerShape, false);
            
            // create and set text graphics algorithm
            Rectangle rectangle3 = gaService.createPlainRectangle(shape);
            rectangle3.setStyle(StyleUtil.getStyleForTaskContext(getDiagram()));
            rectangle3.setLineWidth(2);
            rectangle3.setTransparency(0.0);
            gaService.setLocationAndSize(rectangle3, 10 , 42, width-20, 25);
            
            // create link and wire it
            ChopboxAnchor boxAnchor = peCreateService.createChopboxAnchor(shape);
            boxAnchor.setReferencedGraphicsAlgorithm(rectangle3);
            
            Text text = gaService.createText(rectangle3, "vals");
            text.setStyle(StyleUtil.getStyleForTextTip(getDiagram()));
            text.setHorizontalAlignment(Orientation.ALIGNMENT_RIGHT );
            // vertical alignment has as default value "center"
            text.setFont(gaService.manageDefaultFont(getDiagram(), false, true));
            gaService.setLocationAndSize(text, 10, 0, width-35, 20);
            
            link(shape, addedClass);
        }
        
        // SHAPE WITH Rectangle values box
        {
            // create shape for rectangel
            Shape shape = peCreateService.createContainerShape(containerShape, false);
            
            // create and set text graphics algorithm
            Rectangle rectangle3 = gaService.createPlainRectangle(shape);
            rectangle3.setStyle(StyleUtil.getStyleForTaskContext(getDiagram()));
            rectangle3.setLineWidth(2);
            rectangle3.setTransparency(0.0);
            gaService.setLocationAndSize(rectangle3, 10 , 67, width-20, 25);
            
            // create link and wire it
            ChopboxAnchor boxAnchor = peCreateService.createChopboxAnchor(shape);
            boxAnchor.setReferencedGraphicsAlgorithm(rectangle3);
            
            Text text = gaService.createText(rectangle3, "ops");
            text.setStyle(StyleUtil.getStyleForTextTip(getDiagram()));
            text.setHorizontalAlignment(Orientation.ALIGNMENT_RIGHT );
            // vertical alignment has as default value "center"
            text.setFont(gaService.manageDefaultFont(getDiagram(), false, true));
            gaService.setLocationAndSize(text, 10, 0, width-35, 20);
            
            link(shape, addedClass);
        }
        
        final IDirectEditingInfo directEditingInfo = getFeatureProvider().getDirectEditingInfo();
        // set container shape for direct editing after object creation
        directEditingInfo.setMainPictogramElement(containerShape);
        
        layoutPictogramElement(containerShape);
        return containerShape;
	}

}

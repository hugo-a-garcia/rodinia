package be.kuleuven.rodinia.graphiti.rtt.features;

import org.eclipse.graphiti.features.IDirectEditingInfo;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.impl.AbstractAddShapeFeature;
import org.eclipse.graphiti.mm.algorithms.Polyline;
import org.eclipse.graphiti.mm.algorithms.Rectangle;
import org.eclipse.graphiti.mm.algorithms.RoundedRectangle;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.algorithms.styles.Orientation;
import org.eclipse.graphiti.mm.pictograms.ChopboxAnchor;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.services.IPeCreateService;

import be.kueleuven.rodinia.model.rtt.Activity;
import be.kueleuven.rodinia.model.rtt.TaskContext;
import be.kuleuven.rodinia.graphiti.rtt.util.StyleUtil;

public class TaskContextAddFeature extends AbstractAddShapeFeature {
	
	private static int TASK_CONTEXT_DEFAULT_HEIGHT = 160;
	private static int TASK_CONTEXT_DEFAULT_WIDTH = 160;

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
        final TaskContext taskContext = (TaskContext) context.getNewObject();
        final Diagram targetDiagram = (Diagram) context.getTargetContainer();
  
        // CONTAINER SHAPE WITH ROUNDED RECTANGLE
        final IPeCreateService peCreateService = Graphiti.getPeCreateService();
        final ContainerShape taskContextContainerShape =
            peCreateService.createContainerShape(targetDiagram, true);
  
        // check whether the context has a size (e.g. from a create feature)
        // otherwise define a default size for the shape
        final int taskContextWidth = context.getWidth() <= 0 ? TASK_CONTEXT_DEFAULT_WIDTH : context.getWidth();
        final int taskContextHeight = context.getHeight() <= 0 ? TASK_CONTEXT_DEFAULT_HEIGHT : context.getHeight();

        IGaService gaService = Graphiti.getGaService();
        RoundedRectangle roundedRectangle; // need to access it later
        Rectangle invisibleRectangle;
        
        
        //the invisble shape were everything is in
        {
        	invisibleRectangle = gaService.createPlainRectangle(taskContextContainerShape);
            invisibleRectangle.setStyle(StyleUtil.getStyleForTaskContext(getDiagram()));
            invisibleRectangle.setLineWidth(1);
            invisibleRectangle.setTransparency(1.0);
            gaService.setLocationAndSize(invisibleRectangle,
                context.getX(), context.getY(), taskContextWidth, taskContextHeight);
            invisibleRectangle.setLineVisible(false);
            
            link(taskContextContainerShape, taskContext);
        }
 
        {
        	Shape shape = peCreateService.createShape(taskContextContainerShape, false);
        	
            // create and set graphics algorithm
            roundedRectangle =
                gaService.createRoundedRectangle(shape, 10, 10);
            roundedRectangle.setStyle(StyleUtil.getStyleForTaskContext(getDiagram()));
            roundedRectangle.setLineWidth(2);
            gaService.setLocationAndSize(roundedRectangle,
                10, 0, taskContextWidth-20, taskContextHeight-0);
            roundedRectangle.setLineVisible(true);
 
            // if added Class has no resource we add it to the resource
            // of the diagram
            // in a real scenario the business model would have its own resource
            if (taskContext.eResource() == null) {
                     getDiagram().eResource().getContents().add(taskContext);
            }
            // create link and wire it
            link(shape, taskContext);
        }
 
        // SHAPE WITH LINE
        {
            // create shape for line
            Shape shape = peCreateService.createShape(taskContextContainerShape, false);
 
            // create and set graphics algorithm
            Polyline polyline =
                gaService.createPolyline(shape, new int[] { 10, 20, taskContextWidth, 20 });
            polyline.setStyle(StyleUtil.getStyleForTaskContext(getDiagram()));
            polyline.setLineWidth(2);
        }
 
        // SHAPE WITH TEXT
        {
            // create shape for text
            Shape shape = peCreateService.createShape(taskContextContainerShape, false);
 
            // create and set text graphics algorithm
            Text text = gaService.createText(shape, taskContext.getName());
            text.setStyle(StyleUtil.getStyleForText(getDiagram()));
            text.setHorizontalAlignment(Orientation.ALIGNMENT_CENTER );
            // vertical alignment has as default value "center"
            text.setFont(gaService.manageDefaultFont(getDiagram(), false, true));
            gaService.setLocationAndSize(text, 8, 0, taskContextWidth-16, 20);
 
            // create link and wire it
            link(shape, taskContext);
        }
        
        
        // SHAPE WITH Rectangle endport box left
        {
            // create shape for text
            Shape shape = peCreateService.createContainerShape(taskContextContainerShape, false);
            
            // create and set text graphics algorithm
            Rectangle rectangle = gaService.createPlainRectangle(shape);
            rectangle.setStyle(StyleUtil.getStyleForTaskContext(getDiagram()));
            rectangle.setLineWidth(2);
            rectangle.setTransparency(1.0);
            gaService.setLocationAndSize(rectangle, 10, 20, ((taskContextWidth/2)-(taskContextWidth/10)) + 10, taskContextHeight-26);
            
            // create link and wire it
            ChopboxAnchor boxAnchor = peCreateService.createChopboxAnchor(shape);
            boxAnchor.setReferencedGraphicsAlgorithm(rectangle);
            link(shape, taskContext);
        }
        
        // SHAPE WITH Rectangle endport box right
        {
            // create shape for text
            Shape shape = peCreateService.createContainerShape(taskContextContainerShape, false);
 
            // create and set text graphics algorithm
            Rectangle rectangle2 = gaService.createPlainRectangle(shape);
            rectangle2.setStyle(StyleUtil.getStyleForTaskContext(getDiagram()));
            rectangle2.setLineWidth(2);
            rectangle2.setTransparency(1.0);
            gaService.setLocationAndSize(rectangle2, (taskContextWidth/2) + 10 , 20, ((taskContextWidth/2)-(taskContextWidth/10)) - 10, taskContextHeight-26);
            
            // create link and wire it
            ChopboxAnchor boxAnchor = peCreateService.createChopboxAnchor(shape);
            boxAnchor.setReferencedGraphicsAlgorithm(rectangle2);
            link(shape, taskContext);
        }
        
        // SHAPE WITH Rectangle activity box
        {
            // create shape for rectangel
            Shape shape = peCreateService.createContainerShape(taskContextContainerShape, false);
            
            // create and set text graphics algorithm
            Rectangle rectangle3 = gaService.createPlainRectangle(shape);
            rectangle3.setStyle(StyleUtil.getStyleForTaskContext(getDiagram()));
            rectangle3.setLineWidth(2);
            rectangle3.setTransparency(0.0);
            gaService.setLocationAndSize(rectangle3, 10 , 19, taskContextWidth-20, 25);
            
            // create link and wire it
            ChopboxAnchor boxAnchor = peCreateService.createChopboxAnchor(shape);
            boxAnchor.setReferencedGraphicsAlgorithm(rectangle3);
            
            Text text = gaService.createText(rectangle3, "act");
            text.setTransparency(0.4);
            text.setStyle(StyleUtil.getStyleForTextTip(getDiagram()));
            text.setHorizontalAlignment(Orientation.ALIGNMENT_RIGHT );
            // vertical alignment has as default value "center"
            text.setFont(gaService.manageDefaultFont(getDiagram(), false, true));
            gaService.setLocationAndSize(text, 10, 0, taskContextWidth-35, 20);
            
            link(shape, taskContext);
        }
        
     // SHAPE WITH Rectangle values box
        {
            // create shape for rectangel
            Shape shape = peCreateService.createContainerShape(taskContextContainerShape, false);
            
            // create and set text graphics algorithm
            Rectangle rectangle3 = gaService.createPlainRectangle(shape);
            rectangle3.setStyle(StyleUtil.getStyleForTaskContext(getDiagram()));
            rectangle3.setLineWidth(2);
            rectangle3.setTransparency(0.0);
            gaService.setLocationAndSize(rectangle3, 10 , 42, taskContextWidth-20, 25);
            
            // create link and wire it
            ChopboxAnchor boxAnchor = peCreateService.createChopboxAnchor(shape);
            boxAnchor.setReferencedGraphicsAlgorithm(rectangle3);
            
            Text text = gaService.createText(rectangle3, "props");
            text.setTransparency(0.4);
            text.setStyle(StyleUtil.getStyleForTextTip(getDiagram()));
            text.setHorizontalAlignment(Orientation.ALIGNMENT_RIGHT );
            // vertical alignment has as default value "center"
            text.setFont(gaService.manageDefaultFont(getDiagram(), false, true));
            gaService.setLocationAndSize(text, 10, 0, taskContextWidth-35, 20);
            
            link(shape, taskContext);
        }
        
        // SHAPE WITH Rectangle values box
        {
            // create shape for rectangel
            Shape shape = peCreateService.createContainerShape(taskContextContainerShape, false);
            
            // create and set text graphics algorithm
            Rectangle rectangle3 = gaService.createPlainRectangle(shape);
            rectangle3.setStyle(StyleUtil.getStyleForTaskContext(getDiagram()));
            rectangle3.setLineWidth(2);
            rectangle3.setTransparency(0.0);
            gaService.setLocationAndSize(rectangle3, 10 , 67, taskContextWidth-20, 25);
            
            // create link and wire it
            ChopboxAnchor boxAnchor = peCreateService.createChopboxAnchor(shape);
            boxAnchor.setReferencedGraphicsAlgorithm(rectangle3);
            
            Text text = gaService.createText(rectangle3, "ops");
            text.setTransparency(0.4);
            text.setStyle(StyleUtil.getStyleForTextTip(getDiagram()));
            text.setHorizontalAlignment(Orientation.ALIGNMENT_RIGHT );
            // vertical alignment has as default value "center"
            text.setFont(gaService.manageDefaultFont(getDiagram(), false, true));
            gaService.setLocationAndSize(text, 10, 0, taskContextWidth-35, 20);
            
            link(shape, taskContext);
        }
        
        final IDirectEditingInfo directEditingInfo = getFeatureProvider().getDirectEditingInfo();
        // set container shape for direct editing after object creation
        directEditingInfo.setMainPictogramElement(taskContextContainerShape);
        
        layoutPictogramElement(taskContextContainerShape);
        
        addActivity(taskContextContainerShape, taskContext);
        
        return taskContextContainerShape;
	}

	private void addActivity(ContainerShape taskContextContainerShape, TaskContext taskContext) {
		final int width = taskContextContainerShape.getGraphicsAlgorithm().getWidth();        
			 
		final Activity activity = taskContext.getActivity();
  
        // CONTAINER SHAPE WITH ROUNDED RECTANGLE
        final IPeCreateService peCreateService = Graphiti.getPeCreateService();
        final ContainerShape activityContainerShape =
            peCreateService.createContainerShape(taskContextContainerShape, true);

        IGaService gaService = Graphiti.getGaService();
        RoundedRectangle roundedRectangle; // need to access it later       
 
        {
            // create and set graphics algorithm
            roundedRectangle = gaService.createRoundedRectangle(activityContainerShape, 5, 5);
            roundedRectangle.setStyle(StyleUtil.getStyleForActivity(getDiagram()));
            roundedRectangle.setLineWidth(1);
            roundedRectangle.setTransparency(0.7);
			//final Object target = getBusinessObjectForPictogramElement(context.getTargetContainer());
            
            gaService.setLocationAndSize(roundedRectangle,10, 19, width-50, 24);
            // if added Class has no resource we add it to the resource
            // of the diagram
            // in a real scenario the business model would have its own resource
            if (activity.eResource() == null) {
                     getDiagram().eResource().getContents().add(activity);
            }
            
            // create link and wire it
            link(activityContainerShape, activity);
        }
        
        // SHAPE WITH TEXT
        {
            // create shape for text
            Shape shape = peCreateService.createShape(activityContainerShape, false);
 
            // create and set text graphics algorithm
            Text text = gaService.createText(shape, activity.getName());
            text.setStyle(StyleUtil.getStyleForText(getDiagram()));
            // vertical alignment has as default value "center"
            gaService.setLocationAndSize(text, 5, 0, taskContextContainerShape.getGraphicsAlgorithm().getWidth() - 22, 20);
            text.setHorizontalAlignment(Orientation.ALIGNMENT_LEFT );
 
            // create link and wire it
            link(shape, activity);
        }
        
        layoutPictogramElement(activityContainerShape);
		
	}

}

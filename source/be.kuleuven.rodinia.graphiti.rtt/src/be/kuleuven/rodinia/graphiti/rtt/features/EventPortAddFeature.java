package be.kuleuven.rodinia.graphiti.rtt.features;

import org.eclipse.graphiti.features.IDirectEditingInfo;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.impl.AbstractAddShapeFeature;
import org.eclipse.graphiti.mm.algorithms.Ellipse;
import org.eclipse.graphiti.mm.algorithms.RoundedRectangle;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.algorithms.styles.Orientation;
import org.eclipse.graphiti.mm.pictograms.ChopboxAnchor;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.services.IPeCreateService;

import be.kueleuven.rodinia.model.rtt.EventPort;
import be.kueleuven.rodinia.model.rtt.TaskContext;
import be.kuleuven.rodinia.graphiti.rtt.util.StyleUtil;
import be.kuleuven.rodinia.graphiti.rtt.util.TextUtils;

public class EventPortAddFeature extends AbstractAddShapeFeature{
	
	public EventPortAddFeature(IFeatureProvider fp) {
		super(fp);
	}

	@Override
	public boolean canAdd(IAddContext context) {
        if (context.getNewObject() instanceof EventPort) {
            // check if user wants to add to a vertex
            if (context.getTargetContainer().getLink().getBusinessObjects().get(0) instanceof TaskContext) {
                return true;
            }
        }
        return false;
	}

	@Override
	public PictogramElement add(IAddContext context) {
		final EventPort addedClass = (EventPort) context.getNewObject();
        final ContainerShape targetDiagram =  context.getTargetContainer();
  
        // CONTAINER SHAPE WITH ROUNDED RECTANGLE
        final IPeCreateService peCreateService = Graphiti.getPeCreateService();
        final ContainerShape containerShape =
            peCreateService.createContainerShape(targetDiagram, true);
  
        // check whether the context has a size (e.g. from a create feature)
        // otherwise define a default size for the shape
        @SuppressWarnings("unused")
		final int width = context.getWidth() <= 0 ? 100 : context.getWidth();
        @SuppressWarnings("unused")
		final int height = context.getHeight() <= 0 ? 50 : context.getHeight();

        IGaService gaService = Graphiti.getGaService();
        RoundedRectangle roundedRectangle; // need to access it later
        Ellipse ellipse; //the shape that is always visible
        boolean LR = false;
        //int widthWithText = (addedClass.getEndPointID().length()*7) + 27;
        int widthWithText = TextUtils.calculateTextWidth(addedClass.getName().toString()) + 30;
        //System.out.println("at creation text " + widthWithText);
        if (widthWithText > (targetDiagram.getGraphicsAlgorithm().getWidth() - 10)){
        	widthWithText = targetDiagram.getGraphicsAlgorithm().getWidth() - 10;
        }
        
 
        {
            // create and set graphics algorithm
            roundedRectangle = gaService.createRoundedRectangle(containerShape, 5, 5);
            roundedRectangle.setStyle(StyleUtil.getStyleForEventPort(getDiagram()));
            roundedRectangle.setLineWidth(2);
            roundedRectangle.setTransparency(1.0);
            @SuppressWarnings("unused")
			final Object target = getBusinessObjectForPictogramElement(context.getTargetContainer());
            
            
            //set the X position to the far left or to the far right
            int X = 0;
            if (context.getX() > context.getTargetContainer().getGraphicsAlgorithm().getWidth() / 2){
            	X = context.getTargetContainer().getGraphicsAlgorithm().getWidth() - widthWithText;
            	LR = true;
            }
            
            gaService.setLocationAndSize(roundedRectangle,
            			X, context.getY(), widthWithText, 25);
            // if added Class has no resource we add it to the resource
            // of the diagram
            // in a real scenario the business model would have its own resource
            if (addedClass.eResource() == null) {
                     getDiagram().eResource().getContents().add(addedClass);
            }
            
            // create link and wire it
            link(containerShape, addedClass);
        }

 
        
        // SHAPE WITH ELLIPSE
        {
        	Shape shape = peCreateService.createShape(containerShape, false);
        	Ellipse el = gaService.createEllipse(shape);
            el.setStyle(StyleUtil.getStyleForEventPort(getDiagram()));
            el.setLineWidth(2);
            if (LR == true){
            	gaService.setLocationAndSize(el, widthWithText-15, 0, 10, 10);
            } else {
            	gaService.setLocationAndSize(el, 5, 0, 10, 10);
            }
        	link(shape, addedClass);
        	ellipse = el;
        }
        
        //make an anchor and link it to the ellipse wich is endpoints main structure for attaching edges
        {
        	final ChopboxAnchor boxAnchor = peCreateService.createChopboxAnchor(containerShape);
        	boxAnchor.setReferencedGraphicsAlgorithm(ellipse);
        }
        
        // SHAPE WITH TEXT
        {
            // create shape for text
            Shape shape = peCreateService.createShape(containerShape, false);
 
            // create and set text graphics algorithm
            Text text = gaService.createText(shape, addedClass.getName());
            text.setStyle(StyleUtil.getStyleForText(getDiagram()));
            // vertical alignment has as default value "center"
            text.setFont(gaService.manageDefaultFont(getDiagram(), false, true));
            if (LR == true){
            	gaService.setLocationAndSize(text, 6, 0, widthWithText-26, 20);
            	text.setHorizontalAlignment(Orientation.ALIGNMENT_RIGHT );
            } else {
            	gaService.setLocationAndSize(text, 20, 0, widthWithText-26, 20);
            	text.setHorizontalAlignment(Orientation.ALIGNMENT_LEFT );
            }
 
            // create link and wire it
            link(shape, addedClass);
        }
        layoutPictogramElement(containerShape);
        
        final IDirectEditingInfo directEditingInfo = getFeatureProvider().getDirectEditingInfo();
        // set container shape for direct editing after object creation
        directEditingInfo.setMainPictogramElement(containerShape);
        
        return containerShape;
	}

}


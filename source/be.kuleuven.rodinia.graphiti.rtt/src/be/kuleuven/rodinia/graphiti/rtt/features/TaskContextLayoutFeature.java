package be.kuleuven.rodinia.graphiti.rtt.features;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.datatypes.IDimension;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ILayoutContext;
import org.eclipse.graphiti.features.impl.AbstractLayoutFeature;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.algorithms.Polyline;
import org.eclipse.graphiti.mm.algorithms.Rectangle;
import org.eclipse.graphiti.mm.algorithms.RoundedRectangle;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.algorithms.styles.Orientation;
import org.eclipse.graphiti.mm.algorithms.styles.Point;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;

import be.kueleuven.rodinia.model.rtt.TaskContext;

public class TaskContextLayoutFeature 	extends AbstractLayoutFeature {
 
    private static final int MIN_HEIGHT = 30;
 
    private static final int MIN_WIDTH = 100;
 
    public TaskContextLayoutFeature(IFeatureProvider fp) {
        super(fp);
    }
 
    public boolean canLayout(ILayoutContext context) {
       PictogramElement pe = context.getPictogramElement();
       if (!(pe instanceof ContainerShape))
           return false;
       EList<EObject> businessObjects = pe.getLink().getBusinessObjects();
       return businessObjects.size() == 1
              && businessObjects.get(0) instanceof TaskContext;
    }
 
    public boolean layout(ILayoutContext context) {
        boolean anythingChanged = false;
        ContainerShape containerShape =
            (ContainerShape) context.getPictogramElement();
        GraphicsAlgorithm containerGa = containerShape.getGraphicsAlgorithm();
 
        // height
        if (containerGa.getHeight() < MIN_HEIGHT) {
            containerGa.setHeight(MIN_HEIGHT);
            anythingChanged = true;
        }
 
        // width
        if (containerGa.getWidth() < MIN_WIDTH) {
            containerGa.setWidth(MIN_WIDTH);
            anythingChanged = true;
        }
 
        int containerWidth = containerGa.getWidth();
        int containerHeight = containerGa.getHeight();
       
        for (Shape shape : containerShape.getChildren()){
        	int textWidth = 0;
            GraphicsAlgorithm graphicsAlgorithm = shape.getGraphicsAlgorithm();
            IGaService gaService = Graphiti.getGaService();
            IDimension size =
                 gaService.calculateSize(graphicsAlgorithm);
            if (shape != null && shape.getLink() != null){
            }
            if (containerWidth != size.getWidth()) {
                if (graphicsAlgorithm instanceof Polyline) {
                    Polyline polyline = (Polyline) graphicsAlgorithm;
                    Point secondPoint = polyline.getPoints().get(1);
                    Point newSecondPoint =
                        gaService.createPoint(containerWidth-10, secondPoint.getY());
                    polyline.getPoints().set(1, newSecondPoint);
                    anythingChanged = true;
                } else {
                	if (graphicsAlgorithm instanceof Rectangle){
                		Rectangle rec = (Rectangle) graphicsAlgorithm;
                		gaService.setHeight(rec, containerHeight-25);
                			int width = ((containerWidth-20)/2)-((containerWidth-20)/10);
                			if (width > 30){
                				width =30;
                			}
                			if (!(graphicsAlgorithm instanceof RoundedRectangle)){
                				if (graphicsAlgorithm.getX() > 15){
                					gaService.setLocation(graphicsAlgorithm, (containerWidth - width) - 10, graphicsAlgorithm.getY());
                				}
                			}
                			if (rec.getY() == 20){
                				gaService.setSize(rec, containerWidth, containerHeight-20);
                			} else {
                				gaService.setWidth(rec,width);
                			}
                			anythingChanged = true;
                	} else {
                		if (graphicsAlgorithm instanceof Text || graphicsAlgorithm instanceof RoundedRectangle){
            				gaService.setWidth(graphicsAlgorithm, containerWidth-20);
            				if (graphicsAlgorithm instanceof RoundedRectangle){
            					if (size.getHeight() == 25){
            						if (textWidth != 0){
            							gaService.setSize(graphicsAlgorithm, textWidth+27, 25);
            						} else {
            							gaService.setSize(graphicsAlgorithm, size.getWidth(), 25);
            						}
            						if (graphicsAlgorithm.getX() == 0){
            							gaService.setLocation(graphicsAlgorithm, 0, graphicsAlgorithm.getY());
            						} else {
            							gaService.setLocation(graphicsAlgorithm, containerWidth-size.getWidth(), graphicsAlgorithm.getY());
            						}
            					} else {
            						gaService.setWidth(graphicsAlgorithm, containerWidth-20);
            						gaService.setHeight(graphicsAlgorithm, containerHeight);
            					}
            				} else {
            					if (graphicsAlgorithm instanceof Text){
            						if (graphicsAlgorithm.getX() == 27){
            							gaService.setLocation(graphicsAlgorithm, 27, graphicsAlgorithm.getY());
            						} else {
            							gaService.setLocation(graphicsAlgorithm, 8, graphicsAlgorithm.getY());
            							gaService.setSize(graphicsAlgorithm, containerGa.getWidth(), 25);
            							Text a = (Text) graphicsAlgorithm;
            							a.setHorizontalAlignment(Orientation.ALIGNMENT_CENTER );
            						}
            						if (textWidth != 0){
            							gaService.setSize(graphicsAlgorithm, textWidth+27, 25);
            						} else {
            							gaService.setSize(graphicsAlgorithm, containerGa.getWidth()-16, 25);
            							Text a = (Text) graphicsAlgorithm;
            							a.setHorizontalAlignment(Orientation.ALIGNMENT_CENTER );
            						}
            					}
            					if (graphicsAlgorithm.getHeight() == 20){
            						if (graphicsAlgorithm.getX() == 27){
            							gaService.setLocation(graphicsAlgorithm, 27, graphicsAlgorithm.getY());
            						} else {
            							gaService.setLocation(graphicsAlgorithm, 0, graphicsAlgorithm.getY());
            						}
            					}
            				}
                		} else {
                			if (size.getHeight() == 25){
                				gaService.setWidth(graphicsAlgorithm ,25);
                			} else {
                				gaService.setWidth(graphicsAlgorithm,
                				containerWidth);
                			}
                			anythingChanged = true;
                		}
                	}
                }
            }
        }
        anythingChanged = true;
        return anythingChanged;
    }

}

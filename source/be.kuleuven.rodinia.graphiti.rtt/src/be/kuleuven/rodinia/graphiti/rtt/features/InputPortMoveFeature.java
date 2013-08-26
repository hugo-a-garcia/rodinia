package be.kuleuven.rodinia.graphiti.rtt.features;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IMoveShapeContext;
import org.eclipse.graphiti.features.impl.DefaultMoveShapeFeature;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.algorithms.styles.Orientation;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;

import be.kueleuven.rodinia.model.rtt.InputPort;
import be.kuleuven.rodinia.graphiti.rtt.util.TextUtils;

public class InputPortMoveFeature extends DefaultMoveShapeFeature{

	@SuppressWarnings("unused")
	private boolean left = false;
	
	public InputPortMoveFeature(IFeatureProvider fp) {
		super(fp);
	}
	
	@Override
	protected void preMoveShape(IMoveShapeContext context){
		ContainerShape parent = context.getTargetContainer();
		 ContainerShape containerShape =
		            (ContainerShape) context.getPictogramElement();
		 if (containerShape.getGraphicsAlgorithm().getWidth() >= parent.getGraphicsAlgorithm().getWidth() - 20){
			 if (containerShape.getGraphicsAlgorithm().getX() == 0){
				 left = true;
			 } else {
				 left = false;
			 }
		 }
	}
	
	@SuppressWarnings("unused")
	@Override
	protected void postMoveShape(IMoveShapeContext context) {
		ContainerShape parent = context.getTargetContainer();
		 ContainerShape containerShape =
		            (ContainerShape) context.getPictogramElement();
		GraphicsAlgorithm containerGa = containerShape.getGraphicsAlgorithm();
        int containerWidth = containerGa.getWidth();
        int containerHeight = containerGa.getHeight();
	    if (containerShape.getGraphicsAlgorithm().getX() > (context.getTargetContainer().getGraphicsAlgorithm().getWidth() /2) - (context.getTargetContainer().getGraphicsAlgorithm().getWidth()/10)){
	        //int lengtWithText = containerWidth - (((EndPoint) getBusinessObjectForPictogramElement(containerShape)).getEndPointID().length() * 8);
	        int lengtWithText = containerWidth - TextUtils.calculateTextWidth(((InputPort) getBusinessObjectForPictogramElement(containerShape)).getName());
	        if (lengtWithText < 0){
	        	lengtWithText = 0;
	        }
	        containerGa.setX(context.getTargetContainer().getGraphicsAlgorithm().getWidth()-containerWidth);
	        containerShape.getChildren().get(0).getGraphicsAlgorithm().setX(containerWidth - 15);
	        containerShape.getChildren().get(1).getGraphicsAlgorithm().setWidth(containerWidth-27);
	        containerShape.getChildren().get(1).getGraphicsAlgorithm().setX(6);
	        Text a = (Text) containerShape.getChildren().get(1).getGraphicsAlgorithm();
	        a.setHorizontalAlignment(Orientation.ALIGNMENT_RIGHT);
	     } else {
	        containerGa.setX(0);
	        containerShape.getChildren().get(1).getGraphicsAlgorithm().setWidth(containerWidth-26);
	        containerShape.getChildren().get(1).getGraphicsAlgorithm().setX(20);
	        Text a = (Text) containerShape.getChildren().get(1).getGraphicsAlgorithm();
	        a.setHorizontalAlignment(Orientation.ALIGNMENT_LEFT);
	        containerShape.getChildren().get(0).getGraphicsAlgorithm().setX(5);
        }
	}

}

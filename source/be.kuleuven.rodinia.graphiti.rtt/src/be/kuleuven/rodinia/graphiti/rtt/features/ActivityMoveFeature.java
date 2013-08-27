package be.kuleuven.rodinia.graphiti.rtt.features;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IMoveShapeContext;
import org.eclipse.graphiti.features.impl.DefaultMoveShapeFeature;

public class ActivityMoveFeature extends DefaultMoveShapeFeature{

	public ActivityMoveFeature(IFeatureProvider fp) {
		super(fp);
	}
	
	protected void postMoveShape(IMoveShapeContext context) {
		context.getShape().getGraphicsAlgorithm().setX(10);
		context.getShape().getGraphicsAlgorithm().setY(19);
	}

}

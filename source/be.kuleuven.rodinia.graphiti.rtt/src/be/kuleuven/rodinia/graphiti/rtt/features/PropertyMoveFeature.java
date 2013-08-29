package be.kuleuven.rodinia.graphiti.rtt.features;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IMoveShapeContext;
import org.eclipse.graphiti.features.impl.DefaultMoveShapeFeature;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;

import be.kueleuven.rodinia.model.rtt.Property;
import be.kueleuven.rodinia.model.rtt.TaskContext;

public class PropertyMoveFeature extends DefaultMoveShapeFeature{

	public PropertyMoveFeature(IFeatureProvider fp) {
		super(fp);
	}
	
	protected void postMoveShape(IMoveShapeContext context) {
		ContainerShape containerShape = (ContainerShape) context.getPictogramElement();
	    GraphicsAlgorithm containerGa = containerShape.getGraphicsAlgorithm();
	    int containerHeight = containerGa.getHeight();
	    
	    GraphicsAlgorithm graphicsAlgorithm = containerShape.getChildren().get(0).getGraphicsAlgorithm();
	    
	    final Object container = getBusinessObjectForPictogramElement(context.getTargetContainer().getLink().getPictogramElement());
		final Object target = getBusinessObjectForPictogramElement(graphicsAlgorithm.getPictogramElement());
		int number = 0;
		if (target instanceof Property){
			System.out.println("1");
			Property prop = (Property) target;
			System.out.println(container);
			if (container instanceof TaskContext){
				System.out.println("2");
				TaskContext task = (TaskContext) container;
				int i = 1;
				for (Property propx : task.getProperties()){
					System.out.println("3");
					if (propx.getName().equals(prop.getName())){
						number = i;
						if ((19+(number + 1) * 23) >= 42 + ((containerHeight-42)/2)){
							graphicsAlgorithm.setTransparency(1.0);
							for (GraphicsAlgorithm graph : graphicsAlgorithm.getGraphicsAlgorithmChildren()){
								graph.setTransparency(1.0);
							}
						} else {
							graphicsAlgorithm.setTransparency(0.7);
							for (GraphicsAlgorithm graph : graphicsAlgorithm.getGraphicsAlgorithmChildren()){
								graph.setTransparency(0.0);
							}
						}
					}
					i++;
				}
			}
		}
	}

}

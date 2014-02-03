package be.kuleuven.rodinia.graphiti.rtt.features;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ILayoutContext;
import org.eclipse.graphiti.features.impl.AbstractLayoutFeature;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.algorithms.RoundedRectangle;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Shape;

public class TaskContextLayoutFeature extends AbstractLayoutFeature {

	public TaskContextLayoutFeature(IFeatureProvider fp) {
		super(fp);
	}

	@Override
	public boolean canLayout(ILayoutContext context) {
		return true;
	}

	@Override
	public boolean layout(ILayoutContext context) {
		boolean anythingChanged = false;
		ContainerShape containerShape = (ContainerShape) context.getPictogramElement();
		GraphicsAlgorithm containerGa = containerShape.getGraphicsAlgorithm();
		// height
		if (containerGa.getHeight() < IPictogramConstants.TASK_CONTEXT_DEFAULT_HEIGHT) {
			containerGa.setHeight(IPictogramConstants.TASK_CONTEXT_DEFAULT_HEIGHT);
			anythingChanged = true;
		}

		// width
		if (containerGa.getWidth() < IPictogramConstants.TASK_CONTEXT_DEFAULT_WIDTH) {
			containerGa.setWidth(IPictogramConstants.TASK_CONTEXT_DEFAULT_WIDTH);
			anythingChanged = true;
		}
		int containerWidth = containerGa.getWidth();
		int containerHeight = containerGa.getHeight();

		for (GraphicsAlgorithm child : containerGa.getGraphicsAlgorithmChildren()) {
			if (child instanceof RoundedRectangle) {
				child.setWidth(containerWidth - 2 * IPictogramConstants.MARGIN);
				child.setHeight(containerHeight - 2 * IPictogramConstants.MARGIN);
			}
			if (child instanceof Text) {
				child.setWidth(containerWidth - (2 * IPictogramConstants.MARGIN)
						- (2 * IPictogramConstants.BUFFER_SPACE));
			}
			anythingChanged = true;
		}

		for (Shape shape : containerShape.getChildren()) {
			shape.getGraphicsAlgorithm().setWidth(
					containerWidth - (2 * IPictogramConstants.MARGIN) - (2 * IPictogramConstants.BUFFER_SPACE));
		}

		return false;
	}

}

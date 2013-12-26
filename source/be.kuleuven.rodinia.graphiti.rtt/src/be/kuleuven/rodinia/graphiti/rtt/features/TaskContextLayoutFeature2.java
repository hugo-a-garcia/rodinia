package be.kuleuven.rodinia.graphiti.rtt.features;

import org.eclipse.graphiti.datatypes.IDimension;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ILayoutContext;
import org.eclipse.graphiti.features.impl.AbstractLayoutFeature;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.algorithms.Rectangle;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;

import be.kueleuven.rodinia.model.rtt.Activity;

public class TaskContextLayoutFeature2 extends AbstractLayoutFeature {

	private boolean anythingChanged;

	public TaskContextLayoutFeature2(IFeatureProvider fp) {
		super(fp);
	}

	@Override
	public boolean canLayout(ILayoutContext context) {
		return true;
	}

	@Override
	public boolean layout(ILayoutContext context) {
		anythingChanged = false;
		ContainerShape containerShape = (ContainerShape) context.getPictogramElement();
		search(containerShape);
		return anythingChanged;
	}

	private void search(ContainerShape containerShape) {
		GraphicsAlgorithm containerGa = containerShape.getGraphicsAlgorithm();
		
		int containerWidth = containerGa.getWidth();
		int containerHeight = containerGa.getHeight();
		
//		// height
//		if (containerGa.getHeight() < IPictogramConstants.TASK_CONTEXT_DEFAULT_HEIGHT) {
//			containerGa.setHeight(IPictogramConstants.TASK_CONTEXT_DEFAULT_HEIGHT);
//			anythingChanged = true;
//		}
//
//		// width
//		if (containerGa.getWidth() < IPictogramConstants.TASK_CONTEXT_DEFAULT_WIDTH) {
//			containerGa.setWidth(IPictogramConstants.TASK_CONTEXT_DEFAULT_WIDTH);
//			anythingChanged = true;
//		}
		
		IGaService gaService = Graphiti.getGaService();
		for (Shape shape : containerShape.getChildren()) {
			if (shape instanceof ContainerShape) {
				if (!((ContainerShape) shape).getChildren().isEmpty()) {
					search((ContainerShape) shape);
				}
			}
			GraphicsAlgorithm graphicsAlgorithm = shape.getGraphicsAlgorithm();
			System.out.println("---> " + graphicsAlgorithm.toString());
			
			IDimension size = gaService.calculateSize(graphicsAlgorithm);
			if (containerWidth != size.getWidth()) {
				if (graphicsAlgorithm instanceof Text) {
					gaService.setWidth(graphicsAlgorithm, containerWidth);
					anythingChanged = true;
				}
				if(graphicsAlgorithm instanceof Rectangle) {
					gaService.setWidth(graphicsAlgorithm, containerWidth);
					if (getBusinessObjectForPictogramElement(graphicsAlgorithm.getPictogramElement()) instanceof Activity) {
						gaService.setHeight(graphicsAlgorithm, IPictogramConstants.TEXT_BOX_HEIGHT);
					};
					anythingChanged = true;
				}
			}
		}	
	}

}
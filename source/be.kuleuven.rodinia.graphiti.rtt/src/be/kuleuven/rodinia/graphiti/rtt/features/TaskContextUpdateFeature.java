package be.kuleuven.rodinia.graphiti.rtt.features;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.IReason;
import org.eclipse.graphiti.features.context.IUpdateContext;
import org.eclipse.graphiti.features.impl.AbstractUpdateFeature;
import org.eclipse.graphiti.features.impl.Reason;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;

import be.kueleuven.rodinia.model.rtt.TaskContext;

public class TaskContextUpdateFeature extends AbstractUpdateFeature {

	public TaskContextUpdateFeature(IFeatureProvider fp) {

		super(fp);
	}

	public boolean canUpdate(IUpdateContext context) {

		Object businessObject = getBusinessObjectForPictogramElement(context.getPictogramElement());
		return (businessObject instanceof TaskContext);
	}

	public IReason updateNeeded(IUpdateContext context) {

		String activityNamePic = null;
		String taskContextNamePic = null;
		PictogramElement pictogramElement = context.getPictogramElement();
		if (pictogramElement instanceof ContainerShape) {
			ContainerShape containerShape = (ContainerShape) pictogramElement;
			for (Shape shape : containerShape.getChildren()) {
				if (shape.getGraphicsAlgorithm() instanceof Text) {
					Text text = (Text) shape.getGraphicsAlgorithm();
					activityNamePic = text.getValue();
					System.out.println("PIC = " + activityNamePic);
				}
			}
			for (GraphicsAlgorithm child : containerShape.getGraphicsAlgorithm().getGraphicsAlgorithmChildren()) {
				if (child instanceof Text) {
					taskContextNamePic = ((Text) child).getValue();
					System.out.println("TA = " + taskContextNamePic);
				}
			}
		}

		String taskContextName = null;
		String activityName = null;
		Object businessObject = getBusinessObjectForPictogramElement(pictogramElement);
		if (businessObject instanceof TaskContext) {
			TaskContext taskContext = (TaskContext) businessObject;
			taskContextName = taskContext.getName();
			System.out.println("BN = " + taskContextName);
			activityName = taskContext.getActivity().getName();
		}

		if (!(taskContextName.equals(taskContextNamePic)) || !(activityName.equals(activityNamePic))) {
			return Reason.createTrueReason("Update Needed");
		}
		return Reason.createFalseReason();
	}

	public boolean update(IUpdateContext context) {

		String businessName = null;
		PictogramElement pictogramElement = context.getPictogramElement();
		Object businessObject = getBusinessObjectForPictogramElement(pictogramElement);
		if (businessObject instanceof TaskContext) {
			TaskContext taskcontext = (TaskContext) businessObject;
			businessName = taskcontext.getName();
		}
		if (pictogramElement instanceof ContainerShape) {
			ContainerShape containerShape = (ContainerShape) pictogramElement;
			for (GraphicsAlgorithm child : containerShape.getGraphicsAlgorithm().getGraphicsAlgorithmChildren()) {
				if (child instanceof Text) {
					((Text) child).setValue(businessName);
					return true;
				}
			}
		}
		return false;
	}

}

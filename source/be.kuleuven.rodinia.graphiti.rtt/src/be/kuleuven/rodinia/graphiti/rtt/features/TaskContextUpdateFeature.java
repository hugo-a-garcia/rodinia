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
		
		String textValue = null;
		PictogramElement pictogramElement = context.getPictogramElement();
		if (pictogramElement instanceof ContainerShape) {
			ContainerShape containerShape = (ContainerShape) pictogramElement;
			for (GraphicsAlgorithm child : containerShape.getGraphicsAlgorithm().getGraphicsAlgorithmChildren()) {
				if (child instanceof Text) {
					textValue = ((Text) child).getValue();
				}
			}
		}

		String taskContextName = null;
		Object businessObject = getBusinessObjectForPictogramElement(pictogramElement);
		if (businessObject instanceof TaskContext) {
			TaskContext taskContext = (TaskContext) businessObject;
			taskContextName = taskContext.getName();
		}

		if (!(taskContextName.equals(textValue))) {
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

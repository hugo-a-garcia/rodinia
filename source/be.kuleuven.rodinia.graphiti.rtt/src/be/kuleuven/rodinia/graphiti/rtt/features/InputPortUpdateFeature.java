package be.kuleuven.rodinia.graphiti.rtt.features;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.IReason;
import org.eclipse.graphiti.features.context.IUpdateContext;
import org.eclipse.graphiti.features.impl.AbstractUpdateFeature;
import org.eclipse.graphiti.features.impl.Reason;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;

import be.kueleuven.rodinia.model.rtt.InputPort;

public class InputPortUpdateFeature extends AbstractUpdateFeature {

	public InputPortUpdateFeature(IFeatureProvider fp) {
		super(fp);
	}

	public boolean canUpdate(IUpdateContext context) {
		Object businessObject = getBusinessObjectForPictogramElement(context
				.getPictogramElement());
		return (businessObject instanceof InputPort);
	}

	public IReason updateNeeded(IUpdateContext context) {
		String pictogramName = null;
		PictogramElement pictogramElement = context.getPictogramElement();
		if (pictogramElement instanceof ContainerShape) {
			ContainerShape containerShape = (ContainerShape) pictogramElement;
			for (Shape shape : containerShape.getChildren()) {
				if (shape.getGraphicsAlgorithm() instanceof Text) {
					Text text = (Text) shape.getGraphicsAlgorithm();
					pictogramName = text.getValue();
				}
			}
		}

		String businessName = null;
		Object businessObject = getBusinessObjectForPictogramElement(pictogramElement);
		if (businessObject instanceof InputPort) {
			InputPort inputPort = (InputPort) businessObject;
			businessName = inputPort.getName();
		}

		boolean updateNameNeeded = ((pictogramName == null && businessName != null) || (pictogramName != null && !pictogramName
				.equals(businessName)));
		if (updateNameNeeded) {
			return Reason.createTrueReason("Name is out of date");
		} else {
			return Reason.createFalseReason();
		}
	}

	public boolean update(IUpdateContext context) {
		String businessName = null;
		PictogramElement pictogramElement = context.getPictogramElement();
		Object businessObject = getBusinessObjectForPictogramElement(pictogramElement);
		if (businessObject instanceof InputPort) {
			InputPort inputPort = (InputPort) businessObject;
			businessName = inputPort.getName();
		}

		if (pictogramElement instanceof ContainerShape) {
			ContainerShape containerShape = (ContainerShape) pictogramElement;
			for (Shape shape : containerShape.getChildren()) {
				if (shape.getGraphicsAlgorithm() instanceof Text) {
					Text text = (Text) shape.getGraphicsAlgorithm();
					text.setValue(businessName);
					return true;
				}
			}
		}

		return false;
	}

}

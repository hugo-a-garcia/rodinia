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

import be.kueleuven.rodinia.model.rtt.EventPort;

public class EventPortUpdateFeature extends AbstractUpdateFeature {
 
    public EventPortUpdateFeature(IFeatureProvider fp) {
        super(fp);
    }
 
    public boolean canUpdate(IUpdateContext context) {
        Object businessobject =
            getBusinessObjectForPictogramElement(context.getPictogramElement());
        return (businessobject instanceof EventPort);
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
        if (businessObject instanceof EventPort) {
            EventPort eventPort = (EventPort) businessObject;
            businessName = eventPort.getName();
        }
 
        boolean updateNameNeeded =
            ((pictogramName == null && businessName != null) ||
                (pictogramName != null && !pictogramName.equals(businessName)));
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
        if (businessObject instanceof EventPort) {
            EventPort eventPort = (EventPort) businessObject;
            businessName = eventPort.getName();
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

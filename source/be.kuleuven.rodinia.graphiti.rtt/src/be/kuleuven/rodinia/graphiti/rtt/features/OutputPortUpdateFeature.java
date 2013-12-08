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

import be.kueleuven.rodinia.model.rtt.OutputPort;


public class OutputPortUpdateFeature extends AbstractUpdateFeature {
 
    public OutputPortUpdateFeature(IFeatureProvider fp) {
        super(fp);
    }
 
    public boolean canUpdate(IUpdateContext context) {
        Object businessObject =
            getBusinessObjectForPictogramElement(context.getPictogramElement());
        return (businessObject instanceof OutputPort);
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
        Object bo = getBusinessObjectForPictogramElement(pictogramElement);
        if (bo instanceof OutputPort) {
        	OutputPort outputPort = (OutputPort) bo;
            businessName = outputPort.getName();
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
        if (businessObject instanceof OutputPort) {
        	OutputPort outpoutPort = (OutputPort) businessObject;
            businessName = outpoutPort.getName();
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

package be.kuleuven.rodinia.graphiti.rtt.features;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.IReason;
import org.eclipse.graphiti.features.context.IUpdateContext;
import org.eclipse.graphiti.features.impl.AbstractUpdateFeature;
import org.eclipse.graphiti.features.impl.Reason;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;

import be.kueleuven.rodinia.model.rtt.Activity;

public class ActivityUpdateFeature extends AbstractUpdateFeature {
 
    public ActivityUpdateFeature(IFeatureProvider fp) {
        super(fp);
    }
 
    public boolean canUpdate(IUpdateContext context) {
        Object businessObject =
            getBusinessObjectForPictogramElement(context.getPictogramElement());
        return (businessObject instanceof Activity);
    }
 
    public IReason updateNeeded(IUpdateContext context) {
        String textValue = null;
        PictogramElement pictogramElement = context.getPictogramElement();
        if (pictogramElement instanceof ContainerShape) {
            ContainerShape containerShape = (ContainerShape) pictogramElement;
                if (containerShape.getGraphicsAlgorithm() instanceof Text) {
                    Text text = (Text) containerShape.getGraphicsAlgorithm();
                    textValue = text.getValue();
                }
        }
        String actvityName = null;
        Object businessObject = getBusinessObjectForPictogramElement(pictogramElement);
        if (businessObject instanceof Activity) {
            Activity activity = (Activity) businessObject;
            actvityName = activity.getName();
        }
        if (!textValue.equals(actvityName)) {
            return Reason.createTrueReason("Name is out of date");
        }
        return Reason.createFalseReason();
    }
 
    public boolean update(IUpdateContext context) {
        String activityName = null;
        PictogramElement pictogramElement = context.getPictogramElement();
		Object businessObject = getBusinessObjectForPictogramElement(pictogramElement);
        if (businessObject instanceof Activity) {
            Activity activity = (Activity) businessObject;
            activityName = activity.getName();
        }
        if (pictogramElement instanceof ContainerShape) {
            ContainerShape containerShape = (ContainerShape) pictogramElement;
                if (containerShape.getGraphicsAlgorithm() instanceof Text) {
                    Text text = (Text) containerShape.getGraphicsAlgorithm();
                    text.setValue(activityName);
                    return true;
                }
        }
        return false;
    }

}

package be.kuleuven.rodinia.graphiti.rtt.features;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.IReason;
import org.eclipse.graphiti.features.context.IUpdateContext;
import org.eclipse.graphiti.features.impl.AbstractUpdateFeature;
import org.eclipse.graphiti.features.impl.Reason;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.algorithms.RoundedRectangle;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;

import be.kueleuven.rodinia.model.rtt.Property;

public class PropertyUpdateFeature extends AbstractUpdateFeature {
 
    public PropertyUpdateFeature(IFeatureProvider fp) {
        super(fp);
    }
 
    public boolean canUpdate(IUpdateContext context) {
        Object bo =
            getBusinessObjectForPictogramElement(context.getPictogramElement());
        return (bo instanceof Property);
    }
 
    public IReason updateNeeded(IUpdateContext context) {
        String pictogramName = null;
        PictogramElement pictogramElement = context.getPictogramElement();
        if (pictogramElement instanceof ContainerShape) {
            ContainerShape cs = (ContainerShape) pictogramElement;
            for (GraphicsAlgorithm shape : cs.getGraphicsAlgorithm().getGraphicsAlgorithmChildren()) {
                if (shape instanceof Text) {
                    Text text = (Text) shape;
                    pictogramName = text.getValue();
                }
                if (shape instanceof RoundedRectangle){
                	Text text = (Text) shape.getGraphicsAlgorithmChildren().get(0);
                	pictogramName = text.getValue();
                }
            }
        }
 
        String businessName = null;
        Object bo = getBusinessObjectForPictogramElement(pictogramElement);
        if (bo instanceof Property) {
            Property eClass = (Property) bo;
            businessName = eClass.getName();
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
        Object bo = getBusinessObjectForPictogramElement(pictogramElement);
        if (bo instanceof Property) {
            Property eClass = (Property) bo;
            businessName = eClass.getName();
        }
 
        if (pictogramElement instanceof ContainerShape) {
            ContainerShape cs = (ContainerShape) pictogramElement;
            for (GraphicsAlgorithm shape : cs.getGraphicsAlgorithm().getGraphicsAlgorithmChildren()) {
                if (shape instanceof Text) {
                    Text text = (Text) shape;
                    text.setValue(businessName);
                    return true;
                }
                if (shape instanceof RoundedRectangle){
                	Text text = (Text) shape.getGraphicsAlgorithmChildren().get(0);
                	text.setValue(businessName);
                	return true;
                }
            }
        }
 
        return false;
    }

}

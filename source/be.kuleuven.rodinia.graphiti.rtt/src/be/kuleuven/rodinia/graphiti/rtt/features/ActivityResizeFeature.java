package be.kuleuven.rodinia.graphiti.rtt.features;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IResizeShapeContext;
import org.eclipse.graphiti.features.impl.DefaultResizeShapeFeature;
import org.eclipse.graphiti.mm.pictograms.Shape;

import be.kueleuven.rodinia.model.rtt.Activity;

public class ActivityResizeFeature extends DefaultResizeShapeFeature {
   
    public ActivityResizeFeature(IFeatureProvider fp) {
        super(fp);
    }
 
    @Override
    public boolean canResizeShape(IResizeShapeContext context) {
        boolean canResize = super.canResizeShape(context);
 
        if (canResize) {
            Shape shape = context.getShape();
            Object bo = getBusinessObjectForPictogramElement(shape);
            if (bo instanceof Activity) {
            	canResize = false;
            }
        }
        return canResize;
    }
}

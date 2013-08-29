package be.kuleuven.rodinia.graphiti.rtt.features;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ILayoutContext;
import org.eclipse.graphiti.features.impl.AbstractLayoutFeature;

import be.kueleuven.rodinia.model.rtt.Activity;

public class PropertyLayoutFeature extends AbstractLayoutFeature {
 
 
    public PropertyLayoutFeature(IFeatureProvider fp) {
        super(fp);
    }
 
    public boolean canLayout(ILayoutContext context) {
    	if (context.getPictogramElement().getLink().getBusinessObjects().get(0) instanceof Activity){
    		return true;
    	}
    	return false;
    }
 
    public boolean layout(ILayoutContext context) {
        return true;
    }
}

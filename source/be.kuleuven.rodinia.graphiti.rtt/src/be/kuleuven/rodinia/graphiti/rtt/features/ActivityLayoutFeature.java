package be.kuleuven.rodinia.graphiti.rtt.features;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ILayoutContext;
import org.eclipse.graphiti.features.impl.AbstractLayoutFeature;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.services.Graphiti;

import be.kueleuven.rodinia.model.rtt.Activity;


public class ActivityLayoutFeature extends AbstractLayoutFeature {
 
    public ActivityLayoutFeature(IFeatureProvider fp) {
        super(fp);
    }
 
    public boolean canLayout(ILayoutContext context) {
		PictogramElement pe = context.getPictogramElement();
		if (!(pe instanceof ContainerShape))
			return false;
		EList<EObject> businessObjects = pe.getLink().getBusinessObjects();
		return businessObjects.size() == 1 && businessObjects.get(0) instanceof Activity;
    }
 
    public boolean layout(ILayoutContext context) {
    	//context.getPictogramElement().getGraphicsAlgorithm().setHeight(IPictogramConstants.TEXT_BOX_HEIGHT);;
    	//context.getPictogramElement().getGraphicsAlgorithm().setWidth(IPictogramConstants.TASK_CONTEXT_DEFAULT_WIDTH);;
    	System.out.println(context.getPictogramElement().toString());
    	Graphiti.getGaService().setHeight(context.getPictogramElement().getGraphicsAlgorithm(), IPictogramConstants.TEXT_BOX_HEIGHT);
    	Graphiti.getGaService().setWidth(context.getPictogramElement().getGraphicsAlgorithm(), IPictogramConstants.TASK_CONTEXT_DEFAULT_WIDTH);
        return true;
    }
}

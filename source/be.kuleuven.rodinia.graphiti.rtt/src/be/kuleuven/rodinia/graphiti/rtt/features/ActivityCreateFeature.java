package be.kuleuven.rodinia.graphiti.rtt.features;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICreateContext;
import org.eclipse.graphiti.features.impl.AbstractCreateFeature;
import org.eclipse.graphiti.mm.algorithms.impl.RectangleImpl;

import be.kueleuven.rodinia.model.rtt.Activity;
import be.kueleuven.rodinia.model.rtt.RttFactory;
import be.kueleuven.rodinia.model.rtt.TaskContext;

@SuppressWarnings("restriction")
public class ActivityCreateFeature extends AbstractCreateFeature {

	public ActivityCreateFeature(IFeatureProvider fp) {
		super(fp, "Activity", "Create an Activity");
	}

	@Override
	public boolean canCreate(ICreateContext context) {
		boolean canCreate = false;
		if (context.getTargetContainer().getLink() != null){
			if (context.getTargetContainer().getLink().getBusinessObjects().get(0) instanceof TaskContext){
				RectangleImpl a = (RectangleImpl) context.getTargetContainer().eContents().get(7).eContents().get(0);
				if (context.getX() >= a.getX() && context.getX() <= a.getX()+a.getWidth()){
					if (context.getY() >= a.getY() && context.getY() <= a.getY()+a.getHeight()){
						if (((TaskContext)context.getTargetContainer().getLink().getBusinessObjects().get(0)).getActivity() == null){
							canCreate = true;
						}
					}
				}
			}
		}
		return canCreate;
	}

	@Override
	public Object[] create(ICreateContext context) {

		Activity act = RttFactory.eINSTANCE.createActivity();
		
        final Object target = getBusinessObjectForPictogramElement(context.getTargetContainer());
        if (target instanceof TaskContext) {
        	TaskContext domainObject = (TaskContext) target;
        	act.setName(domainObject.getName() + "_Activity");
        	domainObject.setActivity(act);
        	context.getTargetContainer().setVisible(false);
        	context.getTargetContainer().setVisible(true);
        }
        
		// do the add
		addGraphicalRepresentation(context, act);

		// return newly created business object(s)
		return new Object[] { act };
	}

}

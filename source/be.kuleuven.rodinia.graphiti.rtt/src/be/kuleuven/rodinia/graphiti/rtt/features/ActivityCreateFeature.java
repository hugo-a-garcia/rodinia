package be.kuleuven.rodinia.graphiti.rtt.features;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICreateContext;
import org.eclipse.graphiti.features.impl.AbstractCreateFeature;
import org.eclipse.graphiti.mm.pictograms.Diagram;

import be.kueleuven.rodinia.model.rtt.Activity;
import be.kueleuven.rodinia.model.rtt.OrocosPackage;
import be.kueleuven.rodinia.model.rtt.RttFactory;
import be.kuleuven.rodinia.graphiti.rtt.util.Util;

public class ActivityCreateFeature extends AbstractCreateFeature {
	
	private static final String TITLE = "Create Task Context";

	private static final String USER_QUESTION = "Enter new Task Context name";
	
	
	public ActivityCreateFeature(IFeatureProvider fp) {
		super(fp, "Activity", "Create a Activity");
	}

	@Override
	public boolean canCreate(ICreateContext context) {
		return context.getTargetContainer() instanceof Diagram;
	}

	@Override
	public Object[] create(ICreateContext context) {
		String ActivityName = Util.askString(TITLE, USER_QUESTION, "");
		if (ActivityName == null || ActivityName.trim().length() == 0) {
			return EMPTY;
		}

		Activity act = RttFactory.eINSTANCE.createActivity();
		act.setName(ActivityName);
		
        final Object target = getBusinessObjectForPictogramElement(context.getTargetContainer());
        if (target instanceof OrocosPackage) {
            //OrocosPackage domainObject = (OrocosPackage) target;
            //domainObject.setActivities(act);
        }
        
		// do the add
		addGraphicalRepresentation(context, act);

		// return newly created business object(s)
		return new Object[] { act };
	}

}

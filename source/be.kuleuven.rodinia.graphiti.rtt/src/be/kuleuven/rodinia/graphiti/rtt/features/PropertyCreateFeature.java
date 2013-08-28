package be.kuleuven.rodinia.graphiti.rtt.features;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICreateContext;
import org.eclipse.graphiti.features.impl.AbstractCreateFeature;
import org.eclipse.graphiti.mm.algorithms.impl.RectangleImpl;

import be.kueleuven.rodinia.model.rtt.Property;
import be.kueleuven.rodinia.model.rtt.RttFactory;
import be.kueleuven.rodinia.model.rtt.TaskContext;
import be.kuleuven.rodinia.graphiti.rtt.util.Util;

@SuppressWarnings("restriction")
public class PropertyCreateFeature extends AbstractCreateFeature {
	
	private static final String TITLE = "Create Property";

	private static final String USER_QUESTION = "Enter new Property name";
	
	
	public PropertyCreateFeature(IFeatureProvider fp) {
		super(fp, "Property", "Create a Property");
	}

	@Override
	public boolean canCreate(ICreateContext context) {
		boolean canCreate = false;
		if (context.getTargetContainer().getLink() != null){
			if (context.getTargetContainer().getLink().getBusinessObjects().get(0) instanceof TaskContext){
				RectangleImpl a = (RectangleImpl) context.getTargetContainer().eContents().get(8).eContents().get(0);
				if (context.getX() >= a.getX() && context.getX() <= a.getX()+a.getWidth()){
					if (context.getY() >= a.getY() && context.getY() <= a.getY()+a.getHeight()){
						canCreate = true;
					}
				}
			}
		}
		return canCreate;
	}

	@Override
	public Object[] create(ICreateContext context) {
		String ActivityName = Util.askString(TITLE, USER_QUESTION, "");
		if (ActivityName == null || ActivityName.trim().length() == 0) {
			return EMPTY;
		}

		Property act = RttFactory.eINSTANCE.createProperty();
		act.setName(ActivityName);
		
        final Object target = getBusinessObjectForPictogramElement(context.getTargetContainer());
        if (target instanceof TaskContext) {
        	TaskContext domainObject = (TaskContext) target;
        	domainObject.getProperties().add(act);
        	context.getTargetContainer().setVisible(false);
        	context.getTargetContainer().setVisible(true);
        }
        
		// do the add
		addGraphicalRepresentation(context, act);

		// return newly created business object(s)
		return new Object[] { act };
	}

}

package be.kuleuven.rodinia.graphiti.rtt.features;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICreateContext;
import org.eclipse.graphiti.features.impl.AbstractCreateFeature;
import org.eclipse.graphiti.mm.algorithms.impl.RectangleImpl;

import be.kueleuven.rodinia.model.rtt.EventPort;
import be.kueleuven.rodinia.model.rtt.RttFactory;
import be.kueleuven.rodinia.model.rtt.TaskContext;
import be.kuleuven.rodinia.graphiti.rtt.util.Util;

@SuppressWarnings("restriction")
public class EventPortCreateFeature extends AbstractCreateFeature{

	private static final String TITLE = "Create Event Port";

	private static final String USER_QUESTION = "Enter new event port name";
	
	public EventPortCreateFeature(IFeatureProvider fp) {
		super(fp, "EventPort", TITLE);
	}

	@Override
	public boolean canCreate(ICreateContext context) {
		boolean canCreate = false;
		if (context.getTargetContainer().getLink() != null){
			if (context.getTargetContainer().getLink().getBusinessObjects().get(0) instanceof TaskContext){
				RectangleImpl a = (RectangleImpl) context.getTargetContainer().eContents().get(6).eContents().get(0);
				if (context.getX() >= a.getX() && context.getX() <= a.getX()+a.getWidth()){
					if (context.getY() >= a.getY() && context.getY() <= a.getY()+a.getHeight()){
						canCreate = true;
					}
				}
				a = (RectangleImpl) context.getTargetContainer().eContents().get(5).eContents().get(0);
				if (context.getX() >= a.getX() && context.getX() <= a.getX()+a.getWidth()){
					if (context.getY() >= a.getY() && context.getY() <= a.getY()+a.getHeight()){
						canCreate = true;
					}{

}
				}
			}
		}
		return canCreate;
	}

	@Override
	public Object[] create(ICreateContext context) {
		String InputPortName = Util.askString(TITLE, USER_QUESTION, "");
		if (InputPortName == null || InputPortName.trim().length() == 0) {
			return EMPTY;
		}

		EventPort inputPort = RttFactory.eINSTANCE.createEventPort();
		inputPort.setName(InputPortName);
		
        final Object target = getBusinessObjectForPictogramElement(context.getTargetContainer());
        if (target instanceof TaskContext) {
            TaskContext domainObject = (TaskContext) target;
            domainObject.getEventPorts().add(inputPort);
        }
        
		// do the add
		addGraphicalRepresentation(context, inputPort);

		// return newly created business object(s)
		return new Object[] { inputPort };
	}

}


package be.kuleuven.rodinia.graphiti.rtt.features;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICreateContext;
import org.eclipse.graphiti.features.impl.AbstractCreateFeature;
import org.eclipse.graphiti.mm.pictograms.Diagram;

import be.kueleuven.rodinia.model.rtt.OrocosPackage;
import be.kueleuven.rodinia.model.rtt.RttFactory;
import be.kueleuven.rodinia.model.rtt.TaskContext;
import be.kuleuven.rodinia.graphiti.rtt.util.Util;

public class TaskContextCreateFeature extends AbstractCreateFeature {

	private static final String TITLE = "Create Task Context";

	private static final String USER_QUESTION = "Enter new Task Context name";

	public TaskContextCreateFeature(IFeatureProvider fp) {
		super(fp, "TaskContext", TITLE);
	}

	@Override
	public boolean canCreate(ICreateContext context) {
		return context.getTargetContainer() instanceof Diagram;
	}

	@Override
	public Object[] create(ICreateContext context) {
		String taskContentName = Util.askString(TITLE, USER_QUESTION, "");
		if (taskContentName == null || taskContentName.trim().length() == 0) {
			return EMPTY;
		}

		TaskContext taskContext = RttFactory.eINSTANCE.createTaskContext();
		taskContext.setName(taskContentName);
		taskContext.setNamespace("test1");
		taskContext.setType("test2");
		
        final Object target = getBusinessObjectForPictogramElement(context.getTargetContainer());
        if (target instanceof OrocosPackage) {
            OrocosPackage domainObject = (OrocosPackage) target;
            domainObject.getTaskContexts().add(taskContext);
        }
        
		// do the add
		addGraphicalRepresentation(context, taskContext);

		// return newly created business object(s)
		return new Object[] { taskContext };
	}

}

package be.kuleuven.rodinia.graphiti.rtt.features;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICreateContext;
import org.eclipse.graphiti.features.impl.AbstractCreateFeature;
import org.eclipse.graphiti.mm.pictograms.Diagram;

import be.kueleuven.rodinia.model.rtt.OrocosPackage;
import be.kueleuven.rodinia.model.rtt.RttFactory;
import be.kueleuven.rodinia.model.rtt.TaskContext;

public class TaskContextCreateFeature extends AbstractCreateFeature {

	private static final String TITLE = "Create Task Context";

	public TaskContextCreateFeature(IFeatureProvider fp) {
		super(fp, "TaskContext", TITLE);
	}

	@Override
	public boolean canCreate(ICreateContext context) {
		return context.getTargetContainer() instanceof Diagram;
	}

	@Override
	public Object[] create(ICreateContext context) {

		TaskContext taskContext = RttFactory.eINSTANCE.createTaskContext();
		String taskContentName = "name";
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

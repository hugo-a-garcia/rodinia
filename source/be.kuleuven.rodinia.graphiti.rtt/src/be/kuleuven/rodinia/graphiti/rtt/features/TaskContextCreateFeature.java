package be.kuleuven.rodinia.graphiti.rtt.features;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICreateContext;
import org.eclipse.graphiti.features.impl.AbstractCreateFeature;
import org.eclipse.graphiti.mm.pictograms.Diagram;

import be.kueleuven.rodinia.model.rtt.RttFactory;
import be.kueleuven.rodinia.model.rtt.TaskContext;
import be.kuleuven.rodinia.graphiti.rtt.util.Util;

public class TaskContextCreateFeature extends AbstractCreateFeature {

	private static final String TITLE = "Create Task Context";

	private static final String USER_QUESTION = "Enter new Task Content name";

	public TaskContextCreateFeature(IFeatureProvider fp) {
		super(fp, "TaskContext", TITLE);
	}

	@Override
	public boolean canCreate(ICreateContext context) {
		return context.getTargetContainer() instanceof Diagram;
	}

	@Override
	public Object[] create(ICreateContext context) {
		// ask user for EClass name
		String newClassName = Util.askString(TITLE, USER_QUESTION, "");
		if (newClassName == null || newClassName.trim().length() == 0) {
			return EMPTY;
		}

		// create EClass

		TaskContext newClass = RttFactory.eINSTANCE.createTaskContext();
		//EClass newClass = EcoreFactory.eINSTANCE.createEClass();
		// Add model element to resource.
		// We add the model element to the resource of the diagram for
		// simplicity's sake. Normally, a customer would use its own
		// model persistence layer for storing the business model separately.
		getDiagram().eResource().getContents().add(newClass);
		newClass.setName(newClassName);

		// do the add
		addGraphicalRepresentation(context, newClass);

		// return newly created business object(s)
		return new Object[] { newClass };
	}

}

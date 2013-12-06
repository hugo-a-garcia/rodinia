package be.kuleuven.rodinia.graphiti.rtt.features;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICreateContext;
import org.eclipse.graphiti.features.impl.AbstractCreateFeature;
import org.eclipse.graphiti.mm.algorithms.impl.RectangleImpl;

import be.kueleuven.rodinia.model.rtt.InputPort;
import be.kueleuven.rodinia.model.rtt.RttFactory;
import be.kueleuven.rodinia.model.rtt.TaskContext;

@SuppressWarnings("restriction")
public class InputPortCreateFeature extends AbstractCreateFeature{
	
	public InputPortCreateFeature(IFeatureProvider fp) {
		super(fp, "InputPort", "Create Input Port");
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
					}
				}
			}
		}
		return canCreate;
	}

	@Override
	public Object[] create(ICreateContext context) {

		InputPort inputPort = RttFactory.eINSTANCE.createInputPort();
		inputPort.setName("name");
		
        final Object target = getBusinessObjectForPictogramElement(context.getTargetContainer());
        if (target instanceof TaskContext) {
            TaskContext taskContext = (TaskContext) target;
            taskContext.getInputPorts().add(inputPort);
        }
        
		addGraphicalRepresentation(context, inputPort);
		return new Object[] { inputPort };
	}

}

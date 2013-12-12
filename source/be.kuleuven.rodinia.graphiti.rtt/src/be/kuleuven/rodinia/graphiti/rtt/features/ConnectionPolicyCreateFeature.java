package be.kuleuven.rodinia.graphiti.rtt.features;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICreateConnectionContext;
import org.eclipse.graphiti.features.context.impl.AddConnectionContext;
import org.eclipse.graphiti.features.impl.AbstractCreateConnectionFeature;
import org.eclipse.graphiti.mm.pictograms.Anchor;
import org.eclipse.graphiti.mm.pictograms.Connection;

import be.kueleuven.rodinia.model.rtt.ConnectionPolicy;
import be.kueleuven.rodinia.model.rtt.InputPort;
import be.kueleuven.rodinia.model.rtt.OrocosPackage;
import be.kueleuven.rodinia.model.rtt.OutputPort;
import be.kueleuven.rodinia.model.rtt.impl.RttFactoryImpl;

public class ConnectionPolicyCreateFeature extends AbstractCreateConnectionFeature{
	
	public ConnectionPolicyCreateFeature(IFeatureProvider fp) {
		super(fp, "ConnectionPolicy", "Create Connection Policy");
	}

	@Override
	public boolean canCreate(ICreateConnectionContext context) {
		Object sourcePort = getPortInAnchor(context.getSourceAnchor());
		Object targetPort = getPortInAnchor(context.getTargetAnchor());
		if (sourcePort != null && targetPort != null
				&& sourcePort != targetPort) {
			if ((sourcePort instanceof OutputPort & targetPort instanceof InputPort)
					|| (sourcePort instanceof InputPort & targetPort instanceof OutputPort)) {
				return true;
			}
		}
		return false;
	}

    private Object getPortInAnchor(Anchor anchor) {
        if (anchor != null) {
            Object object =
                getBusinessObjectForPictogramElement(anchor.getParent());
            if (object instanceof InputPort || object instanceof OutputPort) {
                return object;
            }
        }
        return null;
    }
    
    public boolean canStartConnection(ICreateConnectionContext context) {
        if (getPortInAnchor(context.getSourceAnchor()) != null) {
        	return true;
        }
        return false;
    }
 
	public Connection create(ICreateConnectionContext context) {

		Connection newConnection = null;
		Anchor sourceAnchor = context.getSourceAnchor();
		Anchor targetAnchor = context.getTargetAnchor();
		Object sourcePort = getBusinessObjectForPictogramElement(sourceAnchor.getParent());
		Object targetPort = getBusinessObjectForPictogramElement(targetAnchor.getParent());

		Object temp = null;
		if (sourcePort instanceof InputPort) {
			temp = targetPort;
			targetPort = sourcePort;
			sourcePort = temp;
			temp = targetAnchor;
			targetAnchor = sourceAnchor;
			sourceAnchor = (Anchor) temp;
		}

		ConnectionPolicy connectionPolicy = createConnectionPolicy(sourcePort,
				targetPort);
		AddConnectionContext addContext = new AddConnectionContext(
				sourceAnchor, targetAnchor);
		addContext.setNewObject(connectionPolicy);
		newConnection = (Connection) getFeatureProvider().addIfPossible(
				addContext);
		return newConnection;
	}
 
    private ConnectionPolicy createConnectionPolicy(Object source, Object target) {
		ConnectionPolicy connectionPolicy = RttFactoryImpl.eINSTANCE.createConnectionPolicy();
		connectionPolicy.setName("ConnName");
		connectionPolicy.setInputPort((InputPort) target);
		connectionPolicy.setOutputPort((OutputPort) source);
		OrocosPackage orocosPackage = (OrocosPackage) getBusinessObjectForPictogramElement(getDiagram());
		orocosPackage.getConnectionPolicies().add(connectionPolicy);
		return connectionPolicy;
   }
}

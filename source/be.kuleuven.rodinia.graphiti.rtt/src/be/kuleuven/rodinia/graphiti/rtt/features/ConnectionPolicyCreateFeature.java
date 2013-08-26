package be.kuleuven.rodinia.graphiti.rtt.features;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IContext;
import org.eclipse.graphiti.features.context.ICreateConnectionContext;
import org.eclipse.graphiti.features.context.impl.AddConnectionContext;
import org.eclipse.graphiti.features.impl.AbstractCreateConnectionFeature;
import org.eclipse.graphiti.mm.pictograms.Anchor;
import org.eclipse.graphiti.mm.pictograms.Connection;
import org.eclipse.graphiti.mm.pictograms.Diagram;

import be.kueleuven.rodinia.model.rtt.ConnectionPolicy;
import be.kueleuven.rodinia.model.rtt.InputPort;
import be.kueleuven.rodinia.model.rtt.OrocosPackage;
import be.kueleuven.rodinia.model.rtt.OutputPort;
import be.kueleuven.rodinia.model.rtt.impl.RttFactoryImpl;
import be.kuleuven.rodinia.graphiti.rtt.util.Util;

public class ConnectionPolicyCreateFeature extends AbstractCreateConnectionFeature{

	protected ConnectionPolicy newClass = null;
	
	public ConnectionPolicyCreateFeature(IFeatureProvider fp) {
		super(fp, "ConnectionPolicy", "Create Connection Policy");
	}
	
	@Override
	public boolean canExecute(IContext context) {
		boolean ret = false;
		if (context instanceof ICreateConnectionContext) {
			ret = canCreate((ICreateConnectionContext) context) && canEndConnection((ICreateConnectionContext) context);
		}
		return ret;
	}

	@Override
	public boolean canCreate(ICreateConnectionContext context) {
        // return true if both anchors belong to an EClass
        // and those EClasses are not identical
		// and both anchors don't have an edge already
        Object source = getEClass(context.getSourceAnchor());
        Object target = getEClass(context.getTargetAnchor());
        
        if (source instanceof OutputPort && target instanceof InputPort){
        	if (source != null && target != null && source != target) {
        		return true;
        	}
        }
        return false;
	}

    private Object getEClass(Anchor anchor) {
        if (anchor != null) {
            Object object =
                getBusinessObjectForPictogramElement(anchor.getParent());
            if (object instanceof InputPort) {
                return (InputPort) object;
            }
            if (object instanceof OutputPort) {
                return (OutputPort) object;
            }
        }
        return null;
    }
    
    public boolean canStartConnection(ICreateConnectionContext context) {
        // return true if start anchor belongs to a EClass
        if (getEClass(context.getSourceAnchor()) != null && context.getSourceAnchor().getOutgoingConnections().size() == 0 && context.getSourceAnchor().getIncomingConnections().size() == 0) {
        	return true;
        }
        return false;
    }
    
    private boolean canEndConnection(ICreateConnectionContext context){
        if (getEClass(context.getTargetAnchor()) != null && context.getSourceAnchor().getOutgoingConnections().size() == 0 && context.getSourceAnchor().getIncomingConnections().size() == 0) {
        	return true;
        }
    	return false;
    }
 
    public Connection create(ICreateConnectionContext context) {
    	
		//String newClassName = JOptionPane.showInputDialog("The name for the new edge");
    	String newClassName = Util.askString("New ConnectionPolicy", "The name for the new Connection Policy", "");
		if (newClassName == null || newClassName.trim().length() == 0) {
          	return null;
      	}
      
        Connection newConnection = null;
 
        // get EClasses which should be connected
        OutputPort source = (OutputPort) getEClass(context.getSourceAnchor());
        InputPort target = (InputPort) getEClass(context.getTargetAnchor());
 
        if (source != null && target != null) {
            // create new business object
            ConnectionPolicy eReference = createEReference(source, target, newClassName);
            // add connection for business object
            AddConnectionContext addContext =
                new AddConnectionContext(context.getSourceAnchor(), context.getTargetAnchor());
            addContext.setNewObject(eReference);
            newConnection = (Connection) getFeatureProvider().addIfPossible(addContext);
        }
        return newConnection;
    }
 
    /**
    * Creates a EReference between two EClasses.
    */
    private ConnectionPolicy createEReference(OutputPort source, InputPort target, String name) {
        EReference eReference = EcoreFactory.eINSTANCE.createEReference();
        eReference.setName("new EReference");
        eReference.setLowerBound(0);
        eReference.setUpperBound(1);
        if (source instanceof OutputPort && target instanceof InputPort){
        	newClass = RttFactoryImpl.eINSTANCE.createConnectionPolicy();
        	newClass.setName(name);
        	newClass.setInputPort(target);
        	newClass.setOutputPort(source);
        	//source.setOutputConnectionPolicy(newClass);
        	//target.setInputConnectionPolicy(newClass);
        	Diagram a = getDiagram();
        	OrocosPackage graph = (OrocosPackage) getBusinessObjectForPictogramElement(a);
        	graph.getConnectionPolicies().add(newClass);
        }
        return newClass;
   }
}

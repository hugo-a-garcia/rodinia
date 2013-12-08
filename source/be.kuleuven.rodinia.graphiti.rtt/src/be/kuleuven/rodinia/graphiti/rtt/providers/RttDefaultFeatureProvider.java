package be.kuleuven.rodinia.graphiti.rtt.providers;

import org.eclipse.graphiti.dt.IDiagramTypeProvider;
import org.eclipse.graphiti.features.IAddFeature;
import org.eclipse.graphiti.features.ICreateConnectionFeature;
import org.eclipse.graphiti.features.ICreateFeature;
import org.eclipse.graphiti.features.ILayoutFeature;
import org.eclipse.graphiti.features.IMoveShapeFeature;
import org.eclipse.graphiti.features.IReconnectionFeature;
import org.eclipse.graphiti.features.IResizeShapeFeature;
import org.eclipse.graphiti.features.IUpdateFeature;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.context.ICustomContext;
import org.eclipse.graphiti.features.context.ILayoutContext;
import org.eclipse.graphiti.features.context.IMoveShapeContext;
import org.eclipse.graphiti.features.context.IReconnectionContext;
import org.eclipse.graphiti.features.context.IResizeShapeContext;
import org.eclipse.graphiti.features.context.IUpdateContext;
import org.eclipse.graphiti.features.custom.ICustomFeature;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.ui.features.DefaultFeatureProvider;

import be.kueleuven.rodinia.model.rtt.Activity;
import be.kueleuven.rodinia.model.rtt.ConnectionPolicy;
import be.kueleuven.rodinia.model.rtt.EventPort;
import be.kueleuven.rodinia.model.rtt.InputPort;
import be.kueleuven.rodinia.model.rtt.OutputPort;
import be.kueleuven.rodinia.model.rtt.Property;
import be.kueleuven.rodinia.model.rtt.TaskContext;
import be.kuleuven.rodinia.graphiti.rtt.features.ActivityAddFeature;
import be.kuleuven.rodinia.graphiti.rtt.features.ActivityCreateFeature;
import be.kuleuven.rodinia.graphiti.rtt.features.ActivityLayoutFeature;
import be.kuleuven.rodinia.graphiti.rtt.features.ActivityResizeFeature;
import be.kuleuven.rodinia.graphiti.rtt.features.ActivityUpdateFeature;
import be.kuleuven.rodinia.graphiti.rtt.features.ConnectionPolicyAddFeature;
import be.kuleuven.rodinia.graphiti.rtt.features.ConnectionPolicyCreateFeature;
import be.kuleuven.rodinia.graphiti.rtt.features.ConnectionPolicyReconnectFeature;
import be.kuleuven.rodinia.graphiti.rtt.features.CustomChangeColorFeature;
import be.kuleuven.rodinia.graphiti.rtt.features.CustomHideLabelFeature;
import be.kuleuven.rodinia.graphiti.rtt.features.EventPortAddFeature;
import be.kuleuven.rodinia.graphiti.rtt.features.EventPortCreateFeature;
import be.kuleuven.rodinia.graphiti.rtt.features.EventPortMoveFeature;
import be.kuleuven.rodinia.graphiti.rtt.features.EventPortResizeFeature;
import be.kuleuven.rodinia.graphiti.rtt.features.EventPortUpdateFeature;
import be.kuleuven.rodinia.graphiti.rtt.features.InputPortAddFeature;
import be.kuleuven.rodinia.graphiti.rtt.features.InputPortCreateFeature;
import be.kuleuven.rodinia.graphiti.rtt.features.InputPortMoveFeature;
import be.kuleuven.rodinia.graphiti.rtt.features.InputPortResizeFeature;
import be.kuleuven.rodinia.graphiti.rtt.features.InputPortUpdateFeature;
import be.kuleuven.rodinia.graphiti.rtt.features.OutputPortAddFeature;
import be.kuleuven.rodinia.graphiti.rtt.features.OutputPortCreateFeature;
import be.kuleuven.rodinia.graphiti.rtt.features.OutputPortMoveFeature;
import be.kuleuven.rodinia.graphiti.rtt.features.OutputPortResizeFeature;
import be.kuleuven.rodinia.graphiti.rtt.features.OutputPortUpdateFeature;
import be.kuleuven.rodinia.graphiti.rtt.features.PropertyAddFeature;
import be.kuleuven.rodinia.graphiti.rtt.features.PropertyCreateFeature;
import be.kuleuven.rodinia.graphiti.rtt.features.PropertyLayoutFeature;
import be.kuleuven.rodinia.graphiti.rtt.features.PropertyResizeFeature;
import be.kuleuven.rodinia.graphiti.rtt.features.PropertyUpdateFeature;
import be.kuleuven.rodinia.graphiti.rtt.features.TaskContextAddFeature;
import be.kuleuven.rodinia.graphiti.rtt.features.TaskContextCreateFeature;
import be.kuleuven.rodinia.graphiti.rtt.features.TaskContextLayoutFeature;
import be.kuleuven.rodinia.graphiti.rtt.features.TaskContextUpdateFeature;

public class RttDefaultFeatureProvider extends DefaultFeatureProvider {

	public RttDefaultFeatureProvider(IDiagramTypeProvider dtp) {
		super(dtp);
	}

	@Override
	public IAddFeature getAddFeature(IAddContext context) {
	    if (context.getNewObject() instanceof TaskContext) {
	        return new TaskContextAddFeature(this);
	    }
	    if (context.getNewObject() instanceof InputPort){
	    	return new InputPortAddFeature(this);
	    }
	    if (context.getNewObject() instanceof OutputPort){
	    	return new OutputPortAddFeature(this);
	    }
	    if (context.getNewObject() instanceof EventPort){
	    	return new EventPortAddFeature(this);
	    }
	    if (context.getNewObject() instanceof ConnectionPolicy){
	    	return new ConnectionPolicyAddFeature(this);
	    }
	    if (context.getNewObject() instanceof Activity){
	    	return new ActivityAddFeature(this);
	    }
	    if (context.getNewObject() instanceof Property){
	    	return new PropertyAddFeature(this);
	    }
		return super.getAddFeature(context);
	}

	@Override
	public ICreateFeature[] getCreateFeatures() {
		 return new ICreateFeature[] { new ActivityCreateFeature(this), new TaskContextCreateFeature(this), new InputPortCreateFeature(this), new OutputPortCreateFeature(this), new EventPortCreateFeature(this), new PropertyCreateFeature(this) };
	}
	
	@Override
	public ILayoutFeature getLayoutFeature(ILayoutContext context) {
	    PictogramElement pictogramElement = context.getPictogramElement();
	    Object bo = getBusinessObjectForPictogramElement(pictogramElement);
	    if (bo instanceof TaskContext) {
	        return new TaskContextLayoutFeature(this);
	    }
	    if (bo instanceof Activity){
	    	return new ActivityLayoutFeature(this);
	    }
	    if (bo instanceof Property){
	    	return new PropertyLayoutFeature(this);
	    }
	    return super.getLayoutFeature(context);
	} 
	
	@Override
	public IMoveShapeFeature getMoveShapeFeature(IMoveShapeContext context) {
	    Shape shape = context.getShape();
	    Object bo = getBusinessObjectForPictogramElement(shape);
	    if (bo instanceof InputPort) {
	        return new InputPortMoveFeature(this);
	    }
	    if (bo instanceof OutputPort) {
	        return new OutputPortMoveFeature(this);
	    }
	    if (bo instanceof EventPort) {
	        return new EventPortMoveFeature(this);
	    }
	    if (bo instanceof Property){
	    	///return new PropertyMoveFeature(this);
	    	return super.getMoveShapeFeature(context);
	    }
	    return super.getMoveShapeFeature(context);
	} 
	
	@Override
	public IResizeShapeFeature getResizeShapeFeature(
	        IResizeShapeContext context) {
	    Shape shape = context.getShape();
	    Object bo = getBusinessObjectForPictogramElement(shape);
	    if (bo instanceof InputPort) {
	        return new InputPortResizeFeature(this);
	    }
	    if (bo instanceof OutputPort) {
	        return new OutputPortResizeFeature(this);
	    }
	    if (bo instanceof EventPort) {
	        return new EventPortResizeFeature(this);
	    }
	    if (bo instanceof Activity){
	    	return new ActivityResizeFeature(this);
	    }
	    if (bo instanceof Property){
	    	return new PropertyResizeFeature(this);
	    }
	    return super.getResizeShapeFeature(context);
	}
	
	 @Override
	 public ICreateConnectionFeature[] getCreateConnectionFeatures() {
	    return new ICreateConnectionFeature[] {
	        new ConnectionPolicyCreateFeature(this) };
	 } 
	 
	@Override
	public ICustomFeature[] getCustomFeatures(ICustomContext context) {
		return new ICustomFeature[] { new CustomHideLabelFeature(this), 
										new CustomChangeColorFeature(this)};
	} 
	
	@Override
	public IReconnectionFeature getReconnectionFeature(IReconnectionContext context) {
	    return new ConnectionPolicyReconnectFeature(this);
	}
	
	@Override
	public IUpdateFeature getUpdateFeature(IUpdateContext context) {
	   PictogramElement pictogramElement = context.getPictogramElement();
	   if (pictogramElement instanceof ContainerShape) {
	       Object bo = getBusinessObjectForPictogramElement(pictogramElement);
	       if (bo instanceof TaskContext) {
	           return new TaskContextUpdateFeature(this);
	       }
	       if (bo instanceof Activity) {
	           return new ActivityUpdateFeature(this);
	       }
	       if (bo instanceof InputPort) {
	           return new InputPortUpdateFeature(this);
	       }
	       if (bo instanceof OutputPort) {
	           return new OutputPortUpdateFeature(this);
	       }
	       if (bo instanceof EventPort) {
	           return new EventPortUpdateFeature(this);
	       }
	       if (bo instanceof ConnectionPolicy) {
	           return new OutputPortUpdateFeature(this);
	       }
	       if (bo instanceof Property) {
	    	   return new PropertyUpdateFeature(this);
	       }
	   }
	   return super.getUpdateFeature(context);
	} 

}

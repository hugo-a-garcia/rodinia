package be.kuleuven.rodinia.graphiti.rtt.providers;

import org.eclipse.graphiti.dt.IDiagramTypeProvider;
import org.eclipse.graphiti.features.IAddFeature;
import org.eclipse.graphiti.features.ICreateFeature;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.ui.features.DefaultFeatureProvider;

import be.kueleuven.rodinia.model.rtt.TaskContext;
import be.kuleuven.rodinia.graphiti.rtt.features.TaskContextAddFeature;
import be.kuleuven.rodinia.graphiti.rtt.features.TaskContextCreateFeature;

public class RttDefaultFeatureProvider extends DefaultFeatureProvider {

	public RttDefaultFeatureProvider(IDiagramTypeProvider dtp) {
		super(dtp);
	}

	@Override
	public IAddFeature getAddFeature(IAddContext context) {
	    if (context.getNewObject() instanceof TaskContext) {
	        return new TaskContextAddFeature(this);
	    }
		return super.getAddFeature(context);
	}

	@Override
	public ICreateFeature[] getCreateFeatures() {
		 return new ICreateFeature[] { new TaskContextCreateFeature(this) };
	}

}

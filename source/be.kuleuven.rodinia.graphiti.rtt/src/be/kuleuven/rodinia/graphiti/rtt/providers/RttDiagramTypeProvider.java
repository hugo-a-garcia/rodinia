package be.kuleuven.rodinia.graphiti.rtt.providers;

import org.eclipse.graphiti.dt.AbstractDiagramTypeProvider;

public class RttDiagramTypeProvider extends AbstractDiagramTypeProvider {

	public RttDiagramTypeProvider() {
		super();
		setFeatureProvider(new RttDefaultFeatureProvider(this));
	}

}

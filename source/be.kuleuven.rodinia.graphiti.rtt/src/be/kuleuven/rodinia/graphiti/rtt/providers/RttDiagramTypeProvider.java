package be.kuleuven.rodinia.graphiti.rtt.providers;

import org.eclipse.graphiti.dt.AbstractDiagramTypeProvider;
import org.eclipse.graphiti.tb.IToolBehaviorProvider;

public class RttDiagramTypeProvider extends AbstractDiagramTypeProvider {

	private IToolBehaviorProvider[] toolBehaviorProviders;
	
	public RttDiagramTypeProvider() {
		super();
		setFeatureProvider(new RttDefaultFeatureProvider(this));
	}
	
    @Override
    public IToolBehaviorProvider[] getAvailableToolBehaviorProviders() {
        if (toolBehaviorProviders == null) {
            toolBehaviorProviders =
                new IToolBehaviorProvider[] { new RttToolBehaviorProvider(this) };
        }
        return toolBehaviorProviders;
    }

}

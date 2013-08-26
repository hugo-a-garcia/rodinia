package be.kuleuven.rodinia.graphiti.rtt.features;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IReconnectionContext;
import org.eclipse.graphiti.features.impl.DefaultReconnectionFeature;

public class ConnectionPolicyReconnectFeature extends DefaultReconnectionFeature {
	 
    public ConnectionPolicyReconnectFeature(IFeatureProvider fp) {
        super(fp);
    }

    @Override
    public boolean canReconnect(IReconnectionContext context) {
        //do not allow to reconnect
        return false;
    }
}

package be.kuleuven.rodinia.graphiti.rtt.features;

import org.eclipse.graphiti.features.IDirectEditingInfo;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IAddConnectionContext;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.impl.AbstractAddShapeFeature;
import org.eclipse.graphiti.mm.algorithms.Polyline;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.pictograms.Connection;
import org.eclipse.graphiti.mm.pictograms.ConnectionDecorator;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.services.IPeCreateService;
import org.eclipse.graphiti.util.ColorConstant;
import org.eclipse.graphiti.util.IColorConstant;

import be.kueleuven.rodinia.model.rtt.ConnectionPolicy;

public class ConnectionPolicyAddFeature extends AbstractAddShapeFeature {

	private static final IColorConstant E_REFERENCE_FOREGROUND = new ColorConstant(98, 131, 167);
	
	public ConnectionPolicyAddFeature(IFeatureProvider fp) {
		super(fp);
	}

	@Override
	public boolean canAdd(IAddContext context) {
		return true;
	}

	@Override
    public PictogramElement add(IAddContext context) {
        IAddConnectionContext addConContext = (IAddConnectionContext) context;
        ConnectionPolicy connectionPolicy = (ConnectionPolicy) context.getNewObject();
        IPeCreateService peCreateService = Graphiti.getPeCreateService();
       
        // Connection polyline
        Connection connection = peCreateService
            .createFreeFormConnection(getDiagram());
        connection.setStart(addConContext.getSourceAnchor());
        connection.setEnd(addConContext.getTargetAnchor());
 
        IGaService gaService = Graphiti.getGaService();
        Polyline polyline = gaService.createPolyline(connection);
        polyline.setLineWidth(2);
        polyline.setForeground(manageColor(E_REFERENCE_FOREGROUND));
 
        // Text decorator for connection name
        ConnectionDecorator textDecorator =
            peCreateService.createConnectionDecorator(connection, true,
            0.5, true);
        Text text = gaService.createDefaultText(getDiagram(),textDecorator);
        text.setForeground(manageColor(IColorConstant.BLACK));
        gaService.setLocation(text, 10, 0);
        text.setValue(connectionPolicy.getName());
        
        IDirectEditingInfo directEditingInfo =
                getFeatureProvider().getDirectEditingInfo();
            directEditingInfo.setMainPictogramElement(textDecorator);
        
        link(connection, connectionPolicy);
        return connection;
    }

}

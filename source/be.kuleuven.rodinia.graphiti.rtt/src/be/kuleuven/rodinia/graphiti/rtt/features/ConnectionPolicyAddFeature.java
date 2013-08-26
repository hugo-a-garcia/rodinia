package be.kuleuven.rodinia.graphiti.rtt.features;

import org.eclipse.graphiti.features.IDirectEditingInfo;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IAddConnectionContext;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.impl.AbstractAddShapeFeature;
import org.eclipse.graphiti.mm.GraphicsAlgorithmContainer;
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
        ConnectionPolicy addedEReference = (ConnectionPolicy) context.getNewObject();
        IPeCreateService peCreateService = Graphiti.getPeCreateService();
       
        // CONNECTION WITH POLYLINE
        Connection connection = peCreateService
            .createFreeFormConnection(getDiagram());
        connection.setStart(addConContext.getSourceAnchor());
        connection.setEnd(addConContext.getTargetAnchor());
 
        IGaService gaService = Graphiti.getGaService();
        Polyline polyline = gaService.createPolyline(connection);
        polyline.setLineWidth(2);
        polyline.setForeground(manageColor(E_REFERENCE_FOREGROUND));
 
        // add dynamic text decorator for the association name
        ConnectionDecorator textDecorator =
            peCreateService.createConnectionDecorator(connection, true,
            0.5, true);
        Text text = gaService.createDefaultText(getDiagram(),textDecorator);
        text.setForeground(manageColor(IColorConstant.BLACK));
        gaService.setLocation(text, 10, 0);
        // set reference name in the text decorator
        ConnectionPolicy eReference = (ConnectionPolicy) context.getNewObject();
        text.setValue(eReference.getName());
    
        // add static graphical decorator (composition and navigable)
        ConnectionDecorator cd;
        cd = peCreateService
              .createConnectionDecorator(connection, false, 1.0, true);
        createArrow(cd);
        
        IDirectEditingInfo directEditingInfo =
                getFeatureProvider().getDirectEditingInfo();
            // set container shape for direct editing after object creation
            directEditingInfo.setMainPictogramElement(textDecorator);
        
        link(connection, addedEReference);
        return connection;
    }
	
	//create an arrow shape for the connection
	private Polyline createArrow(GraphicsAlgorithmContainer gaContainer) {
	    IGaService gaService = Graphiti.getGaService();
	    Polyline polyline =
	        gaService.createPolyline(gaContainer, new int[] { -15, 10, 0, 0, -15,
	                -10 });
	    polyline.setForeground(manageColor(E_REFERENCE_FOREGROUND));
	    polyline.setLineWidth(2);
	    return polyline;
	}

}

package be.kuleuven.rodinia.graphiti.rtt.propertiesTab;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.ui.platform.AbstractPropertySectionFilter;

import be.kueleuven.rodinia.model.rtt.EventPort;

public class EventPortFilter extends AbstractPropertySectionFilter {
 
    @Override
    protected boolean accept(PictogramElement pe) {
        EObject eObject =
            Graphiti.getLinkService()
            .getBusinessObjectForLinkedPictogramElement(pe);
        if (eObject instanceof EventPort) {
            return true;
        }
        return false;
    }
}
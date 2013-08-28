package be.kuleuven.rodinia.graphiti.rtt.propertiesTab;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.ui.platform.AbstractPropertySectionFilter;

import be.kueleuven.rodinia.model.rtt.Activity;
//import be.kueleuven.rodinia.model.rtt.ConnectionPolicy;
import be.kueleuven.rodinia.model.rtt.InputPort;
import be.kueleuven.rodinia.model.rtt.OutputPort;
import be.kueleuven.rodinia.model.rtt.Property;
import be.kueleuven.rodinia.model.rtt.TaskContext;

public class RttStructureFilter extends AbstractPropertySectionFilter {
 
    @Override
    protected boolean accept(PictogramElement pe) {
        EObject eObject =
            Graphiti.getLinkService()
            .getBusinessObjectForLinkedPictogramElement(pe);
        if (eObject instanceof TaskContext || 
        		eObject instanceof Activity || 
        		eObject instanceof InputPort || 
        		eObject instanceof OutputPort ||
        		eObject instanceof Property//|| 
        		//eObject instanceof ConnectionPolicy) {
        		){
            return true;
        }
        return false;
    }

}

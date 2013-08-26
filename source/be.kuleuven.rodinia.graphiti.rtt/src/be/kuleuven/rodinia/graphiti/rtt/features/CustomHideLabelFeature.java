package be.kuleuven.rodinia.graphiti.rtt.features;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICustomContext;
import org.eclipse.graphiti.features.custom.AbstractCustomFeature;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.platform.IPlatformImageConstants;

import be.kueleuven.rodinia.model.rtt.InputPort;
import be.kueleuven.rodinia.model.rtt.OutputPort;

public class CustomHideLabelFeature extends AbstractCustomFeature {
 
    private boolean hasDoneChanges = false;
     
    public CustomHideLabelFeature(IFeatureProvider fp) {
        super(fp);
    }
 
    @Override
    public String getName() {
        return "Toggle label(s)";
    }
 
    @Override
    public String getDescription() {
        return "Switches one or more label(s) visuality";
    }
    
    @Override
    public String getImageId() {
          return IPlatformImageConstants.IMG_EDIT_COLLAPSE;
    }
 
    @Override
    public boolean canExecute(ICustomContext context) {
        // allow rename if exactly one pictogram element
        // representing a EClass is selected
        boolean ret = false;
        PictogramElement[] pes = context.getPictogramElements();
        if (pes != null && pes.length == 1) {
            Object bo = getBusinessObjectForPictogramElement(pes[0]);
            if (bo instanceof InputPort || bo instanceof OutputPort) {
                ret = true;
            }
        }
        if (pes != null && pes.length > 1){
        	ret = true;
        	for (int i = 0; i < pes.length; i++){
        		Object bo = getBusinessObjectForPictogramElement(pes[i]);
        		if (!(bo instanceof InputPort || bo instanceof OutputPort)){
        			ret = false;
        		}
        	}
        }
        return ret;
    }
 
    @Override
    public void execute(ICustomContext context) {
        PictogramElement[] pes = context.getPictogramElements();
		 ContainerShape containerShape =
		            (ContainerShape) pes[0];
        if (pes != null && pes.length == 1) {
            Object bo = getBusinessObjectForPictogramElement(pes[0]);
            if (bo instanceof InputPort || bo instanceof OutputPort) {
                if (containerShape.getChildren().get(1).getGraphicsAlgorithm().getTransparency() == 0.0){
                	containerShape.getChildren().get(1).getGraphicsAlgorithm().setTransparency(1.0);
                } else {
                	containerShape.getChildren().get(1).getGraphicsAlgorithm().setTransparency(0.0);
                }
                updatePictogramElement(pes[0]);
            }
        }
        if (pes != null && pes.length > 1){
        	for (int i = 0; i < pes.length; i++){
        		Object bo = getBusinessObjectForPictogramElement(pes[i]);
        		containerShape =
    		            (ContainerShape) pes[i];
        		if (bo instanceof InputPort || bo instanceof OutputPort){
                    if (containerShape.getChildren().get(1).getGraphicsAlgorithm().getTransparency() == 0.0){
                    	containerShape.getChildren().get(1).getGraphicsAlgorithm().setTransparency(1.0);
                    } else {
                    	containerShape.getChildren().get(1).getGraphicsAlgorithm().setTransparency(0.0);
                    }
                    updatePictogramElement(pes[i]);
        		}
        	}
        }
    }
 
    @Override
    public boolean hasDoneChanges() {
           return this.hasDoneChanges;
    }
}


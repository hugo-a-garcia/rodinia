package be.kuleuven.rodinia.graphiti.rtt.providers;

import org.eclipse.emf.common.util.EList;
import org.eclipse.graphiti.dt.IDiagramTypeProvider;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICustomContext;
import org.eclipse.graphiti.features.context.IPictogramElementContext;
import org.eclipse.graphiti.features.context.impl.CustomContext;
import org.eclipse.graphiti.features.custom.ICustomFeature;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.platform.IPlatformImageConstants;
import org.eclipse.graphiti.tb.ContextButtonEntry;
import org.eclipse.graphiti.tb.ContextEntryHelper;
import org.eclipse.graphiti.tb.ContextMenuEntry;
import org.eclipse.graphiti.tb.DefaultToolBehaviorProvider;
import org.eclipse.graphiti.tb.IContextButtonEntry;
import org.eclipse.graphiti.tb.IContextButtonPadData;
import org.eclipse.graphiti.tb.IContextMenuEntry;
import org.eclipse.graphiti.tb.IDecorator;
import org.eclipse.graphiti.tb.ImageDecorator;

import be.kueleuven.rodinia.model.rtt.Activity;
import be.kueleuven.rodinia.model.rtt.InputPort;
import be.kueleuven.rodinia.model.rtt.OutputPort;
import be.kueleuven.rodinia.model.rtt.TaskContext;
import be.kuleuven.rodinia.graphiti.rtt.features.CustomHideLabelFeature;

@SuppressWarnings("unused")
public class RttToolBehaviorProvider extends DefaultToolBehaviorProvider{

	public RttToolBehaviorProvider(IDiagramTypeProvider diagramTypeProvider) {
		super(diagramTypeProvider);
	}
	


	@Override
	public IContextButtonPadData getContextButtonPad(
	                                   IPictogramElementContext context) {
	    IContextButtonPadData data = super.getContextButtonPad(context);
	    PictogramElement pe = context.getPictogramElement();
	 
	    // 1. set the generic context buttons
	    // note, that we do not add 'remove' (just as an example)
	    setGenericContextButtons(data, pe, CONTEXT_BUTTON_DELETE | CONTEXT_BUTTON_REMOVE | CONTEXT_BUTTON_UPDATE);
	    
	    // 2. set the collapse button
	    // simply use a dummy custom feature (senseless example)
	    CustomContext cc = new CustomContext(new PictogramElement[] { pe });
	    ICustomFeature[] cf = getFeatureProvider().getCustomFeatures(cc);
	    for (int i = 0; i < cf.length; i++) {
	        ICustomFeature iCustomFeature = cf[i];
	        if (iCustomFeature instanceof CustomHideLabelFeature) {
	            IContextButtonEntry collapseButton = ContextEntryHelper.
	               createCollapseContextButton(true, iCustomFeature, cc);
	            data.setCollapseContextButton(collapseButton);
	            break;
	        }
	    }
	   
	    return data;
	}

	@Override
	public IContextMenuEntry[] getContextMenu(ICustomContext context) {
	    // create a sub-menu for all custom features
	    ContextMenuEntry subMenu = new ContextMenuEntry(null, context);
	    subMenu.setText("Custom");
	    subMenu.setDescription("Custom features submenu");
	    // display sub-menu hierarchical or flat
	    subMenu.setSubmenu(true);
	
	    // create a menu-entry in the sub-menu for each custom feature
	    ICustomFeature[] customFeatures = getFeatureProvider().getCustomFeatures(context);
	    for (int i = 0; i < customFeatures.length; i++) {
	         ICustomFeature customFeature = customFeatures[i];
	         if (customFeature.isAvailable(context)) {
	             ContextMenuEntry menuEntry = new ContextMenuEntry(customFeature, context);
	             subMenu.add(menuEntry);
	         }
	     }
	
	     IContextMenuEntry ret[] = new IContextMenuEntry[] { subMenu };
	     return ret;
	}
	
	@Override
	public String getToolTip(GraphicsAlgorithm ga) {
	    PictogramElement pe = ga.getPictogramElement();
	    Object bo = getFeatureProvider().getBusinessObjectForPictogramElement(pe);
	    if (bo instanceof TaskContext) {
	        String name = ((TaskContext)bo).getName();
	        if (name != null && !name.isEmpty()) {
	            return name;        
	        }
	    }
	    if (bo instanceof InputPort) {
	        String name = ((InputPort)bo).getName();
	        if (name != null && !name.isEmpty()) {
	            return name;        
	        }
	    }
	    if (bo instanceof OutputPort) {
	        String name = ((OutputPort)bo).getName();
	        if (name != null && !name.isEmpty()) {
	            return name;        
	        }
	    }
	    if (bo instanceof Activity) {
	        String name = ((Activity)bo).getName();
	        if (name != null && !name.isEmpty()) {
	            return name;        
	        }
	    }
	    return (String) super.getToolTip(ga);
	}
	
	@Override
	public GraphicsAlgorithm[] getClickArea(PictogramElement pe) {
	    IFeatureProvider featureProvider = getFeatureProvider();
	    Object bo = featureProvider.getBusinessObjectForPictogramElement(pe);
	    if (bo instanceof TaskContext) {
	        GraphicsAlgorithm invisible = pe.getGraphicsAlgorithm();
	        return new GraphicsAlgorithm[] { ((ContainerShape)pe).getChildren().get(0).getGraphicsAlgorithm() };
	    }
	    if (bo instanceof InputPort || bo instanceof OutputPort){
	    	GraphicsAlgorithm invisible = pe.getGraphicsAlgorithm();
	        return new GraphicsAlgorithm[] { ((ContainerShape)pe).getChildren().get(0).getGraphicsAlgorithm(), ((ContainerShape)pe).getChildren().get(1).getGraphicsAlgorithm() };
	    }
	    return super.getClickArea(pe);
	}

	@Override
	public GraphicsAlgorithm getSelectionBorder(PictogramElement pe) {
	    if (pe instanceof ContainerShape) {
		    IFeatureProvider featureProvider = getFeatureProvider();
		    Object bo = featureProvider.getBusinessObjectForPictogramElement(pe);
		    if (bo instanceof TaskContext){
		    	if (((ContainerShape)pe).getChildren().size() != 0){
		    		return ((ContainerShape)pe).getChildren().get(0).getGraphicsAlgorithm();
		    	}
		    }
		    if (bo instanceof InputPort || bo instanceof OutputPort){
		    	if (((ContainerShape)pe).getChildren().size() != 0){
		    		return ((ContainerShape)pe).getChildren().get(0).getGraphicsAlgorithm();
		    	}
		    }
	    }
	    return super.getSelectionBorder(pe);
	} 
	
	@Override
	public IDecorator[] getDecorators(PictogramElement pe) {
	    IFeatureProvider featureProvider = getFeatureProvider();
	    Object bo = featureProvider.getBusinessObjectForPictogramElement(pe);
	    if (bo instanceof Activity) {
	        Activity eClass = (Activity) bo;
	        String name = eClass.getName();
	        if (eClass.getTaskContext() == null) {
	            IDecorator imageRenderingDecorator =
	                new ImageDecorator(
	                    IPlatformImageConstants.IMG_ECLIPSE_WARNING_TSK);
	            imageRenderingDecorator
	                .setMessage("No TaskContext for Activity found");
	            return new IDecorator[] { imageRenderingDecorator };
	        }
	    }
	 
	    return super.getDecorators(pe);
	}



}

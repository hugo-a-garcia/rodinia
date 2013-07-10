package be.kuleuven.rodinia.cdt.transform.rtt.handler;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;

import be.kuleuven.rodinia.cdt.transform.rtt.Activator;
import be.kuleuven.rodinia.cdt.transform.rtt.Component;
import be.kuleuven.rodinia.epsilon.service.egl.EglTransformParameter;

public class StructureHandler extends AbstractHandler {
	
	private IResource resource;

	public StructureHandler() {
	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		ISelection currentSelection = HandlerUtil.getCurrentSelection(event);
		if (currentSelection instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) currentSelection).getFirstElement();
			if(firstElement instanceof IResource) {
				resource = (IResource) firstElement;
				String projectPath = resource.getProject().getLocation().toOSString();
				doTransformations(projectPath);
			}
			
		}
		return null;
	}

	private void doTransformations(String projectPath) {
		EglTransformParameter transformParameter = new EglTransformParameter();
		
		String eglTransformFileName = "epsilon/package.egl";
		String outputRoot = projectPath;
		String pluginID = Activator.PLUGIN_ID;
		String sourceMetaModelURI = "be.kueleuven.rodinia.model.rtt";
		String sourceModelFilePath = resource.getLocation().toOSString();
		//String sourceName = null;
		boolean sourceReadOnLoad = true;
		boolean sourceStoreOnDisposal = false;
		String transformName = "boo";
		
		transformParameter.setEglTransformFileName(eglTransformFileName);
		transformParameter.setOutputRoot(outputRoot);
		transformParameter.setPluginID(pluginID);
		transformParameter.setSourceMetaModelURI(sourceMetaModelURI);
		transformParameter.setSourceModelFilePath(sourceModelFilePath);
		//transformParameter.setSourceName(sourceName);
		transformParameter.setSourceReadOnLoad(sourceReadOnLoad);
		transformParameter.setSourceStoreOnDisposal(sourceStoreOnDisposal);
		transformParameter.setTransformName(transformName);
		//IEglTransformService eglTransformService = EglComponent.getInstance().getEglTransformService();
		
		Component componentInstance = Component.getInstance();
		componentInstance.getEglTransformService().doEglTransform(transformParameter);
	}

}

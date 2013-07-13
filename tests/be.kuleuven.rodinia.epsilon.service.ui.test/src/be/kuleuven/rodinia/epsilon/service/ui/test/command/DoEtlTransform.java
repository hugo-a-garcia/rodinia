package be.kuleuven.rodinia.epsilon.service.ui.test.command;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IResource;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;

import be.kuleuven.rodinia.epsilon.service.ui.test.Activator;
import be.kuleuven.rodinia.epsilon.service.ui.test.component.Component;
import be.kuleuven.rodinia.epsilon.service.etl.EtlTransformParameter;
import be.kuleuven.rodinia.epsilon.service.etl.IEtlTransformService;

public class DoEtlTransform extends AbstractHandler {
	
	private IResource resource;

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
		
		EtlTransformParameter transformParameter = new EtlTransformParameter();
		
		String pluginID = Activator.PLUGIN_ID;
		String etlTransformPath = "epsilon/transform.etl";
		String sourceName = "Source";
		String sourceMetaModelURI = "be.kuleuven.rodinia.epsilon.service.ui.test.model.square";
		String sourceModelFilePath = resource.getLocation().toOSString();
		boolean sourceReadOnLoad = true;
		boolean sourceStoreOnDisposal = false;
		String targetName = "Target";
		String targetMetaModelURI = "be.kuleuven.rodinia.epsilon.service.ui.test.model.circle";
		String targetModelFilePath = "/home/hugo/out.circle";//createTarget(projectPath, resource.getName());;
		boolean targetReadOnLoad = false;
		boolean targetStoreOnDisposal = true;
		String transformName = "ETL Test Transform";
		
		URI sourceModelURI = URI.createFileURI(sourceModelFilePath);
		URI targetModelURI = URI.createFileURI(targetModelFilePath);
		
		transformParameter.setTransformName(transformName);
		transformParameter.setEtlTransformPath(etlTransformPath);
		transformParameter.setPluginID(pluginID);
		transformParameter.setSourceMetaModelURI(sourceMetaModelURI);
		transformParameter.setSourceModelFilePath(sourceModelFilePath);
		transformParameter.setSourceModelURI(sourceModelURI);
		transformParameter.setSourceName(sourceName);
		transformParameter.setSourceReadOnLoad(sourceReadOnLoad);
		transformParameter.setSourceStoreOnDisposal(sourceStoreOnDisposal);
		transformParameter.setTargetMetaModelURI(targetMetaModelURI);
		transformParameter.setTargetModelFilePath(targetModelFilePath);
		transformParameter.setTargetModelURI(targetModelURI);
		transformParameter.setTargetName(targetName);
		transformParameter.setTargetReadOnLoad(targetReadOnLoad);
		transformParameter.setTargetStoreOnDisposal(targetStoreOnDisposal);
		
		Component componentInstance = Component.getInstance();
		IEtlTransformService service = componentInstance.getEtlTransformService();
		service.doEtlTransform(transformParameter);
		
	}

}

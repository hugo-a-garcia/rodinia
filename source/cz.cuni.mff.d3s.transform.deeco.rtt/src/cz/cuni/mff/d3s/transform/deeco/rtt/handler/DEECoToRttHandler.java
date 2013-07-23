package cz.cuni.mff.d3s.transform.deeco.rtt.handler;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IResource;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;

import cz.cuni.mff.d3s.transform.deeco.rtt.Activator;
import cz.cuni.mff.d3s.transform.deeco.rtt.Component;
import be.kueleuven.rodinia.model.rtt.RttFactory;
import be.kueleuven.rodinia.model.rtt.RttPackage;
import be.kuleuven.rodinia.epsilon.service.etl.EtlTransformParameter;

public class DEECoToRttHandler extends AbstractHandler {
	
	private IResource resource;

	public DEECoToRttHandler() {
	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		ISelection currentSelection = HandlerUtil.getCurrentSelection(event);
		if (currentSelection instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) currentSelection).getFirstElement();
			if(firstElement instanceof IResource) {
				resource = (IResource) firstElement;
				String projectPath = resource.getProject().getLocation().toOSString();
				doEtlTransformation(projectPath);
			}
			
		}
		return null;
	}
	
	private void doEtlTransformation(String projectPath) {
		EtlTransformParameter transformParameter = new EtlTransformParameter();
		
		String pluginID = Activator.PLUGIN_ID;
		String etlTransformPath = "epsilon/DeecoToRtt.etl";
		String sourceName = "Source";
		String sourceMetaModelURI = "cz.cuni.mff.d3s.model.deeco";
		String sourceModelFilePath = resource.getLocation().toOSString();
		boolean sourceReadOnLoad = true;
		boolean sourceStoreOnDisposal = false;
		String targetName = "Target";
		String targetMetaModelURI = "be.kueleuven.rodinia.model.rtt";
		String targetModelFilePath = createTarget(projectPath, resource.getName());;
		boolean targetReadOnLoad = false;
		boolean targetStoreOnDisposal = true;
		URI sourceModelURI = URI.createFileURI(sourceModelFilePath);
		URI targetModelURI = URI.createFileURI(targetModelFilePath);
		
		String transformName = "DEECo RTT Transform";
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
		componentInstance.getEtlTransformService().doEtlTransform(transformParameter);
	}
	
	private String createTarget(String projectPath, String name) {
		String fileName = name.substring(0, name.indexOf(".deeco"));
		String fileString = projectPath + "/model/" + fileName + ".rtt";
		RttPackage rttPackage = RttFactory.eINSTANCE.getRttPackage().eINSTANCE;
		return fileString;
	}

}

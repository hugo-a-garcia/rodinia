package be.kuleuven.rodinia.cdt.transform.rtt.handler;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IResource;
import org.eclipse.emf.common.util.URI;
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
				String outputRoot = resource.getProject().getLocation().toOSString();
				URI resrouceURI = URI.createPlatformResourceURI(resource.getFullPath().toString(), false);
				EglTransformParameter transformParameter = buildEglTransformParameter(
						outputRoot, resrouceURI);
				Component componentInstance = Component.getInstance();
				componentInstance.getEglTransformService().doEglTransform(transformParameter);
				//doEtlTransformation(projectPath);
			}
		}
		return null;
	}

	private EglTransformParameter buildEglTransformParameter(String outputRoot,
			URI resrouceURI) {
		EglTransformParameter transformParameter = new EglTransformParameter();
		
		String eglTransformFileName = "epsilon/package.egl";
		String pluginID = Activator.PLUGIN_ID;
		String sourceMetaModelURI = "be.kueleuven.rodinia.model.rtt";
		String sourceModelFilePath = resource.getLocation().toOSString();
		boolean sourceReadOnLoad = true;
		boolean sourceStoreOnDisposal = false;
		String transformName = "RTT ETL Transform";
		
		transformParameter.setTransformName(transformName);
		transformParameter.setEglTransformFileName(eglTransformFileName);
		transformParameter.setOutputRoot(outputRoot);
		transformParameter.setPluginID(pluginID);
		transformParameter.setSourceMetaModelURI(sourceMetaModelURI);
		transformParameter.setSourceModelFilePath(sourceModelFilePath);
		transformParameter.setSourceModelURI(resrouceURI);
		transformParameter.setSourceReadOnLoad(sourceReadOnLoad);
		transformParameter.setSourceStoreOnDisposal(sourceStoreOnDisposal);
		return transformParameter;
	}
	
// Below is unused code for an ETL transformation (cpf file)	
	
//	private void doEtlTransformation(String projectPath) {
//		EtlTransformParameter transformParameter = new EtlTransformParameter();
//		
//		String pluginID = Activator.PLUGIN_ID;
//		String etlTransformPath = "epsilon/rttTocpf.etl";
//		String sourceName = "Source";
//		String sourceMetaModelURI = "be.kueleuven.rodinia.model.rtt";
//		String sourceModelFilePath = resource.getLocation().toOSString();
//		boolean sourceReadOnLoad = true;
//		boolean sourceStoreOnDisposal = false;
//		String targetName = "Target";
//		String targetMetaModelURI = "be.kuleuven.rodinia.model.cpf";
//		String targetModelFilePath = createTarget(projectPath, resource.getName());;
//		boolean targetReadOnLoad = false;
//		boolean targetStoreOnDisposal = true;
//
//		URI psourceModelURI = URI.createPlatformResourceURI(sourceModelFilePath, false);
//		URI ptargetModelURI = URI.createPlatformResourceURI(targetModelFilePath, false);
//		
//		URI sourceModelURI = URI.createFileURI(sourceModelFilePath);
//		URI targetModelURI = URI.createFileURI(targetModelFilePath);
//		
//		String transformName = "ETL RTT Transform";
//		transformParameter.setTransformName(transformName);
//		transformParameter.setEtlTransformPath(etlTransformPath);
//		transformParameter.setPluginID(pluginID);
//		transformParameter.setSourceMetaModelURI(sourceMetaModelURI);
//		transformParameter.setSourceModelFilePath(sourceModelFilePath);
//		transformParameter.setSourceModelURI(sourceModelURI);
//		transformParameter.setSourceName(sourceName);
//		transformParameter.setSourceReadOnLoad(sourceReadOnLoad);
//		transformParameter.setSourceStoreOnDisposal(sourceStoreOnDisposal);
//		transformParameter.setTargetMetaModelURI(targetMetaModelURI);
//		transformParameter.setTargetModelFilePath(targetModelFilePath);
//		transformParameter.setTargetModelURI(targetModelURI);
//		transformParameter.setTargetName(targetName);
//		transformParameter.setTargetReadOnLoad(targetReadOnLoad);
//		transformParameter.setTargetStoreOnDisposal(targetStoreOnDisposal);
//		
//		Component componentInstance = Component.getInstance();
//		componentInstance.getEtlTransformService().doEtlTransform(transformParameter);
//	}
//	
//	private String createTarget(String projectPath, String name) {
//		String fileName = name.substring(0, name.indexOf(".rtt"));
//		String fileString = projectPath + "/deployment/"
//				+ fileName + ".cpf";
//		CpfPackage cpfPackage = CpfFactory.eINSTANCE.getCpfPackage().eINSTANCE;
//		return fileString;
//	}

}

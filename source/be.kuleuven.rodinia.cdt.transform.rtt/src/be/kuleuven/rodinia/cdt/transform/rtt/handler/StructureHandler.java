package be.kuleuven.rodinia.cdt.transform.rtt.handler;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.best_of_robotics.model.Cpf.CpfFactory;
import org.best_of_robotics.model.Cpf.CpfPackage;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;

import be.kuleuven.rodinia.cdt.transform.rtt.Activator;
import be.kuleuven.rodinia.cdt.transform.rtt.Component;
import be.kuleuven.rodinia.epsilon.service.egl.EglTransformParameter;
import be.kuleuven.rodinia.epsilon.service.etl.EtlTransformParameter;

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
		doEglTransformation(projectPath);
		doEtlTransformation(projectPath);
	}

	private void doEglTransformation(String projectPath) {
		EglTransformParameter transformParameter = new EglTransformParameter();
		
		String eglTransformFileName = "epsilon/package.egl";
		String outputRoot = projectPath;
		String pluginID = Activator.PLUGIN_ID;
		String sourceMetaModelURI = "be.kueleuven.rodinia.model.rtt";
		String sourceModelFilePath = resource.getLocation().toOSString();
		//String sourceName = null;
		boolean sourceReadOnLoad = true;
		boolean sourceStoreOnDisposal = false;
		String transformName = "RTT ETL Transform";
		
		transformParameter.setTransformName(transformName);
		transformParameter.setEglTransformFileName(eglTransformFileName);
		transformParameter.setOutputRoot(outputRoot);
		transformParameter.setPluginID(pluginID);
		transformParameter.setSourceMetaModelURI(sourceMetaModelURI);
		transformParameter.setSourceModelFilePath(sourceModelFilePath);
		//transformParameter.setSourceName(sourceName);
		transformParameter.setSourceReadOnLoad(sourceReadOnLoad);
		transformParameter.setSourceStoreOnDisposal(sourceStoreOnDisposal);
		//IEglTransformService eglTransformService = EglComponent.getInstance().getEglTransformService();
		
		Component componentInstance = Component.getInstance();
		componentInstance.getEglTransformService().doEglTransform(transformParameter);
	}
	
	private void doEtlTransformation(String projectPath) {
		EtlTransformParameter transformParameter = new EtlTransformParameter();
		
		String pluginID = Activator.PLUGIN_ID;
		String etlTransformPath = "epsilon/rttTocpf.etl";
		String sourceName = "Source";
		String sourceMetaModelURI = "be.kueleuven.rodinia.model.rtt";
		String sourceModelFilePath = resource.getLocation().toOSString();
		boolean sourceReadOnLoad = true;
		boolean sourceStoreOnDisposal = false;
		String targetName = "Target";
		String targetMetaModelURI = "http://Cpf/1.0";
		String targetModelFilePath = createTarget(projectPath, resource.getName());;
		boolean targetReadOnLoad = false;
		boolean targetStoreOnDisposal = true;
		URI sourceModelURI = URI.createFileURI(sourceModelFilePath);
		URI targetModelURI = URI.createFileURI(targetModelFilePath);
		
		String transformName = "ETL RTT Transform";
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
		//String name = targetFile.getName();
		String fileName = name.substring(0, name.indexOf(".rtt"));
		
		String fileString = projectPath + "/deployment/"
				+ fileName + ".cpf";

		CpfPackage cpfPackage = CpfFactory.eINSTANCE.getCpfPackage().eINSTANCE;
//
//		ResourceSet resourceSet = new ResourceSetImpl();
//		URI cpfFilelURI = org.eclipse.emf.common.util.URI
//				.createFileURI(cpfFile);
//		Resource resource = resourceSet.createResource(cpfFilelURI);
//		try {
//			//resource.load(null);
//			//Map<String, Boolean> options = new HashMap<String, Boolean>();
//			//options.put(XMLResource.OPTION_SCHEMA_LOCATION, Boolean.FALSE);
//			resource.save(null);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		String fileString = cpfFilelURI.toFileString();
		return fileString;
	}


}

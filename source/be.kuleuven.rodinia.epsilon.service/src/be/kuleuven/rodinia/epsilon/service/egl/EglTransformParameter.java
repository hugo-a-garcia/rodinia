package be.kuleuven.rodinia.epsilon.service.egl;

import org.eclipse.emf.common.util.URI;

import be.kuleuven.rodinia.epsilon.service.AbstractTransformParameter;

/**
 * Parameter object for the EGL transformation.
 * 
 * @author Hugo A. Garcia
 */
public class EglTransformParameter extends AbstractTransformParameter implements
		IEglTransformParameter {

	private String pluginID = null;
	private String eglTransformationFileName;
	private String sourceName = "Source";
	private String sourceMetaModelURI;
	private String sourceModelFilePath;
	private boolean sourceReadOnLoad = true;
	private boolean sourceStoreOnDisposal = false;
	private String outputRoot = "output";
	private URI sourceModelURI;

	public EglTransformParameter() {
	}

	@Override
	public String getPluginID() {
		return pluginID;
	}

	/*
	 * The pluginID is the OSGI Bundle-SymbolicName for this plug-in. It is
	 * needed in order to find the root directory for accessing the resources
	 * included in the bundle such as the transformation files.
	 * 
	 * The pluginID is accessed from the Activator of the bundle:
	 * String pluginID = Activator.PLUGIN_ID;
	 * 
	 */
	@Override
	public void setPluginID(String pluginID) {
		this.pluginID = pluginID;
	}

	@Override
	public String getEglTransformationFileName() {
		return eglTransformationFileName;
	}

	@Override
	public void setEglTransformFileName(String eglTransformation) {
		this.eglTransformationFileName = eglTransformation;
	}

	@Override
	public String getSourceName() {
		return sourceName;
	}

	@Override
	public void setSourceName(String sourceName) {
		this.sourceName = sourceName;
	}

	@Override
	public String getSourceMetaModelURI() {
		return sourceMetaModelURI;
	}

	@Override
	public void setSourceMetaModelURI(String sourceMetaModelURI) {
		this.sourceMetaModelURI = sourceMetaModelURI;
	}

	@Override
	public String getSourceModelFilePath() {
		return sourceModelFilePath;
	}

	@Override
	public void setSourceModelFilePath(String sourceModelFilePath) {
		this.sourceModelFilePath = sourceModelFilePath;
	}

	@Override
	public boolean isSourceReadOnLoad() {
		return sourceReadOnLoad;
	}

	@Override
	public void setSourceReadOnLoad(boolean sourceReadOnLoad) {
		this.sourceReadOnLoad = sourceReadOnLoad;
	}

	@Override
	public boolean isSourceStoreOnDisposal() {
		return sourceStoreOnDisposal;
	}

	@Override
	public void setSourceStoreOnDisposal(boolean sourceStoreOnDisposal) {
		this.sourceStoreOnDisposal = sourceStoreOnDisposal;
	}

	@Override
	public String getOutputRoot() {
		return outputRoot;
	}

	@Override
	public void setOutputRoot(String outputRoot) {
		this.outputRoot = outputRoot;
	}

	public boolean checkParameters() {
		if (pluginID == null) return false;
		if (eglTransformationFileName == null) return false;
		//if (sourceModelFilePath == null) return false;
		//if (sourceModelFilePath == null) return false;
		if (outputRoot == null) return false;
		return true;
	}

	public URI getSourceModelURI() {
		return this.sourceModelURI;
	}
	public void setSourceModelURI(URI sourceModelURI) {
		this.sourceModelURI = sourceModelURI;
	}

}

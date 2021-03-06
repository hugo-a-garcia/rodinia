package be.kuleuven.rodinia.epsilon.service.etl;

import org.eclipse.emf.common.util.URI;

import be.kuleuven.rodinia.epsilon.service.ITransformParameter;


public interface IEtlTransformParameter extends ITransformParameter {
	
	public String getPluginID();

	public void setPluginID(String pluginID);

	public String getEtlTransformPath();

	public void setEtlTransformPath(String etlTransformPath);

	public String getSourceName();

	public void setSourceName(String sourceName);

	public String getSourceMetaModelURI();

	public void setSourceMetaModelURI(String sourceMetaModelURI);

	public String getSourceModelFilePath();

	public void setSourceModelFilePath(String sourceModelFilePath);

	public boolean isSourceReadOnLoad();

	public void setSourceReadOnLoad(boolean sourceReadOnLoad);

	public boolean isSourceStoreOnDisposal();

	public void setSourceStoreOnDisposal(boolean sourceStoreOnDisposal);

	public String getTargetName();

	public void setTargetName(String targetName);

	public String getTargetMetaModelURI();

	public void setTargetMetaModelURI(String targetMetaModelURI);

	public String getTargetModelFilePath();

	public void setTargetModelFilePath(String targetModelFilePath);

	public boolean isTargetReadOnLoad();

	public void setTargetReadOnLoad(boolean targetReadOnLoad);

	public boolean isTargetStoreOnDisposal();

	public void setTargetStoreOnDisposal(boolean targetStoreOnDisposal);

	public URI getSourceModelURI();
	
	public void setSourceModelURI(URI sourceModelURI);
	
	public URI getTargetModelURI();
	
	public void setTargetModelURI(URI targetModelURI);
	
}

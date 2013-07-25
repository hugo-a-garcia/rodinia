package be.kuleuven.rodinia.cdt.transform.rtt;

import be.kuleuven.rodinia.epsilon.service.egl.IEglTransformService;
import be.kuleuven.rodinia.epsilon.service.etl.IEtlTransformService;

public class Component {
	
	private static Component component;
	
	public IEglTransformService eglTransformService;
	public IEtlTransformService etlTransformService;

	public Component() {
	}

	public IEglTransformService getEglTransformService() {
		return eglTransformService;
	}

	public void setEglTransformService(IEglTransformService eglTransformService) {
		this.eglTransformService = eglTransformService;
	}

	public IEtlTransformService getEtlTransformService() {
		return etlTransformService;
	}

	public void setEtlTransformService(IEtlTransformService etlTransformService) {
		this.etlTransformService = etlTransformService;
	}
	
	public void start() {
		component = this;
	}
	
	public void stop() {
		component = null;
	}
	
	public static Component getInstance() {
		return component;
	}
	

}

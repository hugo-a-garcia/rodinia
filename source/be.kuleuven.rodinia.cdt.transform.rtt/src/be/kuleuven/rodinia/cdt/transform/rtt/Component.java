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
		System.out.println("be.kuleuven.rodinia.cdt.transform.rtt eglTransformService set");
		this.eglTransformService = eglTransformService;
	}

	public IEtlTransformService getEtlTransformService() {
		return etlTransformService;
	}

	public void setEtlTransformService(IEtlTransformService etlTransformService) {
		System.out.println("be.kuleuven.rodinia.cdt.transform.rtt etlTransformService set");
		this.etlTransformService = etlTransformService;
	}
	
	public void start() {
		System.out.println("be.kuleuven.rodinia.cdt.transform.rtt eglTransformService start");
		component = this;
	}
	
	public void stop() {
		System.out.println("be.kuleuven.rodinia.cdt.transform.rtt eglTransformService stop");
		component = null;
	}
	
	public static Component getInstance() {
		return component;
	}
	

}

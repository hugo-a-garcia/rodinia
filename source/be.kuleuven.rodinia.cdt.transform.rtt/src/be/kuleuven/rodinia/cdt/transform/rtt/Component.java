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
		System.out.println("eglTransformService2 set");
		this.eglTransformService = eglTransformService;
	}

	public IEtlTransformService getEtlTransformService() {
		return etlTransformService;
	}

	public void setEtlTransformService(IEtlTransformService etlTransformService) {
		System.out.println("etlTransformService2 set");
		this.etlTransformService = etlTransformService;
	}
	
	public void start() {
		System.out.println("eglTransformService2 start");
		component = this;
	}
	
	public void stop() {
		System.out.println("eglTransformService2 stop");
		component = null;
	}
	
	public static Component getInstance() {
		return component;
	}
	

}

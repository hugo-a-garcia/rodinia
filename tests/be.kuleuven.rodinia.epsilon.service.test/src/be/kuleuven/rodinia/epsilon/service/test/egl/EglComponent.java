package be.kuleuven.rodinia.epsilon.service.test.egl;

import be.kuleuven.rodinia.epsilon.service.egl.IEglTransformService;


public class EglComponent {

	private static EglComponent component;
	
	public EglComponent() {
		System.out.println("eglTransformService");
	}
	
	public IEglTransformService eglTransformService;

	public IEglTransformService getEglTransformService() {
		return eglTransformService;
	}

	public void setEglTransformService(IEglTransformService eglTransformService) {
		this.eglTransformService = eglTransformService;
		System.out.println("eglTransformService Set in Compomnent");
	}
	
	public void start() {
		System.out.println("eglTransformService start");
		component = this;
	}
	
	public void stop() {
		System.out.println("eglTransformService stop");
		component = null;
	}
	
	public static EglComponent getInstance() {
		return component;
	}
}

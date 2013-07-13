package be.kuleuven.rodinia.epsilon.service.test.etl;

import be.kuleuven.rodinia.epsilon.service.etl.IEtlTransformService;

public class EtlComponent {
	
private static EtlComponent component;

	public IEtlTransformService etlTransformService;
	
	public EtlComponent() {
		System.out.println("etlTransformService");
	}

	public IEtlTransformService getEtlTransformService() {
		return etlTransformService;
	}

	public void setEtlTransformService(IEtlTransformService etlTransformService) {
		this.etlTransformService = etlTransformService;
		System.out.println("etlTransformService Set in Compomnent");
	}
	
	public void start() {
		System.out.println("etlTransformService start");
		component = this;
	}
	
	public void stop() {
		System.out.println("etlTransformService stop");
		component = null;
	}
	
	public static EtlComponent getInstance() {
		return component;
	}

}

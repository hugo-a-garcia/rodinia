package be.kuleuven.rodinia.epsilon.service.ui.test.component;

import be.kuleuven.rodinia.epsilon.service.etl.IEtlTransformService;

public class Component {
	
private static Component component;

public IEtlTransformService etlTransformService;
	
	public Component() {
		System.out.println("etl component");
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
	
	public static Component getInstance() {
		return component;
	}

}

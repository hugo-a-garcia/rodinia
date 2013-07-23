package cz.cuni.mff.d3s.transform.deeco.rtt;

import be.kuleuven.rodinia.epsilon.service.etl.IEtlTransformService;

public class Component {
	
	private static Component component;
	
	public IEtlTransformService etlTransformService;

	public Component() {
	}
	
	public IEtlTransformService getEtlTransformService() {
		System.out.println("cz.cuni.mff.d3s.transform.deeco.rtt ettTransformService getEtlTransformService");
		return etlTransformService;
	}

	public void setEtlTransformService(IEtlTransformService etlTransformService) {
		System.out.println("cz.cuni.mff.d3s.transform.deeco.rtt ettTransformService setEtlTransformService");
		this.etlTransformService = etlTransformService;
	}
	
	public void start() {
		System.out.println("cz.cuni.mff.d3s.transform.deeco.rtt ettTransformService start");
		component = this;
	}
	
	public void stop() {
		System.out.println("cz.cuni.mff.d3s.transform.deeco.rtt ettTransformService stop");
		component = null;
	}
	
	public static Component getInstance() {
		return component;
	}

}

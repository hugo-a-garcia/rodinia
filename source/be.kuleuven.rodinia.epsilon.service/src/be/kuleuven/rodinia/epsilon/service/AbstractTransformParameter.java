package be.kuleuven.rodinia.epsilon.service;


public class AbstractTransformParameter implements ITransformParameter {

	private String transformName;

	public AbstractTransformParameter() {
	}

	@Override
	public String getTransformName() {
		return transformName;
	}

	@Override
	public void setTransformName(String transformName) {
		this.transformName = transformName;
	}

}

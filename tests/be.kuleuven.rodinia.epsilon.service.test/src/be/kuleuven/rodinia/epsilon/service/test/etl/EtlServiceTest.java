package be.kuleuven.rodinia.epsilon.service.test.etl;

import static org.junit.Assert.*;

import org.junit.Test;

import be.kuleuven.rodinia.epsilon.service.test.Activator;
import be.kuleuven.rodinia.epsilon.service.test.model.box.Box;
import be.kuleuven.rodinia.epsilon.service.test.model.box.BoxFactory;
import be.kuleuven.rodinia.epsilon.service.test.model.box.BoxPackage;
import be.kuleuven.rodinia.epsilon.service.etl.EtlTransformParameter;

public class EtlServiceTest {

	@Test
	public void test() {
		
		EtlTransformParameter transformParameter = new EtlTransformParameter();
		
		String pluginID = Activator.PLUGIN_ID;
		String etlTransformPath = "epsilon/etl_transform_test.etl";
		String sourceName = "Source";
		String sourceMetaModelURI = "be.kuleuven.rodinia.epsilon.service.test.model.box";
		String sourceModelFilePath = "/home/hugo/rodinia/git/rodinia/tests/be.kuleuven.rodinia.epsilon.service.test/model/Box.xmi";
		boolean sourceReadOnLoad = true;
		boolean sourceStoreOnDisposal = false;
		String targetName = "Target";
		String targetMetaModelURI = "be.kuleuven.rodinia.epsilon.service.test.model.thing";
		String targetModelFilePath = "/home/hugo/rodinia/git/rodinia/tests/be.kuleuven.rodinia.epsilon.service.test/model/Thing.xmi";
		boolean targetReadOnLoad = true;
		boolean targetStoreOnDisposal = true;
		//URI sourceModelURI;
		//URI targetModelURI;
		
		transformParameter.setTransformName("ETL Test");
		transformParameter.setEtlTransformPath(etlTransformPath);
		transformParameter.setPluginID(pluginID);
		transformParameter.setSourceMetaModelURI(sourceMetaModelURI);
		//transformParameter.setSourceModelFilePath(sourceModelFilePath);
		transformParameter.setSourceName(sourceName);
		transformParameter.setSourceReadOnLoad(sourceReadOnLoad);
		transformParameter.setSourceStoreOnDisposal(sourceStoreOnDisposal);
		transformParameter.setTargetMetaModelURI(targetMetaModelURI);
		//transformParameter.setTargetModelFilePath(targetModelFilePath);
		transformParameter.setTargetName(targetName);
		transformParameter.setTargetReadOnLoad(targetReadOnLoad);
		transformParameter.setTargetStoreOnDisposal(targetStoreOnDisposal);
		
		EtlComponent component = EtlComponent.getInstance();
		component.getEtlTransformService().doEtlTransform(transformParameter);
		
		BoxPackage box = BoxFactory.eINSTANCE.getBoxPackage().eINSTANCE;
		
	}

}

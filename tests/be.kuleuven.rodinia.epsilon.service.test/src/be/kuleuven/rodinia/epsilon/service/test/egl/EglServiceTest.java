package be.kuleuven.rodinia.epsilon.service.test.egl;

import static org.junit.Assert.*;

import org.eclipse.core.runtime.IPath;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import be.kuleuven.rodinia.epsilon.service.test.Activator;
import be.kuleuven.rodinia.epsilon.service.egl.EglTransformParameter;
import be.kuleuven.rodinia.epsilon.service.egl.IEglTransformService;

public class EglServiceTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		IPath stateLocatoin = be.kuleuven.rodinia.epsilon.service.test.Activator.getDefault().getStateLocation();
		System.out.println("===> " + stateLocatoin.toString());
		
		EglComponent component = EglComponent.getInstance();
		assertNotNull(component);
		IEglTransformService service = component.getEglTransformService();
		assertNotNull(service);
	}
	
	@Test
	public void checkParametersEglTransformTest() throws Exception {
		
		EglTransformParameter transformParameter = new EglTransformParameter();
		assertFalse(transformParameter.checkParameters());
		
		String eglTransformFileName = "epsilon/egl_transform_test.egl";
		String outputRoot = "/home/hugo/rodinia/output";
		String pluginID = Activator.PLUGIN_ID;
		String sourceMetaModelURI = "be.kuleuven.rodinia.epsilon.service.test.model.box";
		String sourceModelFilePath = "model/Box.xmi";
		//String sourceName = null;
		boolean sourceReadOnLoad = true;
		boolean sourceStoreOnDisposal = false;
		String transformName = "boo";
		
		transformParameter.setEglTransformFileName(eglTransformFileName);
		transformParameter.setOutputRoot(outputRoot);
		transformParameter.setPluginID(pluginID);
		transformParameter.setSourceMetaModelURI(sourceMetaModelURI);
		transformParameter.setSourceModelFilePath(sourceModelFilePath);
		//transformParameter.setSourceName(sourceName);
		transformParameter.setSourceReadOnLoad(sourceReadOnLoad);
		transformParameter.setSourceStoreOnDisposal(sourceStoreOnDisposal);
		transformParameter.setTransformName(transformName);
		//IEglTransformService eglTransformService = EglComponent.getInstance().getEglTransformService();
		
		transformParameter.getEglTransformationFileName();
		transformParameter.getOutputRoot();
		transformParameter.getPluginID();
		transformParameter.getSourceMetaModelURI();
		transformParameter.getSourceModelFilePath();
		transformParameter.getSourceName();
		transformParameter.isSourceReadOnLoad();
		transformParameter.isSourceStoreOnDisposal();
		transformParameter.getTransformName();
		
		assertTrue(transformParameter.checkParameters());
		
		EglComponent component = EglComponent.getInstance();
		assertNotNull(component);
		IEglTransformService service = component.getEglTransformService();
		assertNotNull(service);
		
		service.doEglTransform(transformParameter);
		
	}

}

package be.kuleuven.rodinia.epsilon.service.test.egl;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

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
		EglComponent component = EglComponent.getInstance();
		assertNotNull(component);
		IEglTransformService service = component.getEglTransformService();
		assertNotNull(service);
		//fail("Not yet implemented");
	}

}

/*
* generated by Xtext
*/
package be.kuleuven.rodinia.dsl.rtt;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class RttDslStandaloneSetup extends RttDslStandaloneSetupGenerated{

	public static void doSetup() {
		new RttDslStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}


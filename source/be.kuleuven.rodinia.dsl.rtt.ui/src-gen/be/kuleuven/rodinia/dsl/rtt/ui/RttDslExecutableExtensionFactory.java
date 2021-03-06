/*
 * generated by Xtext
 */
package be.kuleuven.rodinia.dsl.rtt.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import be.kuleuven.rodinia.dsl.rtt.ui.internal.RttDslActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class RttDslExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return RttDslActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return RttDslActivator.getInstance().getInjector(RttDslActivator.BE_KULEUVEN_RODINIA_DSL_RTT_RTTDSL);
	}
	
}

/*
 * generated by Xtext
 */
package cz.cuni.mff.d3s.dsl.deeco.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import cz.cuni.mff.d3s.dsl.deeco.ui.internal.DEECoDslActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class DEECoDslExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return DEECoDslActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return DEECoDslActivator.getInstance().getInjector(DEECoDslActivator.CZ_CUNI_MFF_D3S_DSL_DEECO_DEECODSL);
	}
	
}

/**
 * generated by Xtext
 */
package be.kuleuven.rodinia.dsl.rtt.ui.labeling;

import com.google.inject.Inject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider;

/**
 * Provides labels for a EObjects.
 * 
 * see http://www.eclipse.org/Xtext/documentation/latest/xtext.html#labelProvider
 */
@SuppressWarnings("all")
public class RttStructureLabelProvider extends DefaultEObjectLabelProvider {
  @Inject
  public RttStructureLabelProvider(final AdapterFactoryLabelProvider delegate) {
    super(delegate);
  }
}
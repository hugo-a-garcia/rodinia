/**
 */
package be.kuleuven.rodinia.epsilon.service.test.model.box;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see be.kuleuven.rodinia.epsilon.service.test.model.box.BoxPackage
 * @generated
 */
public interface BoxFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  BoxFactory eINSTANCE = be.kuleuven.rodinia.epsilon.service.test.model.box.impl.BoxFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Box</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Box</em>'.
   * @generated
   */
  Box createBox();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  BoxPackage getBoxPackage();

} //BoxFactory

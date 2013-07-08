/**
 */
package be.kuleuven.rodinia.epsilon.service.test.model.box;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see be.kuleuven.rodinia.epsilon.service.test.model.box.BoxFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel basePackage='be.kuleuven.rodinia.epsilon.service.test.model'"
 * @generated
 */
public interface BoxPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "box";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "be.kuleuven.rodinia.epsilon.service.test.model.box";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "box";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  BoxPackage eINSTANCE = be.kuleuven.rodinia.epsilon.service.test.model.box.impl.BoxPackageImpl.init();

  /**
   * The meta object id for the '{@link be.kuleuven.rodinia.epsilon.service.test.model.box.impl.BoxImpl <em>Box</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see be.kuleuven.rodinia.epsilon.service.test.model.box.impl.BoxImpl
   * @see be.kuleuven.rodinia.epsilon.service.test.model.box.impl.BoxPackageImpl#getBox()
   * @generated
   */
  int BOX = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOX__NAME = 0;

  /**
   * The number of structural features of the '<em>Box</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOX_FEATURE_COUNT = 1;

  /**
   * The number of operations of the '<em>Box</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOX_OPERATION_COUNT = 0;


  /**
   * Returns the meta object for class '{@link be.kuleuven.rodinia.epsilon.service.test.model.box.Box <em>Box</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Box</em>'.
   * @see be.kuleuven.rodinia.epsilon.service.test.model.box.Box
   * @generated
   */
  EClass getBox();

  /**
   * Returns the meta object for the attribute '{@link be.kuleuven.rodinia.epsilon.service.test.model.box.Box#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see be.kuleuven.rodinia.epsilon.service.test.model.box.Box#getName()
   * @see #getBox()
   * @generated
   */
  EAttribute getBox_Name();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  BoxFactory getBoxFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each operation of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link be.kuleuven.rodinia.epsilon.service.test.model.box.impl.BoxImpl <em>Box</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see be.kuleuven.rodinia.epsilon.service.test.model.box.impl.BoxImpl
     * @see be.kuleuven.rodinia.epsilon.service.test.model.box.impl.BoxPackageImpl#getBox()
     * @generated
     */
    EClass BOX = eINSTANCE.getBox();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BOX__NAME = eINSTANCE.getBox_Name();

  }

} //BoxPackage

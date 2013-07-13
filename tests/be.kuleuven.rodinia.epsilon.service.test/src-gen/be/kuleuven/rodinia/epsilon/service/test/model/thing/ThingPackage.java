/**
 */
package be.kuleuven.rodinia.epsilon.service.test.model.thing;

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
 * @see be.kuleuven.rodinia.epsilon.service.test.model.thing.ThingFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel basePackage='be.kuleuven.rodinia.epsilon.service.test.model'"
 * @generated
 */
public interface ThingPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "thing";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "be.kuleuven.rodinia.epsilon.service.test.model.thing";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "thing";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ThingPackage eINSTANCE = be.kuleuven.rodinia.epsilon.service.test.model.thing.impl.ThingPackageImpl.init();

  /**
   * The meta object id for the '{@link be.kuleuven.rodinia.epsilon.service.test.model.thing.impl.ThingImpl <em>Thing</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see be.kuleuven.rodinia.epsilon.service.test.model.thing.impl.ThingImpl
   * @see be.kuleuven.rodinia.epsilon.service.test.model.thing.impl.ThingPackageImpl#getThing()
   * @generated
   */
  int THING = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THING__NAME = 0;

  /**
   * The number of structural features of the '<em>Thing</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THING_FEATURE_COUNT = 1;

  /**
   * The number of operations of the '<em>Thing</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THING_OPERATION_COUNT = 0;


  /**
   * Returns the meta object for class '{@link be.kuleuven.rodinia.epsilon.service.test.model.thing.Thing <em>Thing</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Thing</em>'.
   * @see be.kuleuven.rodinia.epsilon.service.test.model.thing.Thing
   * @generated
   */
  EClass getThing();

  /**
   * Returns the meta object for the attribute '{@link be.kuleuven.rodinia.epsilon.service.test.model.thing.Thing#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see be.kuleuven.rodinia.epsilon.service.test.model.thing.Thing#getName()
   * @see #getThing()
   * @generated
   */
  EAttribute getThing_Name();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  ThingFactory getThingFactory();

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
     * The meta object literal for the '{@link be.kuleuven.rodinia.epsilon.service.test.model.thing.impl.ThingImpl <em>Thing</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see be.kuleuven.rodinia.epsilon.service.test.model.thing.impl.ThingImpl
     * @see be.kuleuven.rodinia.epsilon.service.test.model.thing.impl.ThingPackageImpl#getThing()
     * @generated
     */
    EClass THING = eINSTANCE.getThing();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute THING__NAME = eINSTANCE.getThing_Name();

  }

} //ThingPackage

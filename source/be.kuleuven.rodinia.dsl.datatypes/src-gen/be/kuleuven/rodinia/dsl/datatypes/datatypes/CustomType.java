/**
 */
package be.kuleuven.rodinia.dsl.datatypes.datatypes;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Custom Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link be.kuleuven.rodinia.dsl.datatypes.datatypes.CustomType#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link be.kuleuven.rodinia.dsl.datatypes.datatypes.CustomType#getFields <em>Fields</em>}</li>
 * </ul>
 * </p>
 *
 * @see be.kuleuven.rodinia.dsl.datatypes.datatypes.DatatypesPackage#getCustomType()
 * @model
 * @generated
 */
public interface CustomType extends DataType
{
  /**
   * Returns the value of the '<em><b>Super Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Super Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Super Type</em>' reference.
   * @see #setSuperType(CustomType)
   * @see be.kuleuven.rodinia.dsl.datatypes.datatypes.DatatypesPackage#getCustomType_SuperType()
   * @model
   * @generated
   */
  CustomType getSuperType();

  /**
   * Sets the value of the '{@link be.kuleuven.rodinia.dsl.datatypes.datatypes.CustomType#getSuperType <em>Super Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Super Type</em>' reference.
   * @see #getSuperType()
   * @generated
   */
  void setSuperType(CustomType value);

  /**
   * Returns the value of the '<em><b>Fields</b></em>' containment reference list.
   * The list contents are of type {@link be.kuleuven.rodinia.dsl.datatypes.datatypes.Field}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fields</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fields</em>' containment reference list.
   * @see be.kuleuven.rodinia.dsl.datatypes.datatypes.DatatypesPackage#getCustomType_Fields()
   * @model containment="true"
   * @generated
   */
  EList<Field> getFields();

} // CustomType

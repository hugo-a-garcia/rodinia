/**
 */
package be.kuleuven.rodinia.dsl.datatypes.datatypes;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Type Library</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link be.kuleuven.rodinia.dsl.datatypes.datatypes.DataTypeLibrary#getName <em>Name</em>}</li>
 *   <li>{@link be.kuleuven.rodinia.dsl.datatypes.datatypes.DataTypeLibrary#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see be.kuleuven.rodinia.dsl.datatypes.datatypes.DatatypesPackage#getDataTypeLibrary()
 * @model
 * @generated
 */
public interface DataTypeLibrary extends AbstractElement
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see be.kuleuven.rodinia.dsl.datatypes.datatypes.DatatypesPackage#getDataTypeLibrary_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link be.kuleuven.rodinia.dsl.datatypes.datatypes.DataTypeLibrary#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
   * The list contents are of type {@link be.kuleuven.rodinia.dsl.datatypes.datatypes.AbstractElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' containment reference list.
   * @see be.kuleuven.rodinia.dsl.datatypes.datatypes.DatatypesPackage#getDataTypeLibrary_Elements()
   * @model containment="true"
   * @generated
   */
  EList<AbstractElement> getElements();

} // DataTypeLibrary

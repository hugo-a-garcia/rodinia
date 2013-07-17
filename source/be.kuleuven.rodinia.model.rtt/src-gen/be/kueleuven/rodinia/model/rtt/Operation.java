/**
 */
package be.kueleuven.rodinia.model.rtt;

import be.kuleuven.rodinia.dsl.datatypes.datatypes.DataType;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link be.kueleuven.rodinia.model.rtt.Operation#getName <em>Name</em>}</li>
 *   <li>{@link be.kueleuven.rodinia.model.rtt.Operation#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link be.kueleuven.rodinia.model.rtt.Operation#getDocumentation <em>Documentation</em>}</li>
 * </ul>
 * </p>
 *
 * @see be.kueleuven.rodinia.model.rtt.RttPackage#getOperation()
 * @model
 * @generated
 */
public interface Operation extends EObject
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
   * @see be.kueleuven.rodinia.model.rtt.RttPackage#getOperation_Name()
   * @model unique="false"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link be.kueleuven.rodinia.model.rtt.Operation#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Return Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Return Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Return Type</em>' reference.
   * @see #setReturnType(DataType)
   * @see be.kueleuven.rodinia.model.rtt.RttPackage#getOperation_ReturnType()
   * @model
   * @generated
   */
  DataType getReturnType();

  /**
   * Sets the value of the '{@link be.kueleuven.rodinia.model.rtt.Operation#getReturnType <em>Return Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Return Type</em>' reference.
   * @see #getReturnType()
   * @generated
   */
  void setReturnType(DataType value);

  /**
   * Returns the value of the '<em><b>Documentation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Documentation</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Documentation</em>' attribute.
   * @see #setDocumentation(String)
   * @see be.kueleuven.rodinia.model.rtt.RttPackage#getOperation_Documentation()
   * @model unique="false"
   * @generated
   */
  String getDocumentation();

  /**
   * Sets the value of the '{@link be.kueleuven.rodinia.model.rtt.Operation#getDocumentation <em>Documentation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Documentation</em>' attribute.
   * @see #getDocumentation()
   * @generated
   */
  void setDocumentation(String value);

} // Operation

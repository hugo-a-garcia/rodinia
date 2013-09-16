/**
 */
package be.kueleuven.rodinia.model.rtt;

import be.kuleuven.rodinia.dsl.datatypes.datatypes.DataType;

import org.eclipse.emf.common.util.EList;

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
 *   <li>{@link be.kueleuven.rodinia.model.rtt.Operation#getArguments <em>Arguments</em>}</li>
 *   <li>{@link be.kueleuven.rodinia.model.rtt.Operation#getExecutionType <em>Execution Type</em>}</li>
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
   * Returns the value of the '<em><b>Arguments</b></em>' containment reference list.
   * The list contents are of type {@link be.kueleuven.rodinia.model.rtt.OperationArgument}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Arguments</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Arguments</em>' containment reference list.
   * @see be.kueleuven.rodinia.model.rtt.RttPackage#getOperation_Arguments()
   * @model containment="true"
   * @generated
   */
  EList<OperationArgument> getArguments();

  /**
   * Returns the value of the '<em><b>Execution Type</b></em>' attribute.
   * The default value is <code>"ClientThread"</code>.
   * The literals are from the enumeration {@link be.kueleuven.rodinia.model.rtt.ExecutionType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Execution Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Execution Type</em>' attribute.
   * @see be.kueleuven.rodinia.model.rtt.ExecutionType
   * @see #setExecutionType(ExecutionType)
   * @see be.kueleuven.rodinia.model.rtt.RttPackage#getOperation_ExecutionType()
   * @model default="ClientThread" unique="false"
   * @generated
   */
  ExecutionType getExecutionType();

  /**
   * Sets the value of the '{@link be.kueleuven.rodinia.model.rtt.Operation#getExecutionType <em>Execution Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Execution Type</em>' attribute.
   * @see be.kueleuven.rodinia.model.rtt.ExecutionType
   * @see #getExecutionType()
   * @generated
   */
  void setExecutionType(ExecutionType value);

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

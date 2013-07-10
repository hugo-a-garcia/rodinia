/**
 */
package be.kueleuven.rodinia.model.rtt;

import be.kuleuven.rodinia.dsl.datatypes.datatypes.DataType;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link be.kueleuven.rodinia.model.rtt.InputPort#getIsEventPort <em>Is Event Port</em>}</li>
 *   <li>{@link be.kueleuven.rodinia.model.rtt.InputPort#getName <em>Name</em>}</li>
 *   <li>{@link be.kueleuven.rodinia.model.rtt.InputPort#getDataType <em>Data Type</em>}</li>
 *   <li>{@link be.kueleuven.rodinia.model.rtt.InputPort#getInputConnectionPolicy <em>Input Connection Policy</em>}</li>
 * </ul>
 * </p>
 *
 * @see be.kueleuven.rodinia.model.rtt.RttPackage#getInputPort()
 * @model
 * @generated
 */
public interface InputPort extends EObject
{
  /**
   * Returns the value of the '<em><b>Is Event Port</b></em>' attribute.
   * The default value is <code>"false"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is Event Port</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is Event Port</em>' attribute.
   * @see #setIsEventPort(Boolean)
   * @see be.kueleuven.rodinia.model.rtt.RttPackage#getInputPort_IsEventPort()
   * @model default="false" unique="false" required="true"
   * @generated
   */
  Boolean getIsEventPort();

  /**
   * Sets the value of the '{@link be.kueleuven.rodinia.model.rtt.InputPort#getIsEventPort <em>Is Event Port</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Event Port</em>' attribute.
   * @see #getIsEventPort()
   * @generated
   */
  void setIsEventPort(Boolean value);

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
   * @see be.kueleuven.rodinia.model.rtt.RttPackage#getInputPort_Name()
   * @model unique="false" required="true"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link be.kueleuven.rodinia.model.rtt.InputPort#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Data Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Data Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Data Type</em>' reference.
   * @see #setDataType(DataType)
   * @see be.kueleuven.rodinia.model.rtt.RttPackage#getInputPort_DataType()
   * @model
   * @generated
   */
  DataType getDataType();

  /**
   * Sets the value of the '{@link be.kueleuven.rodinia.model.rtt.InputPort#getDataType <em>Data Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Data Type</em>' reference.
   * @see #getDataType()
   * @generated
   */
  void setDataType(DataType value);

  /**
   * Returns the value of the '<em><b>Input Connection Policy</b></em>' reference.
   * It is bidirectional and its opposite is '{@link be.kueleuven.rodinia.model.rtt.ConnectionPolicy#getInputPort <em>Input Port</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Input Connection Policy</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Input Connection Policy</em>' reference.
   * @see #setInputConnectionPolicy(ConnectionPolicy)
   * @see be.kueleuven.rodinia.model.rtt.RttPackage#getInputPort_InputConnectionPolicy()
   * @see be.kueleuven.rodinia.model.rtt.ConnectionPolicy#getInputPort
   * @model opposite="inputPort"
   * @generated
   */
  ConnectionPolicy getInputConnectionPolicy();

  /**
   * Sets the value of the '{@link be.kueleuven.rodinia.model.rtt.InputPort#getInputConnectionPolicy <em>Input Connection Policy</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Input Connection Policy</em>' reference.
   * @see #getInputConnectionPolicy()
   * @generated
   */
  void setInputConnectionPolicy(ConnectionPolicy value);

} // InputPort

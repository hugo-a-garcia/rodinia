/**
 */
package be.kueleuven.rodinia.model.rtt;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection Policy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link be.kueleuven.rodinia.model.rtt.ConnectionPolicy#getName <em>Name</em>}</li>
 *   <li>{@link be.kueleuven.rodinia.model.rtt.ConnectionPolicy#getInputPort <em>Input Port</em>}</li>
 *   <li>{@link be.kueleuven.rodinia.model.rtt.ConnectionPolicy#getOutputPort <em>Output Port</em>}</li>
 *   <li>{@link be.kueleuven.rodinia.model.rtt.ConnectionPolicy#getBufferSize <em>Buffer Size</em>}</li>
 *   <li>{@link be.kueleuven.rodinia.model.rtt.ConnectionPolicy#getDataSize <em>Data Size</em>}</li>
 *   <li>{@link be.kueleuven.rodinia.model.rtt.ConnectionPolicy#isInit <em>Init</em>}</li>
 *   <li>{@link be.kueleuven.rodinia.model.rtt.ConnectionPolicy#getLockPolicy <em>Lock Policy</em>}</li>
 *   <li>{@link be.kueleuven.rodinia.model.rtt.ConnectionPolicy#isPull <em>Pull</em>}</li>
 *   <li>{@link be.kueleuven.rodinia.model.rtt.ConnectionPolicy#getTransport <em>Transport</em>}</li>
 *   <li>{@link be.kueleuven.rodinia.model.rtt.ConnectionPolicy#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see be.kueleuven.rodinia.model.rtt.RttPackage#getConnectionPolicy()
 * @model
 * @generated
 */
public interface ConnectionPolicy extends EObject
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
   * @see be.kueleuven.rodinia.model.rtt.RttPackage#getConnectionPolicy_Name()
   * @model unique="false"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link be.kueleuven.rodinia.model.rtt.ConnectionPolicy#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Input Port</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Input Port</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Input Port</em>' reference.
   * @see #setInputPort(AbstractInputPort)
   * @see be.kueleuven.rodinia.model.rtt.RttPackage#getConnectionPolicy_InputPort()
   * @model required="true"
   * @generated
   */
  AbstractInputPort getInputPort();

  /**
   * Sets the value of the '{@link be.kueleuven.rodinia.model.rtt.ConnectionPolicy#getInputPort <em>Input Port</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Input Port</em>' reference.
   * @see #getInputPort()
   * @generated
   */
  void setInputPort(AbstractInputPort value);

  /**
   * Returns the value of the '<em><b>Output Port</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Output Port</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Output Port</em>' reference.
   * @see #setOutputPort(OutputPort)
   * @see be.kueleuven.rodinia.model.rtt.RttPackage#getConnectionPolicy_OutputPort()
   * @model required="true"
   * @generated
   */
  OutputPort getOutputPort();

  /**
   * Sets the value of the '{@link be.kueleuven.rodinia.model.rtt.ConnectionPolicy#getOutputPort <em>Output Port</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Output Port</em>' reference.
   * @see #getOutputPort()
   * @generated
   */
  void setOutputPort(OutputPort value);

  /**
   * Returns the value of the '<em><b>Buffer Size</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Buffer Size</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Buffer Size</em>' attribute.
   * @see #setBufferSize(short)
   * @see be.kueleuven.rodinia.model.rtt.RttPackage#getConnectionPolicy_BufferSize()
   * @model unique="false"
   * @generated
   */
  short getBufferSize();

  /**
   * Sets the value of the '{@link be.kueleuven.rodinia.model.rtt.ConnectionPolicy#getBufferSize <em>Buffer Size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Buffer Size</em>' attribute.
   * @see #getBufferSize()
   * @generated
   */
  void setBufferSize(short value);

  /**
   * Returns the value of the '<em><b>Data Size</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Data Size</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Data Size</em>' attribute.
   * @see #setDataSize(short)
   * @see be.kueleuven.rodinia.model.rtt.RttPackage#getConnectionPolicy_DataSize()
   * @model unique="false"
   * @generated
   */
  short getDataSize();

  /**
   * Sets the value of the '{@link be.kueleuven.rodinia.model.rtt.ConnectionPolicy#getDataSize <em>Data Size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Data Size</em>' attribute.
   * @see #getDataSize()
   * @generated
   */
  void setDataSize(short value);

  /**
   * Returns the value of the '<em><b>Init</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Init</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Init</em>' attribute.
   * @see #setInit(boolean)
   * @see be.kueleuven.rodinia.model.rtt.RttPackage#getConnectionPolicy_Init()
   * @model unique="false"
   * @generated
   */
  boolean isInit();

  /**
   * Sets the value of the '{@link be.kueleuven.rodinia.model.rtt.ConnectionPolicy#isInit <em>Init</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Init</em>' attribute.
   * @see #isInit()
   * @generated
   */
  void setInit(boolean value);

  /**
   * Returns the value of the '<em><b>Lock Policy</b></em>' attribute.
   * The default value is <code>"LOCK_FREE"</code>.
   * The literals are from the enumeration {@link be.kueleuven.rodinia.model.rtt.ConnectionPolicyLockPolicy}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lock Policy</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lock Policy</em>' attribute.
   * @see be.kueleuven.rodinia.model.rtt.ConnectionPolicyLockPolicy
   * @see #setLockPolicy(ConnectionPolicyLockPolicy)
   * @see be.kueleuven.rodinia.model.rtt.RttPackage#getConnectionPolicy_LockPolicy()
   * @model default="LOCK_FREE" unique="false"
   * @generated
   */
  ConnectionPolicyLockPolicy getLockPolicy();

  /**
   * Sets the value of the '{@link be.kueleuven.rodinia.model.rtt.ConnectionPolicy#getLockPolicy <em>Lock Policy</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lock Policy</em>' attribute.
   * @see be.kueleuven.rodinia.model.rtt.ConnectionPolicyLockPolicy
   * @see #getLockPolicy()
   * @generated
   */
  void setLockPolicy(ConnectionPolicyLockPolicy value);

  /**
   * Returns the value of the '<em><b>Pull</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pull</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pull</em>' attribute.
   * @see #setPull(boolean)
   * @see be.kueleuven.rodinia.model.rtt.RttPackage#getConnectionPolicy_Pull()
   * @model unique="false"
   * @generated
   */
  boolean isPull();

  /**
   * Sets the value of the '{@link be.kueleuven.rodinia.model.rtt.ConnectionPolicy#isPull <em>Pull</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pull</em>' attribute.
   * @see #isPull()
   * @generated
   */
  void setPull(boolean value);

  /**
   * Returns the value of the '<em><b>Transport</b></em>' attribute.
   * The literals are from the enumeration {@link be.kueleuven.rodinia.model.rtt.ConnectionPolicyTransport}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Transport</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Transport</em>' attribute.
   * @see be.kueleuven.rodinia.model.rtt.ConnectionPolicyTransport
   * @see #setTransport(ConnectionPolicyTransport)
   * @see be.kueleuven.rodinia.model.rtt.RttPackage#getConnectionPolicy_Transport()
   * @model unique="false"
   * @generated
   */
  ConnectionPolicyTransport getTransport();

  /**
   * Sets the value of the '{@link be.kueleuven.rodinia.model.rtt.ConnectionPolicy#getTransport <em>Transport</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Transport</em>' attribute.
   * @see be.kueleuven.rodinia.model.rtt.ConnectionPolicyTransport
   * @see #getTransport()
   * @generated
   */
  void setTransport(ConnectionPolicyTransport value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The default value is <code>"DATA"</code>.
   * The literals are from the enumeration {@link be.kueleuven.rodinia.model.rtt.ConnectionPolicyType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see be.kueleuven.rodinia.model.rtt.ConnectionPolicyType
   * @see #setType(ConnectionPolicyType)
   * @see be.kueleuven.rodinia.model.rtt.RttPackage#getConnectionPolicy_Type()
   * @model default="DATA" unique="false"
   * @generated
   */
  ConnectionPolicyType getType();

  /**
   * Sets the value of the '{@link be.kueleuven.rodinia.model.rtt.ConnectionPolicy#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see be.kueleuven.rodinia.model.rtt.ConnectionPolicyType
   * @see #getType()
   * @generated
   */
  void setType(ConnectionPolicyType value);

} // ConnectionPolicy

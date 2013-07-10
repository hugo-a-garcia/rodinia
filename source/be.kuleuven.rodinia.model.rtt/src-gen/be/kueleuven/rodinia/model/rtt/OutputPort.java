/**
 */
package be.kueleuven.rodinia.model.rtt;

import be.kuleuven.rodinia.dsl.datatypes.datatypes.DataType;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Output Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link be.kueleuven.rodinia.model.rtt.OutputPort#getName <em>Name</em>}</li>
 *   <li>{@link be.kueleuven.rodinia.model.rtt.OutputPort#getDataType <em>Data Type</em>}</li>
 *   <li>{@link be.kueleuven.rodinia.model.rtt.OutputPort#getOutputConnectionPolicy <em>Output Connection Policy</em>}</li>
 * </ul>
 * </p>
 *
 * @see be.kueleuven.rodinia.model.rtt.RttPackage#getOutputPort()
 * @model
 * @generated
 */
public interface OutputPort extends EObject
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
   * @see be.kueleuven.rodinia.model.rtt.RttPackage#getOutputPort_Name()
   * @model unique="false" required="true"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link be.kueleuven.rodinia.model.rtt.OutputPort#getName <em>Name</em>}' attribute.
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
   * @see be.kueleuven.rodinia.model.rtt.RttPackage#getOutputPort_DataType()
   * @model
   * @generated
   */
  DataType getDataType();

  /**
   * Sets the value of the '{@link be.kueleuven.rodinia.model.rtt.OutputPort#getDataType <em>Data Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Data Type</em>' reference.
   * @see #getDataType()
   * @generated
   */
  void setDataType(DataType value);

  /**
   * Returns the value of the '<em><b>Output Connection Policy</b></em>' reference.
   * It is bidirectional and its opposite is '{@link be.kueleuven.rodinia.model.rtt.ConnectionPolicy#getOutputPort <em>Output Port</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Output Connection Policy</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Output Connection Policy</em>' reference.
   * @see #setOutputConnectionPolicy(ConnectionPolicy)
   * @see be.kueleuven.rodinia.model.rtt.RttPackage#getOutputPort_OutputConnectionPolicy()
   * @see be.kueleuven.rodinia.model.rtt.ConnectionPolicy#getOutputPort
   * @model opposite="outputPort"
   * @generated
   */
  ConnectionPolicy getOutputConnectionPolicy();

  /**
   * Sets the value of the '{@link be.kueleuven.rodinia.model.rtt.OutputPort#getOutputConnectionPolicy <em>Output Connection Policy</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Output Connection Policy</em>' reference.
   * @see #getOutputConnectionPolicy()
   * @generated
   */
  void setOutputConnectionPolicy(ConnectionPolicy value);

} // OutputPort

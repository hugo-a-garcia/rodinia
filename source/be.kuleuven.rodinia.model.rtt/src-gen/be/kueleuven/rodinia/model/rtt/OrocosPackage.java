/**
 */
package be.kueleuven.rodinia.model.rtt;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Orocos Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link be.kueleuven.rodinia.model.rtt.OrocosPackage#getName <em>Name</em>}</li>
 *   <li>{@link be.kueleuven.rodinia.model.rtt.OrocosPackage#getTaskContexts <em>Task Contexts</em>}</li>
 *   <li>{@link be.kueleuven.rodinia.model.rtt.OrocosPackage#getConnectionPolicies <em>Connection Policies</em>}</li>
 * </ul>
 * </p>
 *
 * @see be.kueleuven.rodinia.model.rtt.RttPackage#getOrocosPackage()
 * @model
 * @generated
 */
public interface OrocosPackage extends EObject
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
   * @see be.kueleuven.rodinia.model.rtt.RttPackage#getOrocosPackage_Name()
   * @model unique="false"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link be.kueleuven.rodinia.model.rtt.OrocosPackage#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Task Contexts</b></em>' containment reference list.
   * The list contents are of type {@link be.kueleuven.rodinia.model.rtt.TaskContext}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Task Contexts</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Task Contexts</em>' containment reference list.
   * @see be.kueleuven.rodinia.model.rtt.RttPackage#getOrocosPackage_TaskContexts()
   * @model containment="true" resolveProxies="true"
   * @generated
   */
  EList<TaskContext> getTaskContexts();

  /**
   * Returns the value of the '<em><b>Connection Policies</b></em>' containment reference list.
   * The list contents are of type {@link be.kueleuven.rodinia.model.rtt.ConnectionPolicy}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Connection Policies</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Connection Policies</em>' containment reference list.
   * @see be.kueleuven.rodinia.model.rtt.RttPackage#getOrocosPackage_ConnectionPolicies()
   * @model containment="true" resolveProxies="true"
   * @generated
   */
  EList<ConnectionPolicy> getConnectionPolicies();

} // OrocosPackage

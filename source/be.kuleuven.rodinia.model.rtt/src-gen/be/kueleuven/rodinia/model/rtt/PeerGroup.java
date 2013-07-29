/**
 */
package be.kueleuven.rodinia.model.rtt;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Peer Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link be.kueleuven.rodinia.model.rtt.PeerGroup#getName <em>Name</em>}</li>
 *   <li>{@link be.kueleuven.rodinia.model.rtt.PeerGroup#getCoordinator <em>Coordinator</em>}</li>
 *   <li>{@link be.kueleuven.rodinia.model.rtt.PeerGroup#getMembers <em>Members</em>}</li>
 * </ul>
 * </p>
 *
 * @see be.kueleuven.rodinia.model.rtt.RttPackage#getPeerGroup()
 * @model
 * @generated
 */
public interface PeerGroup extends EObject
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
   * @see be.kueleuven.rodinia.model.rtt.RttPackage#getPeerGroup_Name()
   * @model unique="false"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link be.kueleuven.rodinia.model.rtt.PeerGroup#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Coordinator</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Coordinator</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Coordinator</em>' reference.
   * @see #setCoordinator(TaskContext)
   * @see be.kueleuven.rodinia.model.rtt.RttPackage#getPeerGroup_Coordinator()
   * @model required="true"
   * @generated
   */
  TaskContext getCoordinator();

  /**
   * Sets the value of the '{@link be.kueleuven.rodinia.model.rtt.PeerGroup#getCoordinator <em>Coordinator</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Coordinator</em>' reference.
   * @see #getCoordinator()
   * @generated
   */
  void setCoordinator(TaskContext value);

  /**
   * Returns the value of the '<em><b>Members</b></em>' reference list.
   * The list contents are of type {@link be.kueleuven.rodinia.model.rtt.TaskContext}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Members</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Members</em>' reference list.
   * @see be.kueleuven.rodinia.model.rtt.RttPackage#getPeerGroup_Members()
   * @model
   * @generated
   */
  EList<TaskContext> getMembers();

} // PeerGroup

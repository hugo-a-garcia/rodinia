/**
 */
package be.kueleuven.rodinia.model.rtt;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IActivity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link be.kueleuven.rodinia.model.rtt.IActivity#getName <em>Name</em>}</li>
 *   <li>{@link be.kueleuven.rodinia.model.rtt.IActivity#getTaskContext <em>Task Context</em>}</li>
 * </ul>
 * </p>
 *
 * @see be.kueleuven.rodinia.model.rtt.RttPackage#getIActivity()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IActivity extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * The default value is <code>"Activity"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see be.kueleuven.rodinia.model.rtt.RttPackage#getIActivity_Name()
   * @model default="Activity" unique="false" required="true"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link be.kueleuven.rodinia.model.rtt.IActivity#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Task Context</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Task Context</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Task Context</em>' reference.
   * @see #setTaskContext(TaskContext)
   * @see be.kueleuven.rodinia.model.rtt.RttPackage#getIActivity_TaskContext()
   * @model
   * @generated
   */
  TaskContext getTaskContext();

  /**
   * Sets the value of the '{@link be.kueleuven.rodinia.model.rtt.IActivity#getTaskContext <em>Task Context</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Task Context</em>' reference.
   * @see #getTaskContext()
   * @generated
   */
  void setTaskContext(TaskContext value);

} // IActivity

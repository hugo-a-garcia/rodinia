/**
 */
package be.kueleuven.rodinia.model.rtt;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link be.kueleuven.rodinia.model.rtt.Activity#getSlave <em>Slave</em>}</li>
 *   <li>{@link be.kueleuven.rodinia.model.rtt.Activity#getScheduler <em>Scheduler</em>}</li>
 *   <li>{@link be.kueleuven.rodinia.model.rtt.Activity#getCpuAffinity <em>Cpu Affinity</em>}</li>
 *   <li>{@link be.kueleuven.rodinia.model.rtt.Activity#getPeriod <em>Period</em>}</li>
 *   <li>{@link be.kueleuven.rodinia.model.rtt.Activity#getPriority <em>Priority</em>}</li>
 * </ul>
 * </p>
 *
 * @see be.kueleuven.rodinia.model.rtt.RttPackage#getActivity()
 * @model
 * @generated
 */
public interface Activity extends IActivity
{
  /**
   * Returns the value of the '<em><b>Slave</b></em>' containment reference list.
   * The list contents are of type {@link be.kueleuven.rodinia.model.rtt.Slave}.
   * It is bidirectional and its opposite is '{@link be.kueleuven.rodinia.model.rtt.Slave#getMaster <em>Master</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Slave</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Slave</em>' containment reference list.
   * @see be.kueleuven.rodinia.model.rtt.RttPackage#getActivity_Slave()
   * @see be.kueleuven.rodinia.model.rtt.Slave#getMaster
   * @model opposite="master" containment="true"
   * @generated
   */
  EList<Slave> getSlave();

  /**
   * Returns the value of the '<em><b>Scheduler</b></em>' attribute.
   * The default value is <code>"ORO_SCHED_OTHER"</code>.
   * The literals are from the enumeration {@link be.kueleuven.rodinia.model.rtt.Scheduler}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Scheduler</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Scheduler</em>' attribute.
   * @see be.kueleuven.rodinia.model.rtt.Scheduler
   * @see #setScheduler(Scheduler)
   * @see be.kueleuven.rodinia.model.rtt.RttPackage#getActivity_Scheduler()
   * @model default="ORO_SCHED_OTHER" unique="false" required="true"
   * @generated
   */
  Scheduler getScheduler();

  /**
   * Sets the value of the '{@link be.kueleuven.rodinia.model.rtt.Activity#getScheduler <em>Scheduler</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Scheduler</em>' attribute.
   * @see be.kueleuven.rodinia.model.rtt.Scheduler
   * @see #getScheduler()
   * @generated
   */
  void setScheduler(Scheduler value);

  /**
   * Returns the value of the '<em><b>Cpu Affinity</b></em>' attribute.
   * The default value is <code>"~0"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cpu Affinity</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cpu Affinity</em>' attribute.
   * @see #setCpuAffinity(String)
   * @see be.kueleuven.rodinia.model.rtt.RttPackage#getActivity_CpuAffinity()
   * @model default="~0" unique="false" required="true"
   * @generated
   */
  String getCpuAffinity();

  /**
   * Sets the value of the '{@link be.kueleuven.rodinia.model.rtt.Activity#getCpuAffinity <em>Cpu Affinity</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cpu Affinity</em>' attribute.
   * @see #getCpuAffinity()
   * @generated
   */
  void setCpuAffinity(String value);

  /**
   * Returns the value of the '<em><b>Period</b></em>' attribute.
   * The default value is <code>"0"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Period</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Period</em>' attribute.
   * @see #setPeriod(float)
   * @see be.kueleuven.rodinia.model.rtt.RttPackage#getActivity_Period()
   * @model default="0" unique="false" required="true"
   * @generated
   */
  float getPeriod();

  /**
   * Sets the value of the '{@link be.kueleuven.rodinia.model.rtt.Activity#getPeriod <em>Period</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Period</em>' attribute.
   * @see #getPeriod()
   * @generated
   */
  void setPeriod(float value);

  /**
   * Returns the value of the '<em><b>Priority</b></em>' attribute.
   * The default value is <code>"0"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Priority</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Priority</em>' attribute.
   * @see #setPriority(int)
   * @see be.kueleuven.rodinia.model.rtt.RttPackage#getActivity_Priority()
   * @model default="0" unique="false" required="true"
   * @generated
   */
  int getPriority();

  /**
   * Sets the value of the '{@link be.kueleuven.rodinia.model.rtt.Activity#getPriority <em>Priority</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Priority</em>' attribute.
   * @see #getPriority()
   * @generated
   */
  void setPriority(int value);

} // Activity

/**
 */
package be.kueleuven.rodinia.model.rtt;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Slave</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link be.kueleuven.rodinia.model.rtt.Slave#getMaster <em>Master</em>}</li>
 * </ul>
 * </p>
 *
 * @see be.kueleuven.rodinia.model.rtt.RttPackage#getSlave()
 * @model
 * @generated
 */
public interface Slave extends IActivity
{
  /**
   * Returns the value of the '<em><b>Master</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link be.kueleuven.rodinia.model.rtt.Activity#getSlave <em>Slave</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Master</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Master</em>' container reference.
   * @see #setMaster(Activity)
   * @see be.kueleuven.rodinia.model.rtt.RttPackage#getSlave_Master()
   * @see be.kueleuven.rodinia.model.rtt.Activity#getSlave
   * @model opposite="slave" transient="false"
   * @generated
   */
  Activity getMaster();

  /**
   * Sets the value of the '{@link be.kueleuven.rodinia.model.rtt.Slave#getMaster <em>Master</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Master</em>' container reference.
   * @see #getMaster()
   * @generated
   */
  void setMaster(Activity value);

} // Slave

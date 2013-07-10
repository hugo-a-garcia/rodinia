/**
 */
package be.kueleuven.rodinia.model.rtt.impl;

import be.kueleuven.rodinia.model.rtt.ConnectionPolicy;
import be.kueleuven.rodinia.model.rtt.OrocosPackage;
import be.kueleuven.rodinia.model.rtt.RttPackage;
import be.kueleuven.rodinia.model.rtt.TaskContext;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Orocos Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link be.kueleuven.rodinia.model.rtt.impl.OrocosPackageImpl#getName <em>Name</em>}</li>
 *   <li>{@link be.kueleuven.rodinia.model.rtt.impl.OrocosPackageImpl#getTaskContexts <em>Task Contexts</em>}</li>
 *   <li>{@link be.kueleuven.rodinia.model.rtt.impl.OrocosPackageImpl#getConnectionPolicies <em>Connection Policies</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OrocosPackageImpl extends MinimalEObjectImpl.Container implements OrocosPackage
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getTaskContexts() <em>Task Contexts</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTaskContexts()
   * @generated
   * @ordered
   */
  protected EList<TaskContext> taskContexts;

  /**
   * The cached value of the '{@link #getConnectionPolicies() <em>Connection Policies</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConnectionPolicies()
   * @generated
   * @ordered
   */
  protected EList<ConnectionPolicy> connectionPolicies;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OrocosPackageImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return RttPackage.Literals.OROCOS_PACKAGE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RttPackage.OROCOS_PACKAGE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TaskContext> getTaskContexts()
  {
    if (taskContexts == null)
    {
      taskContexts = new EObjectContainmentEList.Resolving<TaskContext>(TaskContext.class, this, RttPackage.OROCOS_PACKAGE__TASK_CONTEXTS);
    }
    return taskContexts;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ConnectionPolicy> getConnectionPolicies()
  {
    if (connectionPolicies == null)
    {
      connectionPolicies = new EObjectContainmentEList.Resolving<ConnectionPolicy>(ConnectionPolicy.class, this, RttPackage.OROCOS_PACKAGE__CONNECTION_POLICIES);
    }
    return connectionPolicies;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case RttPackage.OROCOS_PACKAGE__TASK_CONTEXTS:
        return ((InternalEList<?>)getTaskContexts()).basicRemove(otherEnd, msgs);
      case RttPackage.OROCOS_PACKAGE__CONNECTION_POLICIES:
        return ((InternalEList<?>)getConnectionPolicies()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case RttPackage.OROCOS_PACKAGE__NAME:
        return getName();
      case RttPackage.OROCOS_PACKAGE__TASK_CONTEXTS:
        return getTaskContexts();
      case RttPackage.OROCOS_PACKAGE__CONNECTION_POLICIES:
        return getConnectionPolicies();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case RttPackage.OROCOS_PACKAGE__NAME:
        setName((String)newValue);
        return;
      case RttPackage.OROCOS_PACKAGE__TASK_CONTEXTS:
        getTaskContexts().clear();
        getTaskContexts().addAll((Collection<? extends TaskContext>)newValue);
        return;
      case RttPackage.OROCOS_PACKAGE__CONNECTION_POLICIES:
        getConnectionPolicies().clear();
        getConnectionPolicies().addAll((Collection<? extends ConnectionPolicy>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case RttPackage.OROCOS_PACKAGE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case RttPackage.OROCOS_PACKAGE__TASK_CONTEXTS:
        getTaskContexts().clear();
        return;
      case RttPackage.OROCOS_PACKAGE__CONNECTION_POLICIES:
        getConnectionPolicies().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case RttPackage.OROCOS_PACKAGE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case RttPackage.OROCOS_PACKAGE__TASK_CONTEXTS:
        return taskContexts != null && !taskContexts.isEmpty();
      case RttPackage.OROCOS_PACKAGE__CONNECTION_POLICIES:
        return connectionPolicies != null && !connectionPolicies.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //OrocosPackageImpl

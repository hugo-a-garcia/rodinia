/**
 */
package be.kueleuven.rodinia.model.rtt.impl;

import be.kueleuven.rodinia.model.rtt.PeerGroup;
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

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Peer Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link be.kueleuven.rodinia.model.rtt.impl.PeerGroupImpl#getName <em>Name</em>}</li>
 *   <li>{@link be.kueleuven.rodinia.model.rtt.impl.PeerGroupImpl#getCoordinator <em>Coordinator</em>}</li>
 *   <li>{@link be.kueleuven.rodinia.model.rtt.impl.PeerGroupImpl#getMembers <em>Members</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PeerGroupImpl extends MinimalEObjectImpl.Container implements PeerGroup
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
   * The cached value of the '{@link #getCoordinator() <em>Coordinator</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCoordinator()
   * @generated
   * @ordered
   */
  protected TaskContext coordinator;

  /**
   * The cached value of the '{@link #getMembers() <em>Members</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMembers()
   * @generated
   * @ordered
   */
  protected EList<TaskContext> members;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PeerGroupImpl()
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
    return RttPackage.Literals.PEER_GROUP;
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
      eNotify(new ENotificationImpl(this, Notification.SET, RttPackage.PEER_GROUP__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TaskContext getCoordinator()
  {
    if (coordinator != null && coordinator.eIsProxy())
    {
      InternalEObject oldCoordinator = (InternalEObject)coordinator;
      coordinator = (TaskContext)eResolveProxy(oldCoordinator);
      if (coordinator != oldCoordinator)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RttPackage.PEER_GROUP__COORDINATOR, oldCoordinator, coordinator));
      }
    }
    return coordinator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TaskContext basicGetCoordinator()
  {
    return coordinator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCoordinator(TaskContext newCoordinator, NotificationChain msgs)
  {
    TaskContext oldCoordinator = coordinator;
    coordinator = newCoordinator;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RttPackage.PEER_GROUP__COORDINATOR, oldCoordinator, newCoordinator);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCoordinator(TaskContext newCoordinator)
  {
    if (newCoordinator != coordinator)
    {
      NotificationChain msgs = null;
      if (coordinator != null)
        msgs = ((InternalEObject)coordinator).eInverseRemove(this, RttPackage.TASK_CONTEXT__PEER_GROUP_COORDINATOR, TaskContext.class, msgs);
      if (newCoordinator != null)
        msgs = ((InternalEObject)newCoordinator).eInverseAdd(this, RttPackage.TASK_CONTEXT__PEER_GROUP_COORDINATOR, TaskContext.class, msgs);
      msgs = basicSetCoordinator(newCoordinator, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RttPackage.PEER_GROUP__COORDINATOR, newCoordinator, newCoordinator));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TaskContext> getMembers()
  {
    if (members == null)
    {
      members = new EObjectWithInverseResolvingEList<TaskContext>(TaskContext.class, this, RttPackage.PEER_GROUP__MEMBERS, RttPackage.TASK_CONTEXT__PEER_GROUP_MEMBER);
    }
    return members;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case RttPackage.PEER_GROUP__COORDINATOR:
        if (coordinator != null)
          msgs = ((InternalEObject)coordinator).eInverseRemove(this, RttPackage.TASK_CONTEXT__PEER_GROUP_COORDINATOR, TaskContext.class, msgs);
        return basicSetCoordinator((TaskContext)otherEnd, msgs);
      case RttPackage.PEER_GROUP__MEMBERS:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getMembers()).basicAdd(otherEnd, msgs);
    }
    return super.eInverseAdd(otherEnd, featureID, msgs);
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
      case RttPackage.PEER_GROUP__COORDINATOR:
        return basicSetCoordinator(null, msgs);
      case RttPackage.PEER_GROUP__MEMBERS:
        return ((InternalEList<?>)getMembers()).basicRemove(otherEnd, msgs);
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
      case RttPackage.PEER_GROUP__NAME:
        return getName();
      case RttPackage.PEER_GROUP__COORDINATOR:
        if (resolve) return getCoordinator();
        return basicGetCoordinator();
      case RttPackage.PEER_GROUP__MEMBERS:
        return getMembers();
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
      case RttPackage.PEER_GROUP__NAME:
        setName((String)newValue);
        return;
      case RttPackage.PEER_GROUP__COORDINATOR:
        setCoordinator((TaskContext)newValue);
        return;
      case RttPackage.PEER_GROUP__MEMBERS:
        getMembers().clear();
        getMembers().addAll((Collection<? extends TaskContext>)newValue);
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
      case RttPackage.PEER_GROUP__NAME:
        setName(NAME_EDEFAULT);
        return;
      case RttPackage.PEER_GROUP__COORDINATOR:
        setCoordinator((TaskContext)null);
        return;
      case RttPackage.PEER_GROUP__MEMBERS:
        getMembers().clear();
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
      case RttPackage.PEER_GROUP__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case RttPackage.PEER_GROUP__COORDINATOR:
        return coordinator != null;
      case RttPackage.PEER_GROUP__MEMBERS:
        return members != null && !members.isEmpty();
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

} //PeerGroupImpl

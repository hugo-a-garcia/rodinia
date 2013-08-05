/**
 */
package be.kueleuven.rodinia.model.rtt.impl;

import be.kueleuven.rodinia.model.rtt.ConnectionPolicy;
import be.kueleuven.rodinia.model.rtt.InputPort;
import be.kueleuven.rodinia.model.rtt.RttPackage;

import be.kuleuven.rodinia.dsl.datatypes.datatypes.DataType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Input Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link be.kueleuven.rodinia.model.rtt.impl.InputPortImpl#getName <em>Name</em>}</li>
 *   <li>{@link be.kueleuven.rodinia.model.rtt.impl.InputPortImpl#getDataType <em>Data Type</em>}</li>
 *   <li>{@link be.kueleuven.rodinia.model.rtt.impl.InputPortImpl#getInputConnectionPolicy <em>Input Connection Policy</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InputPortImpl extends MinimalEObjectImpl.Container implements InputPort
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
   * The cached value of the '{@link #getDataType() <em>Data Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDataType()
   * @generated
   * @ordered
   */
  protected DataType dataType;

  /**
   * The cached value of the '{@link #getInputConnectionPolicy() <em>Input Connection Policy</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInputConnectionPolicy()
   * @generated
   * @ordered
   */
  protected ConnectionPolicy inputConnectionPolicy;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InputPortImpl()
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
    return RttPackage.Literals.INPUT_PORT;
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
      eNotify(new ENotificationImpl(this, Notification.SET, RttPackage.INPUT_PORT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataType getDataType()
  {
    if (dataType != null && dataType.eIsProxy())
    {
      InternalEObject oldDataType = (InternalEObject)dataType;
      dataType = (DataType)eResolveProxy(oldDataType);
      if (dataType != oldDataType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RttPackage.INPUT_PORT__DATA_TYPE, oldDataType, dataType));
      }
    }
    return dataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataType basicGetDataType()
  {
    return dataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDataType(DataType newDataType)
  {
    DataType oldDataType = dataType;
    dataType = newDataType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RttPackage.INPUT_PORT__DATA_TYPE, oldDataType, dataType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConnectionPolicy getInputConnectionPolicy()
  {
    if (inputConnectionPolicy != null && inputConnectionPolicy.eIsProxy())
    {
      InternalEObject oldInputConnectionPolicy = (InternalEObject)inputConnectionPolicy;
      inputConnectionPolicy = (ConnectionPolicy)eResolveProxy(oldInputConnectionPolicy);
      if (inputConnectionPolicy != oldInputConnectionPolicy)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RttPackage.INPUT_PORT__INPUT_CONNECTION_POLICY, oldInputConnectionPolicy, inputConnectionPolicy));
      }
    }
    return inputConnectionPolicy;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConnectionPolicy basicGetInputConnectionPolicy()
  {
    return inputConnectionPolicy;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInputConnectionPolicy(ConnectionPolicy newInputConnectionPolicy, NotificationChain msgs)
  {
    ConnectionPolicy oldInputConnectionPolicy = inputConnectionPolicy;
    inputConnectionPolicy = newInputConnectionPolicy;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RttPackage.INPUT_PORT__INPUT_CONNECTION_POLICY, oldInputConnectionPolicy, newInputConnectionPolicy);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInputConnectionPolicy(ConnectionPolicy newInputConnectionPolicy)
  {
    if (newInputConnectionPolicy != inputConnectionPolicy)
    {
      NotificationChain msgs = null;
      if (inputConnectionPolicy != null)
        msgs = ((InternalEObject)inputConnectionPolicy).eInverseRemove(this, RttPackage.CONNECTION_POLICY__INPUT_PORT, ConnectionPolicy.class, msgs);
      if (newInputConnectionPolicy != null)
        msgs = ((InternalEObject)newInputConnectionPolicy).eInverseAdd(this, RttPackage.CONNECTION_POLICY__INPUT_PORT, ConnectionPolicy.class, msgs);
      msgs = basicSetInputConnectionPolicy(newInputConnectionPolicy, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RttPackage.INPUT_PORT__INPUT_CONNECTION_POLICY, newInputConnectionPolicy, newInputConnectionPolicy));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case RttPackage.INPUT_PORT__INPUT_CONNECTION_POLICY:
        if (inputConnectionPolicy != null)
          msgs = ((InternalEObject)inputConnectionPolicy).eInverseRemove(this, RttPackage.CONNECTION_POLICY__INPUT_PORT, ConnectionPolicy.class, msgs);
        return basicSetInputConnectionPolicy((ConnectionPolicy)otherEnd, msgs);
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
      case RttPackage.INPUT_PORT__INPUT_CONNECTION_POLICY:
        return basicSetInputConnectionPolicy(null, msgs);
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
      case RttPackage.INPUT_PORT__NAME:
        return getName();
      case RttPackage.INPUT_PORT__DATA_TYPE:
        if (resolve) return getDataType();
        return basicGetDataType();
      case RttPackage.INPUT_PORT__INPUT_CONNECTION_POLICY:
        if (resolve) return getInputConnectionPolicy();
        return basicGetInputConnectionPolicy();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case RttPackage.INPUT_PORT__NAME:
        setName((String)newValue);
        return;
      case RttPackage.INPUT_PORT__DATA_TYPE:
        setDataType((DataType)newValue);
        return;
      case RttPackage.INPUT_PORT__INPUT_CONNECTION_POLICY:
        setInputConnectionPolicy((ConnectionPolicy)newValue);
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
      case RttPackage.INPUT_PORT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case RttPackage.INPUT_PORT__DATA_TYPE:
        setDataType((DataType)null);
        return;
      case RttPackage.INPUT_PORT__INPUT_CONNECTION_POLICY:
        setInputConnectionPolicy((ConnectionPolicy)null);
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
      case RttPackage.INPUT_PORT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case RttPackage.INPUT_PORT__DATA_TYPE:
        return dataType != null;
      case RttPackage.INPUT_PORT__INPUT_CONNECTION_POLICY:
        return inputConnectionPolicy != null;
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

} //InputPortImpl

/**
 */
package be.kueleuven.rodinia.model.rtt.impl;

import be.kueleuven.rodinia.model.rtt.ConnectionPolicy;
import be.kueleuven.rodinia.model.rtt.OutputPort;
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
 * An implementation of the model object '<em><b>Output Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link be.kueleuven.rodinia.model.rtt.impl.OutputPortImpl#getName <em>Name</em>}</li>
 *   <li>{@link be.kueleuven.rodinia.model.rtt.impl.OutputPortImpl#getDataType <em>Data Type</em>}</li>
 *   <li>{@link be.kueleuven.rodinia.model.rtt.impl.OutputPortImpl#getOutputConnectionPolicy <em>Output Connection Policy</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OutputPortImpl extends MinimalEObjectImpl.Container implements OutputPort
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
   * The cached value of the '{@link #getOutputConnectionPolicy() <em>Output Connection Policy</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOutputConnectionPolicy()
   * @generated
   * @ordered
   */
  protected ConnectionPolicy outputConnectionPolicy;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OutputPortImpl()
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
    return RttPackage.Literals.OUTPUT_PORT;
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
      eNotify(new ENotificationImpl(this, Notification.SET, RttPackage.OUTPUT_PORT__NAME, oldName, name));
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RttPackage.OUTPUT_PORT__DATA_TYPE, oldDataType, dataType));
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
      eNotify(new ENotificationImpl(this, Notification.SET, RttPackage.OUTPUT_PORT__DATA_TYPE, oldDataType, dataType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConnectionPolicy getOutputConnectionPolicy()
  {
    if (outputConnectionPolicy != null && outputConnectionPolicy.eIsProxy())
    {
      InternalEObject oldOutputConnectionPolicy = (InternalEObject)outputConnectionPolicy;
      outputConnectionPolicy = (ConnectionPolicy)eResolveProxy(oldOutputConnectionPolicy);
      if (outputConnectionPolicy != oldOutputConnectionPolicy)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RttPackage.OUTPUT_PORT__OUTPUT_CONNECTION_POLICY, oldOutputConnectionPolicy, outputConnectionPolicy));
      }
    }
    return outputConnectionPolicy;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConnectionPolicy basicGetOutputConnectionPolicy()
  {
    return outputConnectionPolicy;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOutputConnectionPolicy(ConnectionPolicy newOutputConnectionPolicy, NotificationChain msgs)
  {
    ConnectionPolicy oldOutputConnectionPolicy = outputConnectionPolicy;
    outputConnectionPolicy = newOutputConnectionPolicy;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RttPackage.OUTPUT_PORT__OUTPUT_CONNECTION_POLICY, oldOutputConnectionPolicy, newOutputConnectionPolicy);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOutputConnectionPolicy(ConnectionPolicy newOutputConnectionPolicy)
  {
    if (newOutputConnectionPolicy != outputConnectionPolicy)
    {
      NotificationChain msgs = null;
      if (outputConnectionPolicy != null)
        msgs = ((InternalEObject)outputConnectionPolicy).eInverseRemove(this, RttPackage.CONNECTION_POLICY__OUTPUT_PORT, ConnectionPolicy.class, msgs);
      if (newOutputConnectionPolicy != null)
        msgs = ((InternalEObject)newOutputConnectionPolicy).eInverseAdd(this, RttPackage.CONNECTION_POLICY__OUTPUT_PORT, ConnectionPolicy.class, msgs);
      msgs = basicSetOutputConnectionPolicy(newOutputConnectionPolicy, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RttPackage.OUTPUT_PORT__OUTPUT_CONNECTION_POLICY, newOutputConnectionPolicy, newOutputConnectionPolicy));
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
      case RttPackage.OUTPUT_PORT__OUTPUT_CONNECTION_POLICY:
        if (outputConnectionPolicy != null)
          msgs = ((InternalEObject)outputConnectionPolicy).eInverseRemove(this, RttPackage.CONNECTION_POLICY__OUTPUT_PORT, ConnectionPolicy.class, msgs);
        return basicSetOutputConnectionPolicy((ConnectionPolicy)otherEnd, msgs);
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
      case RttPackage.OUTPUT_PORT__OUTPUT_CONNECTION_POLICY:
        return basicSetOutputConnectionPolicy(null, msgs);
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
      case RttPackage.OUTPUT_PORT__NAME:
        return getName();
      case RttPackage.OUTPUT_PORT__DATA_TYPE:
        if (resolve) return getDataType();
        return basicGetDataType();
      case RttPackage.OUTPUT_PORT__OUTPUT_CONNECTION_POLICY:
        if (resolve) return getOutputConnectionPolicy();
        return basicGetOutputConnectionPolicy();
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
      case RttPackage.OUTPUT_PORT__NAME:
        setName((String)newValue);
        return;
      case RttPackage.OUTPUT_PORT__DATA_TYPE:
        setDataType((DataType)newValue);
        return;
      case RttPackage.OUTPUT_PORT__OUTPUT_CONNECTION_POLICY:
        setOutputConnectionPolicy((ConnectionPolicy)newValue);
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
      case RttPackage.OUTPUT_PORT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case RttPackage.OUTPUT_PORT__DATA_TYPE:
        setDataType((DataType)null);
        return;
      case RttPackage.OUTPUT_PORT__OUTPUT_CONNECTION_POLICY:
        setOutputConnectionPolicy((ConnectionPolicy)null);
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
      case RttPackage.OUTPUT_PORT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case RttPackage.OUTPUT_PORT__DATA_TYPE:
        return dataType != null;
      case RttPackage.OUTPUT_PORT__OUTPUT_CONNECTION_POLICY:
        return outputConnectionPolicy != null;
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

} //OutputPortImpl

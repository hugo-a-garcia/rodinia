/**
 */
package be.kueleuven.rodinia.model.rtt.impl;

import be.kueleuven.rodinia.model.rtt.AbstractInputPort;
import be.kueleuven.rodinia.model.rtt.ConnectionPolicy;
import be.kueleuven.rodinia.model.rtt.ConnectionPolicyLockPolicy;
import be.kueleuven.rodinia.model.rtt.ConnectionPolicyTransport;
import be.kueleuven.rodinia.model.rtt.ConnectionPolicyType;
import be.kueleuven.rodinia.model.rtt.OutputPort;
import be.kueleuven.rodinia.model.rtt.RttPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connection Policy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link be.kueleuven.rodinia.model.rtt.impl.ConnectionPolicyImpl#getName <em>Name</em>}</li>
 *   <li>{@link be.kueleuven.rodinia.model.rtt.impl.ConnectionPolicyImpl#getInputPort <em>Input Port</em>}</li>
 *   <li>{@link be.kueleuven.rodinia.model.rtt.impl.ConnectionPolicyImpl#getOutputPort <em>Output Port</em>}</li>
 *   <li>{@link be.kueleuven.rodinia.model.rtt.impl.ConnectionPolicyImpl#getBufferSize <em>Buffer Size</em>}</li>
 *   <li>{@link be.kueleuven.rodinia.model.rtt.impl.ConnectionPolicyImpl#getDataSize <em>Data Size</em>}</li>
 *   <li>{@link be.kueleuven.rodinia.model.rtt.impl.ConnectionPolicyImpl#isInit <em>Init</em>}</li>
 *   <li>{@link be.kueleuven.rodinia.model.rtt.impl.ConnectionPolicyImpl#getLockPolicy <em>Lock Policy</em>}</li>
 *   <li>{@link be.kueleuven.rodinia.model.rtt.impl.ConnectionPolicyImpl#isPull <em>Pull</em>}</li>
 *   <li>{@link be.kueleuven.rodinia.model.rtt.impl.ConnectionPolicyImpl#getTransport <em>Transport</em>}</li>
 *   <li>{@link be.kueleuven.rodinia.model.rtt.impl.ConnectionPolicyImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConnectionPolicyImpl extends MinimalEObjectImpl.Container implements ConnectionPolicy
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
   * The cached value of the '{@link #getInputPort() <em>Input Port</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInputPort()
   * @generated
   * @ordered
   */
  protected AbstractInputPort inputPort;

  /**
   * The cached value of the '{@link #getOutputPort() <em>Output Port</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOutputPort()
   * @generated
   * @ordered
   */
  protected OutputPort outputPort;

  /**
   * The default value of the '{@link #getBufferSize() <em>Buffer Size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBufferSize()
   * @generated
   * @ordered
   */
  protected static final short BUFFER_SIZE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getBufferSize() <em>Buffer Size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBufferSize()
   * @generated
   * @ordered
   */
  protected short bufferSize = BUFFER_SIZE_EDEFAULT;

  /**
   * The default value of the '{@link #getDataSize() <em>Data Size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDataSize()
   * @generated
   * @ordered
   */
  protected static final short DATA_SIZE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getDataSize() <em>Data Size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDataSize()
   * @generated
   * @ordered
   */
  protected short dataSize = DATA_SIZE_EDEFAULT;

  /**
   * The default value of the '{@link #isInit() <em>Init</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isInit()
   * @generated
   * @ordered
   */
  protected static final boolean INIT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isInit() <em>Init</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isInit()
   * @generated
   * @ordered
   */
  protected boolean init = INIT_EDEFAULT;

  /**
   * The default value of the '{@link #getLockPolicy() <em>Lock Policy</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLockPolicy()
   * @generated
   * @ordered
   */
  protected static final ConnectionPolicyLockPolicy LOCK_POLICY_EDEFAULT = ConnectionPolicyLockPolicy.LOCK_FREE;

  /**
   * The cached value of the '{@link #getLockPolicy() <em>Lock Policy</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLockPolicy()
   * @generated
   * @ordered
   */
  protected ConnectionPolicyLockPolicy lockPolicy = LOCK_POLICY_EDEFAULT;

  /**
   * The default value of the '{@link #isPull() <em>Pull</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPull()
   * @generated
   * @ordered
   */
  protected static final boolean PULL_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isPull() <em>Pull</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPull()
   * @generated
   * @ordered
   */
  protected boolean pull = PULL_EDEFAULT;

  /**
   * The default value of the '{@link #getTransport() <em>Transport</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTransport()
   * @generated
   * @ordered
   */
  protected static final ConnectionPolicyTransport TRANSPORT_EDEFAULT = ConnectionPolicyTransport.DEFAULT;

  /**
   * The cached value of the '{@link #getTransport() <em>Transport</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTransport()
   * @generated
   * @ordered
   */
  protected ConnectionPolicyTransport transport = TRANSPORT_EDEFAULT;

  /**
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final ConnectionPolicyType TYPE_EDEFAULT = ConnectionPolicyType.DATA;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected ConnectionPolicyType type = TYPE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConnectionPolicyImpl()
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
    return RttPackage.Literals.CONNECTION_POLICY;
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
      eNotify(new ENotificationImpl(this, Notification.SET, RttPackage.CONNECTION_POLICY__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractInputPort getInputPort()
  {
    if (inputPort != null && inputPort.eIsProxy())
    {
      InternalEObject oldInputPort = (InternalEObject)inputPort;
      inputPort = (AbstractInputPort)eResolveProxy(oldInputPort);
      if (inputPort != oldInputPort)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RttPackage.CONNECTION_POLICY__INPUT_PORT, oldInputPort, inputPort));
      }
    }
    return inputPort;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractInputPort basicGetInputPort()
  {
    return inputPort;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInputPort(AbstractInputPort newInputPort)
  {
    AbstractInputPort oldInputPort = inputPort;
    inputPort = newInputPort;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RttPackage.CONNECTION_POLICY__INPUT_PORT, oldInputPort, inputPort));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OutputPort getOutputPort()
  {
    if (outputPort != null && outputPort.eIsProxy())
    {
      InternalEObject oldOutputPort = (InternalEObject)outputPort;
      outputPort = (OutputPort)eResolveProxy(oldOutputPort);
      if (outputPort != oldOutputPort)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RttPackage.CONNECTION_POLICY__OUTPUT_PORT, oldOutputPort, outputPort));
      }
    }
    return outputPort;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OutputPort basicGetOutputPort()
  {
    return outputPort;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOutputPort(OutputPort newOutputPort)
  {
    OutputPort oldOutputPort = outputPort;
    outputPort = newOutputPort;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RttPackage.CONNECTION_POLICY__OUTPUT_PORT, oldOutputPort, outputPort));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public short getBufferSize()
  {
    return bufferSize;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBufferSize(short newBufferSize)
  {
    short oldBufferSize = bufferSize;
    bufferSize = newBufferSize;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RttPackage.CONNECTION_POLICY__BUFFER_SIZE, oldBufferSize, bufferSize));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public short getDataSize()
  {
    return dataSize;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDataSize(short newDataSize)
  {
    short oldDataSize = dataSize;
    dataSize = newDataSize;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RttPackage.CONNECTION_POLICY__DATA_SIZE, oldDataSize, dataSize));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isInit()
  {
    return init;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInit(boolean newInit)
  {
    boolean oldInit = init;
    init = newInit;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RttPackage.CONNECTION_POLICY__INIT, oldInit, init));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConnectionPolicyLockPolicy getLockPolicy()
  {
    return lockPolicy;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLockPolicy(ConnectionPolicyLockPolicy newLockPolicy)
  {
    ConnectionPolicyLockPolicy oldLockPolicy = lockPolicy;
    lockPolicy = newLockPolicy == null ? LOCK_POLICY_EDEFAULT : newLockPolicy;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RttPackage.CONNECTION_POLICY__LOCK_POLICY, oldLockPolicy, lockPolicy));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isPull()
  {
    return pull;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPull(boolean newPull)
  {
    boolean oldPull = pull;
    pull = newPull;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RttPackage.CONNECTION_POLICY__PULL, oldPull, pull));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConnectionPolicyTransport getTransport()
  {
    return transport;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTransport(ConnectionPolicyTransport newTransport)
  {
    ConnectionPolicyTransport oldTransport = transport;
    transport = newTransport == null ? TRANSPORT_EDEFAULT : newTransport;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RttPackage.CONNECTION_POLICY__TRANSPORT, oldTransport, transport));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConnectionPolicyType getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(ConnectionPolicyType newType)
  {
    ConnectionPolicyType oldType = type;
    type = newType == null ? TYPE_EDEFAULT : newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RttPackage.CONNECTION_POLICY__TYPE, oldType, type));
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
      case RttPackage.CONNECTION_POLICY__NAME:
        return getName();
      case RttPackage.CONNECTION_POLICY__INPUT_PORT:
        if (resolve) return getInputPort();
        return basicGetInputPort();
      case RttPackage.CONNECTION_POLICY__OUTPUT_PORT:
        if (resolve) return getOutputPort();
        return basicGetOutputPort();
      case RttPackage.CONNECTION_POLICY__BUFFER_SIZE:
        return getBufferSize();
      case RttPackage.CONNECTION_POLICY__DATA_SIZE:
        return getDataSize();
      case RttPackage.CONNECTION_POLICY__INIT:
        return isInit();
      case RttPackage.CONNECTION_POLICY__LOCK_POLICY:
        return getLockPolicy();
      case RttPackage.CONNECTION_POLICY__PULL:
        return isPull();
      case RttPackage.CONNECTION_POLICY__TRANSPORT:
        return getTransport();
      case RttPackage.CONNECTION_POLICY__TYPE:
        return getType();
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
      case RttPackage.CONNECTION_POLICY__NAME:
        setName((String)newValue);
        return;
      case RttPackage.CONNECTION_POLICY__INPUT_PORT:
        setInputPort((AbstractInputPort)newValue);
        return;
      case RttPackage.CONNECTION_POLICY__OUTPUT_PORT:
        setOutputPort((OutputPort)newValue);
        return;
      case RttPackage.CONNECTION_POLICY__BUFFER_SIZE:
        setBufferSize((Short)newValue);
        return;
      case RttPackage.CONNECTION_POLICY__DATA_SIZE:
        setDataSize((Short)newValue);
        return;
      case RttPackage.CONNECTION_POLICY__INIT:
        setInit((Boolean)newValue);
        return;
      case RttPackage.CONNECTION_POLICY__LOCK_POLICY:
        setLockPolicy((ConnectionPolicyLockPolicy)newValue);
        return;
      case RttPackage.CONNECTION_POLICY__PULL:
        setPull((Boolean)newValue);
        return;
      case RttPackage.CONNECTION_POLICY__TRANSPORT:
        setTransport((ConnectionPolicyTransport)newValue);
        return;
      case RttPackage.CONNECTION_POLICY__TYPE:
        setType((ConnectionPolicyType)newValue);
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
      case RttPackage.CONNECTION_POLICY__NAME:
        setName(NAME_EDEFAULT);
        return;
      case RttPackage.CONNECTION_POLICY__INPUT_PORT:
        setInputPort((AbstractInputPort)null);
        return;
      case RttPackage.CONNECTION_POLICY__OUTPUT_PORT:
        setOutputPort((OutputPort)null);
        return;
      case RttPackage.CONNECTION_POLICY__BUFFER_SIZE:
        setBufferSize(BUFFER_SIZE_EDEFAULT);
        return;
      case RttPackage.CONNECTION_POLICY__DATA_SIZE:
        setDataSize(DATA_SIZE_EDEFAULT);
        return;
      case RttPackage.CONNECTION_POLICY__INIT:
        setInit(INIT_EDEFAULT);
        return;
      case RttPackage.CONNECTION_POLICY__LOCK_POLICY:
        setLockPolicy(LOCK_POLICY_EDEFAULT);
        return;
      case RttPackage.CONNECTION_POLICY__PULL:
        setPull(PULL_EDEFAULT);
        return;
      case RttPackage.CONNECTION_POLICY__TRANSPORT:
        setTransport(TRANSPORT_EDEFAULT);
        return;
      case RttPackage.CONNECTION_POLICY__TYPE:
        setType(TYPE_EDEFAULT);
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
      case RttPackage.CONNECTION_POLICY__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case RttPackage.CONNECTION_POLICY__INPUT_PORT:
        return inputPort != null;
      case RttPackage.CONNECTION_POLICY__OUTPUT_PORT:
        return outputPort != null;
      case RttPackage.CONNECTION_POLICY__BUFFER_SIZE:
        return bufferSize != BUFFER_SIZE_EDEFAULT;
      case RttPackage.CONNECTION_POLICY__DATA_SIZE:
        return dataSize != DATA_SIZE_EDEFAULT;
      case RttPackage.CONNECTION_POLICY__INIT:
        return init != INIT_EDEFAULT;
      case RttPackage.CONNECTION_POLICY__LOCK_POLICY:
        return lockPolicy != LOCK_POLICY_EDEFAULT;
      case RttPackage.CONNECTION_POLICY__PULL:
        return pull != PULL_EDEFAULT;
      case RttPackage.CONNECTION_POLICY__TRANSPORT:
        return transport != TRANSPORT_EDEFAULT;
      case RttPackage.CONNECTION_POLICY__TYPE:
        return type != TYPE_EDEFAULT;
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
    result.append(", bufferSize: ");
    result.append(bufferSize);
    result.append(", dataSize: ");
    result.append(dataSize);
    result.append(", init: ");
    result.append(init);
    result.append(", lockPolicy: ");
    result.append(lockPolicy);
    result.append(", pull: ");
    result.append(pull);
    result.append(", transport: ");
    result.append(transport);
    result.append(", type: ");
    result.append(type);
    result.append(')');
    return result.toString();
  }

} //ConnectionPolicyImpl

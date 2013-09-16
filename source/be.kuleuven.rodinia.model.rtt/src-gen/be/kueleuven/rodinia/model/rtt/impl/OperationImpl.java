/**
 */
package be.kueleuven.rodinia.model.rtt.impl;

import be.kueleuven.rodinia.model.rtt.ExecutionType;
import be.kueleuven.rodinia.model.rtt.Operation;
import be.kueleuven.rodinia.model.rtt.OperationArgument;
import be.kueleuven.rodinia.model.rtt.RttPackage;

import be.kuleuven.rodinia.dsl.datatypes.datatypes.DataType;

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
 * An implementation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link be.kueleuven.rodinia.model.rtt.impl.OperationImpl#getName <em>Name</em>}</li>
 *   <li>{@link be.kueleuven.rodinia.model.rtt.impl.OperationImpl#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link be.kueleuven.rodinia.model.rtt.impl.OperationImpl#getArguments <em>Arguments</em>}</li>
 *   <li>{@link be.kueleuven.rodinia.model.rtt.impl.OperationImpl#getExecutionType <em>Execution Type</em>}</li>
 *   <li>{@link be.kueleuven.rodinia.model.rtt.impl.OperationImpl#getDocumentation <em>Documentation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OperationImpl extends MinimalEObjectImpl.Container implements Operation
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
   * The cached value of the '{@link #getReturnType() <em>Return Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReturnType()
   * @generated
   * @ordered
   */
  protected DataType returnType;

  /**
   * The cached value of the '{@link #getArguments() <em>Arguments</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArguments()
   * @generated
   * @ordered
   */
  protected EList<OperationArgument> arguments;

  /**
   * The default value of the '{@link #getExecutionType() <em>Execution Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExecutionType()
   * @generated
   * @ordered
   */
  protected static final ExecutionType EXECUTION_TYPE_EDEFAULT = ExecutionType.CLIENT_THREAD;

  /**
   * The cached value of the '{@link #getExecutionType() <em>Execution Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExecutionType()
   * @generated
   * @ordered
   */
  protected ExecutionType executionType = EXECUTION_TYPE_EDEFAULT;

  /**
   * The default value of the '{@link #getDocumentation() <em>Documentation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDocumentation()
   * @generated
   * @ordered
   */
  protected static final String DOCUMENTATION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDocumentation() <em>Documentation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDocumentation()
   * @generated
   * @ordered
   */
  protected String documentation = DOCUMENTATION_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OperationImpl()
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
    return RttPackage.Literals.OPERATION;
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
      eNotify(new ENotificationImpl(this, Notification.SET, RttPackage.OPERATION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataType getReturnType()
  {
    if (returnType != null && returnType.eIsProxy())
    {
      InternalEObject oldReturnType = (InternalEObject)returnType;
      returnType = (DataType)eResolveProxy(oldReturnType);
      if (returnType != oldReturnType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RttPackage.OPERATION__RETURN_TYPE, oldReturnType, returnType));
      }
    }
    return returnType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataType basicGetReturnType()
  {
    return returnType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReturnType(DataType newReturnType)
  {
    DataType oldReturnType = returnType;
    returnType = newReturnType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RttPackage.OPERATION__RETURN_TYPE, oldReturnType, returnType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<OperationArgument> getArguments()
  {
    if (arguments == null)
    {
      arguments = new EObjectContainmentEList<OperationArgument>(OperationArgument.class, this, RttPackage.OPERATION__ARGUMENTS);
    }
    return arguments;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExecutionType getExecutionType()
  {
    return executionType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExecutionType(ExecutionType newExecutionType)
  {
    ExecutionType oldExecutionType = executionType;
    executionType = newExecutionType == null ? EXECUTION_TYPE_EDEFAULT : newExecutionType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RttPackage.OPERATION__EXECUTION_TYPE, oldExecutionType, executionType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDocumentation()
  {
    return documentation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDocumentation(String newDocumentation)
  {
    String oldDocumentation = documentation;
    documentation = newDocumentation;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RttPackage.OPERATION__DOCUMENTATION, oldDocumentation, documentation));
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
      case RttPackage.OPERATION__ARGUMENTS:
        return ((InternalEList<?>)getArguments()).basicRemove(otherEnd, msgs);
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
      case RttPackage.OPERATION__NAME:
        return getName();
      case RttPackage.OPERATION__RETURN_TYPE:
        if (resolve) return getReturnType();
        return basicGetReturnType();
      case RttPackage.OPERATION__ARGUMENTS:
        return getArguments();
      case RttPackage.OPERATION__EXECUTION_TYPE:
        return getExecutionType();
      case RttPackage.OPERATION__DOCUMENTATION:
        return getDocumentation();
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
      case RttPackage.OPERATION__NAME:
        setName((String)newValue);
        return;
      case RttPackage.OPERATION__RETURN_TYPE:
        setReturnType((DataType)newValue);
        return;
      case RttPackage.OPERATION__ARGUMENTS:
        getArguments().clear();
        getArguments().addAll((Collection<? extends OperationArgument>)newValue);
        return;
      case RttPackage.OPERATION__EXECUTION_TYPE:
        setExecutionType((ExecutionType)newValue);
        return;
      case RttPackage.OPERATION__DOCUMENTATION:
        setDocumentation((String)newValue);
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
      case RttPackage.OPERATION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case RttPackage.OPERATION__RETURN_TYPE:
        setReturnType((DataType)null);
        return;
      case RttPackage.OPERATION__ARGUMENTS:
        getArguments().clear();
        return;
      case RttPackage.OPERATION__EXECUTION_TYPE:
        setExecutionType(EXECUTION_TYPE_EDEFAULT);
        return;
      case RttPackage.OPERATION__DOCUMENTATION:
        setDocumentation(DOCUMENTATION_EDEFAULT);
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
      case RttPackage.OPERATION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case RttPackage.OPERATION__RETURN_TYPE:
        return returnType != null;
      case RttPackage.OPERATION__ARGUMENTS:
        return arguments != null && !arguments.isEmpty();
      case RttPackage.OPERATION__EXECUTION_TYPE:
        return executionType != EXECUTION_TYPE_EDEFAULT;
      case RttPackage.OPERATION__DOCUMENTATION:
        return DOCUMENTATION_EDEFAULT == null ? documentation != null : !DOCUMENTATION_EDEFAULT.equals(documentation);
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
    result.append(", executionType: ");
    result.append(executionType);
    result.append(", documentation: ");
    result.append(documentation);
    result.append(')');
    return result.toString();
  }

} //OperationImpl

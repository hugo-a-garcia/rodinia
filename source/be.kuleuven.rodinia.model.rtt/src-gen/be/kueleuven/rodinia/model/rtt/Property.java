/**
 */
package be.kueleuven.rodinia.model.rtt;

import be.kuleuven.rodinia.dsl.datatypes.datatypes.DataType;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link be.kueleuven.rodinia.model.rtt.Property#getName <em>Name</em>}</li>
 *   <li>{@link be.kueleuven.rodinia.model.rtt.Property#getVariable <em>Variable</em>}</li>
 *   <li>{@link be.kueleuven.rodinia.model.rtt.Property#getType <em>Type</em>}</li>
 *   <li>{@link be.kueleuven.rodinia.model.rtt.Property#getDocumentation <em>Documentation</em>}</li>
 * </ul>
 * </p>
 *
 * @see be.kueleuven.rodinia.model.rtt.RttPackage#getProperty()
 * @model
 * @generated
 */
public interface Property extends EObject
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
   * @see be.kueleuven.rodinia.model.rtt.RttPackage#getProperty_Name()
   * @model unique="false"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link be.kueleuven.rodinia.model.rtt.Property#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Variable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variable</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable</em>' attribute.
   * @see #setVariable(String)
   * @see be.kueleuven.rodinia.model.rtt.RttPackage#getProperty_Variable()
   * @model unique="false"
   * @generated
   */
  String getVariable();

  /**
   * Sets the value of the '{@link be.kueleuven.rodinia.model.rtt.Property#getVariable <em>Variable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variable</em>' attribute.
   * @see #getVariable()
   * @generated
   */
  void setVariable(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' reference.
   * @see #setType(DataType)
   * @see be.kueleuven.rodinia.model.rtt.RttPackage#getProperty_Type()
   * @model
   * @generated
   */
  DataType getType();

  /**
   * Sets the value of the '{@link be.kueleuven.rodinia.model.rtt.Property#getType <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' reference.
   * @see #getType()
   * @generated
   */
  void setType(DataType value);

  /**
   * Returns the value of the '<em><b>Documentation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Documentation</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Documentation</em>' attribute.
   * @see #setDocumentation(String)
   * @see be.kueleuven.rodinia.model.rtt.RttPackage#getProperty_Documentation()
   * @model unique="false"
   * @generated
   */
  String getDocumentation();

  /**
   * Sets the value of the '{@link be.kueleuven.rodinia.model.rtt.Property#getDocumentation <em>Documentation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Documentation</em>' attribute.
   * @see #getDocumentation()
   * @generated
   */
  void setDocumentation(String value);

} // Property

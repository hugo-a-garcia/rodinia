/**
 */
package be.kuleuven.rodinia.dsl.datatypes.datatypes;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see be.kuleuven.rodinia.dsl.datatypes.datatypes.DatatypesFactory
 * @model kind="package"
 * @generated
 */
public interface DatatypesPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "datatypes";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.kuleuven.be/rodinia/dsl/datatypes/Datatypes";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "datatypes";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  DatatypesPackage eINSTANCE = be.kuleuven.rodinia.dsl.datatypes.datatypes.impl.DatatypesPackageImpl.init();

  /**
   * The meta object id for the '{@link be.kuleuven.rodinia.dsl.datatypes.datatypes.impl.DomainmodelImpl <em>Domainmodel</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see be.kuleuven.rodinia.dsl.datatypes.datatypes.impl.DomainmodelImpl
   * @see be.kuleuven.rodinia.dsl.datatypes.datatypes.impl.DatatypesPackageImpl#getDomainmodel()
   * @generated
   */
  int DOMAINMODEL = 0;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAINMODEL__ELEMENTS = 0;

  /**
   * The number of structural features of the '<em>Domainmodel</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAINMODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link be.kuleuven.rodinia.dsl.datatypes.datatypes.impl.AbstractElementImpl <em>Abstract Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see be.kuleuven.rodinia.dsl.datatypes.datatypes.impl.AbstractElementImpl
   * @see be.kuleuven.rodinia.dsl.datatypes.datatypes.impl.DatatypesPackageImpl#getAbstractElement()
   * @generated
   */
  int ABSTRACT_ELEMENT = 1;

  /**
   * The number of structural features of the '<em>Abstract Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_ELEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link be.kuleuven.rodinia.dsl.datatypes.datatypes.impl.DataTypeLibraryImpl <em>Data Type Library</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see be.kuleuven.rodinia.dsl.datatypes.datatypes.impl.DataTypeLibraryImpl
   * @see be.kuleuven.rodinia.dsl.datatypes.datatypes.impl.DatatypesPackageImpl#getDataTypeLibrary()
   * @generated
   */
  int DATA_TYPE_LIBRARY = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE_LIBRARY__NAME = ABSTRACT_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE_LIBRARY__ELEMENTS = ABSTRACT_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Data Type Library</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE_LIBRARY_FEATURE_COUNT = ABSTRACT_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link be.kuleuven.rodinia.dsl.datatypes.datatypes.impl.ImportImpl <em>Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see be.kuleuven.rodinia.dsl.datatypes.datatypes.impl.ImportImpl
   * @see be.kuleuven.rodinia.dsl.datatypes.datatypes.impl.DatatypesPackageImpl#getImport()
   * @generated
   */
  int IMPORT = 3;

  /**
   * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT__IMPORTED_NAMESPACE = ABSTRACT_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Import</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_FEATURE_COUNT = ABSTRACT_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link be.kuleuven.rodinia.dsl.datatypes.datatypes.impl.DataTypeImpl <em>Data Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see be.kuleuven.rodinia.dsl.datatypes.datatypes.impl.DataTypeImpl
   * @see be.kuleuven.rodinia.dsl.datatypes.datatypes.impl.DatatypesPackageImpl#getDataType()
   * @generated
   */
  int DATA_TYPE = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE__NAME = ABSTRACT_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Data Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE_FEATURE_COUNT = ABSTRACT_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link be.kuleuven.rodinia.dsl.datatypes.datatypes.impl.SimpleTypeImpl <em>Simple Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see be.kuleuven.rodinia.dsl.datatypes.datatypes.impl.SimpleTypeImpl
   * @see be.kuleuven.rodinia.dsl.datatypes.datatypes.impl.DatatypesPackageImpl#getSimpleType()
   * @generated
   */
  int SIMPLE_TYPE = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_TYPE__NAME = DATA_TYPE__NAME;

  /**
   * The number of structural features of the '<em>Simple Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link be.kuleuven.rodinia.dsl.datatypes.datatypes.impl.CustomTypeImpl <em>Custom Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see be.kuleuven.rodinia.dsl.datatypes.datatypes.impl.CustomTypeImpl
   * @see be.kuleuven.rodinia.dsl.datatypes.datatypes.impl.DatatypesPackageImpl#getCustomType()
   * @generated
   */
  int CUSTOM_TYPE = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOM_TYPE__NAME = DATA_TYPE__NAME;

  /**
   * The feature id for the '<em><b>Super Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOM_TYPE__SUPER_TYPE = DATA_TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Fields</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOM_TYPE__FIELDS = DATA_TYPE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Custom Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOM_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link be.kuleuven.rodinia.dsl.datatypes.datatypes.impl.FieldImpl <em>Field</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see be.kuleuven.rodinia.dsl.datatypes.datatypes.impl.FieldImpl
   * @see be.kuleuven.rodinia.dsl.datatypes.datatypes.impl.DatatypesPackageImpl#getField()
   * @generated
   */
  int FIELD = 7;

  /**
   * The feature id for the '<em><b>Many</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__MANY = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__NAME = 1;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__TYPE = 2;

  /**
   * The number of structural features of the '<em>Field</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_FEATURE_COUNT = 3;


  /**
   * Returns the meta object for class '{@link be.kuleuven.rodinia.dsl.datatypes.datatypes.Domainmodel <em>Domainmodel</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Domainmodel</em>'.
   * @see be.kuleuven.rodinia.dsl.datatypes.datatypes.Domainmodel
   * @generated
   */
  EClass getDomainmodel();

  /**
   * Returns the meta object for the containment reference list '{@link be.kuleuven.rodinia.dsl.datatypes.datatypes.Domainmodel#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see be.kuleuven.rodinia.dsl.datatypes.datatypes.Domainmodel#getElements()
   * @see #getDomainmodel()
   * @generated
   */
  EReference getDomainmodel_Elements();

  /**
   * Returns the meta object for class '{@link be.kuleuven.rodinia.dsl.datatypes.datatypes.AbstractElement <em>Abstract Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract Element</em>'.
   * @see be.kuleuven.rodinia.dsl.datatypes.datatypes.AbstractElement
   * @generated
   */
  EClass getAbstractElement();

  /**
   * Returns the meta object for class '{@link be.kuleuven.rodinia.dsl.datatypes.datatypes.DataTypeLibrary <em>Data Type Library</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Type Library</em>'.
   * @see be.kuleuven.rodinia.dsl.datatypes.datatypes.DataTypeLibrary
   * @generated
   */
  EClass getDataTypeLibrary();

  /**
   * Returns the meta object for the attribute '{@link be.kuleuven.rodinia.dsl.datatypes.datatypes.DataTypeLibrary#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see be.kuleuven.rodinia.dsl.datatypes.datatypes.DataTypeLibrary#getName()
   * @see #getDataTypeLibrary()
   * @generated
   */
  EAttribute getDataTypeLibrary_Name();

  /**
   * Returns the meta object for the containment reference list '{@link be.kuleuven.rodinia.dsl.datatypes.datatypes.DataTypeLibrary#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see be.kuleuven.rodinia.dsl.datatypes.datatypes.DataTypeLibrary#getElements()
   * @see #getDataTypeLibrary()
   * @generated
   */
  EReference getDataTypeLibrary_Elements();

  /**
   * Returns the meta object for class '{@link be.kuleuven.rodinia.dsl.datatypes.datatypes.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import</em>'.
   * @see be.kuleuven.rodinia.dsl.datatypes.datatypes.Import
   * @generated
   */
  EClass getImport();

  /**
   * Returns the meta object for the attribute '{@link be.kuleuven.rodinia.dsl.datatypes.datatypes.Import#getImportedNamespace <em>Imported Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Imported Namespace</em>'.
   * @see be.kuleuven.rodinia.dsl.datatypes.datatypes.Import#getImportedNamespace()
   * @see #getImport()
   * @generated
   */
  EAttribute getImport_ImportedNamespace();

  /**
   * Returns the meta object for class '{@link be.kuleuven.rodinia.dsl.datatypes.datatypes.DataType <em>Data Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Type</em>'.
   * @see be.kuleuven.rodinia.dsl.datatypes.datatypes.DataType
   * @generated
   */
  EClass getDataType();

  /**
   * Returns the meta object for the attribute '{@link be.kuleuven.rodinia.dsl.datatypes.datatypes.DataType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see be.kuleuven.rodinia.dsl.datatypes.datatypes.DataType#getName()
   * @see #getDataType()
   * @generated
   */
  EAttribute getDataType_Name();

  /**
   * Returns the meta object for class '{@link be.kuleuven.rodinia.dsl.datatypes.datatypes.SimpleType <em>Simple Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Simple Type</em>'.
   * @see be.kuleuven.rodinia.dsl.datatypes.datatypes.SimpleType
   * @generated
   */
  EClass getSimpleType();

  /**
   * Returns the meta object for class '{@link be.kuleuven.rodinia.dsl.datatypes.datatypes.CustomType <em>Custom Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Custom Type</em>'.
   * @see be.kuleuven.rodinia.dsl.datatypes.datatypes.CustomType
   * @generated
   */
  EClass getCustomType();

  /**
   * Returns the meta object for the reference '{@link be.kuleuven.rodinia.dsl.datatypes.datatypes.CustomType#getSuperType <em>Super Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Super Type</em>'.
   * @see be.kuleuven.rodinia.dsl.datatypes.datatypes.CustomType#getSuperType()
   * @see #getCustomType()
   * @generated
   */
  EReference getCustomType_SuperType();

  /**
   * Returns the meta object for the containment reference list '{@link be.kuleuven.rodinia.dsl.datatypes.datatypes.CustomType#getFields <em>Fields</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Fields</em>'.
   * @see be.kuleuven.rodinia.dsl.datatypes.datatypes.CustomType#getFields()
   * @see #getCustomType()
   * @generated
   */
  EReference getCustomType_Fields();

  /**
   * Returns the meta object for class '{@link be.kuleuven.rodinia.dsl.datatypes.datatypes.Field <em>Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Field</em>'.
   * @see be.kuleuven.rodinia.dsl.datatypes.datatypes.Field
   * @generated
   */
  EClass getField();

  /**
   * Returns the meta object for the attribute '{@link be.kuleuven.rodinia.dsl.datatypes.datatypes.Field#isMany <em>Many</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Many</em>'.
   * @see be.kuleuven.rodinia.dsl.datatypes.datatypes.Field#isMany()
   * @see #getField()
   * @generated
   */
  EAttribute getField_Many();

  /**
   * Returns the meta object for the attribute '{@link be.kuleuven.rodinia.dsl.datatypes.datatypes.Field#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see be.kuleuven.rodinia.dsl.datatypes.datatypes.Field#getName()
   * @see #getField()
   * @generated
   */
  EAttribute getField_Name();

  /**
   * Returns the meta object for the reference '{@link be.kuleuven.rodinia.dsl.datatypes.datatypes.Field#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see be.kuleuven.rodinia.dsl.datatypes.datatypes.Field#getType()
   * @see #getField()
   * @generated
   */
  EReference getField_Type();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  DatatypesFactory getDatatypesFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link be.kuleuven.rodinia.dsl.datatypes.datatypes.impl.DomainmodelImpl <em>Domainmodel</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see be.kuleuven.rodinia.dsl.datatypes.datatypes.impl.DomainmodelImpl
     * @see be.kuleuven.rodinia.dsl.datatypes.datatypes.impl.DatatypesPackageImpl#getDomainmodel()
     * @generated
     */
    EClass DOMAINMODEL = eINSTANCE.getDomainmodel();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOMAINMODEL__ELEMENTS = eINSTANCE.getDomainmodel_Elements();

    /**
     * The meta object literal for the '{@link be.kuleuven.rodinia.dsl.datatypes.datatypes.impl.AbstractElementImpl <em>Abstract Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see be.kuleuven.rodinia.dsl.datatypes.datatypes.impl.AbstractElementImpl
     * @see be.kuleuven.rodinia.dsl.datatypes.datatypes.impl.DatatypesPackageImpl#getAbstractElement()
     * @generated
     */
    EClass ABSTRACT_ELEMENT = eINSTANCE.getAbstractElement();

    /**
     * The meta object literal for the '{@link be.kuleuven.rodinia.dsl.datatypes.datatypes.impl.DataTypeLibraryImpl <em>Data Type Library</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see be.kuleuven.rodinia.dsl.datatypes.datatypes.impl.DataTypeLibraryImpl
     * @see be.kuleuven.rodinia.dsl.datatypes.datatypes.impl.DatatypesPackageImpl#getDataTypeLibrary()
     * @generated
     */
    EClass DATA_TYPE_LIBRARY = eINSTANCE.getDataTypeLibrary();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATA_TYPE_LIBRARY__NAME = eINSTANCE.getDataTypeLibrary_Name();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_TYPE_LIBRARY__ELEMENTS = eINSTANCE.getDataTypeLibrary_Elements();

    /**
     * The meta object literal for the '{@link be.kuleuven.rodinia.dsl.datatypes.datatypes.impl.ImportImpl <em>Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see be.kuleuven.rodinia.dsl.datatypes.datatypes.impl.ImportImpl
     * @see be.kuleuven.rodinia.dsl.datatypes.datatypes.impl.DatatypesPackageImpl#getImport()
     * @generated
     */
    EClass IMPORT = eINSTANCE.getImport();

    /**
     * The meta object literal for the '<em><b>Imported Namespace</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT__IMPORTED_NAMESPACE = eINSTANCE.getImport_ImportedNamespace();

    /**
     * The meta object literal for the '{@link be.kuleuven.rodinia.dsl.datatypes.datatypes.impl.DataTypeImpl <em>Data Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see be.kuleuven.rodinia.dsl.datatypes.datatypes.impl.DataTypeImpl
     * @see be.kuleuven.rodinia.dsl.datatypes.datatypes.impl.DatatypesPackageImpl#getDataType()
     * @generated
     */
    EClass DATA_TYPE = eINSTANCE.getDataType();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATA_TYPE__NAME = eINSTANCE.getDataType_Name();

    /**
     * The meta object literal for the '{@link be.kuleuven.rodinia.dsl.datatypes.datatypes.impl.SimpleTypeImpl <em>Simple Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see be.kuleuven.rodinia.dsl.datatypes.datatypes.impl.SimpleTypeImpl
     * @see be.kuleuven.rodinia.dsl.datatypes.datatypes.impl.DatatypesPackageImpl#getSimpleType()
     * @generated
     */
    EClass SIMPLE_TYPE = eINSTANCE.getSimpleType();

    /**
     * The meta object literal for the '{@link be.kuleuven.rodinia.dsl.datatypes.datatypes.impl.CustomTypeImpl <em>Custom Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see be.kuleuven.rodinia.dsl.datatypes.datatypes.impl.CustomTypeImpl
     * @see be.kuleuven.rodinia.dsl.datatypes.datatypes.impl.DatatypesPackageImpl#getCustomType()
     * @generated
     */
    EClass CUSTOM_TYPE = eINSTANCE.getCustomType();

    /**
     * The meta object literal for the '<em><b>Super Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CUSTOM_TYPE__SUPER_TYPE = eINSTANCE.getCustomType_SuperType();

    /**
     * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CUSTOM_TYPE__FIELDS = eINSTANCE.getCustomType_Fields();

    /**
     * The meta object literal for the '{@link be.kuleuven.rodinia.dsl.datatypes.datatypes.impl.FieldImpl <em>Field</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see be.kuleuven.rodinia.dsl.datatypes.datatypes.impl.FieldImpl
     * @see be.kuleuven.rodinia.dsl.datatypes.datatypes.impl.DatatypesPackageImpl#getField()
     * @generated
     */
    EClass FIELD = eINSTANCE.getField();

    /**
     * The meta object literal for the '<em><b>Many</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIELD__MANY = eINSTANCE.getField_Many();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIELD__NAME = eINSTANCE.getField_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FIELD__TYPE = eINSTANCE.getField_Type();

  }

} //DatatypesPackage

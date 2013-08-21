package be.kuleuven.rodinia.dsl.datatypes.serializer;

import be.kuleuven.rodinia.dsl.datatypes.datatypes.ComplexType;
import be.kuleuven.rodinia.dsl.datatypes.datatypes.DataTypeLibrary;
import be.kuleuven.rodinia.dsl.datatypes.datatypes.DatatypesPackage;
import be.kuleuven.rodinia.dsl.datatypes.datatypes.Field;
import be.kuleuven.rodinia.dsl.datatypes.datatypes.Import;
import be.kuleuven.rodinia.dsl.datatypes.datatypes.SimpleType;
import be.kuleuven.rodinia.dsl.datatypes.datatypes.TypeModel;
import be.kuleuven.rodinia.dsl.datatypes.services.DatatypesGrammarAccess;
import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class DatatypesSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private DatatypesGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == DatatypesPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case DatatypesPackage.COMPLEX_TYPE:
				if(context == grammarAccess.getAbstractElementRule() ||
				   context == grammarAccess.getComplexTypeRule() ||
				   context == grammarAccess.getDataTypeRule()) {
					sequence_ComplexType(context, (ComplexType) semanticObject); 
					return; 
				}
				else break;
			case DatatypesPackage.DATA_TYPE_LIBRARY:
				if(context == grammarAccess.getAbstractElementRule() ||
				   context == grammarAccess.getDataTypeLibraryRule()) {
					sequence_DataTypeLibrary(context, (DataTypeLibrary) semanticObject); 
					return; 
				}
				else break;
			case DatatypesPackage.FIELD:
				if(context == grammarAccess.getFieldRule()) {
					sequence_Field(context, (Field) semanticObject); 
					return; 
				}
				else break;
			case DatatypesPackage.IMPORT:
				if(context == grammarAccess.getAbstractElementRule() ||
				   context == grammarAccess.getImportRule()) {
					sequence_Import(context, (Import) semanticObject); 
					return; 
				}
				else break;
			case DatatypesPackage.SIMPLE_TYPE:
				if(context == grammarAccess.getAbstractElementRule() ||
				   context == grammarAccess.getDataTypeRule() ||
				   context == grammarAccess.getSimpleTypeRule()) {
					sequence_SimpleType(context, (SimpleType) semanticObject); 
					return; 
				}
				else break;
			case DatatypesPackage.TYPE_MODEL:
				if(context == grammarAccess.getTypeModelRule()) {
					sequence_TypeModel(context, (TypeModel) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (name=ID superType=[ComplexType|QualifiedName]? (fields+=Field fields+=Field*)?)
	 */
	protected void sequence_ComplexType(EObject context, ComplexType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=QualifiedName elements+=AbstractElement*)
	 */
	protected void sequence_DataTypeLibrary(EObject context, DataTypeLibrary semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (many?='many'? name=ID type=[DataType|QualifiedName])
	 */
	protected void sequence_Field(EObject context, Field semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     importedNamespace=QualifiedNameWithWildcard
	 */
	protected void sequence_Import(EObject context, Import semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DatatypesPackage.Literals.IMPORT__IMPORTED_NAMESPACE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DatatypesPackage.Literals.IMPORT__IMPORTED_NAMESPACE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0(), semanticObject.getImportedNamespace());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_SimpleType(EObject context, SimpleType semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DatatypesPackage.Literals.DATA_TYPE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DatatypesPackage.Literals.DATA_TYPE__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSimpleTypeAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     elements+=AbstractElement*
	 */
	protected void sequence_TypeModel(EObject context, TypeModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}

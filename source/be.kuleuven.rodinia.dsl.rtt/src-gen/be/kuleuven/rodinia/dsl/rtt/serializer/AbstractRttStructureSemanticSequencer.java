package be.kuleuven.rodinia.dsl.rtt.serializer;

import be.kueleuven.rodinia.model.rtt.RttPackage;
import be.kueleuven.rodinia.model.rtt.TaskContext;
import be.kuleuven.rodinia.dsl.rtt.services.RttStructureGrammarAccess;
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
public abstract class AbstractRttStructureSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private RttStructureGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == RttPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case RttPackage.PACKAGE:
				if(context == grammarAccess.getPackageRule()) {
					sequence_Package(context, (be.kueleuven.rodinia.model.rtt.Package) semanticObject); 
					return; 
				}
				else break;
			case RttPackage.TASK_CONTEXT:
				if(context == grammarAccess.getTaskContextRule()) {
					sequence_TaskContext(context, (TaskContext) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (name=EString (taskContexts+=TaskContext taskContexts+=TaskContext*)?)
	 */
	protected void sequence_Package(EObject context, be.kueleuven.rodinia.model.rtt.Package semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString namespace=EString type=EString)
	 */
	protected void sequence_TaskContext(EObject context, TaskContext semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RttPackage.Literals.TASK_CONTEXT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RttPackage.Literals.TASK_CONTEXT__NAME));
			if(transientValues.isValueTransient(semanticObject, RttPackage.Literals.TASK_CONTEXT__NAMESPACE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RttPackage.Literals.TASK_CONTEXT__NAMESPACE));
			if(transientValues.isValueTransient(semanticObject, RttPackage.Literals.TASK_CONTEXT__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RttPackage.Literals.TASK_CONTEXT__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTaskContextAccess().getNameEStringParserRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getTaskContextAccess().getNamespaceEStringParserRuleCall_4_0(), semanticObject.getNamespace());
		feeder.accept(grammarAccess.getTaskContextAccess().getTypeEStringParserRuleCall_6_0(), semanticObject.getType());
		feeder.finish();
	}
}

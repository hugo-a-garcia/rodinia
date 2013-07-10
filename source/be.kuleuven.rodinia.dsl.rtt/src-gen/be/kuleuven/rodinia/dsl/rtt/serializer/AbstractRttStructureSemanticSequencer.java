package be.kuleuven.rodinia.dsl.rtt.serializer;

import be.kueleuven.rodinia.model.rtt.ConnectionPolicy;
import be.kueleuven.rodinia.model.rtt.InputPort;
import be.kueleuven.rodinia.model.rtt.OrocosPackage;
import be.kueleuven.rodinia.model.rtt.OutputPort;
import be.kueleuven.rodinia.model.rtt.RttPackage;
import be.kueleuven.rodinia.model.rtt.TaskContext;
import be.kuleuven.rodinia.dsl.rtt.services.RttStructureGrammarAccess;
import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;

@SuppressWarnings("all")
public abstract class AbstractRttStructureSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private RttStructureGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == RttPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case RttPackage.CONNECTION_POLICY:
				if(context == grammarAccess.getConnectionPolicyRule()) {
					sequence_ConnectionPolicy(context, (ConnectionPolicy) semanticObject); 
					return; 
				}
				else break;
			case RttPackage.INPUT_PORT:
				if(context == grammarAccess.getInputPortRule()) {
					sequence_InputPort(context, (InputPort) semanticObject); 
					return; 
				}
				else break;
			case RttPackage.OROCOS_PACKAGE:
				if(context == grammarAccess.getPackageRule()) {
					sequence_Package(context, (OrocosPackage) semanticObject); 
					return; 
				}
				else break;
			case RttPackage.OUTPUT_PORT:
				if(context == grammarAccess.getOutputPortRule()) {
					sequence_OutputPort(context, (OutputPort) semanticObject); 
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
	 *     (
	 *         name=EString 
	 *         bufferSize=EShort? 
	 *         lockPolicy=ConnectionPolicyLockPolicy? 
	 *         type=ConnectionPolicyType? 
	 *         inputPort=[InputPort|EString] 
	 *         outputPort=[OutputPort|EString]
	 *     )
	 */
	protected void sequence_ConnectionPolicy(EObject context, ConnectionPolicy semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (isEventPort?='isEventPort' name=EString dataType=[DataType|EString]? inputConnectionPolicy=[ConnectionPolicy|EString]?)
	 */
	protected void sequence_InputPort(EObject context, InputPort semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString dataType=[DataType|EString]? outputConnectionPolicy=[ConnectionPolicy|EString]?)
	 */
	protected void sequence_OutputPort(EObject context, OutputPort semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         (taskContexts+=TaskContext taskContexts+=TaskContext*)? 
	 *         (connectionPolicies+=ConnectionPolicy connectionPolicies+=ConnectionPolicy*)?
	 *     )
	 */
	protected void sequence_Package(EObject context, OrocosPackage semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString namespace=EString type=EString (inputPorts+=InputPort inputPorts+=InputPort*)? (outputPorts+=OutputPort outputPorts+=OutputPort*)?)
	 */
	protected void sequence_TaskContext(EObject context, TaskContext semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}

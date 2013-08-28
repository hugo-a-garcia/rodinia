package be.kuleuven.rodinia.dsl.rtt.serializer;

import be.kueleuven.rodinia.model.rtt.Activity;
import be.kueleuven.rodinia.model.rtt.ConnectionPolicy;
import be.kueleuven.rodinia.model.rtt.EventPort;
import be.kueleuven.rodinia.model.rtt.InputPort;
import be.kueleuven.rodinia.model.rtt.Operation;
import be.kueleuven.rodinia.model.rtt.OrocosPackage;
import be.kueleuven.rodinia.model.rtt.OutputPort;
import be.kueleuven.rodinia.model.rtt.PeerGroup;
import be.kueleuven.rodinia.model.rtt.Property;
import be.kueleuven.rodinia.model.rtt.RttPackage;
import be.kueleuven.rodinia.model.rtt.Slave;
import be.kueleuven.rodinia.model.rtt.TaskContext;
import be.kuleuven.rodinia.dsl.rtt.services.RttDslGrammarAccess;
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
public abstract class AbstractRttDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private RttDslGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == RttPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case RttPackage.ACTIVITY:
				if(context == grammarAccess.getActivityRule()) {
					sequence_Activity(context, (Activity) semanticObject); 
					return; 
				}
				else break;
			case RttPackage.CONNECTION_POLICY:
				if(context == grammarAccess.getConnectionPolicyRule()) {
					sequence_ConnectionPolicy(context, (ConnectionPolicy) semanticObject); 
					return; 
				}
				else break;
			case RttPackage.EVENT_PORT:
				if(context == grammarAccess.getEventPortRule() ||
				   context == grammarAccess.getInputPortRule()) {
					sequence_EventPort(context, (EventPort) semanticObject); 
					return; 
				}
				else break;
			case RttPackage.INPUT_PORT:
				if(context == grammarAccess.getInputPortRule() ||
				   context == grammarAccess.getInputPort_ImplRule()) {
					sequence_InputPort_Impl(context, (InputPort) semanticObject); 
					return; 
				}
				else break;
			case RttPackage.OPERATION:
				if(context == grammarAccess.getOperationRule()) {
					sequence_Operation(context, (Operation) semanticObject); 
					return; 
				}
				else break;
			case RttPackage.OROCOS_PACKAGE:
				if(context == grammarAccess.getOrocosPackageRule()) {
					sequence_OrocosPackage(context, (OrocosPackage) semanticObject); 
					return; 
				}
				else break;
			case RttPackage.OUTPUT_PORT:
				if(context == grammarAccess.getOutputPortRule()) {
					sequence_OutputPort(context, (OutputPort) semanticObject); 
					return; 
				}
				else break;
			case RttPackage.PEER_GROUP:
				if(context == grammarAccess.getPeerGroupRule()) {
					sequence_PeerGroup(context, (PeerGroup) semanticObject); 
					return; 
				}
				else break;
			case RttPackage.PROPERTY:
				if(context == grammarAccess.getPropertyRule()) {
					sequence_Property(context, (Property) semanticObject); 
					return; 
				}
				else break;
			case RttPackage.SLAVE:
				if(context == grammarAccess.getSlaveRule()) {
					sequence_Slave(context, (Slave) semanticObject); 
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
	 *         scheduler=Scheduler? 
	 *         cpuAffinity=EString? 
	 *         period=EFloat? 
	 *         priority=EInt? 
	 *         taskContext=[TaskContext|EString]? 
	 *         (slave+=Slave slave+=Slave*)?
	 *     )
	 */
	protected void sequence_Activity(EObject context, Activity semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         inputPort=[InputPort|EString] 
	 *         outputPort=[OutputPort|EString] 
	 *         bufferSize=EShort? 
	 *         dataSize=EShort? 
	 *         lockPolicy=ConnectionPolicyLockPolicy? 
	 *         transport=ConnectionPolicyTransport? 
	 *         type=ConnectionPolicyType? 
	 *         init?='init'? 
	 *         pull?='pull'?
	 *     )
	 */
	protected void sequence_ConnectionPolicy(EObject context, ConnectionPolicy semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString dataType=[DataType|QualifiedNameWithDot]?)
	 */
	protected void sequence_EventPort(EObject context, EventPort semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString dataType=[DataType|QualifiedNameWithDot]?)
	 */
	protected void sequence_InputPort_Impl(EObject context, InputPort semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString documentation=EString? returnType=[DataType|QualifiedNameWithDot]?)
	 */
	protected void sequence_Operation(EObject context, Operation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         (taskContexts+=TaskContext taskContexts+=TaskContext*)? 
	 *         (connectionPolicies+=ConnectionPolicy connectionPolicies+=ConnectionPolicy*)? 
	 *         (peerGroups+=PeerGroup peerGroups+=PeerGroup*)?
	 *     )
	 */
	protected void sequence_OrocosPackage(EObject context, OrocosPackage semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString dataType=[DataType|QualifiedNameWithDot]?)
	 */
	protected void sequence_OutputPort(EObject context, OutputPort semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString coordinator=[TaskContext|EString] (members+=[TaskContext|EString] members+=[TaskContext|EString]*)?)
	 */
	protected void sequence_PeerGroup(EObject context, PeerGroup semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString description=EString? value=EString? type=[DataType|QualifiedNameWithDot]?)
	 */
	protected void sequence_Property(EObject context, Property semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString taskContext=[TaskContext|EString]?)
	 */
	protected void sequence_Slave(EObject context, Slave semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         namespace=EString 
	 *         type=EString 
	 *         activity=Activity? 
	 *         (inputPorts+=InputPort inputPorts+=InputPort*)? 
	 *         (eventPorts+=EventPort eventPorts+=EventPort*)? 
	 *         (outputPorts+=OutputPort outputPorts+=OutputPort*)? 
	 *         (properties+=Property properties+=Property*)? 
	 *         (operations+=Operation operations+=Operation*)?
	 *     )
	 */
	protected void sequence_TaskContext(EObject context, TaskContext semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}

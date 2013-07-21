package cz.cuni.mff.d3s.dsl.deeco.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import cz.cuni.mff.d3s.dsl.deeco.services.DEECoDslGrammarAccess;
import cz.cuni.mff.d3s.model.deeco.Component;
import cz.cuni.mff.d3s.model.deeco.DeecoPackage;
import cz.cuni.mff.d3s.model.deeco.Ensemble;
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
public abstract class AbstractDEECoDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private DEECoDslGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == DeecoPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case DeecoPackage.COMPONENT:
				if(context == grammarAccess.getComponentRule()) {
					sequence_Component(context, (Component) semanticObject); 
					return; 
				}
				else break;
			case DeecoPackage.ENSEMBLE:
				if(context == grammarAccess.getEnsembleRule()) {
					sequence_Ensemble(context, (Ensemble) semanticObject); 
					return; 
				}
				else break;
			case DeecoPackage.PROCESS:
				if(context == grammarAccess.getProcessRule()) {
					sequence_Process(context, (cz.cuni.mff.d3s.model.deeco.Process) semanticObject); 
					return; 
				}
				else break;
			case DeecoPackage.SYSTEM:
				if(context == grammarAccess.getSystemRule()) {
					sequence_System(context, (cz.cuni.mff.d3s.model.deeco.System) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (name=EString process=Process ensembleMember=[Ensemble|EString]? ensembleCordinator=[Ensemble|EString]?)
	 */
	protected void sequence_Component(EObject context, Component semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString coordinator=[Component|EString] (members+=[Component|EString] members+=[Component|EString]*)?)
	 */
	protected void sequence_Ensemble(EObject context, Ensemble semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=EString
	 */
	protected void sequence_Process(EObject context, cz.cuni.mff.d3s.model.deeco.Process semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DeecoPackage.Literals.PROCESS__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DeecoPackage.Literals.PROCESS__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getProcessAccess().getNameEStringParserRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString (components+=Component components+=Component*)? (ensembles+=Ensemble ensembles+=Ensemble*)?)
	 */
	protected void sequence_System(EObject context, cz.cuni.mff.d3s.model.deeco.System semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}

/*
* generated by Xtext
*/
package be.kuleuven.rodinia.dsl.rtt.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import be.kuleuven.rodinia.dsl.rtt.services.RttStructureGrammarAccess;

public class RttStructureParser extends AbstractContentAssistParser {
	
	@Inject
	private RttStructureGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected be.kuleuven.rodinia.dsl.rtt.ui.contentassist.antlr.internal.InternalRttStructureParser createParser() {
		be.kuleuven.rodinia.dsl.rtt.ui.contentassist.antlr.internal.InternalRttStructureParser result = new be.kuleuven.rodinia.dsl.rtt.ui.contentassist.antlr.internal.InternalRttStructureParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getIActivityAccess().getAlternatives(), "rule__IActivity__Alternatives");
					put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
					put(grammarAccess.getEFloatAccess().getAlternatives_4_0(), "rule__EFloat__Alternatives_4_0");
					put(grammarAccess.getConnectionPolicyLockPolicyAccess().getAlternatives(), "rule__ConnectionPolicyLockPolicy__Alternatives");
					put(grammarAccess.getConnectionPolicyTypeAccess().getAlternatives(), "rule__ConnectionPolicyType__Alternatives");
					put(grammarAccess.getSchedulerAccess().getAlternatives(), "rule__Scheduler__Alternatives");
					put(grammarAccess.getPackageAccess().getGroup(), "rule__Package__Group__0");
					put(grammarAccess.getPackageAccess().getGroup_4(), "rule__Package__Group_4__0");
					put(grammarAccess.getPackageAccess().getGroup_4_3(), "rule__Package__Group_4_3__0");
					put(grammarAccess.getPackageAccess().getGroup_5(), "rule__Package__Group_5__0");
					put(grammarAccess.getPackageAccess().getGroup_5_3(), "rule__Package__Group_5_3__0");
					put(grammarAccess.getPackageAccess().getGroup_6(), "rule__Package__Group_6__0");
					put(grammarAccess.getPackageAccess().getGroup_6_3(), "rule__Package__Group_6_3__0");
					put(grammarAccess.getTaskContextAccess().getGroup(), "rule__TaskContext__Group__0");
					put(grammarAccess.getTaskContextAccess().getGroup_9(), "rule__TaskContext__Group_9__0");
					put(grammarAccess.getTaskContextAccess().getGroup_9_3(), "rule__TaskContext__Group_9_3__0");
					put(grammarAccess.getTaskContextAccess().getGroup_10(), "rule__TaskContext__Group_10__0");
					put(grammarAccess.getTaskContextAccess().getGroup_10_3(), "rule__TaskContext__Group_10_3__0");
					put(grammarAccess.getTaskContextAccess().getGroup_11(), "rule__TaskContext__Group_11__0");
					put(grammarAccess.getTaskContextAccess().getGroup_11_3(), "rule__TaskContext__Group_11_3__0");
					put(grammarAccess.getTaskContextAccess().getGroup_12(), "rule__TaskContext__Group_12__0");
					put(grammarAccess.getTaskContextAccess().getGroup_12_3(), "rule__TaskContext__Group_12_3__0");
					put(grammarAccess.getPeerGroupAccess().getGroup(), "rule__PeerGroup__Group__0");
					put(grammarAccess.getPeerGroupAccess().getGroup_5(), "rule__PeerGroup__Group_5__0");
					put(grammarAccess.getPeerGroupAccess().getGroup_5_3(), "rule__PeerGroup__Group_5_3__0");
					put(grammarAccess.getConnectionPolicyAccess().getGroup(), "rule__ConnectionPolicy__Group__0");
					put(grammarAccess.getConnectionPolicyAccess().getGroup_3(), "rule__ConnectionPolicy__Group_3__0");
					put(grammarAccess.getConnectionPolicyAccess().getGroup_4(), "rule__ConnectionPolicy__Group_4__0");
					put(grammarAccess.getConnectionPolicyAccess().getGroup_5(), "rule__ConnectionPolicy__Group_5__0");
					put(grammarAccess.getInputPortAccess().getGroup(), "rule__InputPort__Group__0");
					put(grammarAccess.getInputPortAccess().getGroup_4(), "rule__InputPort__Group_4__0");
					put(grammarAccess.getInputPortAccess().getGroup_5(), "rule__InputPort__Group_5__0");
					put(grammarAccess.getOutputPortAccess().getGroup(), "rule__OutputPort__Group__0");
					put(grammarAccess.getOutputPortAccess().getGroup_3(), "rule__OutputPort__Group_3__0");
					put(grammarAccess.getOutputPortAccess().getGroup_4(), "rule__OutputPort__Group_4__0");
					put(grammarAccess.getPropertyAccess().getGroup(), "rule__Property__Group__0");
					put(grammarAccess.getPropertyAccess().getGroup_4(), "rule__Property__Group_4__0");
					put(grammarAccess.getPropertyAccess().getGroup_5(), "rule__Property__Group_5__0");
					put(grammarAccess.getPropertyAccess().getGroup_6(), "rule__Property__Group_6__0");
					put(grammarAccess.getOperationAccess().getGroup(), "rule__Operation__Group__0");
					put(grammarAccess.getOperationAccess().getGroup_4(), "rule__Operation__Group_4__0");
					put(grammarAccess.getOperationAccess().getGroup_5(), "rule__Operation__Group_5__0");
					put(grammarAccess.getEShortAccess().getGroup(), "rule__EShort__Group__0");
					put(grammarAccess.getActivityAccess().getGroup(), "rule__Activity__Group__0");
					put(grammarAccess.getActivityAccess().getGroup_11(), "rule__Activity__Group_11__0");
					put(grammarAccess.getActivityAccess().getGroup_12(), "rule__Activity__Group_12__0");
					put(grammarAccess.getActivityAccess().getGroup_12_3(), "rule__Activity__Group_12_3__0");
					put(grammarAccess.getSlaveAccess().getGroup(), "rule__Slave__Group__0");
					put(grammarAccess.getSlaveAccess().getGroup_4(), "rule__Slave__Group_4__0");
					put(grammarAccess.getEFloatAccess().getGroup(), "rule__EFloat__Group__0");
					put(grammarAccess.getEFloatAccess().getGroup_4(), "rule__EFloat__Group_4__0");
					put(grammarAccess.getEIntAccess().getGroup(), "rule__EInt__Group__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup(), "rule__QualifiedName__Group__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup_1(), "rule__QualifiedName__Group_1__0");
					put(grammarAccess.getQualifiedNameWithDotAccess().getGroup(), "rule__QualifiedNameWithDot__Group__0");
					put(grammarAccess.getQualifiedNameWithDotAccess().getGroup_1(), "rule__QualifiedNameWithDot__Group_1__0");
					put(grammarAccess.getPackageAccess().getNameAssignment_2(), "rule__Package__NameAssignment_2");
					put(grammarAccess.getPackageAccess().getTaskContextsAssignment_4_2(), "rule__Package__TaskContextsAssignment_4_2");
					put(grammarAccess.getPackageAccess().getTaskContextsAssignment_4_3_1(), "rule__Package__TaskContextsAssignment_4_3_1");
					put(grammarAccess.getPackageAccess().getConnectionPoliciesAssignment_5_2(), "rule__Package__ConnectionPoliciesAssignment_5_2");
					put(grammarAccess.getPackageAccess().getConnectionPoliciesAssignment_5_3_1(), "rule__Package__ConnectionPoliciesAssignment_5_3_1");
					put(grammarAccess.getPackageAccess().getPeerGroupsAssignment_6_2(), "rule__Package__PeerGroupsAssignment_6_2");
					put(grammarAccess.getPackageAccess().getPeerGroupsAssignment_6_3_1(), "rule__Package__PeerGroupsAssignment_6_3_1");
					put(grammarAccess.getTaskContextAccess().getNameAssignment_1(), "rule__TaskContext__NameAssignment_1");
					put(grammarAccess.getTaskContextAccess().getNamespaceAssignment_4(), "rule__TaskContext__NamespaceAssignment_4");
					put(grammarAccess.getTaskContextAccess().getTypeAssignment_6(), "rule__TaskContext__TypeAssignment_6");
					put(grammarAccess.getTaskContextAccess().getActivityAssignment_8(), "rule__TaskContext__ActivityAssignment_8");
					put(grammarAccess.getTaskContextAccess().getInputPortsAssignment_9_2(), "rule__TaskContext__InputPortsAssignment_9_2");
					put(grammarAccess.getTaskContextAccess().getInputPortsAssignment_9_3_1(), "rule__TaskContext__InputPortsAssignment_9_3_1");
					put(grammarAccess.getTaskContextAccess().getOutputPortsAssignment_10_2(), "rule__TaskContext__OutputPortsAssignment_10_2");
					put(grammarAccess.getTaskContextAccess().getOutputPortsAssignment_10_3_1(), "rule__TaskContext__OutputPortsAssignment_10_3_1");
					put(grammarAccess.getTaskContextAccess().getPropertiesAssignment_11_2(), "rule__TaskContext__PropertiesAssignment_11_2");
					put(grammarAccess.getTaskContextAccess().getPropertiesAssignment_11_3_1(), "rule__TaskContext__PropertiesAssignment_11_3_1");
					put(grammarAccess.getTaskContextAccess().getOperationsAssignment_12_2(), "rule__TaskContext__OperationsAssignment_12_2");
					put(grammarAccess.getTaskContextAccess().getOperationsAssignment_12_3_1(), "rule__TaskContext__OperationsAssignment_12_3_1");
					put(grammarAccess.getPeerGroupAccess().getNameAssignment_1(), "rule__PeerGroup__NameAssignment_1");
					put(grammarAccess.getPeerGroupAccess().getCoordinatorAssignment_4(), "rule__PeerGroup__CoordinatorAssignment_4");
					put(grammarAccess.getPeerGroupAccess().getMembersAssignment_5_2(), "rule__PeerGroup__MembersAssignment_5_2");
					put(grammarAccess.getPeerGroupAccess().getMembersAssignment_5_3_1(), "rule__PeerGroup__MembersAssignment_5_3_1");
					put(grammarAccess.getConnectionPolicyAccess().getNameAssignment_1(), "rule__ConnectionPolicy__NameAssignment_1");
					put(grammarAccess.getConnectionPolicyAccess().getBufferSizeAssignment_3_1(), "rule__ConnectionPolicy__BufferSizeAssignment_3_1");
					put(grammarAccess.getConnectionPolicyAccess().getLockPolicyAssignment_4_1(), "rule__ConnectionPolicy__LockPolicyAssignment_4_1");
					put(grammarAccess.getConnectionPolicyAccess().getTypeAssignment_5_1(), "rule__ConnectionPolicy__TypeAssignment_5_1");
					put(grammarAccess.getConnectionPolicyAccess().getInputPortAssignment_7(), "rule__ConnectionPolicy__InputPortAssignment_7");
					put(grammarAccess.getConnectionPolicyAccess().getOutputPortAssignment_9(), "rule__ConnectionPolicy__OutputPortAssignment_9");
					put(grammarAccess.getInputPortAccess().getIsEventPortAssignment_0(), "rule__InputPort__IsEventPortAssignment_0");
					put(grammarAccess.getInputPortAccess().getNameAssignment_2(), "rule__InputPort__NameAssignment_2");
					put(grammarAccess.getInputPortAccess().getDataTypeAssignment_4_1(), "rule__InputPort__DataTypeAssignment_4_1");
					put(grammarAccess.getInputPortAccess().getInputConnectionPolicyAssignment_5_1(), "rule__InputPort__InputConnectionPolicyAssignment_5_1");
					put(grammarAccess.getOutputPortAccess().getNameAssignment_1(), "rule__OutputPort__NameAssignment_1");
					put(grammarAccess.getOutputPortAccess().getDataTypeAssignment_3_1(), "rule__OutputPort__DataTypeAssignment_3_1");
					put(grammarAccess.getOutputPortAccess().getOutputConnectionPolicyAssignment_4_1(), "rule__OutputPort__OutputConnectionPolicyAssignment_4_1");
					put(grammarAccess.getPropertyAccess().getNameAssignment_2(), "rule__Property__NameAssignment_2");
					put(grammarAccess.getPropertyAccess().getDescriptionAssignment_4_1(), "rule__Property__DescriptionAssignment_4_1");
					put(grammarAccess.getPropertyAccess().getValueAssignment_5_1(), "rule__Property__ValueAssignment_5_1");
					put(grammarAccess.getPropertyAccess().getTypeAssignment_6_1(), "rule__Property__TypeAssignment_6_1");
					put(grammarAccess.getOperationAccess().getNameAssignment_2(), "rule__Operation__NameAssignment_2");
					put(grammarAccess.getOperationAccess().getDocumentationAssignment_4_1(), "rule__Operation__DocumentationAssignment_4_1");
					put(grammarAccess.getOperationAccess().getReturnTypeAssignment_5_1(), "rule__Operation__ReturnTypeAssignment_5_1");
					put(grammarAccess.getActivityAccess().getNameAssignment_1(), "rule__Activity__NameAssignment_1");
					put(grammarAccess.getActivityAccess().getSchedulerAssignment_4(), "rule__Activity__SchedulerAssignment_4");
					put(grammarAccess.getActivityAccess().getCpuAffinityAssignment_6(), "rule__Activity__CpuAffinityAssignment_6");
					put(grammarAccess.getActivityAccess().getPeriodAssignment_8(), "rule__Activity__PeriodAssignment_8");
					put(grammarAccess.getActivityAccess().getPriorityAssignment_10(), "rule__Activity__PriorityAssignment_10");
					put(grammarAccess.getActivityAccess().getTaskContextAssignment_11_1(), "rule__Activity__TaskContextAssignment_11_1");
					put(grammarAccess.getActivityAccess().getSlaveAssignment_12_2(), "rule__Activity__SlaveAssignment_12_2");
					put(grammarAccess.getActivityAccess().getSlaveAssignment_12_3_1(), "rule__Activity__SlaveAssignment_12_3_1");
					put(grammarAccess.getSlaveAccess().getNameAssignment_2(), "rule__Slave__NameAssignment_2");
					put(grammarAccess.getSlaveAccess().getTaskContextAssignment_4_1(), "rule__Slave__TaskContextAssignment_4_1");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			be.kuleuven.rodinia.dsl.rtt.ui.contentassist.antlr.internal.InternalRttStructureParser typedParser = (be.kuleuven.rodinia.dsl.rtt.ui.contentassist.antlr.internal.InternalRttStructureParser) parser;
			typedParser.entryRulePackage();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public RttStructureGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(RttStructureGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}

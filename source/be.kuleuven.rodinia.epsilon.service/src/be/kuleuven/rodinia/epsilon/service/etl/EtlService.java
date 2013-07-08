package be.kuleuven.rodinia.epsilon.service.etl;

import org.eclipse.core.resources.IResourceRuleFactory;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.resources.WorkspaceJob;
import org.eclipse.core.runtime.jobs.ISchedulingRule;
import org.eclipse.core.runtime.jobs.Job;

public class EtlService implements IEtlTransformService {
	
	public EtlService() {
	}

	@Override
	public void doEtlTransform(IEtlTransformParameter transformParameter) {
		WorkspaceJob job = null;
		job = EtlJob.createJob((EtlTransformParameter) transformParameter);
		executeJob(job);
	}
	
	private void executeJob(WorkspaceJob job) {
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		IResourceRuleFactory ruleFactory = workspace.getRuleFactory();
		ISchedulingRule rule = ruleFactory.modifyRule(workspace.getRoot());
		job.setUser(true);
		job.setPriority(Job.INTERACTIVE);
		job.setRule(rule);
		job.schedule();
	}

}

package be.kuleuven.rodinia.epsilon.service.egl;

import org.eclipse.core.resources.IResourceRuleFactory;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.resources.WorkspaceJob;
import org.eclipse.core.runtime.jobs.ISchedulingRule;
import org.eclipse.core.runtime.jobs.Job;

public class EglService implements IEglTransformService {
	
	public EglService() {
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

	@Override
	public void doEglTransform(IEglTransformParameter transformParameter) {
		WorkspaceJob job = null;
		job = EglJob.createJob((EglTransformParameter) transformParameter);
		executeJob(job);
	}

}

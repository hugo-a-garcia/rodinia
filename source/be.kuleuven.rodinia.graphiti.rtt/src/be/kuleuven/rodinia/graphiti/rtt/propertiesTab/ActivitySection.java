package be.kuleuven.rodinia.graphiti.rtt.propertiesTab;

import org.eclipse.graphiti.features.IFeature;
import org.eclipse.graphiti.features.context.IContext;
import org.eclipse.graphiti.features.context.impl.CustomContext;
import org.eclipse.graphiti.features.impl.AbstractFeature;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.ui.platform.GFPropertySection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CCombo;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertyConstants;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetWidgetFactory;

import be.kueleuven.rodinia.model.rtt.Activity;
import be.kueleuven.rodinia.model.rtt.Scheduler;

public class ActivitySection extends GFPropertySection implements ITabbedPropertyConstants {
	
	private Text nameText;
	private Text cpuAffinityText;
	private Text periodText;
	private Text priorityText;
	private CCombo schedulerCombo;
	
	private ModifyListener nameTextListener = new ModifyListener() {

		@Override
		public void modifyText(ModifyEvent e) {
			String text = nameText.getText();
			if (text == null) {
				text = "";//$NON-NLS-1$
			}
			PictogramElement pe = getSelectedPictogramElement();
			if (pe != null) {
				Object bo = Graphiti.getLinkService()
						.getBusinessObjectForLinkedPictogramElement(pe);
				if (bo == null) {
					return;
				}
				String name = null;
				if (bo instanceof Activity) {
					name = ((Activity) bo).getName();
					if (text.equals(name))
						return;
				}
				final String finalText = text;
				IFeature feature = new AbstractFeature(getDiagramTypeProvider()
						.getFeatureProvider()) {

					@Override
					public void execute(IContext context) {
						PictogramElement pe = getSelectedPictogramElement();
						if (pe != null) {
							Object bo = Graphiti
									.getLinkService()
									.getBusinessObjectForLinkedPictogramElement(
											pe);
							if (bo == null)
								return;
							if (bo instanceof Activity) {
								Activity activity = (Activity) bo;
								activity.setName(finalText);
							}
							updatePictogramElement(getSelectedPictogramElement());
						}
					}

					@Override
					public boolean canExecute(IContext context) {
						return true;
					}
				};
				CustomContext context = new CustomContext();
				execute(feature, context);
			}
		}
	};
	
	private SelectionListener schedulerComboListener = new SelectionListener() {
		
		@Override
		public void widgetSelected(SelectionEvent e) {

			
			int selectionIndex = schedulerCombo.getSelectionIndex();
			final String item = schedulerCombo.getItem(selectionIndex);
			
			IFeature feature = new AbstractFeature(getDiagramTypeProvider().getFeatureProvider()) {
				@Override
				public boolean canExecute(IContext context) {
					return true;
				}
				@Override
				public void execute(IContext context) {
					PictogramElement pe = getSelectedPictogramElement();
		   			if (pe != null) {
		   				Object bo = Graphiti.getLinkService().getBusinessObjectForLinkedPictogramElement(pe);
		   				if (bo == null)
		   					return;
		   		   		if (bo instanceof Activity){
		   		   			Activity activity = (Activity) bo;
		   		   			activity.setScheduler(Scheduler.get(item));
		   		   		}
		   			}
				}	
			};
	   		CustomContext context = new CustomContext();
	   		execute(feature, context);
		}
		
		@Override
		public void widgetDefaultSelected(SelectionEvent e) {
		}
	};
	
	private ModifyListener periodModifyTextListener = new ModifyListener() {
		
		@Override
		public void modifyText(ModifyEvent e) {
			String text = periodText.getText();
			if (text == null || text.equals("")){
				return;
			}
			float floatValue;
			try {
				floatValue = Float.parseFloat(text);
			} catch (Exception E){
				return;
			}
			final float finalFloatValue = floatValue;
			IFeature feature = new AbstractFeature(getDiagramTypeProvider().getFeatureProvider()) {
				@Override
				public boolean canExecute(IContext context) {
					return true;
				}
				@Override
				public void execute(IContext context) {
					PictogramElement pe = getSelectedPictogramElement();
		   			if (pe != null) {
		   				Object bo = Graphiti.getLinkService().getBusinessObjectForLinkedPictogramElement(pe);
		   				if (bo == null)
		   					return;
		   		   		if (bo instanceof Activity){
		   		   			Activity activity = (Activity) bo;
		   		   			activity.setPeriod(finalFloatValue);
		   		   		}
		   			}
				}	
			};
	   		CustomContext context = new CustomContext();
	   		execute(feature, context);
		}
	};
	
	private ModifyListener priorityModifyLisstener = new ModifyListener() {
		
		@Override
		public void modifyText(ModifyEvent e) {
			String text = priorityText.getText();
			if (text == null || text.equals("")){
				return;
			}
			int intValue;
			try {
				intValue = Integer.parseInt(text);
			} catch (Exception E){
				return;
			}
			final int finalIntValue = intValue;
			IFeature feature = new AbstractFeature(getDiagramTypeProvider().getFeatureProvider()) {
				@Override
				public boolean canExecute(IContext context) {
					return true;
				}
				@Override
				public void execute(IContext context) {
					PictogramElement pe = getSelectedPictogramElement();
		   			if (pe != null) {
		   				Object bo = Graphiti.getLinkService().getBusinessObjectForLinkedPictogramElement(pe);
		   				if (bo == null)
		   					return;
		   		   		if (bo instanceof Activity){
		   		   			Activity activity = (Activity) bo;
		   		   			activity.setPriority(finalIntValue);
		   		   		}
		   			}
				}	
			};
	   		CustomContext context = new CustomContext();
	   		execute(feature, context);
		}
	};
	
	private ModifyListener cpuAffinityModify = new ModifyListener(){

		@Override
		public void modifyText(ModifyEvent e) {
			String text = cpuAffinityText.getText();
			if (text == null){
				return;
			}
			final String finalText = text;
			IFeature feature = new AbstractFeature(getDiagramTypeProvider().getFeatureProvider()) {
				@Override
				public boolean canExecute(IContext context) {
					return true;
				}
				@Override
				public void execute(IContext context) {
					PictogramElement pe = getSelectedPictogramElement();
		   			if (pe != null) {
		   				Object bo = Graphiti.getLinkService().getBusinessObjectForLinkedPictogramElement(pe);
		   				if (bo == null)
		   					return;
		   		   		if (bo instanceof Activity){
		   		   			Activity activity = (Activity) bo;
		   		   			activity.setCpuAffinity(finalText);
		   		   		}
		   			}
				}	
			};
	   		CustomContext context = new CustomContext();
	   		execute(feature, context);
		}
	};
	
	@Override
	public void createControls(Composite parent,
			TabbedPropertySheetPage tabbedPropertySheetPage) {
		
		super.createControls(parent, tabbedPropertySheetPage);

		TabbedPropertySheetWidgetFactory factory = getWidgetFactory();
		Composite composite = factory.createFlatFormComposite(parent);
		
		CLabel nameLabel = factory.createCLabel(composite, "Name:");
		nameText = factory.createText(composite, "");
		CLabel periodLabel = factory.createCLabel(composite, "Period:");
		periodText = factory.createText(composite, "");
		CLabel schedulerLabel = factory.createCLabel(composite, "Scheduler:");
		schedulerCombo = factory.createCCombo(composite);
		for (Scheduler scheduler : Scheduler.values()) {
			schedulerCombo.add(scheduler.getName());
		}

		CLabel priorityLabel = factory.createCLabel(composite, "Priority:");
		priorityText = factory.createText(composite, "");
		CLabel cpuAffinityLabel = factory.createCLabel(composite, "CPU Afinity:");
		cpuAffinityText = factory.createText(composite, "");
		CLabel longestLabel = cpuAffinityLabel;
		
		FormData nameLabelData = new FormData();
		nameLabelData.left = new FormAttachment(0, 0);
		nameLabelData.top = new FormAttachment(0, 0);
		nameLabel.setLayoutData(nameLabelData);

		FormData nameTextData = new FormData();
		nameTextData.left = new FormAttachment(longestLabel, ITabbedPropertyConstants.HSPACE);
		nameTextData.right = new FormAttachment(100);
		nameTextData.top = new FormAttachment(nameLabel, 0, SWT.CENTER);
		nameText.setLayoutData(nameTextData);
		nameText.addModifyListener(nameTextListener);
		
		FormData schedulerLabelData = new FormData();
		schedulerLabelData.left = new FormAttachment(0, 0);
		schedulerLabelData.top = new FormAttachment(nameLabel, ITabbedPropertyConstants.VSPACE);
		schedulerLabel.setLayoutData(schedulerLabelData);
		
		FormData schedulerComboData = new FormData();
		schedulerComboData.left = new FormAttachment(longestLabel, ITabbedPropertyConstants.HSPACE);
		schedulerComboData.right = new FormAttachment(100);
		schedulerComboData.top = new FormAttachment(schedulerLabel, 0, SWT.CENTER);
		schedulerCombo.setLayoutData(schedulerComboData);
		
		FormData periodLabelData = new FormData();
		periodLabelData.left = new FormAttachment(0, 0);
		periodLabelData.top = new FormAttachment(schedulerLabel, ITabbedPropertyConstants.VSPACE);
		periodLabel.setLayoutData(periodLabelData);
		
		FormData periodTextData = new FormData();
		periodTextData.left = new FormAttachment(longestLabel, ITabbedPropertyConstants.HSPACE);
		periodTextData.right = new FormAttachment(100);
		periodTextData.top = new FormAttachment(periodLabel, 0, SWT.CENTER);
		periodText.setLayoutData(periodTextData);
		periodText.addModifyListener(periodModifyTextListener);
		
		FormData priorityLabelData = new FormData();
		priorityLabelData.left = new FormAttachment(0, 0);
		priorityLabelData.top = new FormAttachment(periodLabel, ITabbedPropertyConstants.VSPACE);
		priorityLabel.setLayoutData(priorityLabelData);
		
		FormData priorityTextData = new FormData();
		priorityTextData.left = new FormAttachment(longestLabel, ITabbedPropertyConstants.HSPACE);
		priorityTextData.right = new FormAttachment(100);
		priorityTextData.top = new FormAttachment(priorityLabel, 0, SWT.CENTER);
		priorityText.setLayoutData(priorityTextData);
		priorityText.addModifyListener(priorityModifyLisstener);
		
		FormData cpuAffinityLabelData = new FormData();
		cpuAffinityLabelData.left = new FormAttachment(0, 0);
		cpuAffinityLabelData.top = new FormAttachment(priorityLabel, ITabbedPropertyConstants.VSPACE);
		cpuAffinityLabel.setLayoutData(cpuAffinityLabelData);
		
		FormData cpuAffinityTextData = new FormData();
		cpuAffinityTextData.left = new FormAttachment(longestLabel, ITabbedPropertyConstants.HSPACE);
		cpuAffinityTextData.right = new FormAttachment(100);
		cpuAffinityTextData.top = new FormAttachment(cpuAffinityLabel, 0, SWT.CENTER);
		cpuAffinityText.setLayoutData(cpuAffinityTextData);
		cpuAffinityText.addModifyListener(cpuAffinityModify);
	}

	@Override
	public void refresh() {
		nameText.removeModifyListener(nameTextListener);
		schedulerCombo.removeSelectionListener(schedulerComboListener);
		cpuAffinityText.removeModifyListener(cpuAffinityModify);
		periodText.removeModifyListener(periodModifyTextListener);
		priorityText.removeModifyListener(priorityModifyLisstener);
		PictogramElement pe = getSelectedPictogramElement();
		if (pe != null) {
			Object bo = Graphiti.getLinkService()
					.getBusinessObjectForLinkedPictogramElement(pe);
			if (bo == null) {
				return;
			}
			if (bo instanceof Activity) {
				nameText.setText(((Activity) bo).getName());
				String schedulerName = ((Activity) bo).getScheduler().getName();
				for (int index = 0; index < schedulerCombo.getItemCount(); index++) {
					if (schedulerCombo.getItem(index).equals(schedulerName)) {
						schedulerCombo.select(index);
					}
				}
				cpuAffinityText.setText(((Activity) bo).getCpuAffinity());
				periodText.setText("" + ((Activity) bo).getPeriod());
				priorityText.setText("" + ((Activity) bo).getPriority());
			}
		}
		nameText.addModifyListener(nameTextListener);
		schedulerCombo.addSelectionListener(schedulerComboListener);
		cpuAffinityText.addModifyListener(cpuAffinityModify);
		periodText.addModifyListener(periodModifyTextListener);
		priorityText.addModifyListener(priorityModifyLisstener);
	}
}
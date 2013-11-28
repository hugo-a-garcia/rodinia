package be.kuleuven.rodinia.graphiti.rtt.propertiesTab;

import org.eclipse.graphiti.features.IFeature;
import org.eclipse.graphiti.features.context.IContext;
import org.eclipse.graphiti.features.context.impl.CustomContext;
import org.eclipse.graphiti.features.impl.AbstractFeature;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.ui.platform.GFPropertySection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertyConstants;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetWidgetFactory;

import be.kueleuven.rodinia.model.rtt.TaskContext;

public class TaskContextSection extends GFPropertySection implements
		ITabbedPropertyConstants {

	private Text nameText;
	private Text namespaceText;
	private Text typeText;

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
				if (bo instanceof TaskContext) {
					name = ((TaskContext) bo).getName();
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
							if (bo instanceof TaskContext) {
								TaskContext taskContext = (TaskContext) bo;
								taskContext.setName(finalText);
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

	private ModifyListener namespaceListener = new ModifyListener() {

		@Override
		public void modifyText(ModifyEvent e) {
			String text = namespaceText.getText();
			if (text == null) {
				text = "";
			}
			PictogramElement pe = getSelectedPictogramElement();
			if (pe != null) {
				Object bo = Graphiti.getLinkService()
						.getBusinessObjectForLinkedPictogramElement(pe);
				if (bo == null) {
					return;
				}
				String namespace = null;
				if (bo instanceof TaskContext) {
					namespace = ((TaskContext) bo).getNamespace();
				}
				if (text.equals(namespace))
					return;
			}
			final String finalText = text;
			IFeature feature = new AbstractFeature(getDiagramTypeProvider()
					.getFeatureProvider()) {

				@Override
				public void execute(IContext context) {
					PictogramElement pe = getSelectedPictogramElement();
					if (pe != null) {
						Object bo = Graphiti.getLinkService()
								.getBusinessObjectForLinkedPictogramElement(pe);
						if (bo == null)
							return;
						if (bo instanceof TaskContext) {
							TaskContext taskContext = (TaskContext) bo;
							taskContext.setNamespace(finalText);
						}
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
	};

	private ModifyListener typeTextListener = new ModifyListener() {

		@Override
		public void modifyText(ModifyEvent e) {
			String text = typeText.getText();
			if (text == null) {
				text = "";
			}
			PictogramElement pe = getSelectedPictogramElement();
			if (pe != null) {
				Object bo = Graphiti.getLinkService()
						.getBusinessObjectForLinkedPictogramElement(pe);
				if (bo == null) {
					return;
				}
				String type = null;
				if (bo instanceof TaskContext) {
					type = ((TaskContext) bo).getType();
				}
				if (text.equals(type))
					return;
			}
			final String finalText = text;
			IFeature feature = new AbstractFeature(getDiagramTypeProvider()
					.getFeatureProvider()) {

				@Override
				public void execute(IContext context) {
					PictogramElement pe = getSelectedPictogramElement();
					if (pe != null) {
						Object bo = Graphiti.getLinkService()
								.getBusinessObjectForLinkedPictogramElement(pe);
						if (bo == null)
							return;
						if (bo instanceof TaskContext) {
							TaskContext taskContext = (TaskContext) bo;
							taskContext.setType(finalText);
						}
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
	};

	@Override
	public void createControls(Composite parent,
			TabbedPropertySheetPage tabbedPropertySheetPage) {

		super.createControls(parent, tabbedPropertySheetPage);

		TabbedPropertySheetWidgetFactory factory = getWidgetFactory();
		Composite composite = factory.createFlatFormComposite(parent);

		CLabel nameLabel = factory.createCLabel(composite, "Name:");
		nameText = factory.createText(composite, "");
		CLabel namespaceLabel = factory.createCLabel(composite, "Namespace:");
		namespaceText = factory.createText(composite, "");
		CLabel typeLabel = factory.createCLabel(composite, "Type:");
		typeText = factory.createText(composite, "");
		CLabel longestLabel = namespaceLabel;

		FormData nameLabelData = new FormData();
		nameLabelData.left = new FormAttachment(0, 0);
		nameLabelData.top = new FormAttachment(0, 0);
		nameLabel.setLayoutData(nameLabelData);

		FormData nameTextData = new FormData();
		nameTextData.left = new FormAttachment(longestLabel,
				ITabbedPropertyConstants.HSPACE);
		nameTextData.right = new FormAttachment(100);// (100, -500);
		nameTextData.top = new FormAttachment(nameLabel, 0, SWT.CENTER);
		nameText.setLayoutData(nameTextData);
		nameText.addModifyListener(nameTextListener);

		FormData namespaceLabelData = new FormData();
		namespaceLabelData.left = new FormAttachment(0, 0);
		namespaceLabelData.top = new FormAttachment(nameLabel,
				ITabbedPropertyConstants.VSPACE);
		namespaceLabel.setLayoutData(namespaceLabelData);

		FormData nameSpaceTextData = new FormData();
		nameSpaceTextData.left = new FormAttachment(namespaceLabel,
				ITabbedPropertyConstants.HSPACE);
		nameSpaceTextData.right = new FormAttachment(100);
		nameSpaceTextData.top = new FormAttachment(namespaceLabel, 0,
				SWT.CENTER);
		namespaceText.setLayoutData(nameSpaceTextData);
		namespaceText.addModifyListener(namespaceListener);

		FormData typeLabelData = new FormData();
		typeLabelData.left = new FormAttachment(0, 0);
		typeLabelData.top = new FormAttachment(longestLabel,
				ITabbedPropertyConstants.VSPACE);
		typeLabel.setLayoutData(typeLabelData);

		FormData tyepTextData = new FormData();
		tyepTextData.left = new FormAttachment(longestLabel,
				ITabbedPropertyConstants.HSPACE);
		tyepTextData.right = new FormAttachment(100);
		tyepTextData.top = new FormAttachment(typeLabel, 0, SWT.CENTER);
		typeText.setLayoutData(tyepTextData);
		typeText.addModifyListener(typeTextListener);
	}

	@Override
	public void refresh() {
		nameText.removeModifyListener(nameTextListener);
		namespaceText.removeModifyListener(namespaceListener);
		typeText.removeModifyListener(typeTextListener);
		PictogramElement pe = getSelectedPictogramElement();
		if (pe != null) {
			Object bo = Graphiti.getLinkService()
					.getBusinessObjectForLinkedPictogramElement(pe);
			if (bo == null) {
				return;
			}
			if (bo instanceof TaskContext) {
				String name = ((TaskContext) bo).getName();
				String nameSpace = ((TaskContext) bo).getNamespace();
				String type = ((TaskContext) bo).getType();
				nameText.setText(name == null ? "" : name);
				namespaceText.setText(nameSpace == null ? "" : nameSpace);
				typeText.setText(type == null ? "" : type);
			}
		}
		namespaceText.addModifyListener(namespaceListener);
		typeText.addModifyListener(typeTextListener);
		nameText.addModifyListener(nameTextListener);
	}
}

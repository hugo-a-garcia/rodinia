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
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertyConstants;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetWidgetFactory;

import be.kueleuven.rodinia.model.rtt.EventPort;

public class EventPortSection extends GFPropertySection implements
		ITabbedPropertyConstants {

	private Text nameText;
	private CCombo dataTypeCombo;
	private int selected = 0;

	private ModifyListener nameTextListener = new ModifyListener() {

		@Override
		public void modifyText(ModifyEvent e) {
			String text = nameText.getText();
			if (text == null) {
				text = "";//$NON-NLS-1$
			}
			PictogramElement pictogramElement = getSelectedPictogramElement();
			if (pictogramElement != null) {
				Object businessObject = Graphiti.getLinkService()
						.getBusinessObjectForLinkedPictogramElement(
								pictogramElement);
				if (businessObject == null) {
					return;
				}
				String name = null;
				if (businessObject instanceof EventPort) {
					name = ((EventPort) businessObject).getName();
					if (text.equals(name))
						return;
				}
				final String finalText = text;
				IFeature feature = new AbstractFeature(getDiagramTypeProvider()
						.getFeatureProvider()) {

					@Override
					public void execute(IContext context) {
						PictogramElement pictogramElement = getSelectedPictogramElement();
						if (pictogramElement != null) {
							Object businessObject = Graphiti
									.getLinkService()
									.getBusinessObjectForLinkedPictogramElement(
											pictogramElement);
							if (businessObject == null)
								return;
							if (businessObject instanceof EventPort) {
								EventPort eventPort = (EventPort) businessObject;
								eventPort.setName(finalText);
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

//	private SelectionListener dataTypeComboSelectinoLiistener = new SelectionListener() {
//
//		@Override
//		public void widgetSelected(SelectionEvent e) {
//			dataTypeCombo.select(dataTypeCombo.getSelectionIndex());
//			selected = dataTypeCombo.getSelectionIndex();
//		}
//
//		@Override
//		public void widgetDefaultSelected(SelectionEvent e) {
//		}
//	};

	@Override
	public void createControls(Composite parent,
			TabbedPropertySheetPage tabbedPropertySheetPage) {

		super.createControls(parent, tabbedPropertySheetPage);

		TabbedPropertySheetWidgetFactory factory = getWidgetFactory();
		Composite composite = factory.createFlatFormComposite(parent);

		CLabel nameLabel = factory.createCLabel(composite, "Name:");
		nameText = factory.createText(composite, "");
		CLabel dataTypeLabel = factory.createCLabel(composite, "Data Type:");
		dataTypeCombo = factory.createCCombo(composite, SWT.READ_ONLY);

		FormData nameLabelData = new FormData();
		nameLabelData.left = new FormAttachment(0, 0);
		nameLabelData.top = new FormAttachment(0, 0);
		nameLabel.setLayoutData(nameLabelData);

		FormData nameTextData = new FormData();
		nameTextData.left = new FormAttachment(dataTypeLabel,
				ITabbedPropertyConstants.HSPACE);
		nameTextData.right = new FormAttachment(100);
		nameTextData.top = new FormAttachment(nameLabel, 0, SWT.CENTER);
		nameText.setLayoutData(nameTextData);
		nameText.addModifyListener(nameTextListener);

		FormData namespaceLabelData = new FormData();
		namespaceLabelData.left = new FormAttachment(0, 0);
		namespaceLabelData.top = new FormAttachment(nameLabel,
				ITabbedPropertyConstants.VSPACE);
		dataTypeLabel.setLayoutData(namespaceLabelData);

		FormData nameSpaceTextData = new FormData();
		nameSpaceTextData.left = new FormAttachment(dataTypeLabel,
				ITabbedPropertyConstants.HSPACE);
		nameSpaceTextData.right = new FormAttachment(100);
		nameSpaceTextData.top = new FormAttachment(dataTypeLabel, 0, SWT.CENTER);
		dataTypeCombo.setLayoutData(nameSpaceTextData);
		// dataTypeText.addModifyList(dataTypeTextListener);
	}

	@Override
	public void refresh() {
		nameText.removeModifyListener(nameTextListener);
		// dataTypeText.removeModifyListener(dataTypeTextListener);
		PictogramElement pictogramElement = getSelectedPictogramElement();
		if (pictogramElement != null) {
			Object businessObject = Graphiti.getLinkService()
					.getBusinessObjectForLinkedPictogramElement(
							pictogramElement);
			if (businessObject == null) {
				return;
			}
			if (businessObject instanceof EventPort) {
				String name = ((EventPort) businessObject).getName();
				String dataTypeName = "";
				if (((EventPort) businessObject).getDataType() != null) {
					dataTypeName = ((EventPort) businessObject).getDataType()
							.getName();
				}
				nameText.setText(name == null ? "" : name);
				dataTypeCombo.setItems(new String[] { dataTypeName });
				dataTypeCombo.select(selected);
			}
		}
		// dataTypeText.addModifyListener(dataTypeTextListener);
		nameText.addModifyListener(nameTextListener);
	}

}

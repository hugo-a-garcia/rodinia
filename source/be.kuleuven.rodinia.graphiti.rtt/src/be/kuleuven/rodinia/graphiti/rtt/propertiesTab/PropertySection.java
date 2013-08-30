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

import be.kueleuven.rodinia.model.rtt.Property;

public class PropertySection extends GFPropertySection implements ITabbedPropertyConstants{

	private Text description;
	private CCombo dataType;
	private Text value;
	
	@Override
	public void createControls(Composite parent,
      TabbedPropertySheetPage tabbedPropertySheetPage) {
      super.createControls(parent, tabbedPropertySheetPage);

      TabbedPropertySheetWidgetFactory factory = getWidgetFactory();
      Composite composite = factory.createFlatFormComposite(parent);
      FormData data;
      FormData data2;
      
      description = factory.createText(composite, "a");
      data = new FormData();
      data.left = new FormAttachment(0, 110);
      data.right = new FormAttachment(100, -500);
      data.top = new FormAttachment(0, 0);
      description.setLayoutData(data);
      description.addModifyListener(DescriptionModify);

      CLabel valueLabel2 = factory.createCLabel(composite, "Description:");
      data = new FormData();
      data.left = new FormAttachment(0, 0);
      data.right = new FormAttachment(description, -HSPACE);
      data.top = new FormAttachment(description, 0, SWT.CENTER);
      valueLabel2.setLayoutData(data);
      
      dataType = factory.createCCombo(composite, SWT.READ_ONLY);
      data2 = new FormData();
      data2.left = new FormAttachment(0, 110);
      data2.right = new FormAttachment(100, -500);
      data2.top = new FormAttachment(0, 30);
      dataType.setLayoutData(data2);

      CLabel valueLabel3 = factory.createCLabel(composite, "DataType:");
      data2 = new FormData();
      data2.left = new FormAttachment(0, 0);
      data2.right = new FormAttachment(dataType, -HSPACE);
      data2.top = new FormAttachment(dataType, 0, SWT.CENTER);
      valueLabel3.setLayoutData(data2);
      
      value = factory.createText(composite, "b");
      data2 = new FormData();
      data2.left = new FormAttachment(0, 110);
      data2.right = new FormAttachment(100, -500);
      data2.top = new FormAttachment(0, 70);
      value.setLayoutData(data2);
      value.addModifyListener(ValueModify);

      CLabel valueLabel4 = factory.createCLabel(composite, "Value:");
      data2 = new FormData();
      data2.left = new FormAttachment(0, 0);
      data2.right = new FormAttachment(value, -HSPACE);
      data2.top = new FormAttachment(value, 0, SWT.CENTER);
      valueLabel4.setLayoutData(data2);
          
  }
	
	@Override
	  public void refresh() {
		  description.removeModifyListener(DescriptionModify);
		  value.removeModifyListener(ValueModify);
	      PictogramElement pe = getSelectedPictogramElement();
	      if (pe != null) {
	          Object bo = Graphiti.getLinkService()
	               .getBusinessObjectForLinkedPictogramElement(pe);
	          if (bo == null){
	              return;
	          }
	          if (bo instanceof Property){
	        	  if (((Property)bo).getDescription() == null ){
	        		  description.setText("");
	        	  } else {
	        		  description.setText(""+((Property) bo).getDescription());
	        	  }
	        	  if (((Property)bo).getValue() == null){
	        		  value.setText("");
	        	  } else {
	        		  value.setText(""+((Property) bo).getValue());
	        	  }
	          }
	      }
	      description.addModifyListener(DescriptionModify);
	      value.addModifyListener(ValueModify);
	  }
	
	private ModifyListener DescriptionModify = new ModifyListener() {
		@Override
		public void modifyText(ModifyEvent e) {
			String temp = description.getText();
			if (temp == null || temp.equals("")){
				return;
			}
			String value;
			try {
				value = temp;
			} catch (Exception E){
				return;
			}
			final String typedValue = value;
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
		   		   		if (bo instanceof Property){
		   		   			Property prop = (Property) bo;
		   		   			prop.setDescription(typedValue);
		   		   		}
		   			}
				}	
			};
	   		CustomContext context = new CustomContext();
	   		execute(feature, context);
			
		}
	};
	
	private ModifyListener ValueModify = new ModifyListener() {
		@Override
		public void modifyText(ModifyEvent e) {
			String temp = value.getText();
			if (temp == null || temp.equals("")){
				return;
			}
			String value;
			try {
				value = temp;
			} catch (Exception E){
				return;
			}
			final String typedValue = value;
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
		   		   		if (bo instanceof Property){
		   		   			Property prop = (Property) bo;
		   		   			prop.setValue(typedValue);
		   		   		}
		   			}
				}	
			};
	   		CustomContext context = new CustomContext();
	   		execute(feature, context);
			
		}
	};
}

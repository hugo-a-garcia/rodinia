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

public class TaskContextSection extends GFPropertySection implements ITabbedPropertyConstants {
	 
	private Text nameSpaceText;
	private Text typeText;
	
	@Override
	public void createControls(Composite parent,
       TabbedPropertySheetPage tabbedPropertySheetPage) {
       super.createControls(parent, tabbedPropertySheetPage);

       TabbedPropertySheetWidgetFactory factory = getWidgetFactory();
       Composite composite = factory.createFlatFormComposite(parent);
       FormData data;
       FormData data2;

       nameSpaceText = factory.createText(composite, "");
       data = new FormData();
       data.left = new FormAttachment(0, 110);
       data.right = new FormAttachment(100, -500);
       data.top = new FormAttachment(0, VSPACE);
       nameSpaceText.setLayoutData(data);
       nameSpaceText.addModifyListener(NameSacelistener);

       CLabel valueLabel = factory.createCLabel(composite, "NameSpace:");
       data = new FormData();
       data.left = new FormAttachment(0, 0);
       data.right = new FormAttachment(nameSpaceText, -HSPACE);
       data.top = new FormAttachment(nameSpaceText, 0, SWT.CENTER);
       valueLabel.setLayoutData(data);
       
       
       typeText = factory.createText(composite, "");
       data2 = new FormData();
       data2.left = new FormAttachment(0, 110);
       data2.right = new FormAttachment(100, -500);
       data2.top = new FormAttachment(0, 30);
       typeText.setLayoutData(data2);
       typeText.addModifyListener(Typelistener);

       CLabel valueLabel2 = factory.createCLabel(composite, "Type:");
       data2 = new FormData();
       data2.left = new FormAttachment(0, 0);
       data2.right = new FormAttachment(typeText, -HSPACE);
       data2.top = new FormAttachment(typeText, 0, SWT.CENTER);
       valueLabel2.setLayoutData(data2);
   }

   @Override
   public void refresh() {
	   nameSpaceText.removeModifyListener(NameSacelistener);
	   typeText.removeModifyListener(Typelistener);
       PictogramElement pe = getSelectedPictogramElement();
       if (pe != null) {
           Object bo = Graphiti.getLinkService()
                .getBusinessObjectForLinkedPictogramElement(pe);
           if (bo == null){
               return;
           }
           if (bo instanceof TaskContext){
           	String nameSpace = ((TaskContext) bo).getNamespace();
           	String type = ((TaskContext) bo).getType();
           	nameSpaceText.setText(nameSpace == null ? "" : nameSpace);
           	typeText.setText(type == null ? "" : type);
           }
       }
       nameSpaceText.addModifyListener(NameSacelistener);
       typeText.addModifyListener(Typelistener);
   }
  
   private ModifyListener NameSacelistener = new ModifyListener() {
	    
   	@Override
   	public void modifyText(ModifyEvent e) {
   		String value = nameSpaceText.getText();
   		if (value == null) {
   			value = "";
   		}
   		PictogramElement pe = getSelectedPictogramElement();
   		if (pe != null) {
   			Object bo = Graphiti.getLinkService().getBusinessObjectForLinkedPictogramElement(pe);
   			if (bo == null){
   				return;
   			}
   			String nameSpace = null;
   			if (bo instanceof TaskContext){
   				nameSpace = ((TaskContext) bo).getNamespace();
   			}
   			if (value.equals(nameSpace))
   				return;
   		}
   		final String typedValue = value;
   		IFeature feature = new AbstractFeature(getDiagramTypeProvider().getFeatureProvider()) {
   				
   			@Override
   			public void execute(IContext context) {
   				PictogramElement pe = getSelectedPictogramElement();
   				if (pe != null) {
   					Object bo = Graphiti.getLinkService().getBusinessObjectForLinkedPictogramElement(pe);
   					if (bo == null)
   						return;
   					if (bo instanceof TaskContext){
   						TaskContext eClass = (TaskContext) bo;
   						eClass.setNamespace(typedValue);
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
   
   private ModifyListener Typelistener = new ModifyListener() {
	    
	   	@Override
	   	public void modifyText(ModifyEvent e) {
	   		String value = typeText.getText();
	   		if (value == null) {
	   			value = "";
	   		}
	   		PictogramElement pe = getSelectedPictogramElement();
	   		if (pe != null) {
	   			Object bo = Graphiti.getLinkService().getBusinessObjectForLinkedPictogramElement(pe);
	   			if (bo == null){
	   				return;
	   			}
	   			String type = null;
	   			if (bo instanceof TaskContext){
	   				type = ((TaskContext) bo).getType();
	   			}
	   			if (value.equals(type))
	   				return;
	   		}
	   		final String typedValue = value;
	   		IFeature feature = new AbstractFeature(getDiagramTypeProvider().getFeatureProvider()) {
	   				
	   			@Override
	   			public void execute(IContext context) {
	   				PictogramElement pe = getSelectedPictogramElement();
	   				if (pe != null) {
	   					Object bo = Graphiti.getLinkService().getBusinessObjectForLinkedPictogramElement(pe);
	   					if (bo == null)
	   						return;
	   					if (bo instanceof TaskContext){
	   						TaskContext eClass = (TaskContext) bo;
	   						eClass.setType(typedValue);
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

}

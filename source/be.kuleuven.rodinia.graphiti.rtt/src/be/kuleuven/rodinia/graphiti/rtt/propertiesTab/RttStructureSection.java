package be.kuleuven.rodinia.graphiti.rtt.propertiesTab;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.graphiti.features.IFeature;
import org.eclipse.graphiti.features.context.IContext;
import org.eclipse.graphiti.features.context.impl.CustomContext;
import org.eclipse.graphiti.features.impl.AbstractFeature;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.ui.platform.GFPropertySection;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.ui.views.properties.IPropertySource;
import org.eclipse.ui.views.properties.tabbed.AbstractPropertySection;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertyConstants;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetWidgetFactory;

import be.kueleuven.rodinia.model.rtt.Activity;
import be.kueleuven.rodinia.model.rtt.ConnectionPolicy;
import be.kueleuven.rodinia.model.rtt.EventPort;
import be.kueleuven.rodinia.model.rtt.InputPort;
import be.kueleuven.rodinia.model.rtt.OutputPort;
import be.kueleuven.rodinia.model.rtt.Property;
import be.kueleuven.rodinia.model.rtt.TaskContext;

@SuppressWarnings("unused")
public class RttStructureSection extends GFPropertySection implements ITabbedPropertyConstants {
	 
	private Text nameText;
	private CLabel typeValue;
	
	@Override
	public void createControls(Composite parent,
        TabbedPropertySheetPage tabbedPropertySheetPage) {
        super.createControls(parent, tabbedPropertySheetPage);
 
        TabbedPropertySheetWidgetFactory factory = getWidgetFactory();
        Composite composite = factory.createFlatFormComposite(parent);
        FormData data;
        
        typeValue = factory.createCLabel(composite, "");
        data = new FormData();
        data.left = new FormAttachment(0, STANDARD_LABEL_WIDTH);
        data.right = new FormAttachment(100, -500);
        data.top = new FormAttachment(0, VSPACE);
        typeValue.setLayoutData(data);
        
        CLabel typeLabel = factory.createCLabel(composite, "type:");
        data = new FormData();
        data.left = new FormAttachment(0, 0);
        data.right = new FormAttachment(typeValue, -HSPACE);
        data.top = new FormAttachment(typeValue, 0, SWT.CENTER);
        typeLabel.setLayoutData(data);
 
        nameText = factory.createText(composite, "");
        data = new FormData();
        data.left = new FormAttachment(0, STANDARD_LABEL_WIDTH);
        data.right = new FormAttachment(100, -500);
        data.top = new FormAttachment(0, 30);
        nameText.setLayoutData(data);
        nameText.addModifyListener(listener);
 
        CLabel valueLabel = factory.createCLabel(composite, "Name:");
        data = new FormData();
        data.left = new FormAttachment(0, 0);
        data.right = new FormAttachment(nameText, -HSPACE);
        data.top = new FormAttachment(nameText, 0, SWT.CENTER);
        valueLabel.setLayoutData(data);
    }
 
    @Override
    public void refresh() {
 	   	nameText.removeModifyListener(listener);
        PictogramElement pe = getSelectedPictogramElement();
        if (pe != null) {
            Object bo = Graphiti.getLinkService()
                 .getBusinessObjectForLinkedPictogramElement(pe);
            if (bo == null){
                return;
            }
            if (bo instanceof TaskContext){
            	String name = ((TaskContext) bo).getName();
            	nameText.setText(name == null ? "" : name);
            	typeValue.setText("TaskContext");
            }
            if (bo instanceof Activity){
            	String name = ((Activity) bo).getName();
            	nameText.setText(name == null ? "" : name);
            	typeValue.setText("Activity");
            }
            if (bo instanceof InputPort && !(bo instanceof EventPort)){
            	String name = ((InputPort) bo).getName();
            	nameText.setText(name == null ? "" : name);
            	typeValue.setText("InputPort");
            }
            if (bo instanceof EventPort){
            	String name = ((EventPort) bo).getName();
            	nameText.setText(name == null ? "" : name);
            	typeValue.setText("EventPort");
            }
            if (bo instanceof OutputPort){
            	String name = ((OutputPort) bo).getName();
            	nameText.setText(name == null ? "" : name);
            	typeValue.setText("OutputPort");
            }
            if (bo instanceof ConnectionPolicy){
            	String name = ((ConnectionPolicy) bo).getName();
            	nameText.setText(name == null ? "" : name);
            	typeValue.setText("ConnectionPolicy");
            }
            if (bo instanceof Property){
            	String name = ((Property) bo).getName();
            	nameText.setText(name == null ? "" : name);
            	typeValue.setText("Property");
            }
        }
        nameText.addModifyListener(listener);
    }
    
    private ModifyListener listener = new ModifyListener() {
	    
    	@Override
    	public void modifyText(ModifyEvent e) {
    		String value = nameText.getText();
    		if (value == null) {
    			value = "";//$NON-NLS-1$
    		}
    		PictogramElement pe = getSelectedPictogramElement();
    		if (pe != null) {
    			Object bo = Graphiti.getLinkService().getBusinessObjectForLinkedPictogramElement(pe);
    			// the filter assured, that it is a EClass
    			if (bo == null){
    				return;
    			}
    			String name = null;
    			if (bo instanceof TaskContext){
    				name = ((TaskContext) bo).getName();
    			}
    			if (bo instanceof Activity){
    				name = ((Activity) bo).getName();
    			}
    			if (bo instanceof InputPort){
    				name = ((InputPort) bo).getName();
    			}
    			if (bo instanceof OutputPort){
    				name = ((OutputPort) bo).getName();
    			}
    			if (bo instanceof ConnectionPolicy){
    				name = ((ConnectionPolicy) bo).getName();
    			}
    			if (bo instanceof Property){
    				name = ((Property) bo).getName();
    			}
    			if (value.equals(name))
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
    						eClass.setName(typedValue);
    					}
    					if (bo instanceof Activity){
    						Activity eClass = (Activity) bo;
    						eClass.setName(typedValue);
    					}
    					if (bo instanceof InputPort){
    						InputPort eClass = (InputPort) bo;
    						eClass.setName(typedValue);
    					}
    					if (bo instanceof OutputPort){
    						OutputPort eClass = (OutputPort) bo;
    						eClass.setName(typedValue);
    					}
    					if (bo instanceof Property){
    						Property eClass = (Property) bo;
    						eClass.setName(typedValue);
    					}
    					
    					if (bo instanceof ConnectionPolicy){
    						ConnectionPolicy eClass = (ConnectionPolicy) bo;
    						eClass.setName(typedValue);
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
    };

}

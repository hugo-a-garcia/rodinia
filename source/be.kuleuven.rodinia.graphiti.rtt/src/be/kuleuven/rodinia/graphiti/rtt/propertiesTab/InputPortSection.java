package be.kuleuven.rodinia.graphiti.rtt.propertiesTab;

import java.util.ArrayList;

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
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertyConstants;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetWidgetFactory;

import be.kueleuven.rodinia.model.rtt.InputPort;

public class InputPortSection extends GFPropertySection implements ITabbedPropertyConstants {
	 
	private CCombo portTypeList;
	//private CCombo isEventPortlist;
	
	@Override
	public void createControls(Composite parent,
     TabbedPropertySheetPage tabbedPropertySheetPage) {
     super.createControls(parent, tabbedPropertySheetPage);

     TabbedPropertySheetWidgetFactory factory = getWidgetFactory();
     Composite composite = factory.createFlatFormComposite(parent);
     FormData data;

     //isEventPortlist = factory.createCCombo(composite, SWT.READ_ONLY);
     //data = new FormData();
     //data.left = new FormAttachment(0, 110);
     //data.right = new FormAttachment(100, -500);
     //data.top = new FormAttachment(0, VSPACE);
     //isEventPortlist.setLayoutData(data);
     //isEventPortlist.addSelectionListener(getIsEventPort);

     //CLabel valueLabel1 = factory.createCLabel(composite, "EventPort:");
     //data = new FormData();
     //data.left = new FormAttachment(0, 0);
     //data.right = new FormAttachment(isEventPortlist, -HSPACE);
     //data.top = new FormAttachment(isEventPortlist, 0, SWT.TOP);
     //valueLabel1.setLayoutData(data);
     
     portTypeList = factory.createCCombo(composite, SWT.READ_ONLY);
     data = new FormData();
     data.left = new FormAttachment(0, 110);
     data.right = new FormAttachment(100, -500);
     data.top = new FormAttachment(50, VSPACE);
     portTypeList.setLayoutData(data);

     CLabel valueLabel = factory.createCLabel(composite, "PortType:");
     data = new FormData();
     data.left = new FormAttachment(0, 0);
     data.right = new FormAttachment(portTypeList, -HSPACE);
     data.top = new FormAttachment(portTypeList, 0, SWT.TOP);
     valueLabel.setLayoutData(data);
 }

@Override
 public void refresh() {
	//isEventPortlist.removeSelectionListener(getIsEventPort);
     PictogramElement pe = getSelectedPictogramElement();
     if (pe != null) {
         Object bo = Graphiti.getLinkService()
              .getBusinessObjectForLinkedPictogramElement(pe);
         if (bo == null){
             return;
         }
         if (bo instanceof InputPort){
        	 ArrayList<String> porttypes = new ArrayList<String>();
        	 for (int i = 0; i <= 100; i++){
        		 porttypes.add("" + i);
        	 }
        	 String []strArray = new String[porttypes.size()];
        	 porttypes.toArray(strArray);
        	 portTypeList.setItems(strArray);
        	 portTypeList.select(0);
        	 //isEventPortlist.setItems (new String [] {"True", "False"});
        	 //if (((InputPort) bo).getIsEventPort()){
        		 //isEventPortlist.select(0);
        	 //} else {
        		//isEventPortlist.select(1);
        	 //}
        	 
         }
     }
     //isEventPortlist.addSelectionListener(getIsEventPort);
 }
}

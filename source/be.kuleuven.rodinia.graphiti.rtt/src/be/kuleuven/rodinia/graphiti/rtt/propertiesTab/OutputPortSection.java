package be.kuleuven.rodinia.graphiti.rtt.propertiesTab;


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

import be.kueleuven.rodinia.model.rtt.OutputPort;

public class OutputPortSection extends GFPropertySection implements ITabbedPropertyConstants {
	 
	private CCombo portTypeList;
	private int selected = 0;
	
	@Override
	public void createControls(Composite parent,
     TabbedPropertySheetPage tabbedPropertySheetPage) {
     super.createControls(parent, tabbedPropertySheetPage);

     TabbedPropertySheetWidgetFactory factory = getWidgetFactory();
     Composite composite = factory.createFlatFormComposite(parent);
     FormData data;
     
     portTypeList = factory.createCCombo(composite, SWT.READ_ONLY);
     data = new FormData();
     data.left = new FormAttachment(0, 110);
     data.right = new FormAttachment(100, -500);
     data.top = new FormAttachment(0, VSPACE);
     portTypeList.setLayoutData(data);
     portTypeList.addSelectionListener(blabla);

     CLabel valueLabel = factory.createCLabel(composite, "PortType:");
     data = new FormData();
     data.left = new FormAttachment(0, 0);
     data.right = new FormAttachment(portTypeList, -HSPACE);
     data.top = new FormAttachment(portTypeList, 0, SWT.TOP);
     valueLabel.setLayoutData(data);
 }

 @Override
 public void refresh() {
	 portTypeList.removeSelectionListener(blabla);
     PictogramElement pe = getSelectedPictogramElement();
     if (pe != null) {
         Object bo = Graphiti.getLinkService()
              .getBusinessObjectForLinkedPictogramElement(pe);
         if (bo == null){
             return;
         }
         if (bo instanceof OutputPort){
             portTypeList.setItems (new String [] {"Alpha", "Bravo", "Charlie"});
             portTypeList.select(selected);
         }
     }
     portTypeList.addSelectionListener(blabla);
 }	  
 
 private SelectionListener blabla = new SelectionListener() {
	 
	
	@Override
	public void widgetSelected(SelectionEvent e) {
		portTypeList.select(portTypeList.getSelectionIndex());
		selected = portTypeList.getSelectionIndex();
	}
	
	@Override
	public void widgetDefaultSelected(SelectionEvent e) {
		
	}
};
}

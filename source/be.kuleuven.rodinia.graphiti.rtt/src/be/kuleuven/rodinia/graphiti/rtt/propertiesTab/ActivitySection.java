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
import be.kueleuven.rodinia.model.rtt.OrocosPackage;
import be.kueleuven.rodinia.model.rtt.TaskContext;

public class ActivitySection extends GFPropertySection implements ITabbedPropertyConstants {
	 
	private CCombo TaskContextList;
	private Text cpuAffinity;
	private Text period;
	private Text priority;
	
	@Override
	public void createControls(Composite parent,
      TabbedPropertySheetPage tabbedPropertySheetPage) {
      super.createControls(parent, tabbedPropertySheetPage);

      TabbedPropertySheetWidgetFactory factory = getWidgetFactory();
      Composite composite = factory.createFlatFormComposite(parent);
      FormData data;
      FormData data2;

      TaskContextList = factory.createCCombo(composite, SWT.READ_ONLY);
      data = new FormData();
      data.left = new FormAttachment(0, 110);
      data.right = new FormAttachment(100, -500);
      data.top = new FormAttachment(0, VSPACE);
      TaskContextList.setLayoutData(data);
      TaskContextList.addSelectionListener(getTaskContext);

      CLabel valueLabel = factory.createCLabel(composite, "Task Context:");
      data = new FormData();
      data.left = new FormAttachment(0, 0);
      data.right = new FormAttachment(TaskContextList, -HSPACE);
      data.top = new FormAttachment(TaskContextList, 0, SWT.CENTER);
      valueLabel.setLayoutData(data);
      
      cpuAffinity = factory.createText(composite, "a");
      data = new FormData();
      data.left = new FormAttachment(0, 110);
      data.right = new FormAttachment(100, -500);
      data.top = new FormAttachment(0, 40);
      cpuAffinity.setLayoutData(data);
      cpuAffinity.addModifyListener(cpuAffinityModify);

      CLabel valueLabel2 = factory.createCLabel(composite, "Cpu afinity:");
      data = new FormData();
      data.left = new FormAttachment(0, 0);
      data.right = new FormAttachment(cpuAffinity, -HSPACE);
      data.top = new FormAttachment(cpuAffinity, 0, SWT.CENTER);
      valueLabel2.setLayoutData(data);
      
      period = factory.createText(composite, "b");
      data2 = new FormData();
      data2.left = new FormAttachment(0, 110);
      data2.right = new FormAttachment(100, -500);
      data2.top = new FormAttachment(0, 70);
      period.setLayoutData(data2);
      period.addModifyListener(periodModify);

      CLabel valueLabel3 = factory.createCLabel(composite, "period:");
      data2 = new FormData();
      data2.left = new FormAttachment(0, 0);
      data2.right = new FormAttachment(period, -HSPACE);
      data2.top = new FormAttachment(period, 0, SWT.CENTER);
      valueLabel3.setLayoutData(data2);
      
      priority = factory.createText(composite, "b");
      data2 = new FormData();
      data2.left = new FormAttachment(0, 110);
      data2.right = new FormAttachment(100, -500);
      data2.top = new FormAttachment(0, 100);
      priority.setLayoutData(data2);
      priority.addModifyListener(priorityModify);

      CLabel valueLabel4 = factory.createCLabel(composite, "priority:");
      data2 = new FormData();
      data2.left = new FormAttachment(0, 0);
      data2.right = new FormAttachment(priority, -HSPACE);
      data2.top = new FormAttachment(priority, 0, SWT.CENTER);
      valueLabel4.setLayoutData(data2);
      
      
  }

@Override
  public void refresh() {
    TaskContextList.removeSelectionListener(getTaskContext);
    cpuAffinity.removeModifyListener(cpuAffinityModify);
    period.removeModifyListener(periodModify);
    priority.removeModifyListener(priorityModify);
      PictogramElement pe = getSelectedPictogramElement();
      if (pe != null) {
          Object bo = Graphiti.getLinkService()
               .getBusinessObjectForLinkedPictogramElement(pe);
          if (bo == null){
              return;
          }
          if (bo instanceof Activity){
        	  OrocosPackage taskcontexts = ((OrocosPackage) getDiagram().getLink().getBusinessObjects().get(0));
        	  ArrayList<String> bla = new ArrayList<String>();
        	  bla.add("<none>");
        	  for (int i = 0; i < taskcontexts.getTaskContexts().size(); i++){
        		  bla.add(taskcontexts.getTaskContexts().get(i).getName());
        	  }
         	  String []strArray = new String[bla.size()];
         	  bla.toArray(strArray);
         	  TaskContextList.setItems(strArray);
         	  boolean selected = false;
        	  for (int i = 0; i < taskcontexts.getTaskContexts().size(); i++){
        		  if (taskcontexts.getTaskContexts().get(i) == ((Activity)bo).getTaskContext()){
        			  TaskContextList.select(i+1);
        			  selected = true;
        		  }
        	  }
        	  if (selected == false){
        		  TaskContextList.select(0);
        	  }
        	  cpuAffinity.setText(((Activity) bo).getCpuAffinity());
        	  period.setText("" + ((Activity) bo).getPeriod());
        	  priority.setText("" + ((Activity) bo).getPriority());
          }
      }
      TaskContextList.addSelectionListener(getTaskContext);
      cpuAffinity.addModifyListener(cpuAffinityModify);
      period.addModifyListener(periodModify);
      priority.addModifyListener(priorityModify);
  }
	   
	   private SelectionListener getTaskContext = new SelectionListener(){

		@Override
		public void widgetSelected(SelectionEvent e) {
			int value = TaskContextList.getSelectionIndex() -1;
   			
   			final int typedValue = value;
	   		IFeature feature = new AbstractFeature(getDiagramTypeProvider().getFeatureProvider()) {	
		   		@Override
		   		public void execute(IContext context) {
		   			PictogramElement pe = getSelectedPictogramElement();
		   			if (pe != null) {
		   				Object bo = Graphiti.getLinkService().getBusinessObjectForLinkedPictogramElement(pe);
		   				if (bo == null)
		   					return;
		   		   		if (bo instanceof Activity){
		   		   			Activity acty = (Activity) bo;
		   		   			if (typedValue < 0){
		   		   				acty.setTaskContext(null);
		   		   			} else {
		   		   				TaskContext taskValue = ((OrocosPackage) getDiagram().getLink().getBusinessObjects().get(0)).getTaskContexts().get(typedValue);
		   		   				acty.setTaskContext(taskValue);
		   		   			}
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

		@Override
		public void widgetDefaultSelected(SelectionEvent e) {
			
		}
		   
	   };
	   
	private ModifyListener periodModify = new ModifyListener() {
		@Override
		public void modifyText(ModifyEvent e) {
			String temp = period.getText();
			if (temp == null || temp.equals("")){
				return;
			}
			float value;
			try {
				value = Float.parseFloat(temp);
			} catch (Exception E){
				return;
			}
			final float typedValue = value;
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
		   		   			Activity acty = (Activity) bo;
		   		   			acty.setPeriod(typedValue);
		   		   		}
		   			}
				}	
			};
	   		CustomContext context = new CustomContext();
	   		execute(feature, context);
			
		}
	};
	
	private ModifyListener priorityModify = new ModifyListener() {
		@Override
		public void modifyText(ModifyEvent e) {
			String temp = priority.getText();
			if (temp == null || temp.equals("")){
				return;
			}
			int value;
			try {
				value = Integer.parseInt(temp);
			} catch (Exception E){
				return;
			}
			final int typedValue = value;
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
		   		   			Activity acty = (Activity) bo;
		   		   			acty.setPriority(typedValue);
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
			String value = cpuAffinity.getText();
			if (value == null){
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
		   		   		if (bo instanceof Activity){
		   		   			Activity acty = (Activity) bo;
		   		   			acty.setCpuAffinity(typedValue);
		   		   		}
		   			}
				}	
			};
	   		CustomContext context = new CustomContext();
	   		execute(feature, context);
			
		}
		
	};
}

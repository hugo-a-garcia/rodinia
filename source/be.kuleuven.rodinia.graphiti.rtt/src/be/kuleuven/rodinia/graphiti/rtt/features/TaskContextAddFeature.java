package be.kuleuven.rodinia.graphiti.rtt.features;

import org.eclipse.graphiti.features.IDirectEditingInfo;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.impl.AbstractAddShapeFeature;
import org.eclipse.graphiti.mm.algorithms.Polyline;
import org.eclipse.graphiti.mm.algorithms.Rectangle;
import org.eclipse.graphiti.mm.algorithms.RoundedRectangle;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.algorithms.styles.Orientation;
import org.eclipse.graphiti.mm.pictograms.ChopboxAnchor;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.services.IPeCreateService;

import be.kueleuven.rodinia.model.rtt.Activity;
import be.kueleuven.rodinia.model.rtt.TaskContext;
import be.kuleuven.rodinia.graphiti.rtt.util.StyleUtil;

public class TaskContextAddFeature extends AbstractAddShapeFeature {
	
	private TaskContext taskContext;

	public TaskContextAddFeature(IFeatureProvider fp) {
		super(fp);
	}

	@Override
	public boolean canAdd(IAddContext context) {
		if (context.getNewObject() instanceof TaskContext) {
			if (context.getTargetContainer() instanceof Diagram) {
				return true;
			}
		}
		return false;
	}

	@Override
	public PictogramElement add(IAddContext context) {

		taskContext = (TaskContext) context.getNewObject();
		
		ContainerShape taskContextShape = Graphiti.getPeCreateService().createContainerShape(
				context.getTargetContainer(), true);
		RoundedRectangle taskContextRectangle = Graphiti.getGaService().createRoundedRectangle(taskContextShape, 10, 10);
		taskContextRectangle.setStyle(StyleUtil.getStyleForTaskContext(getDiagram()));
		taskContextRectangle.setLineWidth(2);
		Graphiti.getGaService().setLocationAndSize(taskContextRectangle, context.getX(), context.getY(),
				IPictogramConstants.TASK_CONTEXT_DEFAULT_WIDTH, IPictogramConstants.TASK_CONTEXT_DEFAULT_HEIGHT);
		taskContextRectangle.setLineVisible(true);
		link(taskContextShape, taskContext);
	
		Shape taskContextNameShape = Graphiti.getPeCreateService().createShape(taskContextShape, false);
		Text tastContextText = Graphiti.getGaService().createText(taskContextNameShape, taskContext.getName());
		tastContextText.setStyle(StyleUtil.getStyleForText(getDiagram()));
		tastContextText.setHorizontalAlignment(Orientation.ALIGNMENT_CENTER);
		tastContextText.setFont(Graphiti.getGaService().manageDefaultFont(getDiagram(), false, true));
		Graphiti.getGaService().setLocationAndSize(tastContextText, 0, 0, IPictogramConstants.TASK_CONTEXT_DEFAULT_WIDTH, IPictogramConstants.TEXT_BOX_HEIGHT);
		link(taskContextNameShape, taskContext);
		
		addActivity(taskContextShape, taskContext);
		//addPropertiesShape(taskContextShape);
		//addOperationShape(taskContextShape);

		IDirectEditingInfo directEditingInfo = getFeatureProvider().getDirectEditingInfo();
		directEditingInfo.setMainPictogramElement(taskContextShape);

		layoutPictogramElement(taskContextShape);
		return taskContextShape;
	}
	
	private void addActivity(ContainerShape taskContextShape, TaskContext taskContext) {

		Activity activity = taskContext.getActivity();

		ContainerShape activityShape = Graphiti.getPeCreateService().createContainerShape(taskContextShape, true);
		Rectangle activityRectangle = Graphiti.getGaService().createPlainRectangle(activityShape);
		activityRectangle.setStyle(StyleUtil.getStyleForActivity(getDiagram()));
		activityRectangle.setLineWidth(1);
		activityRectangle.setTransparency(0.7);
		Graphiti.getGaService().setLocationAndSize(activityRectangle, 0, IPictogramConstants.TEXT_BOX_HEIGHT,
				IPictogramConstants.TASK_CONTEXT_DEFAULT_WIDTH, IPictogramConstants.TEXT_BOX_HEIGHT);
		link(activityShape, activity);

		Shape activityTextShape = Graphiti.getPeCreateService().createShape(activityShape, false);
		Text activityNameText = Graphiti.getGaService().createText(activityTextShape, activity.getName());
		activityNameText.setStyle(StyleUtil.getStyleForText(getDiagram()));
		Graphiti.getGaService().setLocationAndSize(activityNameText, IPictogramConstants.BUFFER_SPACE, 0,
				IPictogramConstants.TASK_CONTEXT_DEFAULT_WIDTH, IPictogramConstants.TEXT_BOX_HEIGHT);
		activityNameText.setHorizontalAlignment(Orientation.ALIGNMENT_LEFT);
		link(activityTextShape, activity);
	}

	private void addPropertiesShape(final ContainerShape taskContextContainerShape) {

		Shape propertyShape = Graphiti.getPeCreateService().createContainerShape(taskContextContainerShape, false);
		Rectangle propertyRectangle = Graphiti.getGaService().createPlainRectangle(propertyShape);
		propertyRectangle.setStyle(StyleUtil.getStyleForTaskContext(getDiagram()));
		propertyRectangle.setLineWidth(1);
		propertyRectangle.setTransparency(0.0);
		Graphiti.getGaService().setLocationAndSize(propertyRectangle, IPictogramConstants.BORDER_WIDTH, IPictogramConstants.TEXT_BOX_HEIGHT * 2, IPictogramConstants.TASK_CONTEXT_DEFAULT_WIDTH - (IPictogramConstants.BORDER_WIDTH * 2), 25);
		link(propertyShape, taskContext);
	}

	private void addOperationShape(final ContainerShape taskContextContainerShape) {

		Shape operationShape = Graphiti.getPeCreateService().createContainerShape(taskContextContainerShape, false);
		Rectangle operationPlainRectangle = Graphiti.getGaService().createPlainRectangle(operationShape);
		operationPlainRectangle.setStyle(StyleUtil.getStyleForTaskContext(getDiagram()));
		operationPlainRectangle.setLineWidth(2);
		operationPlainRectangle.setTransparency(0.0);
		Graphiti.getGaService().setLocationAndSize(operationPlainRectangle, 10, 67, IPictogramConstants.TASK_CONTEXT_DEFAULT_WIDTH - 20, 25);
		link(operationShape, taskContext);
	}

}

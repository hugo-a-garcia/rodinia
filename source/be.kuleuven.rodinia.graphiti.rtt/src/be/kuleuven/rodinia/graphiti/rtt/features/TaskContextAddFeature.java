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
import org.eclipse.graphiti.util.ColorConstant;
import org.eclipse.graphiti.util.IColorConstant;

import be.kueleuven.rodinia.model.rtt.Activity;
import be.kueleuven.rodinia.model.rtt.TaskContext;
import be.kuleuven.rodinia.graphiti.rtt.util.StyleUtil;

public class TaskContextAddFeature extends AbstractAddShapeFeature {

	private static final IColorConstant TASK_CONTEXT_FOREGROUND = new ColorConstant(98, 131, 167);
	private static final IColorConstant TASK_CONTEXT_BACKGROUND = new ColorConstant(187, 218, 247);
	private static final IColorConstant ACTIVITY_FOREGROUND = IColorConstant.BLACK;
	private static final IColorConstant ACTIVITY_BACKGROUND = IColorConstant.GRAY;

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
		int taskContextWidth = IPictogramConstants.TASK_CONTEXT_DEFAULT_WIDTH;
		int taskContextHeight = IPictogramConstants.TASK_CONTEXT_DEFAULT_HEIGHT;
		int margin = IPictogramConstants.MARGIN;
		int textBoxHeight = IPictogramConstants.TEXT_BOX_HEIGHT;
		int bufferSpace = IPictogramConstants.BUFFER_SPACE;

		IPeCreateService peCreateService = Graphiti.getPeCreateService();
		IGaService gaService = Graphiti.getGaService();
		Diagram targetDiagram = (Diagram) context.getTargetContainer();

		ContainerShape mainContainerShape = peCreateService.createContainerShape(targetDiagram, true);
		Rectangle invisibleRectangle = gaService.createInvisibleRectangle(mainContainerShape);
		gaService.setLocationAndSize(invisibleRectangle, context.getX(), context.getY(), taskContextWidth + 2 * margin,
				taskContextHeight + 2 * margin);

		RoundedRectangle taskContextRectangle = gaService.createRoundedRectangle(invisibleRectangle, 10, 10);
		taskContextRectangle.setLineWidth(2);
		gaService.setLocationAndSize(taskContextRectangle, margin, margin, taskContextWidth, taskContextHeight);
		taskContextRectangle.setLineVisible(true);
		taskContextRectangle.setBackground(gaService.manageColor(targetDiagram, TASK_CONTEXT_BACKGROUND));
		taskContextRectangle.setForeground(gaService.manageColor(targetDiagram, TASK_CONTEXT_FOREGROUND));
		taskContextRectangle.setFilled(true);
		link(mainContainerShape, taskContext);

		Text taskContextText = gaService.createText(invisibleRectangle, taskContext.getName());
		// tastContextText.setStyle(StyleUtil.getStyleForText(getDiagram()));
		taskContextText.setForeground(gaService.manageColor(targetDiagram, IColorConstant.BLACK));
		taskContextText.setHorizontalAlignment(Orientation.ALIGNMENT_CENTER);
		taskContextText.setFont(gaService.manageDefaultFont(getDiagram(), false, true));
		gaService.setLocationAndSize(taskContextText, margin, margin, taskContextWidth, textBoxHeight);

		// addActivity(taskContextShape, taskContext);
		{
			Activity activity = taskContext.getActivity();

			ContainerShape activityShape = peCreateService.createContainerShape(mainContainerShape, true);
			Rectangle activityRectangle = gaService.createPlainRectangle(activityShape);
			// activityRectangle.setStyle(StyleUtil.getStyleForActivity(getDiagram()));
			activityRectangle.setLineVisible(false);
			activityRectangle.setTransparency(0.7);
			activityRectangle.setFilled(true);
			activityRectangle.setBackground(gaService.manageColor(targetDiagram, ACTIVITY_BACKGROUND));
			gaService.setLocationAndSize(activityRectangle, margin, textBoxHeight + margin, taskContextWidth,
					textBoxHeight);
			link(activityShape, activity);

			Shape activityTextShape = Graphiti.getPeCreateService().createShape(mainContainerShape, false);
			Text activityNameText = Graphiti.getGaService().createText(activityTextShape, activity.getName());
			// activityNameText.setStyle(StyleUtil.getStyleForText(getDiagram()));
			activityNameText.setFont(gaService.manageDefaultFont(getDiagram(), false, false));
			activityNameText.setForeground(gaService.manageColor(targetDiagram, ACTIVITY_FOREGROUND));
			Graphiti.getGaService().setLocationAndSize(activityNameText, margin + bufferSpace, textBoxHeight + margin,
					taskContextWidth - bufferSpace, textBoxHeight);
			activityNameText.setHorizontalAlignment(Orientation.ALIGNMENT_LEFT);
			link(activityTextShape, activity);
		}
		// addPropertiesShape(taskContextShape);
		// addOperationShape(taskContextShape);

		IDirectEditingInfo directEditingInfo = getFeatureProvider().getDirectEditingInfo();
		directEditingInfo.setMainPictogramElement(mainContainerShape);

		layoutPictogramElement(mainContainerShape);
		return mainContainerShape;
	}

	// private void addPropertiesShape(final ContainerShape
	// taskContextContainerShape) {
	//
	// Shape propertyShape =
	// Graphiti.getPeCreateService().createContainerShape(taskContextContainerShape,
	// false);
	// Rectangle propertyRectangle =
	// Graphiti.getGaService().createPlainRectangle(propertyShape);
	// propertyRectangle.setStyle(StyleUtil.getStyleForTaskContext(getDiagram()));
	// propertyRectangle.setLineWidth(1);
	// propertyRectangle.setTransparency(0.0);
	// Graphiti.getGaService().setLocationAndSize(propertyRectangle,
	// IPictogramConstants.BORDER_WIDTH, IPictogramConstants.TEXT_BOX_HEIGHT *
	// 2, IPictogramConstants.TASK_CONTEXT_DEFAULT_WIDTH -
	// (IPictogramConstants.BORDER_WIDTH * 2), 25);
	// link(propertyShape, taskContext);
	// }
	//
	// private void addOperationShape(final ContainerShape
	// taskContextContainerShape) {
	//
	// Shape operationShape =
	// Graphiti.getPeCreateService().createContainerShape(taskContextContainerShape,
	// false);
	// Rectangle operationPlainRectangle =
	// Graphiti.getGaService().createPlainRectangle(operationShape);
	// operationPlainRectangle.setStyle(StyleUtil.getStyleForTaskContext(getDiagram()));
	// operationPlainRectangle.setLineWidth(2);
	// operationPlainRectangle.setTransparency(0.0);
	// Graphiti.getGaService().setLocationAndSize(operationPlainRectangle, 10,
	// 67, IPictogramConstants.TASK_CONTEXT_DEFAULT_WIDTH - 20, 25);
	// link(operationShape, taskContext);
	// }

}

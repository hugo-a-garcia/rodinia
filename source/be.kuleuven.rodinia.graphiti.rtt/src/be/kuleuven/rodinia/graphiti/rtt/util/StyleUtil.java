package be.kuleuven.rodinia.graphiti.rtt.util;

import org.eclipse.graphiti.mm.algorithms.styles.LineStyle;
import org.eclipse.graphiti.mm.algorithms.styles.Orientation;
import org.eclipse.graphiti.mm.algorithms.styles.Style;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.util.ColorConstant;
import org.eclipse.graphiti.util.IColorConstant;

public class StyleUtil {
	
	private static final IColorConstant TEXT_FOREGROUND = IColorConstant.BLACK;
	private static final IColorConstant TEXT_TIP_FOREGROUND = IColorConstant.GRAY;
	private static final IColorConstant TASK_CONTEXT_FOREGROUND = new ColorConstant(98, 131, 167);
	private static final IColorConstant TASK_CONTEXT_BACKGROUND = new ColorConstant(187, 218, 247);
	private static final IColorConstant ACTIVITY_FOREGROUND = IColorConstant.BLACK;
	private static final IColorConstant ACTIVITY_BACKGROUND = IColorConstant.GRAY;
	private static final IColorConstant PORT_FOREGROUND = new ColorConstant(98, 131, 167);
	private static final IColorConstant INPUT_PORT_BACKGROUND = new ColorConstant(119, 193, 255);
	private static final IColorConstant OUTPUT_PORT_BACKGROUND = new ColorConstant(147, 214, 147);
	private static final IColorConstant EVENT_PORT_BACKGROUND = new ColorConstant(254, 254, 254);
	
    private static void setCommonValues(Style style) {
        style.setLineStyle(LineStyle.SOLID);
        style.setLineVisible(true);
        style.setLineWidth(2);
        style.setTransparency(0.0);
    }
    
    private static void setCommonTextValues(Diagram diagram,
            IGaService gaService, Style style) {
            style.setFilled(false);
            style.setAngle(0);
            style.setHorizontalAlignment(Orientation.ALIGNMENT_CENTER);
            style.setVerticalAlignment(Orientation.ALIGNMENT_CENTER);
            style.setForeground(gaService.manageColor(diagram,
                TEXT_FOREGROUND));
        }
    
    private static void setCommonTextTipValues(Diagram diagram,
            IGaService gaService, Style style) {
            style.setFilled(false);
            style.setAngle(0);
            style.setHorizontalAlignment(Orientation.ALIGNMENT_CENTER);
            style.setVerticalAlignment(Orientation.ALIGNMENT_CENTER);
            style.setForeground(gaService.manageColor(diagram,
                TEXT_TIP_FOREGROUND));
        }
	
    public static Style getStyleForCommonValues(Diagram diagram) {
        final String styleId = "COMMON-VALUES";
        IGaService gaService = Graphiti.getGaService();

        // Is style already persisted?
        Style style = gaService.findStyle(diagram, styleId);

        if (style == null) { // style not found - create new style
            style = gaService.createPlainStyle(diagram, styleId);
            setCommonValues(style);
        }
        return style;
    }
	
    public static Style getStyleForTaskContext(Diagram diagram) {
        final String styleId = "TASKCONTEXT";
        IGaService gaService = Graphiti.getGaService();

        // this is a child style of the common-values-style
        Style parentStyle = getStyleForCommonValues(diagram);
        Style style = gaService.findStyle(parentStyle, styleId);

        if (style == null) { // style not found - create new style
            style = gaService.createPlainStyle(parentStyle, styleId);
            style.setFilled(true);
            style.setForeground(gaService.manageColor(diagram,TASK_CONTEXT_FOREGROUND));
            style.setBackground(gaService.manageColor(diagram,TASK_CONTEXT_BACKGROUND));
        }
        return style;
      
    }
    
    public static Style getStyleForActivity(Diagram diagram) {
        final String styleId = "ACTIVITY";
        IGaService gaService = Graphiti.getGaService();

        // this is a child style of the common-values-style
        Style parentStyle = getStyleForCommonValues(diagram);
        Style style = gaService.findStyle(parentStyle, styleId);

        if (style == null) { // style not found - create new style
            style = gaService.createPlainStyle(parentStyle, styleId);
            style.setFilled(true);
            style.setForeground(gaService.manageColor(diagram,ACTIVITY_FOREGROUND));
            style.setBackground(gaService.manageColor(diagram,ACTIVITY_BACKGROUND));
        }
        return style;
      
    }
    
    public static Style getStyleForInputPort(Diagram diagram) {
        final String styleId = "INPUT_PORT";
        IGaService gaService = Graphiti.getGaService();

        // this is a child style of the common-values-style
        Style parentStyle = getStyleForCommonValues(diagram);
        Style style = gaService.findStyle(parentStyle, styleId);

        if (style == null) { // style not found - create new style
            style = gaService.createPlainStyle(parentStyle, styleId);
            style.setFilled(true);
            style.setForeground(gaService.manageColor(diagram,PORT_FOREGROUND));
            style.setBackground(gaService.manageColor(diagram,INPUT_PORT_BACKGROUND));
        }
        return style;
      
    }
    
    public static Style getStyleForOutputPort(Diagram diagram) {
        final String styleId = "OUTPUT_PORT";
        IGaService gaService = Graphiti.getGaService();

        // this is a child style of the common-values-style
        Style parentStyle = getStyleForCommonValues(diagram);
        Style style = gaService.findStyle(parentStyle, styleId);

        if (style == null) { // style not found - create new style
            style = gaService.createPlainStyle(parentStyle, styleId);
            style.setFilled(true);
            style.setForeground(gaService.manageColor(diagram,PORT_FOREGROUND));
            style.setBackground(gaService.manageColor(diagram,OUTPUT_PORT_BACKGROUND));
        }
        return style;
      
    }
    
    public static Style getStyleForEventPort(Diagram diagram) {
        final String styleId = "EVENT_PORT";
        IGaService gaService = Graphiti.getGaService();

        // this is a child style of the common-values-style
        Style parentStyle = getStyleForCommonValues(diagram);
        Style style = gaService.findStyle(parentStyle, styleId);

        if (style == null) { // style not found - create new style
            style = gaService.createPlainStyle(parentStyle, styleId);
            style.setFilled(true);
            style.setForeground(gaService.manageColor(diagram,PORT_FOREGROUND));
            style.setBackground(gaService.manageColor(diagram,EVENT_PORT_BACKGROUND));
        }
        return style;
      
    }
    
    public static Style getStyleForText(Diagram diagram) {
            final String styleId = "TEXT";
            IGaService gaService = Graphiti.getGaService();

            // this is a child style of the common-values-style
            Style parentStyle = getStyleForCommonValues(diagram);
            Style style = gaService.findStyle(parentStyle, styleId);

            if (style == null) { // style not found - create new style
                style = gaService.createPlainStyle(parentStyle, styleId);
                setCommonTextValues(diagram, gaService, style);
                style.setFont(gaService.manageDefaultFont(diagram, false, true));
            }
            return style;
        }
    
    public static Style getStyleForTextTip(Diagram diagram) {
        final String styleId = "TEXT";
        IGaService gaService = Graphiti.getGaService();

        // this is a child style of the common-values-style
        Style parentStyle = getStyleForCommonValues(diagram);
        Style style = gaService.findStyle(parentStyle, styleId);

        if (style == null) { // style not found - create new style
            style = gaService.createPlainStyle(parentStyle, styleId);
            setCommonTextTipValues(diagram, gaService, style);
            style.setFont(gaService.manageFont(diagram, "attribute", 8, true, false));
        }
        return style;
    }
}

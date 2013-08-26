package be.kuleuven.rodinia.graphiti.rtt.features;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICustomContext;
import org.eclipse.graphiti.features.custom.AbstractCustomFeature;
import org.eclipse.graphiti.mm.algorithms.styles.Color;
import org.eclipse.graphiti.mm.algorithms.styles.Style;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;

import be.kueleuven.rodinia.model.rtt.TaskContext;
import be.kuleuven.rodinia.graphiti.rtt.util.StyleUtil;
import be.kuleuven.rodinia.graphiti.rtt.util.Util;

public class CustomChangeColorFeature 	extends AbstractCustomFeature {
 
    public CustomChangeColorFeature(IFeatureProvider fp) {
        super(fp);
    }

    @Override
    public String getName() {
        return "Change &foreground color";
    }

    @Override
    public String getDescription() {
        return "Change the foreground color";
    }

    @Override
    public boolean canExecute(ICustomContext context) {
        PictogramElement[] pes = context.getPictogramElements();
        if (pes == null || pes.length == 0) { // nothing selected
            return false;
        }
        for (PictogramElement pe : pes) {
            final Object bo = getBusinessObjectForPictogramElement(pe);
            if (!(bo instanceof TaskContext)) {
                return false;
            }
        }
        return true;
    }

    public void execute(ICustomContext context) {
        Style style = StyleUtil.getStyleForTaskContext(getDiagram());

        // let the user choose the new color
        Color currentColor = style.getForeground();
        Color newColor = Util.editColor(currentColor);
        if (newColor == null) { // user did not choose new color
            return;
        }
        style.setForeground(newColor);
    }
}

package be.kuleuven.rodinia.graphiti.rtt.Shapes;

import org.eclipse.graphiti.mm.algorithms.Rectangle;
import org.eclipse.graphiti.mm.pictograms.*;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.services.IPeCreateService;


public class ActivityRectangle {

	
	private Rectangle rec;
	
	public ActivityRectangle(Shape containerShape){
		IGaService gaService = Graphiti.getGaService();
		rec = gaService.createPlainRectangle(containerShape);
	}
	
	public Rectangle getRectangle(){
		return this.rec;
	}
}

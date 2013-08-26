package be.kuleuven.rodinia.graphiti.rtt.util;

import java.awt.Font;

import org.eclipse.graphiti.services.IGaService;
import org.eclipse.swt.graphics.FontMetrics;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.widgets.Shell;

public class TextUtils {
	
	//get the width of a piece of text
	public static int calculateTextWidth(String text){
		GC gc = new GC(new Shell());
		FontMetrics metrics = gc.getFontMetrics();
		gc.dispose();
		@SuppressWarnings("unused")
		int hgt = metrics.getHeight();
		int adv = metrics.getAverageCharWidth() * text.length();
		return adv;
	}
	
	
	//get the graphiti default font
	public static Font getDefaultFont(){
		Font a = new Font(IGaService.DEFAULT_FONT, Font.PLAIN, IGaService.DEFAULT_FONT_SIZE);
		return a;
	}

}

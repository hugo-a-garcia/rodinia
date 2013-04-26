package be.kuleuven.rodinia.test.ui.datatypes;

import static org.junit.Assert.*;

import org.junit.Test;
import org.eclipse.swtbot.eclipse.finder.SWTWorkbenchBot;
import org.eclipse.swtbot.swt.finder.junit.SWTBotJunit4ClassRunner;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotShell;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SWTBotJunit4ClassRunner.class)
public class CreateDatatypes {

	private static SWTWorkbenchBot	bot;
	 
	@BeforeClass
	public static void beforeClass() throws Exception {
		bot = new SWTWorkbenchBot();
		bot.viewByTitle("Welcome").close();
	}
 
	@Test
	public void creatNewGeneralProjectAndDatatypesFile() throws Exception {
		//bot.menu("Window").menu("Open Perspective").menu("Java").click();
		bot.menu("File").menu("New").menu("Project...").click();
 
		SWTBotShell shell = bot.shell("New Project");
		shell.activate();
		bot.tree().expandNode("General").select("Project");
		bot.button("Next >").click();
 
		bot.textWithLabel("Project name:").setText("test_project");
 
		bot.button("Finish").click();
		bot.viewByTitle("Project Explorer").show();
		bot.tree().select("test_project");
		bot.menu("File").menu("New").menu("File").click();
		bot.shell("New File").activate();
		bot.textWithLabel("File name:").setText("test_datatypes.datatypes");
		bot.button("Finish").click();
		bot.shell("Add Xtext Nature").activate();
		bot.button("Yes").click();
		// FIXME: assert that the project is actually created, for later
	}
 
	@AfterClass
	public static void sleep() {
		bot.sleep(3000);
	}
}

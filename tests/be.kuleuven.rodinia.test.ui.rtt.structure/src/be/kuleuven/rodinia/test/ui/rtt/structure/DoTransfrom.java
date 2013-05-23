package be.kuleuven.rodinia.test.ui.rtt.structure;

import static org.junit.Assert.assertNotNull;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.swtbot.eclipse.finder.SWTWorkbenchBot;
import org.eclipse.swtbot.eclipse.finder.widgets.SWTBotEditor;
import org.eclipse.swtbot.swt.finder.junit.SWTBotJunit4ClassRunner;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotShell;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotTree;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@RunWith(SWTBotJunit4ClassRunner.class)
public class DoTransfrom {
	
	private static SWTWorkbenchBot	bot;
	private static final String PROJECT_NAME = "transform_test_project";
	 
	@BeforeClass
	public static void beforeClass() throws Exception {
		bot = new SWTWorkbenchBot();
		bot.viewByTitle("Welcome").close();
	}
	
	/**
	 * Create a new Orocos Project
	 */
	@Test
	public void test001() throws Exception {
		
		bot.perspectiveByLabel("C/C++").activate();
		bot.menu("File").menu("New").menu("C++ Project").click();
		
		SWTBotShell shell = bot.shell("C++ Project");
		shell.activate();
		bot.textWithLabel("Project name:").setText(PROJECT_NAME);
		bot.tree().expandNode("Makefile project").select("Orocos Package");
		bot.table().select("Linux GCC");
		bot.button("Finish").click();
		
		IProject createdProject = ResourcesPlugin.getWorkspace().getRoot().getProject(PROJECT_NAME);
		assertNotNull(createdProject);
	}
	
	/**
	 * Create a new model in the project
	 */
	@Test
	public void test002() throws Exception {
		
		SWTBotTree projectTree = bot.viewByTitle("Project Explorer").bot().tree();
		projectTree.expandNode(PROJECT_NAME).select("model");
		bot.menu("File").menu("New").menu("Other...").click();
		bot.shell("New").activate();
		bot.tree().expandNode("RTT").select("New RTT Structural Graph");
		bot.button("Next >").click();
		
		bot.textWithLabel("File name:").setText("rtt_structural.diagram");
		bot.button("Finish").click();
		IResource diagramResource = ResourcesPlugin.getWorkspace().getRoot().getProject(PROJECT_NAME).findMember("model/rtt_structural.diagram");
		assertNotNull(diagramResource);
		IResource modelResource = ResourcesPlugin.getWorkspace().getRoot().getProject(PROJECT_NAME).findMember("model/rtt_structural.rtt");
		assertNotNull(modelResource);
	}
	
	/**
	 * Open the model with Xtext.
	 */
	@Test
	public void test003() throws Exception {
		SWTBotTree projectTree = bot.viewByTitle("Project Explorer").bot().tree();
		projectTree.expandNode(PROJECT_NAME).getNode("model").select().getNode("rtt_structural.rtt").select().doubleClick();
		SWTBotShell shell = bot.shell("Add Xtext Nature");
		shell.activate();
		bot.button("Yes").click();
		SWTBotEditor editor = bot.editorByTitle("rtt_structural.rtt");
		assertNotNull(editor);
	}
	
	@Test
	public void test004() throws Exception {
		SWTBotTree projectTree = bot.viewByTitle("Project Explorer").bot().tree();
		projectTree.expandNode(PROJECT_NAME).getNode("model").select().getNode("rtt_structural.rtt").select();
		bot.menu("Transform").menu("Orocos").menu("Create Structural Code").click();
	}
	
	@AfterClass
	public static void sleep() {
		bot.sleep(3000);
	}

}

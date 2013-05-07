package be.kuleuven.rodinia.graphiti.rtt.wizards;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.ui.editor.DiagramEditor;
import org.eclipse.graphiti.ui.editor.DiagramEditorInput;
import org.eclipse.graphiti.ui.services.GraphitiUi;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchPartReference;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;
import org.eclipse.ui.part.ISetSelectionTarget;

public class NewRttStructuralDiagramWizard extends Wizard implements INewWizard {

	/**
	 * The workbench.
	 */
	private IWorkbench workbench;

	private WizardNewFileCreationPage mainPage;

	/**
	 * The current selection.
	 */
	protected IStructuredSelection selection;

	public NewRttStructuralDiagramWizard() {
		super();
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.workbench = workbench;
		this.selection = selection;
		setWindowTitle("Create RTT Structural Diagram");
		setNeedsProgressMonitor(true);
	}

	@Override
	public void addPages() {
		super.addPages();
		mainPage = new WizardNewFileCreationPage("newFilePage1", selection);//$NON-NLS-1$
		mainPage.setTitle("Create a RTT Structural Diagram");
		mainPage.setDescription("The name of the file should be: '[file_name].diagram'");
		addPage(mainPage);
	}

	/**
	 * Selects and reveals the newly added resource in all parts of the active
	 * workbench window's active page.
	 * 
	 * @see ISetSelectionTarget
	 */
	protected void selectAndReveal(IResource newResource) {
		selectAndReveal(newResource, workbench.getActiveWorkbenchWindow());
	}

	/**
	 * Attempts to select and reveal the specified resource in all parts within
	 * the supplied workbench window's active page.
	 * <p>
	 * Checks all parts in the active page to see if they implement
	 * <code>ISetSelectionTarget</code>, either directly or as an adapter. If
	 * so, tells the part to select and reveal the specified resource.
	 * </p>
	 * 
	 * @param resource
	 *            the resource to be selected and revealed
	 * @param window
	 *            the workbench window to select and reveal the resource
	 * 
	 * @see ISetSelectionTarget
	 */
	public static void selectAndReveal(IResource resource,
			IWorkbenchWindow window) {
		// validate the input
		if (window == null || resource == null) {
			return;
		}
		IWorkbenchPage page = window.getActivePage();
		if (page == null) {
			return;
		}

		// get all the view and editor parts
		List<IWorkbenchPart> parts = new ArrayList<IWorkbenchPart>();
		IWorkbenchPartReference refs[] = page.getViewReferences();
		for (int i = 0; i < refs.length; i++) {
			IWorkbenchPart part = refs[i].getPart(false);
			if (part != null) {
				parts.add(part);
			}
		}
		refs = page.getEditorReferences();
		for (int i = 0; i < refs.length; i++) {
			if (refs[i].getPart(false) != null) {
				parts.add(refs[i].getPart(false));
			}
		}

		final ISelection selection = new StructuredSelection(resource);
		Iterator<IWorkbenchPart> itr = parts.iterator();
		while (itr.hasNext()) {
			IWorkbenchPart part = (IWorkbenchPart) itr.next();

			// get the part's ISetSelectionTarget implementation
			ISetSelectionTarget target = null;
			if (part instanceof ISetSelectionTarget) {
				target = (ISetSelectionTarget) part;
			} else {
				target = (ISetSelectionTarget) part
						.getAdapter(ISetSelectionTarget.class);
			}

			if (target != null) {
				// select and reveal resource
				final ISetSelectionTarget finalTarget = target;
				window.getShell().getDisplay().asyncExec(new Runnable() {
					public void run() {
						finalTarget.selectReveal(selection);
					}
				});
			}
		}
	}

	@Override
	public boolean performFinish() {

		String diagramTypeId = "rttStructure";

		IFile diagramFile = mainPage.createNewFile();
		if (diagramFile == null) {
			return false;
		}

		String diagramName = diagramFile.getFullPath().removeFileExtension()
				.lastSegment();
		String ocorocsPackagePathName = diagramFile.getFullPath().removeFileExtension()
				+ ".rtt";

		Diagram diagram = Graphiti.getPeCreateService().createDiagram(
				diagramTypeId, diagramName, true);

		URI uri = URI.createPlatformResourceURI(diagramFile.getFullPath()
				.toString(), true);

		FileService.createEmfFileForDiagram(uri, diagram, diagramName, ocorocsPackagePathName);
		String providerId = GraphitiUi.getExtensionManager()
				.getDiagramTypeProviderId(diagramTypeId);
		DiagramEditorInput editorInput = new DiagramEditorInput(
				EcoreUtil.getURI(diagram), providerId);

		selectAndReveal(diagramFile);

		try {
			PlatformUI.getWorkbench().getActiveWorkbenchWindow()
					.getActivePage()
					.openEditor(editorInput, DiagramEditor.DIAGRAM_EDITOR_ID);
		} catch (PartInitException e) {
			e.printStackTrace();
			// String error = Messages.CreateDiagramWizard_OpeningEditorError;
			// IStatus status = new Status(IStatus.ERROR,
			// ExamplesCommonPlugin.getID(), error, e);
			// ErrorDialog.openError(getShell(),
			// Messages.CreateDiagramWizard_ErrorOccuredTitle, null, status);
			return false;
		}

		// Open editor on new file.
		// IWorkbenchWindow dw = workbench.getActiveWorkbenchWindow();
		// try {
		// if (dw != null) {
		// IWorkbenchPage page = dw.getActivePage();
		// if (page != null) {
		// IDE.openEditor(page, file, true);
		// }
		// }
		// } catch (PartInitException e) {
		// DialogUtil.openError(dw.getShell(),
		// ResourceMessages.FileResource_errorMessage,
		// e.getMessage(), e);
		// }

		return true;
	}

}

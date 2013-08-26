package be.kuleuven.rodinia.graphiti.rtt.util;

import org.eclipse.graphiti.ui.platform.AbstractImageProvider;

public class ImageProvider extends AbstractImageProvider {
 
    // The prefix for all identifiers of this image provider
    protected static final String PREFIX =
              "org.eclipse.graphiti.examples.tutorial.";
 
    // The image identifier for an EReference.
    public static final String IMG_EREFERENCE= PREFIX + "ereference";
 
    @Override
    protected void addAvailableImages() {
        // register the path for each image identifier
        addImageFilePath(IMG_EREFERENCE, "icons/ereference.gif");
    }

}

package org.yourorg;

import java.util.ArrayList;
import java.util.Map;
import org.venatorlabs.rodeo.plugin.RodeoPlugin;
import org.venatorlabs.rodeo.types.INode;
import org.venatorlabs.rodeo.types.IRelationship;

/**
 * A template for building a rodeo plugin.
 */
public class TemplatePlugin implements RodeoPlugin {

    private boolean docHook = true;
    private boolean nodeHook = true;
    private boolean relationshipHook = true;

    public String getDescription() {
        return "A template plugin";
    }

    public String getName() {
        return "template-plugin";
    }

    public void processDoc(Map<String, Object> doc) {
        System.out.println("I process a document!");
        // TODO: your logic here
    }

    public void processNodes(ArrayList<INode> nodes) {
        System.out.println("I process nodes!");
        // TODO: your logic here
    }

    public void processRelationships(ArrayList<IRelationship> rels) {
        System.out.println("I process relationships!");
        // TODO: your logic here
    }

    public boolean isDocHook() {
        return docHook;
    }

    public boolean isNodeHook() {
        return nodeHook;
    }

    public boolean isRelationshipHook() {
        return relationshipHook;
    }

}

package org.yourorg;

import org.venatorlabs.rodeo.graph.Node;
import org.venatorlabs.rodeo.graph.Relationship;
import org.venatorlabs.rodeo.plugin.RodeoPlugin;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * A template for building a rodeo plugin.
 */
public class TemplatePlugin extends RodeoPlugin {

    private boolean docHook = false;
    private boolean nodeHook = false;
    private boolean relationshipHook = false;

    @Override
    public String getDescription() {
        return "A template plugin";
    }

    @Override
    public String getName() {
        return "template-plugin";
    }

    @Override
    public void processDoc(HashMap<String, Object> doc) {
        System.out.println("I process a document!");
        // TODO: your logic here
    }

    @Override
    public void processNodes(ArrayList<Node> nodes) {
        System.out.println("I process nodes!");
        // TODO: your logic here
    }

    @Override
    public void processRelationships(ArrayList<Relationship> rels) {
        System.out.println("I process relationships!");
        // TODO: your logic here
    }

    @Override
    public boolean isDocHook() {
        return docHook;
    }

    @Override
    public boolean isNodeHook() {
        return nodeHook;
    }

    @Override
    public boolean isRelationshipHook() {
        return relationshipHook;
    }

}

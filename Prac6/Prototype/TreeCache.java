package Prac6.Prototype;

import java.util.Hashtable;

public class TreeCache {

    private static final Hashtable<String, Tree> mapOfTrees = new Hashtable<String, Tree>();

    public static Tree getTree(String treeType) {
        Tree cachedTree = mapOfTrees.get(treeType);
        return cachedTree.clone();
    }

    public static void loadCache() {
        OakTree oak = new OakTree();
        mapOfTrees.put(oak.getType(), oak);

        PineTree pine = new PineTree();
        mapOfTrees.put(pine.getType(), pine);
    }
}

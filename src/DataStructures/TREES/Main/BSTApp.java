package DataStructures.TREES.Main;

import DataStructures.TREES.DataStructure.BinarySearchTree;
import DataStructures.TREES.Model.Node;

public class BSTApp {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        Node root=bst.insert(null,10);
        bst.insert(root,15);


    }
}

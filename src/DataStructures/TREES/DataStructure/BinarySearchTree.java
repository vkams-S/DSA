package DataStructures.TREES.DataStructure;

import DataStructures.TREES.Model.Node;

public class BinarySearchTree {
    public Node root;
    public int size;
    public Node lastAddedNode;

    public BinarySearchTree()
    {
        System.out.println("[BinarySearchTree] Created with size:"+size+" and root as:"+root);
    }

    public Node insert(Node node,int data){
        if(node == null)
        {
            node = new Node(data);
            if(size==0)
            {
                root=node;
            }

            size++;
            System.out.println("[BinarySearchTree] [Inset] node Added. And Size is:"+size);
            node.showNodes();
            lastAddedNode=node;
            return node;

        }
        else if (data< root.data) // insert in the left subtree
        {
            node.left=insert(node.left,data);
        }
        else { //insert in the right subtree
            node.right = insert(node.right,data);
        }

        return node;
    }
}

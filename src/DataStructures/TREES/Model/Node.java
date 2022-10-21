package DataStructures.TREES.Model;

public class Node {
    public int data;
    public Node left;
    public Node right;
    public Node(int data)
    {
        this.data=data;
    }
    public Node(){
        this(0);
    }


    public void showNodes() {
        String text= "Node[" +
                "data=" + data +
                ", left=" + left +
                ", right=" + right +
                ']';
        System.out.println(text);
    }
}

package DataStructures.SinglyLinkedList;

public class LinkedList {
    // each linked-list has root or head node.
    public Node head;
    int size;
   public void add(int data)
    {
        size++;
        Node node= new Node(data);
        if(head==null)
        {
            head=node;
        }
        else{
            Node temp=head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=node;
        }
    }
    void deleteFirst()
    {
        if(size==0||size==1)
        {
            head=null;
            size=0;
            return;
        }
        head=head.next;
        size--;
        return;

    }

    void deleteLast()
    {
        if(size==0||size==1)
        {
            head=null;
            size=0;
            return;
        }
        Node temp = head;
        while(temp.next.next!=null)
        {
            temp=temp.next;
        }
        temp.next=null;
        size--;
        return;
    }
 void delete(int data)
 {
     if(head == null)
     {
         System.out.println("Nothing to delete! LinkedList is empty!!");
         return;
     }
     if(head.data==data)
     {
         head=head.next;
         size--;
         System.out.println("Deleted "+data+" successfully!");
         return;
     }
     Node temp=head;
     while (temp.next!=null)
     {
         if(temp.next.data==data)
         {
             temp.next=temp.next.next;
             size--;
             System.out.println("Deleted "+data+" successfully !");
             return;
         }
         temp=temp.next;
     }
     System.out.println("Data "+data+" not found in List!");

 }
   public void iterate()
    {
        if (size==0)
        {
            System.out.println("List is empty!");
            return;
        }
        Node temp=head;
        while (temp.next!=null)
        {
            System.out.print(temp.data+" ->");
            temp=temp.next;
        }
        System.out.println(temp.data);
    }
    public static void main(String[] args) {
       LinkedList list = new LinkedList();
       list.add(10);
        //list.add(20);
        //list.add(30);
        //list.add(40);
       //list.iterate();
       //list.delete(50);
       list.iterate();
       //list.deleteFirst();
        list.deleteLast();
       list.iterate();
    }
}

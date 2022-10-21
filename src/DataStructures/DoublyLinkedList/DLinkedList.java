package DataStructures.DoublyLinkedList;

public class DLinkedList {
    Node head;
    int size=0;

    void addAtTheEnd(String data)
    {
        if(head==null)
        {
            head=new Node(data);
            size++;
            return;

        }
        Node newNode = new Node(data);
        Node temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next = newNode;
        newNode.prev=temp;
        newNode.next=null;
        size++;

    }

    void iteratorForward()
    {
        if(size==0)
        {
            System.out.println("LinkedList Empty!");
            return;
        }
        Node temp =head;
        while (temp.next!=null)
        {
            System.out.print(temp.data+" <->");
            temp=temp.next;
        }
        System.out.println(temp.data);
    }

    void iteratorBackward()
    {
        if(size==0)
        {
            System.out.println("LinkedList Empty!");
            return;
        }
        Node temp =head;
        while (temp.next!=null)
        {
            temp=temp.next;
        }
        while (temp.prev!=null)
        {
            System.out.print(temp.data+" <->");
            temp=temp.prev;
        }
        System.out.println(temp.data);
    }
}

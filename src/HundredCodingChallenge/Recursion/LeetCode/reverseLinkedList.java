package HundredCodingChallenge.Recursion.LeetCode;

import DataStructures.SinglyLinkedList.LinkedList;
import DataStructures.SinglyLinkedList.Node;

public class reverseLinkedList {
    static Node fp;
    static boolean isPalindrome(Node head)
    {
        fp=head;
        if(head==null)
        {
            return true;
        }
        return rc(head.next);
    }
    static boolean rc(Node current)
    {
        if(current==null)
        {
            return true;
        }
       boolean ret= rc(current.next);
        if(ret) {
            if (current.data != fp.data) {
                return false;
            } else {
                fp = fp.next;
                return true;
            }
        }else {
            return false;
        }
    }
    public static Node reverse(Node ls)
    {
        if(ls==null||ls.next==null)
        {
            return ls;
        }
        Node rest = reverse(ls.next);
        ls.next.next=ls;
        ls.next=null;
        return rest;
    }
    public static void main(String[] args) {
        LinkedList ls = new LinkedList();
        ls.add(1);
        ls.add(1);
        ls.add(2);
        ls.add(1);
        ls.iterate();
        System.out.println(isPalindrome(ls.head));
      //  ls.head=reverse(ls.head);
       // ls.iterate();
    }

}

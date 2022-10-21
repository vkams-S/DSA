package DataStructures.DoublyLinkedList;

public class DlinkedListMain {
    public static void main(String[] args) {
        DLinkedList Dl= new DLinkedList();
        Dl.addAtTheEnd("Hi");
        Dl.addAtTheEnd("Mohor.");
        Dl.addAtTheEnd("How");
        Dl.addAtTheEnd("are");
        Dl.addAtTheEnd("you?");
        Dl.iteratorForward();
        Dl.iteratorBackward();
    }
}

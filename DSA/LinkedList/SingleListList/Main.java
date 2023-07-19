package DSA.LinkedList.SingleListList;

// Three step for creating a new LinkedList

// 1.) Creating Head and tail, initialize with the null values
// 2) Creating the blank node and assigning a value to it and reference to null.
// 3.) Link Head and tail with these node.

// Time complexity for creating a new LinkedList is O(1)

public class Main {
    public static void main(String[] args) {
        SingleListList list = new SingleListList();
        list.createSingleLinkedList(5);
        // System.out.println(list.head.value);
        list.insertingNewNode(6, 1);
        // System.out.println(list.head.next.value);
        list.insertingNewNode(7, 3);
        list.insertingNewNode(8, 0);
        // System.out.println(list.head.next.next.value);
        // list.traversalSingleList();
        list.searching(7);
        list.deleteOfNode(3);
        list.deleteAllLists();
        // list.traversalSingleList();
    }
}

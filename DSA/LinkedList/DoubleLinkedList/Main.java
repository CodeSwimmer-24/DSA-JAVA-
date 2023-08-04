package DSA.LinkedList.DoubleLinkedList;

public class Main {
    public static void main(String[] args) {
        DoubleLinkList list = new DoubleLinkList();
        // list.createDDL(1);
        list.insertDll(12, 0);
        list.insertDll(21, 1);
        list.insertDll(2, 5);
        // System.out.println(list.head.next.value);
        list.traversel();
        list.reverse();
        list.search(21);
    }
}

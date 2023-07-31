package DSA.LinkedList.DoubleLinkedList;

public class DoubleLinkList {
    DoubleNode head;
    DoubleNode tail;
    int size;

    public DoubleNode createDDL(int nodeValue){
        head = new DoubleNode();
        DoubleNode newNode = new DoubleNode();
        newNode.value = nodeValue;
        newNode.next = null;
        newNode.prev = null;
        head = newNode;
        tail = newNode;
        size = 1;
        return head;
    }
}

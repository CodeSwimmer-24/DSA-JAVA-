package DSA.LinkedList.SingleListList;

// Creating head and tail properties


public class SingleListList {
    public Node head;
    public Node tail;
    public int size;

    public Node createSingleLinkedList(int nodeValue) {
       head = new Node();
        Node node = new Node();
        node.next = (Object) null;
        node.value = nodeValue;
        head = node;
        tail = node;
        size =1;
        return head;
    }
}

package DSA.LinkedList.CircularSingleList;

public class CercularSingleList {
    public Node head;
    public Node tail;
    public int size;

    public Node createCSLL(int nodevalue) {
        head = new Node();
        Node node = new Node();
        node.value = nodevalue;
        node.next = node;
        head = node;
        tail = node;
        size = 1;
        return head;
    }

    // Insertion of a node into a circular single list

    public void insertion(int nodeValue, int location) {
        Node node = new Node();
        node.value = nodeValue;
        if (head == null) {
            createCSLL(nodeValue);
        } else if (location == 0) {
            node.next = head;
            head = node;
            tail.next = node;
        } else if (location >= size) {
            tail.next = node;
            tail = node;
            tail.next = head;
        } else {
            Node tempNode = head;
            for (int i = 0; i < location - 1; i++) {
                tempNode = tempNode.next;
            }
            node.next = tempNode.next;
            tempNode.next = node;
        }
        size++;
    }

    // Traversal methods

    public void traversal() {
        Node tempNode = head;
        for (int i = 0; i < size; i++) {
            System.out.print(tempNode.value);
            if (i != size - 1) {
                System.out.print(" -> ");
            }
            tempNode = tempNode.next;
        }
        System.out.println("\n");
    }
    // Searching methods for Circular linked lists

    public void search(int value) {
        Node tempNode = head;
        for (int i = 0; i < size; i++) {
            if (tempNode.value == value) {
                System.out.print("Value is located at " + i);
                return;
            }
            tempNode = tempNode.next;
        }
        System.out.print("Not found");
    }

    public void delete(int location) {
        if (head == null) {
            System.out.println("Empty node");
            return;
        } else if (location == 0) {
            head = head.next;
            tail.next = head;
            size--;
            if (size == 0) {
                head = null;
                tail = null;
                head.next = null;
            }
        } else if (location >= size) {
            Node tempNode = head;
            for( int i = 0; i < size -1 ; i++) {
                tempNode = tempNode.next;
            }
            if(tempNode == head){
                head.next = null;
                head = null;
                // size =  null;
                size --;
                return;
            }
            tempNode.next = head;
            tail = tempNode;
            size--;
        } else {
            Node tempNode = head;
            for( int i = 0; i < location -1 ; i++) {
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next.next;
        }
    }

     // Delete all items from circular list 

    public void deleteAll(){
       head = null;
       tail = null;
       System.out.println("Successfully deleted all items");
    }
}

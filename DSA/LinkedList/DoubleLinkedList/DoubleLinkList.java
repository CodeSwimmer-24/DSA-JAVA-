package DSA.LinkedList.DoubleLinkedList;

public class DoubleLinkList {
    DoubleNode head;
    DoubleNode tail;
    int size;

    public DoubleNode createDDL(int nodeValue) {
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

    // Insert Methods

    public void insertDll(int nodeValue, int location) {
        DoubleNode newNode = new DoubleNode();
        newNode.value = nodeValue;
        if (head == null) {
            createDDL(nodeValue);
            return;

        } else if (location == 0) {
            newNode.next = head;
            newNode.prev = null;
            head.prev = newNode;
            head = newNode;
        } else if (location >= size) {
            newNode.next = null;
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        } else {
            DoubleNode tempNode = head;
            int index = 0;
            while (index < location) {
                tempNode = tempNode.next;
                index++;
            }
            newNode.prev = tempNode;
            newNode.next = tempNode.next;
            tempNode.next = newNode;
            newNode.next.prev = newNode;
        }
        size++;
    }

    // Traversing
    public void traversel() {
        DoubleNode tempNode = head;
        for (int i = 0; i < size; i++) {
            System.out.print(tempNode.value);
            if (i != size - 1) {
                System.out.print(" -> ");
            }
            tempNode = tempNode.next;
        }
        System.out.println("\n");
    }

    // Reverse traversal
    public void reverse() {
        DoubleNode tempNode = tail;
        for (int i = 0; i < size; i++) {
            System.out.print(tempNode.value);
            if (i != size - 1) {
                System.out.print(" <- ");
            }
            tempNode = tempNode.prev;
        }
        System.out.println("\n");
    }

    // Searching 
    public void search(int nodeValue){
        DoubleNode tempNode = head;
        for(int i=0; i< size; i++){
           if(tempNode.value == nodeValue){
            System.out.println("Location found at " + i);
           }
           tempNode = tempNode.next;
        }
    }
}

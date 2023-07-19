package DSA.LinkedList.SingleListList;

// Three step for creating a new LinkedList

// 1.) Creating Head and tail, initialize with the null values
// 2) Creating the blank node and assigning a value to it and reference to null.
// 3.) Link Head and tail with these node.

// Time complexity for creating a new LinkedList is O(1)

public class Main {
    public static void main(String[] args){
        SingleListList list = new SingleListList();
        list.createSingleLinkedList(5);
        System.out.println(list.head.value);
    } 
}

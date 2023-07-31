package DSA.LinkedList.DoubleLinkedList;

public class Main {
    public static void main(String[] args){
        DoubleLinkList list = new DoubleLinkList();
        list.createDDL(1);
        System.out.println(list.head.value);
    }
}

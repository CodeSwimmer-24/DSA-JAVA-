package DSA.LinkedList.CircularSingleList;

public class Main {
    public static void main(String[] args) {
        CercularSingleList csll = new CercularSingleList();
        csll.createCSLL(5);
        System.out.println(csll.head.value);
        // System.out.println(csll.head.value);

        csll.insertion(4, 1);
        csll.insertion(3, 2);
        csll.insertion(6, 3);
        csll.insertion(9, 8);

        System.out.println(csll.head.next.next.value);
        System.out.println(csll.tail.value);

        csll.traversal();
        csll.search(6);
        csll.delete(2);
        csll.traversal();
        csll.deleteAll();
    }
}

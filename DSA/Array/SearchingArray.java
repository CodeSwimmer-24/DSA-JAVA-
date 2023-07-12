// package DSA.Array;

// import java.util.Arrays;

// class Arry {

//     int arr[] = null;

//     public void insert(int length) {
//         arr = new int[length];

//         arr[0] = length + 1;
//         arr[1] = length + 2;
//         arr[2] = length + 3;
//         arr[3] = length + 4;
//         arr[4] = length + 5;
//         arr[5] = length + 6;
//     }

//     public int[] getArray() {
//         return arr;
//     }

//     public void search(int ser) {
//         for (int i = 0; i < arr.length; i++) {
//             if (ser == arr[i]) {
//                 System.out.println("found at " + i);
//             }

//         }
//         System.out.println("not found ");
//     }
// }

// public class SearchingArray {
//     public static void main(String[] args) {
//         Arry a = new Arry();
//         a.insert(8);

//         int[] result = a.getArray();
//         System.out.println(Arrays.toString(result));

//         // Traversal

//         try {
//             for (int i = 0; i < result.length; i++) {
//                 System.out.println(result[i]);
//             }
//         } catch (Exception e) {
//             System.out.println(e);
//         }

//         // Searching

//         a.search(99);
//     }
// }

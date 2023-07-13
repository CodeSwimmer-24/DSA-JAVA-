package DSA.Array.LeatCoad;

import java.util.Arrays;

public class Q1 {
    public static void main(String[] args) {
        // TODO
        int[] arr = new int[4];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        int newArr[] = null;
        newArr = new int[arr.length -2 ];
        for (int i = 1; i < arr.length -1; i++) {
            System.out.println(arr[i]);
                newArr[i-1] = arr[i];
        }
        System.out.println(Arrays.toString(newArr));
    }
}

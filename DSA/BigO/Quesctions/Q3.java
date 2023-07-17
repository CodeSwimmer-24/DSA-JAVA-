package DSA.BigO.Quesctions;

import java.util.Arrays;

class Reverse {
    public void reverse(int arr[]) {
        for (int i = arr.length - 1; i >= 0; i--) {
            // System.out.println(arr[i]);
            int temp = arr[i];
            System.out.println(temp);
        }
        // for (int i = 0; i < arr.length / 2; i++) {
        // int other = arr.length - i - 1;
        // int temp = arr[i];
        // arr[i] = arr[other];
        // arr[other] = temp;
        // }
        // System.out.println(Arrays.toString(arr));
    }
}

public class Q3 {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        Reverse r = new Reverse();
        r.reverse(arr);
    }
}

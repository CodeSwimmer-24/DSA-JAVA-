package LeatCode;

import java.util.Arrays;

public class RemoveRepeat {
    public static void main(String[] args){
        int arr[] = {1,2,2,3,3,4};
        int temp[] = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] == arr[j]){
                     arr[i]= -1;
                }
            }
        }
        for(int i=0; i<arr.length; i++){
            if(arr[i] != -1){
             System.out.println(arr[i]);
                temp[i] = arr[i];
                System.out.println(Arrays.toString(temp));
            }
        }
        System.out.println(Arrays.toString(temp));
    }
}

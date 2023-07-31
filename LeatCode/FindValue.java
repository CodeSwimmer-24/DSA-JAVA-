package LeatCode;

public class FindValue {
    public static void main(String[] args){
        int arr[] = {11,12,13,14,15,16,17,18};
        int input = 1;

        for(int i = 0; i <= arr.length; i++){
           if(i == input-1){
            System.out.println(arr[i]);
           }
        }
    }
}

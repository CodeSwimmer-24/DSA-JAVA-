package LeatCode;

class LargestNumber{
    int temp ,size;
    public void slarge(int arr[]){
        size = arr.length;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
               if(arr[i] > arr[j]){
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
               }
            }
        }
        System.out.println(arr[arr.length-2]);
    }
}

public class FindSecoundLargestNumber {
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5,6,11,8,12,1,22,19,98,26,67};
        LargestNumber largest = new LargestNumber();
        largest.slarge(arr);
    }
}

package DSA.Array.LeatCoad;

class Permutation{
    public void per(int arr1[], int arr2[]){
        int sum1 = 0;
        int sum2 = 0;
        for(int i = 0; i < arr1.length; i++){
            sum1 += arr1[i];
        }
        for(int i = 0; i < arr2.length; i++){
            sum2 += arr2[i];
        }
        if(sum1 == sum2){
            System.out.println("Permutation");
        } else{
            System.out.println("Not Permutation");
        }
    }
}

public class Q8 {
    public static void main(String[] args){
        int arr1[] = {1,2,3,4,5,6};
        int arr2[] = {2,3,4,5,6,1};

        Permutation per = new Permutation();
        per.per(arr1, arr2);
    }
}

package JAVA.Array;

public class Array {
    public static void main(String[] args) {
        // int num[][] = new int[3][4];

        //  for(int i =0;i<3;i++){
        //     for(int j =0;j<4;j++){
        //        num[i][j] = (int)(Math.random()*100);
        //     }
        // }

        // for(int i =0;i<3;i++){
        //     for(int j =0;j<4;j++){
        //         System.out.print(num[i][j]+ " ");
        //     }
        //     System.out.println();
        // }

        int nums[][] = new int[3][];

        nums[0] = new int[4];
        nums[1] = new int[3];  
        nums[2] = new int[2];  

        for(int i=0;i<nums.length;i++){
            for(int j=0;j < nums[i].length; j++){
                nums[i][j] = (int)(Math.random()*10);
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
    }
} 

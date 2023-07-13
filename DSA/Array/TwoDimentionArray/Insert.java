package DSA.Array.TwoDimentionArray;

import java.util.Arrays;

class TwoDimensionArray {
    int arr[][] = null;

    public TwoDimensionArray(int size1, int size2) {
        this.arr = new int[size1][size2];
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[0].length; col++) {
                arr[row][col] = 0;
            }
        }
    }

    public void insert(int row, int col, int value) {
        try {
            if (arr[row][col] == 0) {
                arr[row][col] = value;
                System.out.println("Value inserted Successfully");
            } else {
                System.out.println("This cell already occupied");
            }
        } catch (AbstractMethodError e) {
            System.out.println("Length is more than the size " + e);
        }
    }

    // Accessing the array values

    public void show(int row, int col) {
        try {
            System.out.println(arr[row][col]);
        } catch (Exception e) {
            System.out.println("Not a valid row or column");
        }
    }

    // Traversing the array values

    public void traverse(){
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
    }

    // Searching 

    public void search(int val){
       for(int i=0; i<arr.length; i++) {
        for(int j=0; j<arr.length; j++){
            if(val == arr[i][j]){
                System.out.println("Row " + i + " Col "+ j);
            }
        }
       }
    } 

    public void Delete(int row, int col){
        try{
            System.out.println("successfully deleted " + row + " " + col);
            arr[row][col] = -22333820;
        } catch(Exception e){
            System.out.println("Not a valid row or a col");
        }
    }
}

public class Insert {
    public static void main(String arg[]) {
        TwoDimensionArray newArr = new TwoDimensionArray(3, 3);
        newArr.insert(0, 0, 11); 
        newArr.insert(0, 1, 4);
        newArr.insert(1, 0, 1);
        newArr.insert(1, 1, 32);

        newArr.show(1, 1);

        newArr.traverse(); 

        newArr.search(32);

        newArr.Delete(1, 1);

        System.out.println(Arrays.deepToString(newArr.arr));
    }
}

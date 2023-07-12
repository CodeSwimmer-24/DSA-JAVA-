package DSA.Array;

class SingleDimensionArray {

    int arr[] = null;

    public SingleDimensionArray(int sizeOfArray) {
         arr = new int[sizeOfArray];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.MIN_VALUE;
        }
    }

    public void insert(int location, int valueToBeInserted) {
        try {
            if (arr[location] == Integer.MIN_VALUE) {
                arr[location] = valueToBeInserted;
                System.out.println("Value inserted Successfully");
            } else {
                System.out.println("This cell already occupied");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Length is more than the size "+ e);
        }

    }
}  

public class SingleDimentionArray {
    public static void main(String[] args){
        SingleDimensionArray sda = new SingleDimensionArray(10);
        sda.insert(0, 50);
        sda.insert(1, 30);
        sda.insert(2, 10);
        sda.insert(1, 20);
        sda.insert(14, 30);

        // Accessing the array

        int firstElement = sda.arr[1];
        System.out.println(firstElement);
    }  
}

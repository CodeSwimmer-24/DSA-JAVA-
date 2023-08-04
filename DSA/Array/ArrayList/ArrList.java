package ArrayList;
import java.util.*;

public class ArrList {
    public static void main(String[] args){
        // Inserting a value into an array List

        ArrayList<Integer> a = new ArrayList<Integer>(Arrays.asList(12,12,34));
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4,20);
        System.out.println(a);

        // Accessing a value from an array

        System.out.println(a.get(2));

        // Traversing a value from an array
        
        // 1. for loop
        for (int i = 0; i< a.size() ; i++){
            System.out.println(a.get(i));
        }

        // 2. for each loop

        for (int e : a){
            System.out.println(e);
        }

        // 3. Iterator 

        Iterator<Integer> i = a.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }


        // Searching for values in the  array

        for(int e : a){
            if(e == 34){
                System.out.println("found");
            }
        }
        // indexOf
        int index = a.indexOf(34);
        System.out.println("index found at " + index);

        // Delete the values from the array
        a.remove(2);
        System.out.println(a);
    }
}
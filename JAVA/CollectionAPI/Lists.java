package JAVA.CollectionAPI;

import java.util.ArrayList;
import java.util.List;

// import java.util.Collection;
import javax.xml.transform.Source;

public class Lists {

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<Integer>();

        nums.add(5);
        nums.add(4);
        nums.add(3);

        System.out.println(nums.get(1));

        for(int i = 0; i< nums.size() ; i++) {
            System.out.println(nums.get(i));
        }
        
    }
}

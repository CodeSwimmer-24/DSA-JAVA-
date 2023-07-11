package JAVA.CollectionAPI;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {
    public static void main(String[] args) {

        // Set doesn't repeat the same value twice


        // Set<Integer> nums = new HashSet<Integer>();

        // TreeSet is use for storing the values
        Set<Integer> nums = new TreeSet<Integer>();

        nums.add(5);
        nums.add(4);
        nums.add(3);
        nums.add(3);
        nums.add(4);

        // System.out.println(nums.get(1));

        for (int n : nums) {
            System.out.println(n);
        }

    }
}

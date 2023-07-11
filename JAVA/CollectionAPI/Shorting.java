package JAVA.CollectionAPI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Students {
    int age;
    String name;

    public Students(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return name + " " + age;
    }

}

public class Shorting {
    public static void main(String[] args) {

        // Comparator<String> com = new Comparator<String>(){
        // public int compare(String i, String j) {
        // if(i.length() > j.length()) return 1;
        // else return -1;
        // }
        // };

        // List<String> nums = new ArrayList<String>();

        // nums.add("Fahad");
        // nums.add("Rashid");
        // nums.add("Boy");

        // Collections.sort(nums,com);
        // System.out.println(nums);

        // Shorting by age

        Comparator<Students> com = new Comparator<Students>() {
            public int compare(Students i, Students j) {
                if (i.age > j.age)
                    return 1;
                else
                    return -1;
            }
        };

        List<Students> nums = new ArrayList<Students>();

        nums.add(new Students(10, "Fahad"));
        nums.add(new Students(20, "Rashid"));
        nums.add(new Students(30, "Fahad"));

        Collections.sort(nums, com);
        System.out.println(nums);

        for (Students student : nums) {
            System.out.println(student);
        }

    }
}

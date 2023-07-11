package JAVA.CollectionAPI;

import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        Map<Integer, String> students = new HashMap();

        students.put(1, "Fahada");
        students.put(4, "Fahada");
        students.put(3, "Fahada Mahmood");
        students.put(2, "Fahada");

        System.out.println(students.get(3));

        for(int key : students.keySet()){
            System.out.println(key + " " + students.get(key));
        }
    }
}

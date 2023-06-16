package JAVA.Objects;

class Students {
    int rollNo;
    String name;
    int marks;
}

// Array of an object

public class Object {
    public static void main(String[] args) {
        Students s1 = new Students();
        s1.rollNo = 12;
        s1.name = "Fahada";
        s1.marks = 23;

        Students s2 = new Students();
        s2.rollNo = 12;
        s2.name = "Rashid";
        s2.marks = 23;

        Students s3 = new Students();
        s3.rollNo = 12;
        s3.name = "Khalid";
        s3.marks = 23;
        // System.out.println(s1.name);
        Students arr[] = new Students[3];
        arr[0] = s1;
        arr[1] = s2;
        arr[2] = s3;

        // for(int i=0; i< arr.length; i++) {
        //     System.out.println(arr[i].name);
        // }

        for(Students n : arr){
            System.out.println(n.name);
        }
    }
}

package JAVA.JAVA1;

public class Learn {
    public static void main(String a[]) {

        //  Variable Diclerations
        int n1 = 5;
        float n2 = 3.4f;
        double n3 = n1 + n2;   // Literals 
        String name = "Kahafa" ;
        char name1 = 'n';
        boolean abc = true ;

        // Type Conversion

        byte by = 127;
        int in = (byte)by;

        int in1 = 12;
        byte in2 = (byte) in1;

        float fl = 1.23f;
        int ni = (int) fl;    

        int ff = 12;
        int result = ++ff;


        int oa = 1;
        int ob = 2;
        int oaa = 3;
        int obb = 4;

        boolean rez = oa < ob || oaa > obb;

        int gv = 10;
        int gv1 = 7;

        // if(gv > gv1)
            // System.out.println(gv);
            // else 
            // System.out.println(gv1);

        int n = 20;
        int r = 0;

        // if(n%2 ==0 ){
        //     r = 10;
        //     System.out.println("Even");
        // }else {
        //       r = 20;
        //       System.out.println("Odd");
        // }

        r= n%2 == 0 ? 10 : 20;
        System.out.println(r);
    }
} 

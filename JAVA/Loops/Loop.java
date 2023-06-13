package JAVA.Loops;

public class Loop {
    public static void main(String[] args) {
        // int i = 1;
        // while (i <= 4) {
        //     System.out.println("Hii" + i);
        //     int j = 0;
        //     while (j < 3) {
        //         System.out.println("Hello" + j);
        //         j++;
        //     }
        //     i++;
        // }

        // For Loop

        for(int i=0; i<5; i++){
            System.out.println("Days"+i);
            for(int j=0; j<9; j++) {
                System.out.println("Hours"+ " " +(j+8) +" - "+ (j+9));
            }
        }
    }
}

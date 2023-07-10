package JAVA.Lamda;

@FunctionalInterface
interface Car {
   int show(int i, int j );
}

// public class Lam {
//     public static void main(String[] args) {
//         Car car = new Car(){
//             public int show(int i, int j) {
//                 // System.out.println("in show" + " " + i);
//                 return i + j;
//             }
//         };
//        int result = car.show(5,6);
//        System.out.println(result);
//     }
// }

// -----Lamda Function-------

public class Lam {
    public static void main(String[] args) {
        Car car = (int  i, int j) -> {
            return i+j;
        };
       int result = car.show(5, 6);
       System.out.println(result);
    }
}
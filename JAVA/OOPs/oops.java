// package JAVA.OOPs;

// class Calculator {
//     public int add(int n1, int n2) {
//         int r = n1 + n2;
//         return r;
//     }
// }

// public class oops {
//     public static void main(String[] args){
//         int num1 = 4;
//         int num2 =5;

//         Calculator cal = new Calculator();
//       int result =   cal.add(num1, num2);

//         System.out.println(result);
//     }
// }


package JAVA.OOPs;

class Computer {
    public void music(){
        System.out.println("Music");
    }
    public String pen(int  value){
        if(value < 5){
            return "Nothing";
        }
       return "Pen";
    }
} 

public class oops {
    public static void main(String[] args){
        Computer obj = new Computer();
        obj.music();
       String val =  obj.pen(2);
       System.out.println(val);
    }
}

package JAVA.Super;

class A extends Object {

    public A() {
        System.out.println("inside A");
    }

    public A(int n) {
        System.out.println("inside A int");
    }
}

// Super

// class B extends A {

//     public B() {
//         super(5);
//         System.out.println("inside B");
//     }

//     public B(int n) {
//         super(5);
//         System.out.println("inside B int");
//     }

// }

// This method
class B extends A {

    public B() {
        super();
        System.out.println("inside B");
    }

    public B(int n) {
        // super();
        this();
        System.out.println("inside B int");
    }

}

public class Super {
    public static void main(String[] args){
        B obj = new B(5);
    }
}

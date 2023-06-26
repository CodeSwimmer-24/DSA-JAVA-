package JAVA.Inheritance;

class AdvanceCal extends Object {
    public int mul(int a, int b) {
      return a * b;   
    }
}

class Calc extends AdvanceCal {
    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }
}


public class Inheritance {
    public static void main(String[] args) {
        Calc obj = new Calc();
        int addAms = obj.add(1, 1);
        int subAms = obj.sub(5, 1);
        int mulAms = obj.mul(5, 1);
        System.out.println(addAms + " " + subAms + " " + mulAms);
    }

}

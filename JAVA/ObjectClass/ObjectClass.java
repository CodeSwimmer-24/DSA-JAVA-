package JAVA.ObjectClass;


class Laptop{
    int price;
    String name;

    public String toString() {
        return "Hey";
    }

    public boolean equals(Laptop otherModel){
        // System.out.println(that);
        if(this.price == otherModel.price){
            return true;
        }else return false;
    }
}

public class ObjectClass {
    public static void main(String[] args) {
        Laptop obj = new Laptop();
        obj.name = "MACBOOK";
        obj.price = 1000;


        Laptop obj1 = new Laptop();
          obj1.name = "MACBOOK";
          obj1.price = 1000;

         boolean result =  obj.equals(obj1);
        // toString() is a default method but be overwrite it by our method
        System.out.println(obj.toString());
        System.out.println(result);
    }
}

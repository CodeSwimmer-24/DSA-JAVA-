package JAVA.Constructor;

class Computer {
    int age;
    String name;

    // Normal constructor
    public Computer() {
        age = 10;
        name = "Not Faked";
    }

    // Parameters Constructor
    public Computer(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}

public class Constructor {
    public static void main(String[] args) {

        Computer obj = new Computer();
        Computer consObj = new Computer();
        Computer consObj1 = new Computer(13,"Fahad Mahm");
        obj.setName("Fake");
        consObj.getAge();

        System.out.println(obj.getName());
        System.out.println(consObj.getName());
         System.out.println(consObj1.getName());
    }

}

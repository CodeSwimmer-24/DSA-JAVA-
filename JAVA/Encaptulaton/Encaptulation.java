package JAVA.Encaptulaton;

class Human {
   private  String name;
   private  int age;

    public void  setAge(int age){
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }

   public String getName(){
    return name;
   }

    public int getAge(){
    return age;
   }

}

public class Encaptulation {
    public static void main(String[] args){

        Human obj = new Human();

        obj.setAge(20);
         obj.setName("Fahad");

        System.out.println(obj.getAge());
    }
}

package JAVA.Interface;


// -----------Abstract---------------------------

// abstract class Computer{
//   public abstract void code();
// }

// class Laptop extends Computer{
//     public void code(){
//         System.out.println("Laptop...");
//     }
// }

// class Desktop extends Computer{
//     public void code(){
//         System.out.println("Desktop...");
//     }
// }

// class Developer{
//     public void code(Computer comp){
//         comp.code();
//     }
// }

// -----------Interface--------------------------

interface Computer{
  public abstract void code();
}

class Laptop implements Computer{
    public void code(){
        System.out.println("Laptop...");
    }
}

class Desktop implements Computer{
    public void code(){
        System.out.println("Desktop...");
    }
}

class Developer{
    public void code(Computer comp){
        comp.code();
    }
}


public class Interface {
    public static void main(String[] args){
       
        Laptop laptop = new Laptop();
        Desktop desktop = new Desktop();

        Developer dev = new Developer();
        dev.code(desktop);
    }
}

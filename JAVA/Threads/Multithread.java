package JAVA.Threads;

class A implements Runnable{
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Fahad");

            // For let thread toi wait we use sleep

            try{
                Thread.sleep(10);
            } catch(InterruptedException e){
                e.printStackTrace();
            };
        }
    }
}

class B implements Runnable{
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Maryam");

            // For let thread toi wait we use sleep

            try{
                Thread.sleep(10);
            } catch(InterruptedException e){
                e.printStackTrace();
            };
        }
    }
}

public class Multithread {
    public static void main(String[] args){
        Runnable obj1 = new A();
        Runnable obj2 = new B();
        
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
    }
    
}

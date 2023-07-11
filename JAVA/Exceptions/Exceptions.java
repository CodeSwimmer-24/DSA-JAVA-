package JAVA.Exceptions;

public class Exceptions {
    public static void main(String[] args) {
        int i = 6;
        int j = 2;
        int num[] = new int [5]; 
        String s = null;
        try{
            int k = i/j;
            System.out.println(k);
            System.out.println(num[4]);
            System.out.println(s.length());
        }
        catch(ArithmeticException e){
            System.out.println("Arthmatic Error...");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array Error...");
        }
        catch(StringIndexOutOfBoundsException e){
            System.out.println("String Error...");
        }
        catch(Exception e){
            System.out.println("Exception");
        }
    }
}

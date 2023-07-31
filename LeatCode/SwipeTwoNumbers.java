package LeatCode;

class Swipe{
    public void Swipe(int x, int y){
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println(x + " " + y);
    }
}

public class SwipeTwoNumbers {
    public static void main(String[] args){
        Swipe twoNumbers = new Swipe();
        twoNumbers.Swipe(10, 5);
    }
}

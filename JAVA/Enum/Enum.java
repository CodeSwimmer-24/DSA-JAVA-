package JAVA.Enum;

enum Laptop {
    MacBook(2000), Hp(1000), Del(1500);

    int price;

    Laptop(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

public class Enum {
    public static void main(String[] args) {
        // Laptop[] lap = Laptop.values();
        // System.out.println(lap);

        // for (Laptop lap : Laptop.values()) {
        //     System.out.println(lap);
        // }

        Laptop lap = Laptop.MacBook;
        lap.setPrice(12000);
        System.out.println(lap.getPrice());  
    }
}

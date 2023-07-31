package LeatCode;

public class Palandrom {
    static char original;
    static char newName;

    public static void main(String[] args) {
        String arr = "Fahad";
        for (int i = 0; i < arr.length(); i++) {
            original = arr.charAt(i); //
        }
        for (int j = arr.length() - 1; j >= 0; j--) {
            newName = arr.charAt(j);
        }
        if (original == newName) {
            System.out.println("Palandrom");
        } else {
            System.out.println("Not Palandrom");
        }
    }
}

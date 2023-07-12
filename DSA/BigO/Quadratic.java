package DSA.BigO;

class Num {
    public void muntiply(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                System.out.println(i+ " "+ j);
            }

        }
    }
}

public class Quadratic {
    public static void main(String[] args) {
        Num nums = new Num();
        nums.muntiply(2);
    }
}

package LeatCode;

class Occurrence {

    public void occ(int n, int d) {
      {
    int count = 0;
 
    // Loop to find the digits of N
    while (n > 0)
    {
        if(n % 10 == d){
            count = count + 1;
        } 
        n = n / 10;
    }
 
    // return the count of the
    // occurrences of D in N
    System.out.println(count);
}
 
    }
}

public class Occurrences {
    public static void main(String[] args) {
        Occurrence occ = new Occurrence();
        int d = 2;
        int n = 214215421;
        occ.occ(n, d);
    }
}

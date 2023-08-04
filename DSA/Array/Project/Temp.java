package Project;

import java.util.Arrays;
import java.util.Scanner;


class DaysTemp {
    public void enterDays(int noOfDays) {
        int arr[] = null;
        int tempArray[] = new int[noOfDays];
        int sum = 0;
        double average = 0.0;
        arr = new int[noOfDays];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Please enter day " + (i + 1) + " temp");
            Scanner input = new Scanner(System.in);
            int daysTemp = input.nextInt();
            // System.out.println(daysTemp + "..........");
            tempArray[i] = daysTemp;
            sum += daysTemp;
        }
        average = sum / noOfDays;
        System.out.println("Average Temp: " + average);
        // System.out.println(Arrays.toString(tempArray));

        // Count days above average

        int aboveDays = 0;
        for (int i = 0; i < tempArray.length; i++) {
            if (tempArray[i] > average) {
                aboveDays = aboveDays + 1;
            }
        }
        System.out.println("Above Days: " + aboveDays);
    }
}

public class Temp {
    public static void main(String[] args) {
        System.out.println("Please enter how many days temp ?");
        Scanner input = new Scanner(System.in);
        int days = input.nextInt();
        // System.out.println(days);

        DaysTemp temp = new DaysTemp();
        temp.enterDays(days);
    }
}

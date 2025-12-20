package Basic_Programs;

import java.util.Scanner;

public class Program_2 {
    public static void main(String[] args) {
        // Find the compound interest
        // CI = P(1+R/100)^t

        Scanner input = new Scanner(System.in);
        int principle = input.nextInt();
        double rate = input.nextDouble();
        int time = input.nextInt();

        double compound = principle * Math.pow((1+(rate/100)), time);
        System.out.println("The compound interest is : "+compound);
    }
}

package Day2_19122025;

import java.util.Scanner;

public class Program_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if(n > 0) System.out.println("Positive Number");
        else if(n < 0) System.out.println("Negative number");
        else System.out.println("The given number is 0");
    }
}

package Day2_19122025;

import java.util.Scanner;

public class Program_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // WAJP to check whether the given number is divisible by 7 or not.
        System.out.print("Enter a number to check for divisibility by 7 : ");
        int num1 = input.nextInt();
        if(num1 % 7 == 0) System.out.println("The given number is divisible by 7");
        else System.out.println("The number is not divisible by 7");
    }
}

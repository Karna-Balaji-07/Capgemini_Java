package Day2_19122025;

import java.util.Scanner;

public class Program_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // WAJP to find whether the given number is even or odd using if conditional
        System.out.print("Enter a number to check for even and odd :  ");
        int n = input.nextInt(); // takes integer input
        if(n % 2 == 0) System.out.println("Even number");
        if(n % 2 != 0) System.out.println("Odd number");
        // If else conditional
        if(n % 2 == 0) System.out.println("Even number");
        else System.out.println("Odd number");
    }
}

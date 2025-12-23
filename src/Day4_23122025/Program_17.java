package Day4_23122025;

import java.util.Scanner;

public class Program_17 {
    public static void main(String[] args) {
        // factorial of a number
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int fact = 1;
        for (int i = 2; i < n+1; i++) {
            fact *= i;
        }
        System.out.println("Factorial of "+n+" is "+fact);
    }
}

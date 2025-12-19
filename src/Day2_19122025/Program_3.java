package Day2_19122025;

import java.util.Scanner;

public class Program_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // WAJP to check whether the given number is divisible by both 3 and 5 or not.
        System.out.print("Enter a number of check divisibility by both 3 and 5");
        int num2 = input.nextInt();
        if(num2 % 3 == 0 && num2 % 5 == 0) System.out.println("The given number is divisible by 3 and 5 : ");
        else System.out.println("The number is not divisible by 3 and 5");
    }
}

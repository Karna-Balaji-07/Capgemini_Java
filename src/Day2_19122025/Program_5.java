package Day2_19122025;

import java.util.Scanner;

public class Program_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // WAJP to check whether the given character is digit or not.
        System.out.println("Enter a charcter to check whether the character is digit or not : ");
        char d = input.next().charAt(0); //
        if( Character.isDigit(d)) System.out.println("The given character is a digit");
        else System.out.println("THe character is not a digit");
    }
}

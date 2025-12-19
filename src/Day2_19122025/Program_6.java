package Day2_19122025;

import java.util.Scanner;

public class Program_6 {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        System.out.print("Enter a character : ");
        char c = input.next().charAt(0);
        // WAJP to check whether the given character is uppercase, lowercase, digit, special character
        if(Character.isUpperCase(c)) System.out.println("The given character is in Uppercase");
        else if(Character.isLowerCase(c)) System.out.println("The given character is in Lowercase");
        else if(Character.isDigit(c)) System.out.println("The given character is a Digit");
        else System.out.println("The given character is a special character");

    }
}

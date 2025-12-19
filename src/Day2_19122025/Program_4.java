package Day2_19122025;

import java.util.Scanner;

public class Program_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // WAJP to check whether the given character is vowel or consonant.
        System.out.print("Enter a character to check for vowel and consonant : ");
        char c = input.next().toLowerCase().charAt(0); // takes a string as an input. Converts it to lowercase. gets the first character of that string..thus eventually taking character as an input
        if(c == 'a' || c == 'e' || c=='i' || c=='o'||c=='u') System.out.println("The given character is a vowel");
        else System.out.println("The given consonant is a consonant");
    }
}

package Day2_19122025;

import java.util.Scanner;

public class Program_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char c = input.next().charAt(0);
        if(Character.isLowerCase(c)){
            if(c=='a' || c=='e'|| c=='i'||c=='o'||c=='u'){
                System.out.println("The given character is Lowercase Vowel");
            }
            else{
                System.out.println("The given character is lowercase consonant");
            }
        }
        else{
            if(c=='A' || c=='E' ||c=='I'|| c=='O' || c=='U'){
                System.out.println("The given character is Uppercase vowel");
            }
            else{
                System.out.println("The given character is Uppercase Consonant");
            }
        }
    }
}

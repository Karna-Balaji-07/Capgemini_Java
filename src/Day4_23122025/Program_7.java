package Day4_23122025;

import java.util.Scanner;

public class Program_7 {
    public static void main(String[] args) {
        /*
        *   WAP to check the given character is
uppercase vowel
uppercase consonant
lowercase vowel
lowercase consonant
if the given character is uppercase vowel, print numbers from the range 10 to 20 using
do while loop
if the given character is lowercase vowel, print numbers from the range -10 to -20
using while loop
if the given character is uppercase consonant, print numbers from the range 25 to 15
using for loop
if the given character is lowercase consonant, print numbers from the range -25 to -15
using for loop
        * */

        Scanner input = new Scanner(System.in);
        char c = input.nextLine().charAt(0);
        // uppercase vowel
        if((Character.isUpperCase(c)) && (c=='A'|| c=='E' || c=='I' || c=='O'||c=='U')){
            int i = 10;
            do{
                System.out.print(i+" ");
                i++;
            }while(i < 21);
        }
        // Lowercase vowel
        else if((Character.isLowerCase(c)) && (c=='a'|| c=='e' || c=='i' || c=='o'||c=='u')){
            int j = -10;
            while (j > -21){
                System.out.print(j+" ");
                j--;
            }
        }
        // uppercase consonant
        else if((Character.isUpperCase(c)) && (c!='A'|| c!='E' || c!='I' || c!='O'||c!='U')){
            for (int i = 25; i >14 ; i--) {
                System.out.print(i+" ");
            }
        }

        // lowercase consonant
        else if((Character.isLowerCase(c)) && (c!='a'|| c!='e' || c!='i' || c!='o'||c!='u')){
            for (int i = -25; i <-14 ; i++) {
                System.out.print(i+" ");
            }
        }

    }
}

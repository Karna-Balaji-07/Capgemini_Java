package Day3_20122025;

import java.util.Scanner;

public class Program_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // students Grades using switch case

        char c = input.next().toUpperCase().charAt(0);
        switch (c){
            case 'A' :
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Good");
                break;
            case 'C':
                System.out.println("Fair");
                break;
            case 'D':
                System.out.println("Pass");
                break;
            case 'E':
                System.out.println("Fail");
                break;
            default:
                System.out.println("Enter valid Grade please");
                break;

        }
    }
}


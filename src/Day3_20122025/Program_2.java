package Day3_20122025;

import java.util.Scanner;

public class Program_2 {
    public static void main(String[] args) {
        // Leap year
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();
        if( ((year % 4 == 0) && (year % 100 != 0) )|| (year % 400 == 0)) System.out.println("Leap year");
        else System.out.println("Not leap year");
    }
}

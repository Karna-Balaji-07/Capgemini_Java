package Day4_23122025;

import java.util.Scanner;

public class Program_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = input.nextInt();
        for (int n = 1; n < i+1; n++) {
            if(n % 3 == 0 && n % 5 == 0) System.out.println("FizzBuzz");
            else if(n % 3 == 0 && n % 5 != 0) System.out.println("Fizz");
            else if( n % 3 != 0 && n % 5==0) System.out.println("Buzz");
            else System.out.println(n);
        }
    }
}

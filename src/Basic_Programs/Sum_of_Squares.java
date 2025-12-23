package Basic_Programs;

import java.util.Scanner;

public class Sum_of_Squares {
    public static void main(String[] args) {
        // SUm of squares of n natural numbers

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int sum =0 ;
        for (int i = 1; i < n+1; i++) {
            sum += Math.pow(i,2);
        }
        System.out.println("Sum of squares of natural numbers : "+sum);
    }
}

package Basic_Programs;

import java.util.Scanner;

public class Nth_term_AP {
    public static void main(String[] args) {
        // Find the nth term of an AP using first 2 terms
        Scanner input = new Scanner(System.in);
        int a1 = input.nextInt();
        int a2 = input.nextInt();
        int d = a2-a1;
        int n = input.nextInt();
        int nth = a1 + (n-1)*d;
        System.out.println(nth);
    }
}

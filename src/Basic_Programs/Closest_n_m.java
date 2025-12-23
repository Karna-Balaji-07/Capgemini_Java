package Basic_Programs;

import java.util.Scanner;

public class Closest_n_m {
// Find the number that is closest to m and is diisible by n
    public static int solution1(int m, int n){
        while(m > 0){
            if(m % n == 0) return m;
            m--;
        }
        return -1;
    }

    public static int solution2(int m, int n){
        int rem = m % n;
        return m - rem;
    }

    public static void main(String[] args) {
        // Find the closest to m and n
        // Divisible by n and closest to n
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();

        System.out.println("Closest of m and divisible by n : "+ solution1(m,n));
        System.out.println("Closest of m and divisible by n : "+ solution2(m,n));

    }
}

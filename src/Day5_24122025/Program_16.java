package Day5_24122025;

import java.util.Scanner;

// Abundant numbers : sum of proper factors is greater than the given number
public class Program_16 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int n = input.nextInt();
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if(n % i == 0) sum+=i;
        }
        if(sum > n) System.out.println(1);
        else System.out.println(0);
    }
}

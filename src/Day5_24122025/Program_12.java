package Day5_24122025;

import java.util.Scanner;

// Niven number : the given number is divisible by the sum of the digits
public class Program_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = n;
        int sum = 0;
        while(n>0){
            int r = n % 10;
            sum += r;
            n /= 10;
        }
        System.out.println(sum);
        System.out.println(m % sum == 0);
    }

}

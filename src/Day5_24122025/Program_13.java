package Day5_24122025;

import java.util.Scanner;

// Print factorial of all digits
public class Program_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        while(n > 0){
            int r = n % 10;
            int fact= 1;
            for (int i = 1; i <= r; i++) {
                fact *= i;
            }
            System.out.print(fact+" ");
            n /= 10;
        }
    }
}

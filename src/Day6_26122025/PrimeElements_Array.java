package Day6_26122025;

import java.util.Scanner;

// Find all the prime numbers in an array
public class PrimeElements_Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        for (int i : arr){
            if(i <= 1) continue;
            boolean flag = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if(i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if(flag) System.out.print(i+" is prime");
            System.out.println();

        }
    }
}

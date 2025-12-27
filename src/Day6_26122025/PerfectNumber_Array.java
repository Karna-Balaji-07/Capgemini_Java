package Day6_26122025;

import java.util.Scanner;

// Find all the perfect numbers in the array
public class PerfectNumber_Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        // Finding the factors

        for(int i : arr){
            int sum = 0;
            for (int j = 1; j < i; j++) {
                if(i % j == 0) sum += j;
            }
            if(sum == i) System.out.print(i+" is a perfect number");
            System.out.println();
        }
    }
}

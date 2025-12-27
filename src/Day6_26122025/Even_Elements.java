package Day6_26122025;

import java.util.Scanner;

// Print all the even elements in the array
public class Even_Elements {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        for(int i : arr){
            if(i % 2 == 0) System.out.print(i+" ");
        }
    }
}

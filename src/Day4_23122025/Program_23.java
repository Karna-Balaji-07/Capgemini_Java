package Day4_23122025;

import java.util.Scanner;

public class Program_23 {
    public static void main(String[] args) {
        // 53. Write a program to print the first n numbers in the Fibonacci sequence.
        //	0, 1, 1, 2, 3, 5, 8, 13, ...

        int a = 0;
        int b = 1;
        Scanner input= new Scanner(System.in);
        int n = input.nextInt();
        System.out.print(a+ " "+ b+ " ");
        for (int i = 0; i <n ; i++) {
            int temp = a+b;
            a = b;
            b = temp;
            System.out.print(temp+" ");
        }
    }
}

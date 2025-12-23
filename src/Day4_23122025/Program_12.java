package Day4_23122025;

import java.util.Scanner;

public class Program_12 {
    public static void main(String[] args) {
        // print the factors of a given number
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.print("Factors of "+n+" are ");
        for (int i = 1; i <n+1 ; i++) {
            if(n %i == 0) System.out.print(i+" ");
        }
    }
}

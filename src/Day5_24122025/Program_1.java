package Day5_24122025;
// Print each digits of a number

import java.util.Scanner;

public class Program_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        while(n > 0){
            int r = n % 10;
            System.out.print(r+" : ");
            n /= 10;
        }
    }
}

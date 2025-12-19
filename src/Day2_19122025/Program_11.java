package Day2_19122025;

import java.util.Scanner;

public class Program_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        if(a < b && a < c) System.out.println(a+" is the minimum number");
        else if(b < c) System.out.println(b+" is the minimum number");
        else System.out.println(c+" is the miniimum number");
    }
}

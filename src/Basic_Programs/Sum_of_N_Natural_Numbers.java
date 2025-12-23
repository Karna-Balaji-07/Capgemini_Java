package Basic_Programs;

import java.util.Scanner;

public class Sum_of_N_Natural_Numbers {

    public static int sum1(int n){
        int sum =0;
        for (int i = 1; i < n+1; i++) {
            sum += i;
        }
        return sum;
    }

    public static int sum2(int n){
        int sum = (n * (n+1)) /2;
        return sum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println("Sum of "+n+" natural numbers are : "+ sum1(n));
        int m = input.nextInt();
        System.out.println("Sum of "+m+" natural numbers are : "+sum2(n));

    }
}

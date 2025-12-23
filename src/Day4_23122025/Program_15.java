package Day4_23122025;

import java.util.Scanner;

public class Program_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n= input.nextInt();
        int sum = 0;
        for (int i = 1; i <n ; i++) {
            if(n % i == 0) sum+= i;
            System.out.println(sum);
        }
        if(sum == n) System.out.println("Perfect number");
        else System.out.println("Not a perfect number");
    }
}

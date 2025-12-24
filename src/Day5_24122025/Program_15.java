package Day5_24122025;

import java.util.Scanner;

// palindrome number
public class Program_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n= input.nextInt();
        int rev = 0;
        int m = n;
        while(n>0){
            int r =n % 10;
            rev = rev*10 + r;
            n /= 10;
        }
        System.out.println(m==rev);
    }
}

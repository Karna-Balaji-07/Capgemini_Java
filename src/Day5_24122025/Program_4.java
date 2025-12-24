package Day5_24122025;

import java.util.Scanner;

// sum of all digits
public class Program_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int sum = 0;
        while(n>0){
            int r = n % 10;
            sum += r;
            n /= 10;
        }
        System.out.println(sum);
    }
}

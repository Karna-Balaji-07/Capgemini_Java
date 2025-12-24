package Day5_24122025;

import java.util.Scanner;

// check whether the given number is special or not
public class Program_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = n;
        int sum = 0;
        int prod= 1;
        while(n > 0){
            int r = n % 10;
            sum += r;
            prod *= r;
            n /= 10;
        }
        System.out.println(sum);
        System.out.println(prod);
        int result = sum + prod;
        if(result == m) System.out.println(m+" is a special number");
        else System.out.println("Not special number");
    }
}

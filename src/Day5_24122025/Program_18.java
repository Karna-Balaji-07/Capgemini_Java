package Day5_24122025;

import java.util.Scanner;

public class Program_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = n;
        int first = n;
        int count = 0;
        while(n!=0){
            n/=10;
            count++;
        }
        int sum = 0;

        while(m!=0){
            int r = m % 10;
            sum += Math.pow(r,count);
            count--;
            m /= 10;
        }
        System.out.println(sum==first);
    }
}

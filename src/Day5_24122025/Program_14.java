package Day5_24122025;

import java.util.Scanner;

// strong number or not
public class Program_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int sum = 0;
        int m = n;
        while(n > 0){
            int r = n % 10;
            int fact= 1;
            for (int i = 1; i <= r; i++) {
                fact *= i;
            }
            System.out.print(fact+" ");
            sum += fact;
            n /= 10;
        }
        System.out.println(sum==m);
    }
}

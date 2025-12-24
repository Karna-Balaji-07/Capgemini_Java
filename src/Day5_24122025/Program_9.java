package Day5_24122025;

import java.util.Scanner;

public class Program_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m = input.nextInt();
        int n = m;
        int max = Integer.MIN_VALUE;
        while(m>0){
            int r = m % 10;
            if(r > max) max = r;
            m /= 10;
        }
        int max2 = Integer.MIN_VALUE;
        while(n != 0){
            int r = n % 10;
            if(r > max2 && r < max) max2 = r;
            n /= 10;
        }
        System.out.println("Smallest digit : "+max2);
    }
}

package Day5_24122025;

import java.util.Scanner;

public class Program_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m = input.nextInt();
        int n = m;
        int min = Integer.MAX_VALUE;
        while(m>0){
            int r = m % 10;
            if(r < min) min = r;
            m /= 10;
        }
        int min2 = Integer.MAX_VALUE;
        while(n != 0){
            int r = n % 10;
            if(r < min2 && r > min) min2 = r;
            n /= 10;
        }
        System.out.println("Smallest digit : "+min2);
    }
}

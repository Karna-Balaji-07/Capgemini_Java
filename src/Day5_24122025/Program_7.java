package Day5_24122025;

import java.util.Scanner;

public class Program_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int max = Integer.MIN_VALUE;
        while(n>0){
            int r = n % 10;
            if(r > max) max = r;
            n /= 10;
        }
        System.out.println("Smallest digit : "+max);
    }
}

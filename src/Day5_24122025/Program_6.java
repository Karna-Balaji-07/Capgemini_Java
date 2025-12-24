package Day5_24122025;

import java.util.Scanner;

// find smallest digit from the given number
public class Program_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int min = Integer.MAX_VALUE;
        while(n>0){
            int r = n % 10;
            if(r < min) min = r;
            n /= 10;
        }
        System.out.println("Smallest digit : "+min);
    }
}

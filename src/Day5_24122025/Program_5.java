package Day5_24122025;

import java.util.Scanner;

//  sum of all even digits and odd digits and their product
public class Program_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int prod=1;
        int even=0, odd=0;
        while(n > 0){
            int r = n % 10;
            if(r % 2 == 0) even += r;
            else odd += r;
            n /= 10;

        }
        System.out.println(even * odd);
    }
}

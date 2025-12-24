package Day5_24122025;

import java.util.Scanner;

// print even digits of the given number
public class Program_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        while(n>0){
            int r = n % 10;
            if(r % 2 == 0) System.out.print(r+" ");
            n /= 10;
        }
    }
}

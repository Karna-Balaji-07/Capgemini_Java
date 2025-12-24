package Day5_24122025;

import java.util.Scanner;

public class Program_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int last = n % 10;
        int first=n;
        while(first >= 10){
            first /= 10;
        }
        int sum = 0;
        int extreme= last + first;
        while(n != 0){
            int r = n % 10;
            if(r != first && r != last ){
                sum += r;
            }
            n /= 10;
        }
        if(sum == extreme) System.out.println(1);
        else System.out.println(0);
    }
}

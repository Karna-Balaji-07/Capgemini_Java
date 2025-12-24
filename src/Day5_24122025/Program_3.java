package Day5_24122025;

import java.util.Scanner;

// Print prime digits of a number
public class Program_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        while(n > 0){
            int r = n % 10;
            if(r <= 1) continue;
            boolean flag= true;
            for (int i = 2; i <= Math.sqrt(r); i++) {
                if(r % i == 0){
                    flag = false;
                    break;
                }
            }
            if(flag) System.out.print(r+" ");
            n /= 10;
        }
    }
}

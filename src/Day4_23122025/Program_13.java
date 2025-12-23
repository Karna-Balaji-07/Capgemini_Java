package Day4_23122025;

import java.util.Scanner;

public class Program_13 {
    public static void main(String[] args) {
        // check whether the given number is Prime number or not
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if(n <= 1) {
            System.out.println("Neither prime nor composite");
            return;
        }
        boolean flag = true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0){
                flag = false;
                break;
            }
        }
        if(flag) System.out.println("Prime number");
        else System.out.println("Composite number");
    }
}

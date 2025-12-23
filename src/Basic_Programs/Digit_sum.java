package Basic_Programs;

import java.util.Scanner;

public class Digit_sum {
    public static void main(String[] args) {
        // find the sum of digits
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int temp = num;
        int sum = 0;
        while(temp > 0){
            int rem = temp % 10;
            sum += rem;
            temp /= 10;
        }
        System.out.println(sum);
    }
}

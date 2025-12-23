package Basic_Programs;

import java.util.Scanner;

public class Java_Loops_II {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int n = input.nextInt();

        int curr = a+b;
        System.out.print(curr + " ");
        for (int i = 1; i < n; i++) {
            curr += Math.pow(2,i)*b;
            System.out.print(curr+" ");
        }
    }
}

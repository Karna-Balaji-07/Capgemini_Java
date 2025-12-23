package Basic_Programs;

import java.util.Scanner;

public class Multiplication_Table {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 1; i < 11; i++) {
            System.out.println(n+" x " + i+ " = "+ n*i);
        }
    }
}

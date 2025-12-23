package Basic_Programs;

import java.util.Scanner;

public class Dice_Problem {
    public static void main(String[] args) {
        // Find the opposite face to the given input
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int res = 6 - n + 1;
        System.out.println(res);
    }
}

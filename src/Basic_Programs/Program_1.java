package Basic_Programs;

import java.util.Scanner;

public class Program_1 {
    public static void main(String[] args) {
        // find the perimeter of the rectangle
        Scanner input = new Scanner(System.in);
        int length = input.nextInt();
        int breadth = input.nextInt();
        int perimeter = 2*(length+breadth);
        System.out.println("Permiter of rectangle = "+perimeter);
    }
}

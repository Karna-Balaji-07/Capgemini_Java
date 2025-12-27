package Day5_24122025;

import java.util.Scanner;

public class AreaCalculator {
    public static int calculateArea(int side){
        return side * side;
    }
    public static double calculateArea(double radius){
        return 3.1 * Math.pow(radius,2);
    }
    public static int calculateArea(int length, int breadth){
        return length * breadth;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double radius = input.nextDouble();
        int side = input.nextInt();
        int length = input.nextInt();
        int breadth = input.nextInt();
        System.out.println(calculateArea(side));
        System.out.println(calculateArea(radius));
        System.out.println(calculateArea(length, breadth));
    }
}

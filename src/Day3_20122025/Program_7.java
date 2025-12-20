package Day3_20122025;

import java.util.Scanner;

public class Program_7 {
    public static void main(String[] args) {
        // find the area of circle, rectangle, square, triangle
        Scanner input = new Scanner(System.in);
        System.out.print("Enter shape to calculate its area : ");
        String shape = input.nextLine().toLowerCase();
        switch (shape){
            case "circle":
                System.out.println("Enter radius of circle : ");
                int radius = input.nextInt();
                double carea = 3.14 * Math.pow(radius,2);
                System.out.println("Area of Circle is "+carea);
                break;
            case "rectangle":
                System.out.println("Enter dimensions of rectangle : ");
                int length = input.nextInt();
                int breadth = input.nextInt();
                int rarea = length * breadth;
                System.out.println("Area of rectangle : "+rarea);
                break;
            case "triangle":
                System.out.println("Enter Height and base of triangle : ");
                int height = input.nextInt();
                int base = input.nextInt();
                double tarea = 0.5 * height * base;
                System.out.println("Area of triangle : "+tarea);
                break;
            case "square":
                System.out.println("Enter side of square : ");
                int side = input.nextInt();
                int sarea = side * side;
                System.out.println("Area of square : "+sarea);
                break;
        }
    }
}

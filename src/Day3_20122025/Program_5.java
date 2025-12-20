package Day3_20122025;

import java.util.Scanner;

public class Program_5 {
    public static void main(String[] args) {

// WAJP to perform arithmatic operation using switch and user choice ....2,3,4 variables except for division for 2 variables

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Arithmetic Operation ( add, subtract, multiply, division : ");
        String user = input.nextLine().toLowerCase();
        switch (user){
            case "add":
                System.out.print("Enter no. of variables to add : ");
                int variables1 = input.nextInt();
                int sum1 = 0;
                System.out.println("Enter values for addition : ");
                for (int i = 0; i < variables1; i++) {
                    int value = input.nextInt();
                    sum1 += value;
                }
                System.out.println("Addition of "+variables1+" variables are : "+sum1);
                break;

            case "subtract":
                System.out.print("Enter no. of variables to subtract : ");
                int variables2 = input.nextInt();
                System.out.println("Enter values for subtraction : ");
                int diff = input.nextInt();
                for (int i = 0; i < variables2-1; i++) {
                    int value = input.nextInt();
                    diff -= value;
                }
                System.out.println("Subtraction of "+variables2+" variables are : "+diff);
                break;

            case "multiply":
                System.out.print("Enter no. of variables to multiply : ");
                int variables3 = input.nextInt();
                int prod = 1;
                System.out.println("Enter values for multiplication : ");
                for (int i = 0; i < variables3; i++) {
                    int value = input.nextInt();
                    prod *= value;
                }
                System.out.println("Multiplication of "+variables3+" variables are : "+prod);
                break;

            case "division":
                System.out.println("Enter two values for division : ");
                int a = input.nextInt();
                int b = input.nextInt();
                int div = a / b;
                System.out.println("Division of two values : "+div);
                break;
        }
    }
}

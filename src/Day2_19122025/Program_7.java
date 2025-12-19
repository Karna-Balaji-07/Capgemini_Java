package Day2_19122025;

import java.util.Scanner;

public class Program_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Marks obtained : ");
        int marks = input.nextInt();
        if(marks >=90 && marks <= 100) System.out.println("Grade A");
        else if(marks >=75 && marks < 90) System.out.println("Grade B");
        else if(marks >= 60 && marks < 75) System.out.println("Grade C");
        else if(marks >= 40 && marks < 60) System.out.println("Grade D");
        else if(marks < 40) System.out.println("Failed");
        else System.out.println("Invalid marks");
    }
}


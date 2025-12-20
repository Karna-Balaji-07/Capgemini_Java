package Day3_20122025;

import java.util.Scanner;

public class Program_3 {
    public static void main(String[] args) {

        // Fruits if else if based problems
        Scanner input = new Scanner(System.in);
        String fruit = input.next().toLowerCase();
        if(fruit.equals("apple")) System.out.println("Apples are rich in fiber and vitamin C");
        else if(fruit.equals("banana")) System.out.println("Bananas are great source of potassium");
        else if(fruit.equals("mango")) System.out.println("Mangoes are the king of fruits");
        else if(fruit.equals("oranges")) System.out.println("Oranges are packed with vitamin C");
        else System.out.println("Sorry, I don't have information about that fruit");
    }
}

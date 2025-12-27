package Day7_27122025;

import java.util.Scanner;

public class Fitness_Tracker {
    static Scanner input = new Scanner(System.in);

    public static int inputSteps()
    {
        System.out.print("Enter total steps : ");
        int steps  = input.nextInt();
        return steps;
    }
    public static int inputWeight()
    {
        System.out.print("Enter body weight : ");
        int weight  = input.nextInt();
        return weight;
    }


    public static double calculateCalories(int steps){
        double calories = steps * 0.4;
        return calories;
    }
    public static double calculateCalories(int steps, double weight){
        double calories = steps * weight * 0.0005;
        return calories;
    }
    public static void Summanry(){
        int steps = inputSteps();
        System.out.println();
        int weight = inputWeight();
        System.out.println("Total steps : "+ steps);
        System.out.println("Calories burned : "+ calculateCalories(steps, weight));
    }

    public static void main(String[] args) {
        Summanry();
    }

}

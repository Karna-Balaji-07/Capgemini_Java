package Day3_20122025;

import java.util.Objects;
import java.util.Scanner;

public class Program_1 {
    public static void main(String[] args) {
        // WAJP to check the day and weekend or weekday

        Scanner input = new Scanner(System.in);
        String day = input.next().toLowerCase();
        if(Objects.equals(day, "monday") || Objects.equals(day, "tuesday") || Objects.equals(day, "wednesday") || Objects.equals(day, "thursday") || Objects.equals(day, "friday"))
            System.out.println("Weekday");
        else if(Objects.equals(day, "saturday") || Objects.equals(day, "sunday")) System.out.println("Weekend");
        else System.out.println("Invalid day");
    }
}

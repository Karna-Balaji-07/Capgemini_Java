package Day17_12012025;

import java.util.Scanner;

public class TryCatchException {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        try{
            System.out.print("Enter value for a: ");
            int a = input.nextInt();
            System.out.println("Enter value for b: ");
            int b = input.nextInt();
            int ans = a/b;
            System.out.println("Answer: "+ ans);
        }
        catch (Exception e){
            System.out.println("Catch block executed");
            e.printStackTrace();
            System.out.println("Handled");
        }
        finally {
            System.out.println("Finally block executed");
        }

    }
}

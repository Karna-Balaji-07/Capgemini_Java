package Day17_12012025;

import java.util.Scanner;

class NotEligibleException extends Exception
{
    public NotEligibleException(String string){
        System.out.println(string);
    }
}


public class ThrowThrows {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Age: ");
        int age = input.nextInt();
        try{
            eligibleVoting(age);
        } catch (NotEligibleException e) {
            e.printStackTrace();
        }

    }
    public static void eligibleVoting(int age) throws NotEligibleException{
        if(age >= 18) System.out.println("Eligible for voting");
        else throw new NotEligibleException("Not eligible for voting");

    }
}

/*

52. Write a Java method clockProblem(int input1, int input2) that simulates a 12-hour analog clock.

	Problem Requirements
	input1 represents the current hour position on a clock (1–12).
	input2 represents the number of jumps/multiplication factor.
	Multiply input1 and input2 to calculate the movement.
	The clock should always stay within 1 to 12.
	If the calculated value exceeds 12, it should wrap around using clock logic.
	If the final calculated position becomes 0, it must be treated as 12.

 */

package Day4_23122025;

import java.util.Scanner;

public class Program_22 {

    public static int clockProblem(int input1, int input2){
        int prod = input1 * input2;
        if(prod > 12) prod %= 12;

        if(prod==0) return 12;
        else return prod;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int input1 = input.nextInt();
        int input2 = input.nextInt();
        int result = clockProblem(input1, input2);
        System.out.println(result);
    }
}

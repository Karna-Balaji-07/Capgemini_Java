package Day4_23122025;

public class Program_19 {
    public static void main(String[] args) {
        // factorials of all odd numbers from 10 to 1
        for (int i = 9; i >= 1 ; i-=2) {
            int fact = 1;
            for (int j = 1; j < i+1; j++) {
                fact *= j;
            }
            System.out.println("Factorial of "+ (i) +" is "+fact);
        }
    }
}

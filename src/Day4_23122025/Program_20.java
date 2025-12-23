package Day4_23122025;

public class Program_20 {
    public static void main(String[] args) {
        // factorial of all prime numbers from range 14 to 5
        for (int i = 14; i > 4; i--) {
            boolean flag = true;
            for (int j = 2; j <= Math.sqrt(i) ; j++) {
                if(i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if(flag){
                int fact=1;
                for (int j = 1; j <= i; j++) {
                    fact *= j;
                }
                System.out.println("Factorial of Prime Number "+ i +" is : "+ fact);
            }
        }
    }
}

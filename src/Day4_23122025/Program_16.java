package Day4_23122025;



public class Program_16 {
    public static void main(String[] args) {
        // Print perfect numbers in range 1 to 100
        for (int i = 1; i < 101; i++) {
            int sum  =0;
            for (int j = 1; j < i; j++) {
                if(i % j == 0) sum += j;
            }
            if(sum == i) System.out.print(i+" ");
        }
    }
}

package Day5_24122025;


// print special numbers from the range 1 to 100
public class Program_11 {
    public static void main(String[] args) {


        for (int i = 1; i < 100; i++) {
            int n = i;
            int sum = 0;
            int prod= 1;
            while(n > 0){
                int r = n % 10;
                sum += r;
                prod *= r;
                n /= 10;
            }
            if(sum+prod == i) System.out.print(i+" ");
        }
    }
}

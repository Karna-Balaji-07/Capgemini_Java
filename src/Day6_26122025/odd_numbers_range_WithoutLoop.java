package Day6_26122025;
// print all odd numbers from range 500 to 50 without loop
public class odd_numbers_range_WithoutLoop {

    public static void solution1(int n){
        if(n < 50) return;
        if(n % 2 == 1) System.out.println(n);
        solution1(--n);
    }

    public static void solution2(int n){
        if(n == 500) return;
        solution2(++n);
        if(n % 2 != 0) System.out.println(n);
    }



    public static void main(String[] args) {
        solution2(50);
    }

}

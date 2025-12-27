package Day6_26122025;
// Find the sum of all numbers in range 1 t0 5 without loops
public class Sum_of_numbers_WIthoutLoops {
    public static int solution1(int n){
        if(n== 5) return 5;
        return n + solution1(++n);
    }

    public static int solution2(int n){
        if(n ==1) return 1;
        return n + solution2(--n);
    }

    public static void main(String[] args) {
        System.out.println(solution2(5));
    }
}

package Day6_26122025;

// Print numbers from 1 to 1000 without using loops

public class Print_1_1000_Without_Loops {
    public static void solution(int n){
        if(n < 1) return;
        solution(n-1);
        System.out.println(n);
    }

    public static void solution2(int n){
        if(n > 1000) return;
        System.out.println(n);
        solution(++n);

    }

    public static void main(String[] args) {
        int n = 1000;
        solution(n);
    }
}

package Day7_27122025;

public class Program {

    public static void soluiton(int first, int second, int n, int k){
        System.out.print(first +" "+ second+ " ");
        for (int i = 0; i < 10; i++) {
            int sum = first+second;
            int res = sum * k;
            first = second;
            second = res;
            System.out.print(second+" ");
        }
    }
    public static void solution(int first, int second, int n, int k){
        if(n <= 0) return;
        System.out.println(second+" ");
        solution(second, (first+second)*k, n-1,k);
    }

    public static void main(String[] args) {
        int first = 1;
        int second = 2;
        int k = 2;
        int n = 10;
        soluiton(first, second, n,k);
        solution(first, second, n,k);
    }

}

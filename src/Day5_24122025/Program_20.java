package Day5_24122025;

public class Program_20 {

    public static int findMax(int a, int b, int c){
        int max = Integer.MIN_VALUE;
        if(a > b && a > c) max = a;
        else if(b > c) max = b;
        else max = c;

        return max;
    }

    public static boolean isPrime(int n){
        boolean flag = true;
        if(n <= 1) return false;
        for(int i = 2; i<= Math.sqrt(n); i++){
            if(n % i ==0 ){
                flag = false;
                break;
            }
        }
        return flag;
    }

    public static int findMin(int a, int b, int c){
        int min = Integer.MAX_VALUE;
        if(a < b && a < c) min = a;
        else if(b < c) min = b;
        else min = c;

        return min;
    }

    public static int fibonacci(int n){
        int first = 0;
        int second = 1;
        for (int i = 0; i < n; i++) {
            int third = first+second;
            first = second;
            second = third;

        }
        return first;
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 4;
        int c = 21;
        int d = 55;
        System.out.println(findMax(a,b,c));
        System.out.println(findMin(b,c,d));
        System.out.println(isPrime(d));
        System.out.println(fibonacci(a));
    }

}

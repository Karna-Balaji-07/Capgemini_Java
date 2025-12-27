package Day6_26122025;
// Reverse Each elements
public class ReverseElements_array {
    public static int reverse(int n){
        int rev = 0;
        while(n > 0){
            int r = n % 10;
            rev = rev * 10 + r;
            n /= 10;
        }
        return rev;
    }

    public static void solution(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int rev = reverse(arr[i]);
            arr[i] = rev;
        }
        for(int i : arr){
            System.out.print(i+" ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {123,456,789};
        solution(arr);
    }
}

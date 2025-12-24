package Array;
// sum of all subarrays
public class Subarray_sum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int n = arr.length;
        int result = 0;
        for (int i = 0; i < n; i++) {
            result += arr[i] * (n-i) * (i+1);

        }
        System.out.println(result);
    }
}

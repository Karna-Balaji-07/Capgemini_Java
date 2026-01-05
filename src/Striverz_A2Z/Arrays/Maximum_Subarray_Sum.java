package Striverz_A2Z.Arrays;
// Kadane's algorithm : maximum subarray sum in an array
public class Maximum_Subarray_Sum
{
    public static int solution1(int[] arr)
    {
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for(int i : arr){
            sum += i;
            max = Math.max(max, sum);
            if(sum < 0) sum = 0;
        }
        return max;
    }

    public static int solution2(int[] arr)
    {
        int sum = arr[0];
        int max = arr[0];
        for(int i = 1; i < arr.length; i++){
            sum = Math.max(sum+arr[i], arr[i]);
            max = Math.max(sum, max);
        }
        return max;

    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 5, -2, 7, -4 };
        System.out.println(solution1(arr));
        System.out.println(solution2(arr));
    }
}

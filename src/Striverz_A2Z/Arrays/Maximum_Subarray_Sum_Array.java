package Striverz_A2Z.Arrays;
// Find the array whose sum is the maximum subarray sum in the array
public class Maximum_Subarray_Sum_Array
{
    public static void solution1(int[] arr)
    {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        int start = 0;
        int ansStart = -1;
        int ansEnd = -1;
        for(int i = 0;i < arr.length; i++){
            if(sum == 0) start = i;
            sum += arr[i];
            if(sum > max){
                max = sum;
                ansStart = start;
                ansEnd = i;
            }
            if(sum < 0) sum = 0;

        }
        for(int i = ansStart; i<= ansEnd; i++) System.out.print(arr[i]+" ");
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 5, -2, 7, -4};
        solution1(arr);
    }
}

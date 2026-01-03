package Striverz_A2Z.Arrays;

import java.util.HashMap;

// Find the longest subarray who sum is equal to k
public class Longest_Subarray_Sum_K {

    public static int solution1(int[] arr, int k)
    {
        int prefix = 0;
        int result = 0;
        HashMap<Integer, Integer> dicts = new HashMap<>();
        for(int i = 0; i < arr.length ; i++)
        {
            prefix += arr[i];
            if(prefix == k) result = i+1;

            else if(dicts.containsKey(prefix-k)) result = Math.max(result, i - dicts.get(prefix-k));
            if(! dicts.containsKey(prefix)) dicts.put(prefix,i);
        }
        return result;
    }

    public static int solution2(int[] arr, int k)
    {
        int n = arr.length;
        int right = 0;
        int left = 0;
        int sums = arr[0];
        int maxLen = Integer.MIN_VALUE;
        while(right < n)
        {
            while(left <= right && sums > k){
                sums -= arr[left];
                left++;
            }
            if(sums == k) maxLen = Math.max(maxLen, right-left+1);
            right++;
            if(right < n) sums += arr[right];
        }
        return maxLen;
    }

    public static void main(String[] args) {
        int[] arr = {10, 5, 2, 7, 1, 9};
        int k = 15;
        System.out.println(solution1(arr, k));
        System.out.println(solution2(arr,k));
    }

}

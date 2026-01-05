package Striverz_A2Z.Arrays;

import java.util.HashMap;

// Count the number of subarrays whose sum is equal to k
public class Count_Subarray_Sum
{
    public static int solution1(int[] arr, int k)
    {
        HashMap<Integer, Integer> dicts = new HashMap<>();
        int prefix = 0;
        int result = 0;
        for(int i : arr){
            prefix += i;
            if(prefix == k) result++;
            if(dicts.containsKey(prefix-k)){
                result += dicts.get(prefix-k);
            }

                dicts.put(prefix, dicts.getOrDefault(prefix,0)+1);

        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 2};
        int k = 3;
        System.out.println(solution1(arr,k));

    }
}

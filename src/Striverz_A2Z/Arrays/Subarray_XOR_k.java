package Striverz_A2Z.Arrays;

import java.util.HashMap;

// Count the number of subarrays whose XOR is equal to K
public class Subarray_XOR_k
{
    public static int solution1(int[] arr, int k){
        int n = arr.length;
        int count =0 ;
        HashMap<Integer, Integer> dicts = new HashMap<>();
        dicts.put(0,1);
        int prefix = 0;
        for (int i = 0; i < n; i++) {
            prefix ^= arr[i];
           int target = prefix ^  k;
            if(target == k) count++;
            else if(dicts.containsKey(target)) count += dicts.get(target);
            dicts.put(prefix, dicts.getOrDefault(prefix,0)+1);
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {4,2,2,6,4};
        int k = 6;
        System.out.println(solution1(arr,k));
    }
}

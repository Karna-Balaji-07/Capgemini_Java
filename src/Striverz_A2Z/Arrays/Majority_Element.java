package Striverz_A2Z.Arrays;

import java.util.HashMap;
import java.util.Map;

// Find the majority element which appears more than n/2 tims;
public class Majority_Element {

    public static int solution1(int[] arr)
    {
        int n = arr.length;
        HashMap<Integer, Integer> dicts = new HashMap<>();
        for(int i : arr)
        {
            dicts.put(i,dicts.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Integer, Integer> entry : dicts.entrySet()){
            if(entry.getValue() > n/2 ) return entry.getKey();
        }
        return -1;

    }

    public static void main(String[] args) {
        int[] arr = {2,2,1,1,1,2,2};
        System.out.println(solution1(arr));
    }

}

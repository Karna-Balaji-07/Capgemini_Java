package Array;

import java.util.HashMap;
import java.util.Map;

// Return the element that occurs only once
public class Unique_Numbers_1 {

    public static int solution1(int[] arr){
        HashMap<Integer, Integer> dicts= new HashMap<>();
        for(int i : arr){
            dicts.put(i, dicts.getOrDefault(i,0)+1);
        }
        int result = 0;
        for(Map.Entry<Integer, Integer> num : dicts.entrySet() ){
            if(num.getValue() == 1) result = num.getValue();
        }
        return -1;
    }
}

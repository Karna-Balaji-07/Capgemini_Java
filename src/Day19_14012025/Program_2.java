package Day19_14012025;

import java.util.*;
// using the iterator to remove odd elements from the list
public class Program_2 {
    public static void main(String[] args) {
        
        int[] nums = {10,21,23,24,26,47,34,67,12,11,16,29,35};
        List<Integer> arr = new ArrayList<>();
        for(int i : nums) arr.add(i) ;

        Iterator<Integer> itr = arr.iterator();
        while(itr.hasNext()){
            int i = itr.next();
            if(i % 2 != 0) itr.remove();
        }
        System.out.println(arr);
    }
}

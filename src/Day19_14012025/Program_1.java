package Day19_14012025;
        // remove all odd objects from the given list

import java.util.*;
public class Program_1 {
    public static void main(String[] args) {
        int[] nums = {10,21,23,24,26,47,34,67,12,11,16,29,35};
        List<Integer> arr = new ArrayList<>();
        for(int i : nums) arr.add(i) ;

        for(int i = 0; i < arr.size(); i++){
            if(arr.get(i) % 2 != 0){
                arr.remove(i);
                i--;
            }
        }
        System.out.println(arr);
    }
}

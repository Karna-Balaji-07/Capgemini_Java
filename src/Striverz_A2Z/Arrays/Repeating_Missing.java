package Striverz_A2Z.Arrays;
// Find the repeating and missing numbers
import java.util.*;
public class Repeating_Missing
{
    public static void solution1(int[] arr){
        HashMap<Integer, Integer> dicts = new HashMap<>();
        ArrayList<Integer> result= new ArrayList<>();
        for(int i = 0; i <arr.length;i++){
            dicts.put(arr[i], dicts.getOrDefault(arr[i],0)+1);
        }
        for(Map.Entry<Integer, Integer> entry : dicts.entrySet()){
            if(entry.getValue() > 1) result.add(entry.getKey());

        }
        for(int i=1;i <= arr.length;i++){
            if(!dicts.containsKey(i)) result.add(i);
        }
        for(int i : result) System.out.print(i+" ");
    }

    public static void main(String[] args) {
        int[] arr = {6,3,4,5,1,1};
        solution1(arr);
    }
}

package Striverz_A2Z.Arrays;

import java.util.ArrayList;

import java.util.HashMap;
import java.util.Map;

// return the elements whose count is  greater than n/3 times
public class Majority_Element_II
{
    public static ArrayList<Integer> solution(int[] arr)
    {
        int n = arr.length;
        HashMap<Integer, Integer> dicts = new HashMap<>();
        for(int i : arr){
            dicts.put(i, dicts.getOrDefault(i,0)+1);
        }
        ArrayList<Integer> result = new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry : dicts.entrySet()){
            if(entry.getValue() > n/3) result.add(entry.getKey());
        }
        return result;
    }

    public static ArrayList<Integer> solution2(int[] arr)
    {
        int count1 = 0;
        int count2 = 0;
        int ele1 = 0;
        int ele2= 1;
        for(int i : arr){
            if(i == ele1) count1++;
            else if(i == ele2) count2++;
            else if(count1 == 0 ) {
                ele1 = i;
                count1 = 1;
            }
            else if(count2 == 0){
                ele2 = i;
                count2 = 1;
            }
            else{
                count1--;
                count2--;
            }
        }

        for(int i: arr){
            if(i == ele1) count1++;
            else if(i == ele2) count2++;
        }
        ArrayList<Integer> result = new ArrayList<>();
        if(count1 > arr.length/3)  result.add(ele1);
        if(count2 > arr.length/3) result.add(ele2);
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1,2};
        for(int i : solution(arr)) System.out.print(i+" ");
    }
}

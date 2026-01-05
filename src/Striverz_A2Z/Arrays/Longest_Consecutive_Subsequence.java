package Striverz_A2Z.Arrays;

import java.util.*;

//  Find the longest consecutive subsequence in an array
public class Longest_Consecutive_Subsequence
{
    public static int solution1(int[] arr){
        Arrays.sort(arr);
        int longest = 0;
        int count = 1;
        int last = arr[0];
        for(int i = 1; i < arr.length;i++){
            if(arr[i] == last) continue;
            else if(arr[i]== last+1){
                count++;
                last = arr[i];
            }
            else{
                longest = Math.max(longest, count);
                count = 1;
                last = arr[i];
            }
        }
        longest = Math.max(count, longest);
        return longest;

    }

    public static int solution2(int[] nums) {
        if (nums.length == 0) return 0;

        ArrayList<Integer> arr = new ArrayList<>();
        for (int x : nums) arr.add(x);

        Collections.sort(arr);

        int count = 1;
        int result = 1;

        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i) == arr.get(i - 1)) {
                continue; // ignore duplicates
            }
            else if (arr.get(i) == arr.get(i - 1) + 1) {
                count++;
            }
            else {
                result = Math.max(result, count);
                count = 1;
            }
        }

        return Math.max(result, count);
    }

    public static int solution3(int[] nums)
    {
        HashSet<Integer> set = new HashSet<>();
        for(int i : nums) set.add(i);
        int longest = 0;

        for(int i : set)
        {
            System.out.println(i);
            if(!set.contains(i-1)){
                int current = i;
                int count = 1;
                while(set.contains(current+1)){
                    current++;
                    count++;
                }
                longest = Math.max(longest, count);
            }


        }
        return longest;
    }


    public static void main(String[] args) {
        int[] arr = { 3, 7, 2, 5, 8, 4, 6, 0, 1,0,2,0,5};
        int[] nums = {100, 4, 200, 1, 3, 2};
        System.out.println(solution1(arr));
        System.out.println(solution3(arr));
    }
}

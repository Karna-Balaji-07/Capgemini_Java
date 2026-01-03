package Striverz_A2Z.Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

// return true or false if there exists a pair whose sum is equal to the target
// return the indices of the pair whose sum is equal to the target
public class Two_sum
{
    public static boolean solution1(int[] arr, int target)
    {
        Arrays.sort(arr);
        int left = 0;
        int right = arr.length-1;
        while(left < right){
            if(arr[left]+arr[right] == target) return true;
            else if(arr[left] + arr[right] > target) right--;
            else left++;
        }
        return false;
    }

    public static boolean solution2(int[] arr, int target)
    {
        HashSet<Integer> set = new HashSet<>();
        for(int i : arr){
            int curr = target - i;
            if (set.contains(curr)) return true;
            set.add(i);
        }
        return false;
    }

    public static int[] solution3(int[] arr, int target)
    {
        Arrays.sort(arr);
        int left = 0;
        int right = arr.length-1;
        while(left < right){
            if(arr[left]+arr[right] == target) return new int[] {left, right};
            else if(arr[left] + arr[right] > target) right--;
            else left++;
        }
        return new int[]{-1,-1};
    }

    public static int[] solution4(int[] arr, int target)
    {
        HashMap<Integer, Integer> dicts = new HashMap<>();
        for(int i = 0; i < arr.length;i++)
        {
            int curr = target - arr[i];
            if(dicts.containsKey(curr)) {
                return new int[] {dicts.get(curr),i};
            }
            if(!dicts.containsKey(curr)) dicts.put(arr[i], i);
        }
        return new int[] {-1,-1};
    }


    public static void main(String[] args) {
        int[] arr = {2,6,5,8,11};
        int target = 14;
        System.out.println(solution1(arr, target));
        System.out.println(solution2(arr, target));
        int[] result1 = solution3(arr, target);
        int[] result2 = solution4(arr, target);
        for(int i : result1) System.out.print(i+" ");
        for(int i : result2) System.out.print(i+" ");

    }
}

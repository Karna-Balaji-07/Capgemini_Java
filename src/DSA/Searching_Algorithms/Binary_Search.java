package DSA.Searching_Algorithms;

import java.util.Arrays;

// Binary search
public class Binary_Search {
    public static boolean binary(int[] arr, int target){
        int low =0 ;
        int high= arr.length-1;
        while (low <= high)
        {
            int mid = (low+high) / 2;
            if(arr[mid] == target) return true;
            else if(arr[mid] > target) high = mid-1;
            else low = mid+1;
        }
        return false;
    }

    public static void binary2(int[] arr, int target)
    {
        int result;
        result = Arrays.binarySearch(arr, target);
        System.out.println(result);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6,7,8,9};
        int target = 4;
        System.out.println(binary(arr, target));
        binary2(arr, target);
    }
}

package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Reverse_Array {

    public static void reverse1(int[] arr){
        int left = 0;
        int right = arr.length-1;
        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public static void reverse2(int[] arr){
        int n = arr.length;
        for (int i = 0; i < arr.length/2; i++) {
            int temp = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1] = temp;
        }
    }

    public static void reverse3(List<Integer>arr){
        Collections.reverse(arr);
    }

    public static void main(String[] args) {
        // Reverse an array
        int[] arr = {1,2,3,4,5,6,7,8};
        reverse1(arr);
        for(int i : arr){
            System.out.print(i+" ");
        }

        System.out.println();

        List<Integer> arrs = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8));
        reverse3(arrs);
        for(int i = 0; i < arrs.size();i++){
            System.out.print(arrs.get(i)+" ");
        }
    }
}

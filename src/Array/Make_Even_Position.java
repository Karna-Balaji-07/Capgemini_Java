package Array;

import java.util.ArrayList;
import java.util.Collections;

// Rearrange array such that even positioned are greater than odd position
public class Make_Even_Position {

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void solution1(int[] arr){
        for(int i=1; i < arr.length;i++){
            if((i+1) % 2 == 0){
                if(arr[i] < arr[i-1]) swap(arr,i, i-1);
            }
            else{
                if(arr[i] > arr[i-1]) swap(arr,i,i-1);
            }
        }
    }

    public static ArrayList<Integer> solution2(ArrayList<Integer> arr){
        int n = arr.size();
        for(int i = 1;i < n ; i++){
            if((i+1) % 2 == 0){
                if(arr.get(i) < arr.get(i-1)) Collections.swap(arr,i,i-1);
            }
            else if(arr.get(i) > arr.get(i-1)) Collections.swap(arr, i, i-1);
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,2,1};
        solution1(arr);
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
}

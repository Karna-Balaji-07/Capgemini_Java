package Array;

import java.util.ArrayList;
import java.util.Collections;

public class Leaders_array {

    public static void solution1(int[] arr){
        int max = arr[arr.length-1];
        System.out.print(arr[arr.length-1]+" ");
        for (int i = arr.length-2; i >= 0 ; i--) {
            if(arr[i] > max){
                System.out.print(arr[i]+" ");
                max = arr[i];
            }
        }
    }

    public static ArrayList<Integer> solution2(int[] arr){
        ArrayList<Integer> result = new ArrayList<>();
        int max = arr[arr.length-1];
        result.add(max);
        for (int i = arr.length-2; i >=0 ; i--) {
            if(arr[i] >max){
                result.add(arr[i]);
                max = arr[i];
            }
        }
        Collections.reverse(result);
        return result;

    }

    public static void main(String[] args) {
        // Leaders in an array
        int[] arr = {16, 17, 4, 3, 5, 2};
        solution1(arr);
        System.out.println();
        ArrayList<Integer> result = solution2(arr);
        for(int i : result){
            System.out.print(i+" ");
        }

    }
}

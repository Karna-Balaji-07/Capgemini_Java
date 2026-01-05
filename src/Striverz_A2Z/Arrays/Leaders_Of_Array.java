package Striverz_A2Z.Arrays;

import java.util.ArrayList;
import java.util.Collections;

// Find the leaders in an array
public class Leaders_Of_Array
{
    public static int[] solution1(int[] arr)
    {
        ArrayList<Integer> result = new ArrayList<>();
        int n = arr.length;
        result.add(arr[n-1]);
        int max = arr[n-1];
        for(int i = n-2; i>= 0; i--){
            if(arr[i] > max){
                max = arr[i];
                result.add(max);
            }
        }
        Collections.reverse(result);
        int m = result.size();
        int[] arrs = new int[m];
        for(int i = 0;i<m;i++){
            arrs[i] = result.get(i);
        }
        return arrs;
    }

    public static void main(String[] args) {
        int[] arr = {10,22,12,3,6,0};
        for(int i : solution1(arr)) System.out.print(i+" ");
    }

}

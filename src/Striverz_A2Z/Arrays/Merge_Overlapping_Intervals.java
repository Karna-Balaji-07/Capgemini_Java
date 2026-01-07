package Striverz_A2Z.Arrays;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Merge overlapping intervals
public class Merge_Overlapping_Intervals {

    public static int[][] solution(int[][] arr){
        int n = arr.length;
        Arrays.sort(arr,(a,b)->a[0]-b[0]);
        List<int[]> result = new ArrayList<>();
        int[] current = arr[0];
        for(int i = 1; i< n; i++){
            if(arr[i][0] <= current[1]) current[1] = Math.max(current[1], arr[i][1]);
            else {
                result.add(current);
                current = arr[i];
            }
        }
        result.add(current);
        return result.toArray(new int[result.size()][]);

    }

    public static void main(String[] args) {
        int[][] arr = {{1,3},{2,6},{8,10},{15,18}};
        int[][] merged = solution(arr);

        for (int[] i : merged) {
            System.out.println(i[0] + " " + i[1]);
        }
    }

}

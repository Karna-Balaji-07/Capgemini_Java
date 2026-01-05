package Striverz_A2Z.Arrays;
// 3 Sum problem : Find the triplet whose sum is equal to 0 and it should not contain duplicate triplets;
import java.util.*;

public class Triplet_Sum_Problem {
    public static ArrayList<ArrayList<Integer>> solution1(int[] arr) {
        Arrays.sort(arr);
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        int n = arr.length;
        for (int i = 0; i < n - 2; i++) {
            if (i > 0 && arr[i] == arr[i - 1]) continue;
            int j = i + 1;
            int k = n - 1;
            while (j < k) {
                ArrayList<Integer> curr = new ArrayList<>();
                int sum = arr[i] + arr[j] + arr[k];
                if (sum == 0) {
                    curr.add(arr[i]);
                    curr.add(arr[j]);
                    curr.add(arr[k]);
                    result.add(curr);
                    while (j < k && arr[j] == arr[j + 1]) j++;
                    while (j < k && arr[k] == arr[k - 1]) k--;
                    j++;
                    k--;
                } else if (sum > 0) k--;
                else j++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {-1,0,1,2,-1,-4};
        System.out.println(solution1(arr));
    }
}

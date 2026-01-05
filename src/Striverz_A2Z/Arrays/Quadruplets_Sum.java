package Striverz_A2Z.Arrays;

import java.util.ArrayList;
import java.util.Arrays;

// 4 sum problem
public class Quadruplets_Sum {
    public static ArrayList<ArrayList<Integer>> solution1(int[] arr, int target) {

        Arrays.sort(arr);
        int n = arr.length;
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        for (int i = 0; i < n - 3; i++) {

            if (i > 0 && arr[i] == arr[i - 1]) continue;

            for (int j = i + 1; j < n - 2; j++) {

                if (j > i + 1 && arr[j] == arr[j - 1]) continue;

                int a = j + 1;
                int b = n - 1;

                while (a < b) {
                    int sum = arr[i] + arr[j] + arr[a] + arr[b];

                    if (sum == target) {
                        ArrayList<Integer> curr = new ArrayList<>();
                        curr.add(arr[i]);
                        curr.add(arr[j]);
                        curr.add(arr[a]);
                        curr.add(arr[b]);
                        result.add(curr);

                        while (a < b && arr[a] == arr[a + 1]) a++;
                        while (a < b && arr[b] == arr[b - 1]) b--;

                        a++;
                        b--;
                    } else if (sum > target) {
                        b--;
                    } else {
                        a++;
                    }
                }
            }
        }
        return result;
    }


    public static void main(String[] args) {
        int[] arr = {1, 0, -1, 0, -2, 2};
        System.out.println(solution1(arr, 0));
    }
}

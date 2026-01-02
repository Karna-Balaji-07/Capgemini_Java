package DSA.Hashing;

import java.util.HashMap;

public class Two_Pointers {

    public static int[] solution(int[] arr, int target) {
        HashMap<Integer, Integer> dicts = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int diff = target - arr[i];

            if (dicts.containsKey(diff)) {
                return new int[]{dicts.get(diff), i};
            }

            dicts.put(arr[i], i);
        }

        return new int[]{-1, -1}; // no pair found
    }

    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 9};
        int target = 9;
        int[] result = solution(arr, target);
        System.out.println(result[0] + " " + result[1]);
    }
}

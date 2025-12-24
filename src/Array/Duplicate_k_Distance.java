package Array;

// Find the duplicate within k distance

import java.util.HashSet;

public class Duplicate_k_Distance {

    public static boolean solution1(int[] arr,int k){
        HashSet<Integer> s = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if(s.contains(arr[i])) return true;
            s.add(arr[i]);
            if(i >= k) s.remove(arr[i-k]);
        }
        return false;

    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,1,4,5,2,3,1};
        System.out.println(solution1(arr,3));
    }
}

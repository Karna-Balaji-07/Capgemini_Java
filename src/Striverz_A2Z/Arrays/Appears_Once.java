package Striverz_A2Z.Arrays;

import java.util.Arrays;

// Find the element that appears once and other appears twice
public class Appears_Once {
    public static void solution1(int[] arr)
    {
        int n = arr.length;
        int xor = 0;
        for(int i = 0;i < n;i++){
            xor ^= arr[i];
        }
        System.out.println("Once : "+ xor);
    }

    public static void main(String[] args) {
        int[] arr = {4,1,2,1,2};
        solution1(arr);
    }
    // 1 1 2 2 4
}

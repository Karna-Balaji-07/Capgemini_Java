package DSA.Searching_Algorithms;

import java.util.Arrays;

// Find the missing number in the array from range 1 to n
public class Missing_Number {

    public static int solution1(int[] arr)
    {
        int n = (arr.length)+1;
        int sum =0;
        for(int i : arr) sum+= i;
        int nsum = (n * (n+1))/2;
        return nsum - sum;
    }

    public static int solution2(int[] arr)
    {
        int n = arr.length+1;
        int xor = 0;
        int xor2 = 0;
        for(int i : arr) xor = xor ^ i;
        for(int i = 1; i <= n; i++) xor2 = xor2 ^ i;
        return xor ^ xor2;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6,7,8};
        System.out.println(solution1(arr));
        System.out.println(solution2(arr));
    }

}

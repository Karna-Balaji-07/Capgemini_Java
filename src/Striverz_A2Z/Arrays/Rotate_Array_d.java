package Striverz_A2Z.Arrays;
// Rotate array by d places either left or right
public class Rotate_Array_d {

    public static void solutonLeft(int[] arr, int d)
    {
        int n = arr.length;
        d %= n;
        reverse(arr, 0,d-1);
        reverse(arr,d, n-1);
        reverse(arr, 0,n-1);
        for(int i : arr) System.out.print(i+" ");

    }

    public static void solutionRight(int[] arr, int d)
    {
        int n = arr.length;
        d %= n;
        reverse(arr, 0,n-1);
        reverse(arr, 0,d-1);
        reverse(arr,d, n-1);
        for(int i : arr) System.out.print(i+" ");
    }

    public static void reverse(int[] arr, int start, int end)
    {
        while(start < end)
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int d = 2;
        solutionRight(arr,d);
    }

}

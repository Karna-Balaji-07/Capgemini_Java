package Striverz_A2Z.Arrays;
// Remove duplicates in place such that each unique elements appears only once and maintain the order of elements
public class Remove_Duplicates {
    public static int solution1(int[] arr)
    {
        int index = 1;
        for(int i = 1;i < arr.length; i++){
            if(arr[i] !=arr[i-1]) arr[index++] = arr[i];
        }
        return index;
    }
    public static void main(String[] args)
    {
        int[] arr = {1,2,2,2,3,4,4,5,5,5,6,7,8,8,9};
        int index = solution1(arr);
        for(int i = 0; i < index;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

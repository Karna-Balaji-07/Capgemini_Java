package Striverz_A2Z.Arrays;
// Check if the given array is sorted or not in ascending order
// Check if the array is sorted and rotated

public class Check_Array_Sorted
{
    public static boolean solution1(int[] arr)
    {
        for(int i = 1;i < arr.length; i++)
        {
            if(arr[i] < arr[i-1] ) return false;
        }
        return true;
    }

    public static boolean solution2(int[] arr) {
        int index = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                index = i;
                break;
            }
        }
        int[] temp = new int[arr.length];

        for(int i = 0; i < arr.length - index; i++){
            temp[i] = arr[index+i];
        }
        for(int i = 0;i < index; i++){
            temp[arr.length - index+i] = arr[i];
        }
        for(int i = 1;i < arr.length; i++){
            if(temp[i] < temp[i-1]) return false;
        }
        return true;
    }

    public static boolean solution3(int[] arr){
        int index = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                index = i;
                break;
            }
        }
        reverse(arr, 0, index-1);
        reverse(arr,index, arr.length-1);
        reverse(arr,0,arr.length-1);
        for(int i = 1; i < arr.length ; i++){
            if(arr[i-1] > arr[i]) return false;
        }
        return true;
    }
    public static void reverse(int[] arr, int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {2,1,3,4};
        System.out.println(solution2(arr));
        System.out.println(solution3(arr));
    }
}

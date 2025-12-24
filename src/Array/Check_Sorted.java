package Array;

public class Check_Sorted {

    public static boolean sorted(int[] arr){

        for(int i =1 ; i < arr.length; i++){
            if(arr[i] < arr[i-1]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        // Check if the array is sorted or not
        int[] arr1 = {3,5,2,7,4,8,1,2,7,1};
        int[] arr2 = {2,3,5,7,9,10};
        System.out.println(sorted(arr1));
        System.out.println(sorted(arr2));
    }
}

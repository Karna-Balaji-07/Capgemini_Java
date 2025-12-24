package Array;

public class Print_Elements {
    public static void main(String[] args) {
        // Print all the elements of an array
        int arr[] = {10,23,1,75,23,3,12,65};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        for(int i : arr){
            System.out.print(i+" ");
        }
    }
}

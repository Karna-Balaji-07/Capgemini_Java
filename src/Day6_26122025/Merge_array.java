package Day6_26122025;
// Merge two arrays
public class Merge_array {
    public static void solution1(int[] arr1, int[] arr2){
        int n = arr1.length;
        int m = arr2.length;

        int[] merged = new int[n+m];

        for (int i = 0; i <n ; i++) {
            merged[i] = arr1[i];
        }
        for (int i = 0; i <m ; i++) {
            merged[i+n] = arr2[i];
        }
        for(int i = 0;i < merged.length; i++) System.out.print(merged[i]+" ");
    }

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {6,7,8,9};
        solution1(arr1, arr2);
    }
}

package Day6_26122025;
// Find duplicates in array without collections
public class Duplicates_array {

    public static void solution(int[] arr){
        int prev = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i-1] == arr[i] && arr[i] != prev){
                System.out.print(arr[i-1]+" ");
                prev = arr[i];
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,2,2,3,6,7,8,8,8};
        solution(arr);
    }

}

package Day6_26122025;
// Find all the unique elemeents in the array
public class Unique_arrays {
    public static int solution(int[] arr){
        int index = 1;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i-1] !=arr[i]) arr[index++] = arr[i];
        }
        return index;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,3,3};
        int index = solution(arr);
        for (int i = 0; i < index; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}

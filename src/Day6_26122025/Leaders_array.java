package Day6_26122025;

// Leaders in an array

public class Leaders_array {

    public static void leaders(int[] arr){
        int n = arr.length;
        int max = arr[n-1];
        int[] temp = new int[n];
        int index = 1;
        temp[0] = max;

        for (int i = n-1; i >= 0; i--) {
            if(arr[i] > max){
                temp[index++] = arr[i] ;
                max = arr[i];
            }
        }
        for (int i = index-1 ;i >= 0; i--) {
            System.out.print(temp[i]+" ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {8,7,4,3,5,2};
        leaders(arr);
    }
}

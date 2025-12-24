package Array;

public class Linear_Search {
    public static void main(String[] args) {
        // Search an element in array and print the index
        int[] arr = {1,6,3,4,2,6,9,6,2,6,8,7,1,6,10};
        int element = 8;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == element){
                System.out.println(i);
                return;
            }
        }

    }
}

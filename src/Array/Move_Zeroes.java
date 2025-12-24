package Array;

public class Move_Zeroes {

    public static int[] move1(int[] arr){
        int n = arr.length;
        int[] temp = new int[n];
        int index = 0;
        for (int i = 0; i < n; i++) {
            if(arr[i] != 0) temp[index++] = arr[i];
        }
        return temp;

    }

    public static void main(String[] args) {
        int[] arr = {1,0,4,0,5,0,3,6,0,0,0,1,0};
        int[] result = move1(arr);
        for(int i : result){
            System.out.print(i+" ");
        }
    }
}

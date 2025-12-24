package Array;
// Right rotate array elements by d position
public class Right_rotation {

    public static void rotate1(int[] arr, int d){
        int n = arr.length;
        d %= n;
        int[] temp = new int[n];
        for (int i = 0; i <d ; i++) {
            temp[i] = arr[n-d+i];
        }
        for (int i = 0; i < n-d; i++) {
            temp[i+d] = arr[i];
        }

    }

    public static void rotate2(int[] arr, int d){
        int n = arr.length;
        d %= n;
        reverse(arr,0,n-1);
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);

    }
    public static void reverse(int[] arr, int left, int right){
        while (left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left ++;
            right--;
        }
    }

    public static void main(String[] args) {

    }
}

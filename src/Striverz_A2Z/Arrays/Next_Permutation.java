package Striverz_A2Z.Arrays;
// find the next permutation
public class Next_Permutation {

    public static void solution1(int[] arr)
    {
        int n = arr.length;
        int pivot = -1;

        // Step 1: Find pivot
        for(int i = n - 2; i >= 0; i--)
        {
            if(arr[i] < arr[i + 1]){
                pivot = i;
                break;
            }
        }

        // Step 2: If no pivot, reverse whole array
        if(pivot == -1){
            reverse(arr);
            return;
        }

        // Step 3: Find rightmost element greater than pivot
        for(int i = n - 1; i > pivot; i--){
            if(arr[i] > arr[pivot]) {
                swap(arr, i, pivot);
                break;
            }
        }

        // Step 4: Reverse suffix
        reverse(arr, pivot + 1, n - 1);
    }

    // Reverse entire array
    public static void reverse(int[] arr){
        reverse(arr, 0, arr.length - 1);
    }

    // Reverse subarray from left to right
    public static void reverse(int[] arr, int left, int right){
        while(left < right){
            swap(arr, left, right);
            left++;
            right--;
        }
    }

    // Swap two elements
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Driver code
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 4, 2};
        solution1(arr);

        for(int x : arr){
            System.out.print(x + " ");
        }
    }
}

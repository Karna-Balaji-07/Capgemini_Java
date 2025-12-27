package DSA.Two_Pointers;
// smallest subarray sum greater than a given value
public class MinimumSize_Subarray_Sum {

    public static int solution1(int[] arr, int target) {
        int left = 0;
        int right = 1;
        int result = Integer.MAX_VALUE;
        int n = arr.length;
        int sum = arr[left];
        while (right < n && left < n) {
            sum += arr[right];
            System.out.println("sum : "+sum);
            while(sum > target) {
                System.out.println("Inside the sum > target");
                result = Math.min(result, right - left+1);
                System.out.println("Resultt : "+result);
                sum -= arr[left];
                System.out.println("Sum after updating : "+sum);
                left++;
                System.out.println("Left incremented : "+left);
            }
            right++;
            System.out.println("right incremented : "+right);
        }
        return result;
    }

    public static void main(String[] args) {
        int target = 7;
        int[] arr = {2,3,1,2,4,3};
        System.out.println(solution1(arr, target));
    }
}

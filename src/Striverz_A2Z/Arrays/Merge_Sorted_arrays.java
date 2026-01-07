package Striverz_A2Z.Arrays;
// Merge two sorted arrays
public class Merge_Sorted_arrays
{
    public static void solution(int[] arr1, int[] arr2, int n, int m)
    {
        int k = m+n-1;
        int left = n-1;
        int right = m-1;
        while(left >= 0 && right >= 0){
            if(arr1[left] >= arr2[right]){
                arr1[k] = arr1[left];
                left--;
            }
            else{
                arr1[k] = arr2[right];
                right--;
            }
            k--;
        }
        while(right >= 0){
            arr1[k--] = arr2[right--];
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {-5, -2, 4, 5, 0, 0, 0}, nums2 = {-3, 1, 8};
        solution(nums1, nums2,4,3);
        for(int i : nums1) System.out.print(i+" ");
    }
}

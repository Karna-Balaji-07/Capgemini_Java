package Striverz_A2Z.Arrays;
// Find the missing number in the array
public class Missing_Number
{
    public static void solution1(int[] arr,int n)
    {
        int sum = (n*(n+1)) /2;
        int curr = 0;
        for(int i : arr) curr+=i;
        System.out.println("Missing number : "+ (sum-curr));
    }

    public static void solution2(int[] arr, int n)
    {
        int missing = -1;
        for(int i = 1;i<n;i++){
            if(arr[i-1] != i){
                missing = i;
                break;
            }
        }
        System.out.println("Missing number : "+ missing);
    }

    public static void solution3(int[] arr, int n)
    {
        int xor1 = 0;
        int xor2 = 0;
        for(int i = 0;i < n-1;i++){
            xor1 ^= arr[i];
            xor2 ^= (i+1);
        }
        xor1 ^= n;
        System.out.println("Missing number : "+(xor1 ^ xor2));
    }

    public static void main(String[] args) {
        int[] arr = {1,0,3};
        int n = arr.length+1;
        solution1(arr,n);
        solution2(arr,n);
        solution3(arr,n);
    }
}

package Striverz_A2Z.Arrays;
// Find the best time to buy and sell stock
public class Buy_Sell_Stock
{
    public static int solution1(int[] arr)
    {
        int n = arr.length;
        int min = Integer.MAX_VALUE;
        int profit = 0;
        for(int i = 0;i < n; i++){
            min = Math.min(arr[i], min);
            int curr = arr[i] - min;
            profit = Math.max(curr, profit);
        }
        return profit;

    }

    public static void main(String[] args) {
        int[] arr = {2,1,4};
        System.out.println(solution1(arr));
    }
}

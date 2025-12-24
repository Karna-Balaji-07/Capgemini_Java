package Array;

import java.util.ArrayList;

public class StockBUYSELL_Multiple_Transactions {

    public static int solution1(int[] arr){
        int result = 0;
        for(int i = 1;i < arr.length; i++){
            int profit = arr[i] - arr   [i-1];
            if(arr[i] > arr[i-1]) result += profit;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {100, 180, 260, 310, 40, 535, 695};
        System.out.println(solution1(arr));
    }
}

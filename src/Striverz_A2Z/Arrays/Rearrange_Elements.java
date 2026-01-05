package Striverz_A2Z.Arrays;

import java.util.ArrayList;

// Rearrange array elements by sign
public class Rearrange_Elements
{
    public static int[] solution1(int[] arr)
    {
        int n = arr.length;
        ArrayList<Integer> positive = new ArrayList<>();
        ArrayList<Integer> negative = new ArrayList<>();
        for(int i : arr){
            if(i > 0) positive.add(i);
            else negative.add(i);
        }
        int p = positive.size();
        int m = negative.size();
        int index = 0;
        int i = 0;
        int j = 0;
        while(i < p && j < m){
            arr[index++] = positive.get(i++);
            arr[index++] = negative.get(j++);
        }
        while(i < p){
            arr[index++] = positive.get(i++);
        }
        while(j < m){
            arr[index++] = negative.get(j++);
        }
        return arr;
    }

    public static int[] solution2(int[] arr)
    {
        int[] temp = new int[arr.length];
        int pos = 0;
        int neg = 1;
        for(int i : arr){
            if(i > 0){
                temp[pos] = i;
                pos += 2;
            }
            else{
                temp[neg] = i;
                neg += 2;
            }
        }
        return  temp;
    }

    public static void main(String[] args) {
        int[] arr = {-1,1};
        for(int i : solution1(arr)) System.out.print(i+" ");
    }
}

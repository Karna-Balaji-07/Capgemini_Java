package DSA.Two_Pointers;

import java.util.ArrayList;

// Remove duplicates from sorted array
public class Remove_Duplicates_Sorted_Array {

    // Removing duplicates using indexing pointer
    public static int solution1(int[] arr){
            int index = 1;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i-1] != arr[i]) arr[index++] = arr[i];

        }
        return index;
    }

    // using extra space
    public static int[] solution2(int[] arr){
        ArrayList<Integer> result = new ArrayList<>();
        for(int i : arr){
            if(!result.contains(i)) result.add(i);
        }
        int[] output = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            output[i] = result.get(i);
        }
        return output;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,2,2,3,5,5,5};
        int index = solution1(arr);
        for (int i = 0; i < index; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int[] result = solution2(arr);
        for(int i : result) System.out.print(i+" ");
    }
}

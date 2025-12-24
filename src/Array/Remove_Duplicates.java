package Array;

import java.net.Inet4Address;
import java.util.HashSet;

public class Remove_Duplicates {

    public static int unique(int[] arr){
        HashSet<Integer> s = new HashSet<>();
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if( !s.contains(arr[i])){
                s.add(arr[i]);
                arr[index++] = arr[i];
            }
        }
        return index;

    }

    public static int unique2(int[] arr){
        int index =1;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i-1] != arr[i]){
                arr[index++] = arr[i];
            }
        }
        return index;
    }


    public static void main(String[] args) {
        int[] arr= {1,2,2,2,3,4,5,5,5,5};
        int result = unique(arr);
        for (int i = 0; i < result ; i++) {
            System.out.print(arr[i]+" ");
        }
        int result2 = unique2(arr);
        for (int i = 0; i < result ; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}

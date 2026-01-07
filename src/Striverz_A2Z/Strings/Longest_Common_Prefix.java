package Striverz_A2Z.Strings;
// Find the longest common prefix from the given array of strings
import java.util.*;
public class Longest_Common_Prefix {
    public static String solution1(String[] arr){
        StringBuilder sb = new StringBuilder();
        Arrays.sort(arr);
        String first = arr[0];
        String last = arr[arr.length-1];
        for(int i = 0; i < Math.min(first.length(), last.length()); i++){
            if(first.charAt(i) != last.charAt(i)) return sb.toString();
            sb.append(first.charAt(i));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String[] arr = {"flower", "flow", "flight"};
        String[] arrs = {"apple", "banana", "grape", "mango"};
        System.out.println(solution1(arr));
        System.out.println(solution1(arrs));
    }
}

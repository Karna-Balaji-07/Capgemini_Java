package DSA.Two_Pointers;

import java.util.Arrays;

public class Reverse_String {
    // Reverse string using StringBuilder class or stringbuffer class
    public static String reverse1(String s){
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        String ss = sb.toString();
        return ss;
    }

    // reverse string using two pointers
    public static String reverse2(String s){
        int left = 0;
        int right = s.length()-1;
        char[] arr = s.toCharArray();
        while(left < right){
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        String result = String.valueOf(arr); // this converts char array back to string
        // alternate to String.valueOf(arr) : create a new string object
        // String result = new String(arr);
        return result;
    }

    public static void main(String[] args) {
        String s = "HELLO WORLD";
        System.out.println(reverse1(s));
        System.out.println(reverse2(s));
    }
}

package Striverz_A2Z.Strings;
// Largest odd number in a string

import java.util.*;
public class Largest_Odd_Number {
    public static void solution1(String s){
        StringBuilder sb = new StringBuilder();
        ArrayList<String> arr = new ArrayList<>();
        s = s.replaceFirst("^0+", "");
        for(int i =0;i < s.length();i++){
            if(Integer.parseInt(String.valueOf(s.charAt(i))) % 2 != 0){
                sb.append(s.charAt(i));
                arr.add(sb.toString());
            }
            else{
                sb.append(s.charAt(i));
            }
        }
        String result = "";
        if(!arr.isEmpty()) result = arr.getLast();
        System.out.println(result);

    }

    public static String solution2(String s){
        s = s.replaceFirst("^0+","");
        StringBuilder sb = new StringBuilder();
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            int num = s.charAt(i) - '0';
            sb.append(s.charAt(i));
            if(num % 2 != 0) result = sb.toString();
        }
        return result;
    }

    public static String solution3(String s){
        for(int i = s.length()-1; i>=0; i--){
            if((s.charAt(i)-'0')%2 != 0) return s.substring(0,i+1);
        }
        return "";
    }

    public static void main(String[] args) {
        String s = "3542700000000000000070000000000000000";
        solution1(s);
        System.out.println(solution2(s));
        System.out.println(solution3(s));
    }
}

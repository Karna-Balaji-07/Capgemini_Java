package Striverz_A2Z.Strings;
import java.util.*;
// sort characters by frequency
public class Sort_Characters_Frequency
{
    public static String solution1(String s)
    {
     char[] arr = s.toCharArray();
    StringBuilder sb = new StringBuilder();
     Map<Character, Integer> dict = new TreeMap<>();
     for(char i : arr) dict.put(i,dict.getOrDefault(i,0)+1);
     for(Map.Entry<Character, Integer> entry : dict.entrySet()){
         String a = String.valueOf(entry.getKey()).repeat(entry.getValue());

         System.out.println(a);
        sb.append(a);
     }
    return sb.toString();
    }

    public static void main(String[] args) {
        String s = "tree";
        String a = "aaaabbbbccccccddqrstv";
        System.out.println(solution1(s));
        System.out.println(solution1(a));

    }
}

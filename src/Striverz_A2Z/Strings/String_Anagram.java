package Striverz_A2Z.Strings;
// check if all the strings are anagram to each other
import java.util.*;
public class String_Anagram {

    public static boolean solution1(String s1, String s2)
    {
        if(s1.length() != s2.length()) return false;
        char[] c = s1.toCharArray();
        char[] d = s2.toCharArray();
        Arrays.sort(c);
        Arrays.sort(d);

        return Arrays.toString(c).equals(Arrays.toString(d)) ;
    }

    public static boolean solution2(String s,String t){
        if(s.length() != t.length()) return false;
        int[] sarr = new int[26];

        for(int i = 0; i < s.length(); i++){
            sarr[s.charAt(i)-'a']++;
        }
        for(int i = 0; i <t.length(); i++){
            sarr[t.charAt(i)-'a']--;
        }
        for(int i : sarr){
            if(i == 1) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String  s = "anagram", t = "nagaram";
        System.out.println(solution1(s,t));
        System.out.println(solution2(s,t));
    }
}

package Striverz_A2Z.Strings;
// check whether the two strings are Isomorphic Strings
import java.util.*;
public class Isomorphic_Strings {
    public static boolean solution1(String s, String a) {
        HashMap<Character, Character> dict = new HashMap<>();
        int n = s.length();
        for (int i = 0; i < n; i++) {
            if (!dict.containsKey(s.charAt(i))) {
                if (dict.containsValue(a.charAt(i))) return false;
                dict.put(s.charAt(i), a.charAt(i));
            } else {
                if (dict.get(s.charAt(i)) != a.charAt(i)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "abc";
        String a = "xyy";
        System.out.println(solution1(s,a));
    }
}

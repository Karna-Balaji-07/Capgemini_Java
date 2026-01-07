package Striverz_A2Z.Strings;
// Reverse the words in a given string
import java.util.*;

public class Reverse_Words {

    public static String solution1(String s){
        StringBuilder sb = new StringBuilder();
        s = s.trim();
        ArrayList<String> arr = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                sb.append(s.charAt(i));
            } else {
                // ADD WORD ONLY IF sb HAS CONTENT (skip extra spaces)
                if (sb.length() > 0) {
                    arr.add(sb.toString());
                    sb = new StringBuilder();
                }
            }
        }

        // ADD LAST WORD IF PRESENT
        if (sb.length() > 0) {
            arr.add(sb.toString());
        }

        Collections.reverse(arr);

        sb = new StringBuilder();
        for (int i = 0; i < arr.size(); i++) {
            sb.append(arr.get(i));
            if (i != arr.size() - 1) sb.append(" ");
        }

        return sb.toString();
    }

    public static String solution2(String s)
    {
        String[] words = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(int i = words.length-1; i>= 0;i--){
            sb.append(words[i]);
            if(i != 0){
                sb.append(" ");
            }
        }
        return sb.toString();

    }

    public String reverseWords(String s) {
        StringBuilder result = new StringBuilder();
        int i = s.length() - 1;
        while (i >= 0) {
            while (i >= 0 && s.charAt(i) == ' ') {
                i--;
            }
            if (i < 0) break;

            int end = i;
            while (i >= 0 && s.charAt(i) != ' ') {
                i--;
            }
            String word = s.substring(i + 1, end + 1);
            if (result.length() > 0) {
                result.append(" ");
            }
            result.append(word);
        }

        return result.toString();
    }
    public static void main(String[] args) {
        String s = "  the sky is blue   ";
        System.out.println(solution1(s));
        System.out.println(solution2(s));
    }

}

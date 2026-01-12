package Day17_12012025;
// convert first word vowels into %, second word consonants in # and third word in uppercase
public class Program_1 {

    public static String solution1(String s) {
        String[] arr = s.split(" ");
        for (int i = 0; i < arr.length; i++) {
            if (i % 3 == 0) {
                if (arr[i].toLowerCase().contains("a") || arr[i].toLowerCase().contains("e") || arr[i].toLowerCase().contains("i") || arr[i].toLowerCase().contains("o") || arr[i].toLowerCase().contains("u")) {
                    arr[i] = arr[i].replaceAll("[aeiouAEIOU]", "%");
                }

            } else if (i % 3 == 1) {
                if (!arr[i].toLowerCase().contains("a") || !arr[i].toLowerCase().contains("e") || !arr[i].toLowerCase().contains("i") || !arr[i].toLowerCase().contains("o") || !arr[i].toLowerCase().contains("u"))
                   arr[i] =  arr[i].replaceAll("[qwrtypsdfghjklmnbvcxzQWRTYPLKJHGFDSZXCVBNM]", "#");
            } else arr[i]=arr[i].toUpperCase();
        }
        return String.join(" ", arr);

    }

    public static void main(String[] args) {
        String s = "Meet me at the clock tower";
        System.out.println(solution1(s));
    }
}

package String;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class CheckAnagram {
    public static void main(String[] args) {
        String a = "aaagram";
        String b = "nagaram";

        System.out.println(isAnagram(a, b));
    }

    private static Boolean isAnagram(String a, String b) {
        if (a.length() != b.length())
            return false;
        a = SortString(a);
        b = SortString(b);

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i))
                return false;
        }
        return true;

    }

    public static String SortString(String str) {
        char c[] = str.toCharArray();
        Arrays.sort(c);
        return new String(c);
    }

}

package String;

import java.util.LinkedHashMap;
import java.util.Map;

public class WordPattern {
    public static void main(String[] args) {
        String pattern = "abba";
        String s = "dog dog dog dog";
        boolean ans = wordPattern(pattern, s);
        System.out.println(ans);
    }

    public static boolean wordPattern(String pattern, String s) {
        Map<Character, String> map = new LinkedHashMap<Character, String>();
        String[] splittedString = s.split(" ");
        if (splittedString.length > 0) {
            if (splittedString.length != pattern.length())
                return false;
        } else {
            return true;
        }
        for (int i = 0; i < pattern.length(); i++) {
            if (!map.containsKey(pattern.charAt(i))) {
                if (!map.containsValue(splittedString[i])) {
                    map.put(pattern.charAt(i), splittedString[i]);
                } else {
                    return false;
                }
            } else {
                if (!map.get(pattern.charAt(i)).equals(splittedString[i])) {
                    System.out.println(map.get(pattern.charAt(i)));
                    System.out.println(splittedString[i]);
                    return false;
                }
            }
        }
        System.out.println(map);
        return true;
    }
}

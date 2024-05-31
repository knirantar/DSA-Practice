package String;

import java.util.LinkedHashMap;
import java.util.Map;

/*
 * 
 * Given two strings s and t, determine if they are isomorphic.
 * Two strings s and t are isomorphic if the characters in s can be 
 * replaced to get t.
 * 
 * All occurrences of a character must be replaced with another 
 * character while preserving the order of characters. 
 * 
 *  No two characters may map to the same character, but a character 
 * may map to itself.
 */
public class IsomorphicStrings {
    public static void main(String[] args) {
        String a = "papera";
        String b = "titlee";

        System.out.println(isIsomorphic(a, b));

    }

    private static Boolean isIsomorphic(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }
        Map<Character, Character> map = new LinkedHashMap<>();
        for (int i = 0; i < a.length(); i++) {
            Character first = a.charAt(i);
            Character second = b.charAt(i);

            if (!map.containsKey(first)) {
                if (!map.containsValue(second)) {
                    map.put(first, second);
                } else {
                    return false;
                }
            } else {
                Character mappedCharacter = map.get(first);
                if (mappedCharacter != second) {
                    return false;
                }
            }
        }
        return true;
    }

}

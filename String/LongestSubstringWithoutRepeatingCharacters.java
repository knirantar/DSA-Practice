package String;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters {

    public static void main(String[] args) {
        String s = "cadbzabcd";

        int ans = findLongest(s);
        System.out.println(ans);
    }

    private static int findLongest(String s) {
        Map<Character, Integer> map = new HashMap<>();

        int r = 0;
        int l = 0;
        int n = s.length();
        int maxLength = 0;

        while (r < n) {

            if (map.containsKey(s.charAt(r))) {
                if (l <= map.get(s.charAt(r))) {
                    l = map.get(s.charAt(r)) + 1;
                }
                int length = r - l + 1;
                maxLength = Math.max(maxLength, length);
                r++;
                continue;
            }
            int length = r - l + 1;
            maxLength = Math.max(maxLength, length);
            map.put(s.charAt(r), r);
            r++;
        }
        return maxLength;
    }
}

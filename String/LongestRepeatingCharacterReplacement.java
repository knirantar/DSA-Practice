package String;

import java.util.LinkedHashMap;
import java.util.Map;

public class LongestRepeatingCharacterReplacement {
    public static void main(String[] args) {
        String s = "AABABBA";
        int k = 1;

        int ans = findLongestRepeatingCharacterSequence(s, k);
        System.out.println(ans);
    }

    private static int findLongestRepeatingCharacterSequence(String s, int k) {
        int l = 0;
        int r = 0;
        int maxFreq = 0;
        int maxLength = 0;
        int n = s.length();
        Map<Character, Integer> map = new LinkedHashMap<>();

        while (r < n) {
            map.put(s.charAt(r), map.getOrDefault(s.charAt(r), 0) + 1);
            maxFreq = Math.max(maxFreq, map.get(s.charAt(r)));
            while ((r - l + 1) - maxFreq > k) {
                map.put(s.charAt(l), map.get(s.charAt(l)) - 1);
                l++;
            }
            if ((r - l + 1) - maxFreq <= k) {
                maxLength = Math.max(maxLength, (r - l + 1));
            }
            r++;
        }
        return maxLength;
    }

}

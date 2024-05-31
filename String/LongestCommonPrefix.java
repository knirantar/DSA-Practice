package String;

import java.util.Arrays;

/*
 * Write a function to find the longest common prefix string 
 * amongst an array of strings.

If there is no common prefix, return an empty string ""
 */
public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] s = new String[] { "ab", "a" };
        String ans = findLongestCommonPrefix(s);
        System.out.println(ans);

    }

    private static String findLongestCommonPrefix(String[] s) {
        Arrays.sort(s);
        String ans = "";
        String first = s[0];
        String last = s[s.length - 1];
        for (int i = 0; i < s[0].length(); i++) {
            if (first.charAt(i) == last.charAt(i)) {
                ans = ans + first.charAt(i);
            } else {
                break;
            }
        }
        return ans;

    }

}

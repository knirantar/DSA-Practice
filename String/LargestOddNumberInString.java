package String;
/*
 * You are given a string num, representing a large integer. 
 * Return the largest-valued odd integer (as a string) that is a 
 * non-empty substring of num, or an empty string "" if no odd integer 
 * exists.
 */

public class LargestOddNumberInString {
    public static void main(String[] args) {
        String s = "3542";
        String ans = findLargestOddNumber(s);
        System.out.println(ans);
    }

    private static String findLargestOddNumber(String s) {
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) % 2 != 0) {
                return s.substring(0, i + 1);
            }
        }
        return "";
    }

}

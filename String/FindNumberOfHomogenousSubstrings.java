package String;

public class FindNumberOfHomogenousSubstrings {
    public static void main(String[] args) {
        String s = "abbcccaa";
        findHomogenousSubstring(s);
    }

    private static void findHomogenousSubstring(String s) {
        final int MOD = 1000000007;
        long totalCount = 0;
        int length = s.length();
        int i = 0;

        while (i < length) {
            char currentChar = s.charAt(i);
            int count = 0;

            // Count the length of the current homogenous segment
            while (i < length && s.charAt(i) == currentChar) {
                count++;
                i++;
            }

            // Number of homogenous substrings in this segment
            totalCount += (long) count * (count + 1) / 2;
            totalCount %= MOD;
        }

        System.out.println((int) totalCount);
    }

}

package String;

public class FindNumberOfHomogenousSubstrings {
    public static void main(String[] args) {
        String s = "abbcccaa";
        findHomogenousSubstring(s);
    }

    private static void findHomogenousSubstring(String s) {
        int i = 0;
        int j = 1;
        int count = 0;
        while (j < s.length()) {
            if (s.charAt(j) == s.charAt(i)) {
                j++;
                if (j - i > 1) {
                    count++;
                }
            } else {
                i++;
            }
        }
        count = count + s.length();
        System.out.println(count);
    }

}

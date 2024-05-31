package String;

/*
 * Given a string s, reverse the words of the string.
 */
public class ReverseWordsInString {
    public static void main(String[] args) {
        String s = "  hello world  ";

        reverseWords(s);
    }

    private static void reverseWords(String s) {
        String ans = "";
        int i = s.length() - 1;
        while (i >= 0) {
            while (i >= 0 && s.charAt(i) == ' ')
                i--;
            int j = i;
            while (i >= 0 && s.charAt(i) != ' ')
                i--;
            if (ans.isEmpty()) {
                ans = ans.concat(s.substring(i + 1, j + 1));
            } else {
                ans = ans.concat(" " + s.substring(i + 1, j + 1));
            }
        }
        System.out.println(ans.trim);
    }

}

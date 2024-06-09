package String;
/*
 * Given a string s consisting of words and spaces, return the length of the last word 
 * in the string.
 * A word is a maximal substringconsisting of non-space characters only.
 * 
 */

public class LengthOfTheLastWord {
    public static void main(String[] args) {
        String s = "   fly me   to   the moon  ";
        int len = findLengthOfTheLastWord(s);
        System.out.println(len);
    }

    private static int findLengthOfTheLastWord(String s) {
        s = s.trim();
        int count = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                count++;
            } else
                break;
        }
        return count;
    }

}

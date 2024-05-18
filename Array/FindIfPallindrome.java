/*
 * Find if given string is pallindrome or not
 */
package Array;

public class FindIfPallindrome {
    public static void main(String[] args) {
        String s = "nirrin";
        System.out.println(isPallindrome(s));
    }

    public static Boolean isPallindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}

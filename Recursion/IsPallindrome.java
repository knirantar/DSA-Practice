package Recursion;

public class IsPallindrome {

    public static void main(String[] args) {
        String s = "ADA";
        System.out.println(isPallindrome(s, 0));
    }

    private static Boolean isPallindrome(String s, int i) {
        if (i >= s.length() / 2) {
            return true;
        }
        if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
            return false;
        }
        return isPallindrome(s, i + 1);
    }

}

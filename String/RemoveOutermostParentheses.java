package String;

public class RemoveOutermostParentheses {
    public static void main(String[] args) {
        String s = "(()())(())";

        removeParentheses(s);
    }

    private static void removeParentheses(String s) {
        int count = 0;
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                if(count > 0) {
                    ans = ans + "(";
                }
                count++;
            } else {
                count--;
                if(count > 0) {
                    ans = ans + ")";
                }
            }
        }
        System.out.println(ans);
    }

}

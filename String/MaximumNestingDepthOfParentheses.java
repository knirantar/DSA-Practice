package String;

import java.util.Stack;

/*
 * Given a valid parentheses string s, return the nesting depth of s. 
 * The nesting depth is the maximum number of nested parentheses.
 */
public class MaximumNestingDepthOfParentheses {
    public static void main(String[] args) {
        String s = "(1+(2*3)+((8)/4))+1";

        findMaxDepthOfParentheses(s);
    }

    private static void findMaxDepthOfParentheses(String s) {
        Stack<Character> st = new Stack<>();
        int maxDepth = 0;
        for (int i = 0; i < s.length(); i++) {
            Character ch = s.charAt(i);
            if (ch == '(') {
                st.add(ch);
            } else if (ch == ')') {
                st.pop();
            }
            if (st.size() > maxDepth) {
                maxDepth = st.size();
            }
        }
        System.out.println(maxDepth);
    }

}

package StackAndQueue;

public class BalancedBrackets {
    public static void main(String[] args) {

        String str = "]";

        System.out.println(isStringWithBalancedBrackets(str));
    }

    private static Boolean isStringWithBalancedBrackets(String str) {
        Stack s = new Stack();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '{' || str.charAt(i) == '(' || str.charAt(i) == '[') {
                s.push(str.charAt(i));
            } else if (str.charAt(i) == '}') {
                if (!s.isEmpty() && s.top() == '{') {
                    s.pop();
                } else {
                    return false;
                }
            } else if (str.charAt(i) == ']') {
                if (!s.isEmpty() && s.top() == '[') {
                    s.pop();
                } else {
                    return false;
                }
            } else if (str.charAt(i) == ')') {
                if (!s.isEmpty() && s.top() == '(') {
                    s.pop();
                } else {
                    return false;
                }
            }
        }
        if (s.isEmpty()) {
            return true;
        } else
            return false;
    }

}

package String;

public class ImplementAtoI {
    public static void main(String[] args) {
        String s = "-91283472332";
        System.out.println(convertToInteger(s));
    }

    private static long convertToInteger(String s) {
        s = s.trim();
        if (s.isEmpty()) {
            return 0;
        }
        int result = 0;
        int sign = 1;
        int i = 0;
        if (s.charAt(i) == '-') {
            sign = -1;
            i++;
        } else if (s.charAt(i) == '+') {
            i++;
        }
        while (i < s.length()) {
            Character ch = s.charAt(i);
            if (!(ch - '0' >= 0 && ch - '0' < 10)) {
                break;
            } else if (result > (Integer.MAX_VALUE - (ch - '0')) / 10) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            } else {
                result = result * 10 + ch - '0';
            }
            i++;
        }
        return result * sign;
    }

}

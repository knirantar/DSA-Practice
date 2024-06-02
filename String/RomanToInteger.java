package String;

public class RomanToInteger {
    public static void main(String[] args) {
        String s = "MCMXCIV";
        findRomanToInteger(s);
    }

    private static void findRomanToInteger(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            Character ch = s.charAt(i);
            if (ch == 'M') {
                sum += 1000;
            } else if (ch == 'D') {
                sum += 500;
            } else if (ch == 'C' && i < s.length() - 1 && (s.charAt(i + 1) == 'D' || s.charAt(i + 1) == 'M')) {
                sum += -100;
            } else if (ch == 'C') {
                sum += 100;
            } else if (ch == 'L') {
                sum += 50;
            } else if (ch == 'X' && i < s.length() - 1 && (s.charAt(i + 1) == 'L' || s.charAt(i + 1) == 'C')) {
                sum += -10;
            } else if (ch == 'X') {
                sum += 10;
            } else if (ch == 'V') {
                sum += 5;
            } else if (ch == 'I' && i < s.length() - 1 && (s.charAt(i + 1) == 'V' || s.charAt(i + 1) == 'X')) {
                sum += -1;
            } else if (ch == 'I') {
                sum += 1;
            }
        }
        System.out.println(sum);
    }
}

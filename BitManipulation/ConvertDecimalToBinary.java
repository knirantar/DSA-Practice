package BitManipulation;

public class ConvertDecimalToBinary {
    public static void main(String[] args) {
        int x = 36;
        String s = convertToBinary(x);
        System.out.println(s);
    }

    private static String convertToBinary(int x) {
        String s = "";
        while (x > 0) {
            if (x % 2 == 1) {
                s = s + "1";
            } else {
                s = s + "0";
            }
            x = x / 2;
        }
        int r = s.length() - 1;
        String s2 = "";
        while (r >= 0) {
            s2 = s2 + s.charAt(r);
            r--;
        }
        return s2;
    }

}

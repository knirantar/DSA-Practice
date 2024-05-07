package BitManipulation;

public class ConvertBinaryToDecimal {
    public static void main(String[] args) {
        String s = "1001010";
        int result = convertToDecimal(s);
        System.out.println(result);
    }

    private static int convertToDecimal(String s) {
        int sum = 0;
        int j = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '1') {
                sum = sum + pow(j);
            }
            j++;
        }
        return sum;
    }

    private static int pow(int j) {
        int sum = 1;
        for (int i = 1; i <= j; i++) {
            sum = sum * 2;
        }
        return sum;
    }

}

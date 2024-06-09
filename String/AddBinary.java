package String;

import java.math.BigInteger;

public class AddBinary {
    public static void main(String[] args) {
        String a = "111";
        String b = "011101";
        String ans = findBinarySum(a, b);
        System.out.println(ans);
    }

    private static String findBinarySum(String a, String b) {
        return new BigInteger(a, 2).add(new BigInteger(b, 2)).toString(2);
    }

}

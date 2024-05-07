package BitManipulation;

public class MinimumBitFlipsToConvertNumber {
    public static void main(String[] args) {
        int x = 13; // 1101
        int y = 10; // 1010

        int ans = x ^ y;

        int count = 0;
        // Ans will contain 1 when bits are different in x and y
        // So we can calculate bit flips from ans
        while (ans != 0) {
            count += (ans & 1);
            ans = ans >> 1;
        }
        System.out.println(count);
    }

}

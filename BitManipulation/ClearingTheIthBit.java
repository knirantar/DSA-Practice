package BitManipulation;

public class ClearingTheIthBit {
    public static void main(String[] args) {
        int x = 15;
        int i = 3;

        // Left shift 1 by i and then negate and AND with the number
        int result = x & (~(1 << i));
        System.out.println(result);
    }

}

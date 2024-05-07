package BitManipulation;

public class CountNumberOfSetBits {
    public static void main(String[] args) {
        int x = 31, count = 0;

        while (x != 0) {
            count += (x & 1);
            x = x >> 1;
        }
        if (x == 1) {
            count++;
        }
        System.out.println(count);
    }

}

package BitManipulation;

public class CheckIfIthBitIsSetOrNot {
    public static void main(String[] args) {
        int x = 14;
        int i = 2;
        // We can use << and >> operators
        int res = x & (1 << i);
        if (res != 0) {
            System.out.println("Bit is set");
        } else {
            System.out.println("Bit is not set");
        }
    }

}

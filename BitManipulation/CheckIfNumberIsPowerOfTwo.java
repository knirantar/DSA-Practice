package BitManipulation;

public class CheckIfNumberIsPowerOfTwo {
    public static void main(String[] args) {
        int x = 32;
        int result = x & (x - 1);
        if (result != 0) {
            System.out.println("Not a power of two");
        } else {
            System.out.println("Power of two");
        }
    }
}

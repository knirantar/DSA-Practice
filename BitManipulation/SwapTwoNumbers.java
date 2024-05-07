package BitManipulation;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        // swap without using third variable
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println(a);
        System.out.println(b);

    }

}

package BitManipulation;

public class FindXOROfRangeOfNumbers {
    public static void main(String[] args) {
        int n = 9;
        // int xor = 0;
        // brute force
        // for (int i = 1; i <= n; i++) {
        // xor = xor ^ i;
        // }
        // System.out.println(xor);

        // There is pattern
        if (n % 4 == 1)
            System.out.println(1);
        else if (n % 4 == 2)
            System.out.println(n + 1);
        else if (n % 4 == 3)
            System.out.println(0);
        else
            System.out.println(n);

    }

}

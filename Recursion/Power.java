package Recursion;

public class Power {
    public static void main(String[] args) {
        int x = 2;
        int pow = 10;

        int ans = pow(x, pow);
        System.out.println(ans);
    }

    private static int pow(int x, int pow) {
        if (pow == 1)
            return 2;
        return x * pow(x, pow - 1);
    }

}

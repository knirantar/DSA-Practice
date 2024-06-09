package Recursion;

public class Power {
    public static void main(String[] args) {
        double x = 5.0;
        int pow = 24;

        int ans = pow(x, pow);
        System.out.println(ans);
    }

    private static int pow(double x, int n) {
        if (n == 0)
            return 1;
        long N = n;
        if (N < 0) {
            N = -N;
            x = 1 / x;
        }

        if (N % 2 == 0) {
            return pow(x * x, (int) (N / 2));
        }

        // If N is odd, recursively compute x^(N-1) and multiply it by x
        else {
            return (int) (x * pow(x, (int) (N - 1)));
        }
    }

}

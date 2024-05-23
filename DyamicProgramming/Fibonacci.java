package DyamicProgramming;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 7;
        int dp[] = new int[n + 1];
        for (int i = 0; i < dp.length; i++) {
            dp[i] = -1;
        }
        fibonacciTabulation(n);
        // System.out.println(ans);
    }

    // Fibonacci with memoization
    private static int fibonacci(int n, int[] dp) {

        if (n <= 1) {
            return n;
        }
        if (dp[n] != -1) {
            return dp[n];
        }
        return (fibonacci(n - 1, dp) + fibonacci(n - 2, dp));
    }

    // Fibonacci with Tabulation
    private static void fibonacciTabulation(int n) {
        int prev = 1;
        int prev2 = 0;
        for (int i = 2; i <= n; i++) {
            int curi = prev + prev2;
            prev2 = prev;
            prev = curi;
        }
        System.out.println(prev);
    }
}

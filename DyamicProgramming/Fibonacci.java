package DyamicProgramming;

import java.util.HashMap;
import java.util.Map;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 50;
        int dp[] = new int[n + 1];
        for (int i = 0; i < dp.length; i++) {
        dp[i] = -1;
        }
        fibonacciTabulation(n);
        //System.out.println(ans);
        // Map<Integer, Long> map = new HashMap<>();
        // long ans = fibo(n, map);
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
        long prev = 1;
        long prev2 = 0;
        for (int i = 2; i <= n; i++) {
            long curi = prev + prev2;
            prev2 = prev;
            prev = curi;
        }
        System.out.println(prev);
    }

    private static long fibo(int n, Map<Integer, Long> map) {

        if (map.containsKey(n))
            return map.get(n);
        if (n <= 2)
            return 1;

        map.put(n, fibo(n - 1, map) + fibo(n - 2, map));

        return map.get(n);

    }
}

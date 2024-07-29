package DyamicProgramming;

import java.util.HashMap;

public class Tribonacci {
    public static void main(String[] args) {
        int n = 35;
        int ans = tribonacci(n);
        // int ans = tribonacciMemo(n, new HashMap<Integer, Integer>());
        System.out.println(ans);
    }

    private static int tribonacci(int n) {
        if (n == 0 || n == 1)
            return 0;
        if (n == 2)
            return 1;

        return tribonacci(n - 1) + tribonacci(n - 2) + tribonacci(n - 3);

    }

    private static int tribonacciMemo(int n, HashMap<Integer, Integer> map) {
        if (n == 0 || n == 1)
            return 0;
        if (n == 2)
            return 1;

        if (map.containsKey(n))
            return map.get(n);

        int result = tribonacciMemo(n - 1, map) + tribonacciMemo(n - 2, map) + tribonacciMemo(n - 3, map);
        map.put(n, result);
        return result;
    }

}

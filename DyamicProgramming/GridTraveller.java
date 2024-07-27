package DyamicProgramming;

import java.util.HashMap;
import java.util.Map;

public class GridTraveller {
    public static void main(String[] args) {
        int m = 23;
        int n = 12;

        // int ans = uniquePaths(m, n);
        // System.out.println(ans);

        Map<String, Integer> map = new HashMap<>();
        int ans = gridTraveller(map, m, n);
        System.out.println(ans);
        ;
    }

    // Below is simple recursive solution it gives time limit exceeded for leetcode
    public static int uniquePaths(int m, int n) {
        if (m == 0 || n == 0)
            return 0;
        if (m == 1 && n == 1)
            return 1;

        return uniquePaths(m - 1, n) + uniquePaths(m, n - 1);
    }

    public static int gridTraveller(Map<String, Integer> map, int m, int n) {
        String key = m + "," + n;

        if (map.containsKey(key)) {
            return map.get(key);
        }

        if (m == 0 || n == 0)
            return 0;
        if (m == 1 && n == 1)
            return 1;

        map.put(key, uniquePaths(m - 1, n) + uniquePaths(m, n - 1));
        return map.get(key);

    }
}

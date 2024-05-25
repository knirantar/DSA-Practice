package Array;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] a = new int[] { 7, 6, 4, 3, 1 };

        Map<Integer, Integer> res = twoSum(a, 10);
        System.out.println(res);

    }

    private static Map<Integer, Integer> twoSum(int[] a, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        Map<Integer, Integer> ans = new HashMap<>();

        for (int i = 0; i < a.length; i++) {
            if (map.containsKey(k - a[i])) {
                ans.put(map.get(k - a[i]), i);
            } else {
                map.put(a[i], i);
            }
        }
        return ans;
    }

}

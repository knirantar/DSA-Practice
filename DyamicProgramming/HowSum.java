package DyamicProgramming;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HowSum {
    public static void main(String[] args) {
        int[] a = new int[] { 7, 14 };
        int target = 300;
        Map<Integer, List<Integer>> map = new HashMap<>();
        System.out.println(howSumMemo(a, target, map));
    }

    private static List<Integer> howSum(int[] a, int target) {
        if (target == 0)
            return new ArrayList<>();
        if (target < 0)
            return null;

        for (int i = 0; i < a.length; i++) {
            int rem = target - a[i];
            List<Integer> res = howSum(a, rem);
            if (res != null) {
                res.add(a[i]);
                return res;
            }
        }
        return null;
    }

    private static List<Integer> howSumMemo(int[] a, int target, Map<Integer, List<Integer>> map) {
        if (map.containsKey(target))
            return map.get(target);
        if (target == 0)
            return new ArrayList<>();
        if (target < 0)
            return null;

        for (int i = 0; i < a.length; i++) {
            int rem = target - a[i];
            List<Integer> res = howSumMemo(a, rem, map);
            if (res != null) {
                res.add(a[i]);
                map.put(target, res);
                return res;
            }
        }
        map.put(target, null);
        return null;
    }

}

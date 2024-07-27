package DyamicProgramming;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BestSum {
    public static void main(String[] args) {
        int[] a = new int[] { 1, 2, 5, 25 };
        int target = 100;
        Map<Integer, List<Integer>> map = new HashMap<>();
        System.out.println(bestSumMemo(a, target, map));
    }

    private static List<Integer> bestSum(int[] a, int target) {
        if (target == 0)
            return new ArrayList<>();
        if (target < 0)
            return null;

        List<Integer> best = null;

        for (int i = 0; i < a.length; i++) {
            int rem = target - a[i];
            List<Integer> res = bestSum(a, rem);
            if (res != null) {
                res.add(a[i]);

                if (best == null || res.size() < best.size()) {
                    best = res;
                }
            }
        }
        return best;
    }

    private static List<Integer> bestSumMemo(int[] a, int target, Map<Integer, List<Integer>> map) {
        if (map.containsKey(target))
            return map.get(target);
        if (target == 0)
            return new ArrayList<>();
        if (target < 0)
            return null;

        List<Integer> best = null;

        for (int i = 0; i < a.length; i++) {
            int rem = target - a[i];
            List<Integer> res = bestSumMemo(a, rem, map);
            if (res != null) {
                List<Integer> combination = new ArrayList<>(res);
                combination.add(a[i]);

                if (best == null || combination.size() < best.size()) {
                    best = combination;
                }
            }
        }
        map.put(target, best);
        return best;
    }

}

package DyamicProgramming;

import java.util.HashMap;
import java.util.Map;

public class CanSum {
    public static void main(String[] args) {
        int[] a = new int[] { 7, 14 };
        int target = 300;
        Map<Integer, Boolean> map = new HashMap<>();
        System.out.println(canSumMemo(a, target, map));
    }

    public static boolean canSum(int[] a, int target) {
        if (target == 0)
            return true;
        if (target < 0)
            return false;

        for (int i = 0; i < a.length; i++) {
            int rem = target - a[i];
            if (canSum(a, rem)) {
                return true;
            }
        }
        return false;
    }

    public static boolean canSumMemo(int[] a, int target, Map<Integer, Boolean> map) {
        if (map.containsKey(target))
            return map.get(target);
        if (target == 0)
            return true;
        if (target < 0)
            return false;

        for (int i = 0; i < a.length; i++) {
            int rem = target - a[i];
            if (canSumMemo(a, rem, map)) {
                map.put(target, true);
                return true;
            }
        }
        map.put(target, false);
        return false;
    }

}

package DyamicProgramming;

import java.util.HashMap;
import java.util.Map;

public class CountConstructString {
    public static void main(String[] args) {
        String target = "eeeeeeeeeeeeeeeeeeeeeeeeeeeeeef";
        String[] a = { "ee", "e", "eee", "eeeee", "eeeeee", "eeeeeeeeeee", "eeeeeee" };
        Map<String, Integer> map = new HashMap<>();
        System.out.println(countConstructMemo(target, a, map));
    }

    private static int countConstruct(String target, String[] a) {
        if (target == "")
            return 1;
        int totalCount = 0;
        for (int i = 0; i < a.length; i++) {
            if (target.indexOf(a[i]) == 0) {
                String rem = target.substring(a[i].length());
                int numWays = countConstruct(rem, a);
                totalCount += numWays;
            }
        }
        return totalCount;
    }

    private static int countConstructMemo(String target, String[] a, Map<String, Integer> map) {
        if (map.containsKey(target))
            return map.get(target);
        if (target == "")
            return 1;
        int totalCount = 0;
        for (int i = 0; i < a.length; i++) {
            if (target.indexOf(a[i]) == 0) {
                String rem = target.substring(a[i].length());
                int numWays = countConstructMemo(rem, a, map);
                totalCount += numWays;
            }
        }
        map.put(target, totalCount);
        return totalCount;
    }

}

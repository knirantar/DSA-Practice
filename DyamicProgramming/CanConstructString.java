package DyamicProgramming;

import java.util.HashMap;
import java.util.Map;

public class CanConstructString {
    public static void main(String[] args) {
        String target = "eeeeeeeeeeeeeeeeeef";
        String[] a = { "ee", "e", "eee", "eeeee", "eeeeee", "eeeeeeeeeee", "eeeeeee" };
        Map<String, Boolean> map = new HashMap<>();
        System.out.println(canConstructMemo(target, a, map));
    }

    private static boolean canConstruct(String target, String[] a) {
        if (target == "")
            return true;
        for (int i = 0; i < a.length; i++) {
            if (target.indexOf(a[i]) == 0) {
                String rem = target.substring(a[i].length());
                if (canConstruct(rem, a) == true) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean canConstructMemo(String target, String[] a, Map<String, Boolean> map) {
        if (map.containsKey(target))
            return map.get(target);
        if (target == "")
            return true;
        for (int i = 0; i < a.length; i++) {
            if (target.indexOf(a[i]) == 0) {
                String rem = target.substring(a[i].length());
                if (canConstructMemo(rem, a, map) == true) {
                    map.put(target, true);
                    return true;
                }
            }
        }
        map.put(target, false);
        return false;
    }

}

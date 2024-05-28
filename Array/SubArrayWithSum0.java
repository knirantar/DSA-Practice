package Array;

import java.util.HashMap;
import java.util.Map;

public class SubArrayWithSum0 {
    public static void main(String[] args) {
        int[] a = new int[] { -4,6,10,1,16 };
        System.out.println(sumZeroSubarray(a));
    }

    private static Boolean sumZeroSubarray(int[] a) {
        int prefixsum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            prefixsum = prefixsum + a[i];
            if (map.containsKey(prefixsum) || prefixsum == 0) {
                return true;
            } else {
                map.put(prefixsum, i);
            }
        }
        return false;

    }

}

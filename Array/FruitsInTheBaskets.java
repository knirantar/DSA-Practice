package Array;

import java.util.LinkedHashMap;
import java.util.Map;

/*
 * Find the largest subarray with at most two elements
 */
public class FruitsInTheBaskets {
    public static void main(String[] args) {
        int[] a = new int[] { 3, 3, 3, 1, 2, 1, 1, 2, 3, 3, 4 };
        findLargestSubarray(a);
    }

    private static void findLargestSubarray(int[] a) {
        int l = 0;
        int r = 0;
        int maxLength = 0;
        int n = a.length;
        Map<Integer, Integer> map = new LinkedHashMap<>();

        while (r < n) {
            map.put(a[r], map.getOrDefault(a[r], 0) + 1);
            if (map.size() > 2) {
                map.put(a[l], map.get(a[l]) - 1);
                if (map.get(a[l]) == 0)
                    map.remove(a[l]);
                l++;
            } else {
                maxLength = Math.max(r - l + 1, maxLength);
            }
            r++;
        }
        System.out.println(maxLength);
    }
}

package Array;

import java.util.HashMap;
import java.util.Map;

public class FindMaximumSubarrayWithSumK {
    public static void main(String[] args) {
        int[] a = new int[] { -13, -9, 16, 10, 19, 15, 5, 17, 10, 5, 6 };
        int k = 4;

        findMaxSubarrayWithSumK(a, k);
    }

    private static void findMaxSubarrayWithSumK(int[] a, int k) {
        int prefixSum = 0;
        int lsubarray = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        for (int i = 0; i < a.length; i++) {
            prefixSum = prefixSum + a[i];
            if (prefixSum == k) {
                lsubarray = i + 1;
            } else if (map.containsKey(prefixSum - k)) {
                lsubarray = Math.max(lsubarray, i - map.get(prefixSum - k));
            }
            if (!map.containsKey(prefixSum)) {
                map.put(prefixSum, i);
            }

        }
        System.out.println(lsubarray);
    }

    // Two pointer will only work for positive numbers
    private static void findMaxSubarrayWithSumKTwoPointers(int[] a, int k) {
        int l = 0;
        int r = 0;
        int sum = a[0];
        int maxLength = 0;
        while (r < a.length) {
            while (l <= r && sum > k) {
                sum = sum - a[l];
                l++;
            }
            if (sum == k) {
                maxLength = Math.max(maxLength, r - l + 1);
            }
            r++;
            if (r < a.length)
                sum = sum + a[r];
        }
        System.out.println(maxLength);
    }

}

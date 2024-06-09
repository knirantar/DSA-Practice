package Array;

import java.util.HashMap;
import java.util.Map;

/*
 *
 * Given an integer array nums and an integer k, return true if nums has a good subarray or false otherwise.

A good subarray is a subarray where:

its length is at least two, and
the sum of the elements of the subarray is a multiple of k.
Note that:

A subarray is a contiguous part of the array.
An integer x is a multiple of k if there exists an integer n such that x = n * k. 0 is always a multiple of k. 
*/
public class ContinuousSubarraySumK {
    public static void main(String[] args) {
        int[] a = new int[] { 23, 2, 4, 6, 7 };
        int k = 6;

        boolean ans = isContinuousSubarraySumK(a, k);
        System.out.println(ans);
    }

    /*
     * Here the logic applied is remainder and index of particular prefix sum and element is stored
     * in hashmap so that moment the remainder repeats we can know that some subarray is divisible by k
     * Difference between index and value of map because condition is that subarray should be at least 2 element long
     * 
     */
    private static boolean isContinuousSubarraySumK(int[] a, int k) {
        Map<Integer, Integer> map = new HashMap<>() {
            {
                put(0, -1);
            }
        };
        ;
        int prefix = 0;
        for (int i = 0; i < a.length; i++) {
            prefix = prefix + a[i];
            if (map.containsKey(prefix % k)) {
                if (i - map.get(prefix % k) > 1) {
                    return true;
                }
            } else {
                map.put(prefix % k, i);
            }
        }

        return false;
    }

}

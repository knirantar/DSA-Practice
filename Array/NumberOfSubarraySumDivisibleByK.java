package Array;

import java.util.LinkedHashMap;
import java.util.Map;

/*
 * Given an integer array nums and an integer k, return the number of non-empty subarrays that have a sum divisible by k.

A subarray is a contiguous part of an array.
 */
public class NumberOfSubarraySumDivisibleByK {
    public static void main(String[] args) {
        int[] a = new int[]{4,5,0,-2,-3,1};
        int k = 5;

        int ans = findNumberOfSubarraySumDivisibleByK(a,k);
        System.out.println(ans);
    }

    private static int findNumberOfSubarraySumDivisibleByK(int[] a, int k) {
        Map<Integer,Integer> map = new LinkedHashMap<>();
        map.put(0,1);
        int sum = 0;
        int count = 0;
        for(int i = 0;i<a.length;i++) {
            sum = (sum+a[i])%k;
            if(sum < 0) sum += k;
            count += map.getOrDefault(sum, 0);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return count;
    }
    
}

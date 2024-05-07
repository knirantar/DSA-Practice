/*
 * Koko Eating Bananas
 * 
 * There are n piles of bananas, the ith pile has piles[i] bananas. 
 * The guards have gone and will come back in h hours.
 * Koko can decide her bananas-per-hour eating speed of k. 
 * Each hour, she chooses some pile of bananas and eats k bananas from that pile. 
 * If the pile has less than k bananas, 
 * she eats all of them instead and will not eat any more bananas during this hour.
 * 
 * Return the minimum integer k such that she can eat all the bananas within h hours.
 * 
 * Example 1:

    Input: piles = [3,6,7,11], h = 8
    Output: 4
    Example 2:

    Input: piles = [30,11,23,4,20], h = 5
    Output: 30
    Example 3:

    Input: piles = [30,11,23,4,20], h = 6
    Output: 23

 */

package Array;

public class Array27 {
    public static void main(String[] args) {
        int[] piles = new int[] { 3, 6, 7, 11 };
        int h = 5;
        int ans = kokoEatingBananas(piles, h);
        System.out.println(ans);
    }

    public static int kokoEatingBananas(int[] piles, int h) {
        int max = piles[0];
        for (int i = 1; i < piles.length; i++) {
            if (piles[i] > max) {
                max = piles[i];
            }
        }
        int ans = -1;
        int low = 1;
        int high = max;
        while (low <= high) {
            int mid = (low + high) / 2;
            int inter = requiredTime(mid, piles);
            if (inter > h) {
                low = mid + 1;
            } else if (inter <= h) {
                ans = mid;
                high = mid - 1;
            }
        }
        return ans;
    }

    public static int requiredTime(int j, int[] piles) {
        int time = 0;
        for (int i = 0; i < piles.length; i++) {
            time = time + (int) Math.ceil((float) piles[i] / j);
        }
        return time;
    }

}

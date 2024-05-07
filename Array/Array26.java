/*
 * Find nth root of m
 */

package Array;

public class Array26 {
    public static void main(String[] args) {
        int n = 4;
        int m = 81;
        int ans = findNthRootOfM(n, m);
        System.out.println(ans);
    }

    public static int findNthRootOfM(int n, int m) {
        int low = 1;
        int high = m;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (raisedTo(mid, n) == m)
                return mid;
            else if (raisedTo(mid, n) > m)
                high = mid - 1;
            else {
                low = mid + 1;
            }
        }
        return -1;
    }

    // 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27
    public static int raisedTo(int mid, int n) {
        int ans = 1;
        for (int i = 0; i < n; i++) {
            ans = ans * mid;
        }
        return ans;
    }

}

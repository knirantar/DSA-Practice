package TwoDArray;

import java.util.Arrays;

public class MedianInRowWiseSortedMatrix {

    public static void main(String[] args) {
        int[][] a = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        int median = findMedianUsingBS(a);
        System.out.println(median);
    }

    private static int findMedian(int[][] a) {
        int[] res = new int[a.length * a[0].length];
        int k = 0;
        int n = a.length * a[0].length;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                res[k++] = a[i][j];
            }
        }
        Arrays.sort(res);
        return res[n / 2];
    }

    private static int findMedianUsingBS(int[][] a) {
        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;
        int n = a.length;
        int m = a[0].length;

        for (int i = 0; i < n; i++) {
            low = Math.min(low, a[i][0]);
            high = Math.max(high, a[i][m - 1]);
        }

        int req = (n * m) / 2;

        while (low <= high) {
            int mid = (low + high) / 2;
            int smallEqual = countSmallEqual(a, n, m, mid);
            if (smallEqual <= req)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return low;
    }

    private static int countSmallEqual(int[][] a, int n, int m, int mid) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            count += ub(a[i], mid, m);
        }
        return count;
    }

    private static int ub(int[] a, int x, int m) {
        int low = 0;
        int high = m - 1;
        int ans = m;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (a[mid] > x) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        if (ans == high && x > a[high])
            return -1;
        return ans;
    }

}

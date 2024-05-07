/*
 * Implement Lower Bound - Smallest index such that a[ind] >= x
 * Ceil of the element in array is also the same as lower bound 
 * Ceil value of x is a[ind] >= x
 */

package Array;

public class Array16 {
    public static void main(String[] args) {
        int[] arr = new int[] { 3, 5, 7, 12, 19, 21, 26, 43, 87 };
        int n = arr.length;
        int x = 4;

        int idx = lowerBound(arr, 0, n - 1, x);
        System.out.println("Lower Bound is " + idx);
    }

    public static int lowerBound(int[] arr, int low, int high, int x) {
        int ans = high;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] >= x) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        if (ans == high && x > arr[high])
            return -1;
        return ans;
    }

}

/*
 * Give the Floor value of number in array
 * Floor Value of x is a[ind] <= x
 */

package Array;

public class Array19 {
    public static void main(String[] args) {
        int[] arr = new int[] { 3, 5, 7, 12, 19, 21, 26, 43, 87 };
        int n = arr.length;
        int x = 20;

        int idx = floor(arr, 0, n - 1, x);
        System.out.println(idx);
    }

    public static int floor(int[] arr, int low, int high, int x) {
        int ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] <= x) {
                ans = arr[mid];
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

}

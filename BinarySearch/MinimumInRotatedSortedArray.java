/*
 * Find minimum in rotated sorted array
 * Find out how many times array has been rotated - same answer(need to remember)
 * 
 */

package BinarySearch;

public class MinimumInRotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = new int[] { 26, 43, 7, 12, 21 };
        int n = arr.length - 1;

        int min = minimumInRotatedSortedArray(arr, 0, n - 1);
        System.out.println(min);
    }

    public static int minimumInRotatedSortedArray(int[] arr, int low, int high) {
        int ans = Integer.MAX_VALUE;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[low] <= arr[mid]) {
                if (ans > arr[low]) {
                    ans = arr[low];
                }
                low = mid + 1;
            } else {
                if (arr[mid] < ans) {
                    ans = arr[mid];
                }
                high = mid - 1;
            }
        }
        return ans;
    }

}

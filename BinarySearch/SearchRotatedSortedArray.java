/*
 * Search an element in a rotated sorted array
 * With Unique elements
 */
//Need to Practice this more - Medium level
package BinarySearch;

public class SearchRotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = new int[] { 4, 5, 6, 7, 0, 1, 2 };
        int n = arr.length;
        int x = 0;
        int idx = searchRoatetedSortedArray(arr, 0, n - 1, x);
        System.out.println(idx);
    }

    public static int searchRoatetedSortedArray(int[] arr, int low, int high, int x) {
        while (low <= high) {
            int mid = (high + low) / 2;
            if (arr[mid] == x) {
                return mid;
            }
            // For duplicate elements
            if (arr[low] == arr[mid] && arr[mid] == arr[high]) {
                low++;
                high--;
                continue;
            }
            // Need to check which half is sorted from mid - Because one half of roateted
            // sorted array is always sorted
            else if (arr[low] <= arr[mid]) {
                // Need to check if search key lies where if from low to mid - eliminate other
                // half
                if (arr[low] <= x && x <= arr[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                if (arr[mid] <= x && x <= arr[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }

}

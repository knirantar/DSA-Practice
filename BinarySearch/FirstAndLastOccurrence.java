/*
 * Find the first and last occurrence of an element in an array
 */

package BinarySearch;

public class FirstAndLastOccurrence {
    public static void main(String[] args) {
        int[] arr = new int[] { 3, 5, 7, 12, 19, 21, 21, 21, 21, 26, 43, 87 };
        int n = arr.length;
        int x = 21;

        int first = lb(arr, 0, n - 1, x);
        if (first == -1) {
            System.out.println("Element not in array");
            return;
        }
        int last = ub(arr, 0, n - 1, x);
        System.out.println(first + " " + last);
    }

    public static int lb(int[] arr, int low, int high, int x) {
        int ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] >= x) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        if (arr[ans] != x) {
            return -1;
        }
        return ans;
    }

    public static int ub(int[] arr, int low, int high, int x) {
        int ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] > x) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans - 1;
    }

}

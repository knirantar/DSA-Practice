/*
 * Search the insert position of an element in the array.
 * If the element is present return its index if its not 
 * present give the right index for that element to be inserted in the array.
 */

package Array;

public class Array18 {
    public static void main(String[] args) {
        int[] arr = new int[] { 3, 5, 7, 12, 19, 21, 26, 43, 87 };
        int n = arr.length;
        int x = 18;

        int idx = searchInsertPosition(arr, 0, n - 1, x);
        System.out.println(idx);

    }

    public static int searchInsertPosition(int[] arr, int low, int high, int x) {
        int ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == x) {
                System.out.println("Element present");
                return mid;
            } else if (arr[mid] > x) {
                ans = mid;
                high = mid - 1;
            } else
                low = mid + 1;
        }
        return ans;
    }

}

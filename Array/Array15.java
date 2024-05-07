/*
 * Implement Binary Search
 * 
 */
package Array;

public class Array15 {
    public static void main(String[] args) {
        int[] arr = new int[] { 3, 5, 7, 12, 19, 21, 26, 43, 87 };
        int n = arr.length;
        int k = 7;
        int idx = binarySearch(arr, n - 1, k);
        if (idx == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at location " + (idx + 1));
        }

        int idx2 = binarySearchRecursive(arr, 0, arr.length - 1, k);
        if (idx2 == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at location " + (idx2 + 1));
        }

    }

    public static int binarySearch(int[] arr, int n, int k) {
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == k) {
                return mid;
            } else if (arr[mid] < k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static int binarySearchRecursive(int[] arr, int low, int high, int k) {

        if (low > high) {
            return -1;
        }
        int mid = (low + high) / 2;
        if (arr[mid] == k) {
            return mid;
        } else if (arr[mid] < k)
            return binarySearchRecursive(arr, mid + 1, high, k);
        else
            return binarySearchRecursive(arr, low, mid - 1, k);
    }

}

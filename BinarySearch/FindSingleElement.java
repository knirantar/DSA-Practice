/*
 * Find single element in sorted array.
 * 
 */
package BinarySearch;

public class FindSingleElement {
    public static void main(String[] args) {

        int[] arr = new int[] { 1, 1, 2, 2, 3, 3, 4, 5, 5, 6, 6 };
        int n = arr.length - 1;
        int elem = findSingleElement(arr, n);
        System.out.println(elem);

    }

    public static int findSingleElement(int[] arr, int n) {
        int low = 1;
        int high = n - 1;

        if (n == 1)
            return 0;
        if (arr[0] != arr[1])
            return 0;
        if (arr[n] != arr[n - 1])
            return n - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] != arr[mid - 1] && arr[mid] != arr[mid + 1]) {
                return mid;
            }
            if (arr[mid] == arr[mid - 1] && mid % 2 == 1) {
                low = mid + 1;
            } else if (arr[mid] == arr[mid - 1] && mid % 2 == 0) {
                high = mid - 1;
            } else if (arr[mid] == arr[mid + 1] && mid % 2 == 0) {
                low = mid + 1;
            } else if (arr[mid] == arr[mid + 1] && mid % 2 == 1) {
                high = mid - 1;
            }
        }

        return -1;
    }

}

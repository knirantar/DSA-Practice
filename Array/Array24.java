/*
 * Find Peak Element. Peak arr[i-1] < arr[i] > arr[i+1]
 * Array may have multiple peaks
 * 
 */
package Array;

public class Array24 {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 10, 13, 7, 6, 5, 4, 2, 1, 0 };
        int n = arr.length;
        int peak = findPeakElement(arr, 0, n - 1);
        System.out.println(peak);
    }

    public static int findPeakElement(int[] arr, int low, int high) {
        if (arr.length == 1)
            return arr[0];
        if (arr[0] > arr[1])
            return arr[0];
        if (arr[arr.length - 1] > arr[arr.length - 2])
            return arr[arr.length - 1];
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                return arr[mid];
            } else if (arr[mid] > arr[mid - 1]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

}

/*
 * Sort the array using merge sort
 */
package Array;

public class Array12 {
    public static void main(String[] args) {
        int[] arr = new int[] { 100, 10, 23, 14, 12, 9 };
        int n = arr.length;
        mergeSort(arr, 0, n - 1);
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
    }

    public static void mergeSort(int[] arr, int start, int end) {

        if (start >= end)
            return;
        int mid = (start + end) / 2;
        mergeSort(arr, start, mid);
        mergeSort(arr, mid + 1, end);
        merge(arr, start, mid, end);
    }

    public static void merge(int[] arr, int start, int mid, int end) {
        int[] result = new int[end - start + 1];
        int idx1 = start;
        int idx2 = mid + 1;
        int x = 0;

        while (idx1 <= mid && idx2 <= end) {
            if (arr[idx1] <= arr[idx2]) {
                result[x++] = arr[idx1++];
            } else {
                result[x++] = arr[idx2++];
            }
        }
        while (idx1 <= mid) {
            result[x++] = arr[idx1++];
        }
        while (idx2 <= end) {
            result[x++] = arr[idx2++];
        }

        for (int k = start; k <= end; k++) {
            arr[k] = result[k - start];
        }
    }

}

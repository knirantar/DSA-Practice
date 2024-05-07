/*
 * Sort the array using quick sort
 * Pick a pivot - any element - first, last, middle
 * Smaller on the left and Larger on the right
 * 
 */
package Array;

public class Array13 {
    public static void main(String[] args) {
        int[] arr = new int[] { 4, 6, 2, 5, 7, 9, 1, 3 };
        int n = arr.length;

        quickSort(arr, 0, n);
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int partitionIndex = placePivot(arr, low, high);
            quickSort(arr, low, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, high);
        }
    }

    public static int placePivot(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low;
        int j = high;
        while (i < j) {
            while (arr[i] <= pivot && i <= high - 1) {
                i++;
            }
            while (arr[j] > pivot && j >= low + 1) {
                j--;
            }

            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;

        return j;

    }

}

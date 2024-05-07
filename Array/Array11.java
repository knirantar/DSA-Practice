/*
 * Sort the array using insertion sort
 */
package Array;

public class Array11 {
    public static void main(String[] args) {
        int[] arr = new int[] { 100, 10, 23, 14, 12, 9 };

        insertionSort(arr);
    }

    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int current = arr[i];
            int j = i - 1;

            while (j >= 0 && current < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
            for (int k = 0; k < arr.length; k++) {
                System.out.print(arr[k] + " ");
            }
            System.out.println();
        }

    }

}

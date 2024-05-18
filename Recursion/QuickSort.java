package Recursion;

public class QuickSort {
    public static void main(String[] args) {
        int[] a = new int[] { 3, 1, 2, 4, 1, 5, 2, 6, 4 };
        // First step of Quick sort is Pick a pivot - can be first/last/middle element
        // Place the pivot at its correct place
        // Smaller on the left and larger on the right
        // Repeat recursively
        quickSort(a, 0, a.length - 1);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    private static void quickSort(int[] a, int low, int high) {
        if (low < high) {
            int partition = findPivot(a, low, high);
            quickSort(a, low, partition - 1);
            quickSort(a, partition + 1, high);
        }
    }

    private static int findPivot(int[] a, int low, int high) {
        int pivot = a[low];
        int i = low;
        int j = high;
        while (i < j) {
            while (a[i] <= pivot && i <= high) {
                i++;
            }

            while (a[j] > pivot && j >= low) {
                j--;
            }
            if (i < j) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }

        int temp = a[j];
        a[j] = a[low];
        a[low] = temp;

        return j;
    }

}

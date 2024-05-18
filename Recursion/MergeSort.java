package Recursion;

public class MergeSort {
    public static void main(String[] args) {
        // Divide and Merge
        int[] a = new int[] { 3, 1, 2, 4, 1, 5, 2, 6, 4 };
        a = mergeSort(a, 0, a.length - 1);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    private static int[] mergeSort(int[] a, int low, int high) {

        if (low >= high) {
            return null;
        }
        int mid = (low + high) / 2;
        mergeSort(a, low, mid);
        mergeSort(a, mid + 1, high);
        merge(a, low, mid, high);
        return a;
    }

    private static void merge(int[] a, int low, int mid, int high) {
        int[] b = new int[a.length];
        int i = 0;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= high) {
            if (a[i] < a[j]) {
                b[k] = a[i];
                i++;
                k++;
            } else if (a[j] < a[i]) {
                b[k] = a[j];
                j++;
                k++;
            } else {
                b[k] = a[i];
                i++;
                k++;
            }
        }
        while (i <= mid) {
            b[k] = a[i];
            k++;
            i++;
        }
        while (j < a.length) {
            b[k] = a[j];
            k++;
            j++;
        }
        for (i = 0; i < b.length; i++) {
            a[i] = b[i];
        }
    }
}

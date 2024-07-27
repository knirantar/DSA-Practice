package SortingAlgos;

public class MergeSortTwo {
    public static void main(String[] args) {
        int[] arr = new int[] { 100, 10, 23, 14, 12, 9 };
        int start = 0;
        int end = arr.length - 1;
        mergeSort(arr, start, end);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    private static void mergeSort(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }
        int mid = (start + end) / 2;
        mergeSort(arr, start, mid);
        mergeSort(arr, mid + 1, end);
        merge(arr, start, mid, end);
    }

    private static void merge(int[] arr, int start, int mid, int end) {
        int i = start;
        int j = mid + 1;
        int k = 0;
        int[] ans = new int[end - start + 1];

        while (i <= mid && j <= end) {
            if (arr[i] >= arr[j]) {
                ans[k++] = arr[j++];
            } else {
                ans[k++] = arr[i++];
            }
        }

        while (i <= mid) {
            ans[k++] = arr[i++];
        }
        while (j < end) {
            ans[k++] = arr[j++];
        }

        for (int r = start; r <= end; r++) {
            arr[r] = ans[r-start];
        }

    }

}

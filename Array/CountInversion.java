package Array;

/*
 * Inversion Count: For an array, inversion count indicates how far (or close) the array is from being sorted. If the array is already sorted then the inversion count is 0.
If an array is sorted in the reverse order then the inversion count is the maximum. 
 */
public class CountInversion {
    public static void main(String[] args) {
        int[] a = new int[] { 2, 4, 11, 3, 15 };

        // int res = countInversion(a);
        // System.out.println(res);
        int[] ans = new int[] { 0 };
        mergeSort(a, 0, a.length - 1, ans);
        System.out.println(ans[0]);

    }

    private static int countInversion(int[] a) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void mergeSort(int[] arr, int start, int end, int[] ans) {

        if (start >= end)
            return;
        int mid = (start + end) / 2;
        mergeSort(arr, start, mid, ans);
        mergeSort(arr, mid + 1, end, ans);
        merge(arr, start, mid, end, ans);
    }

    public static void merge(int[] arr, int start, int mid, int end, int[] ans) {
        int[] result = new int[end - start + 1];
        int idx1 = start;
        int idx2 = mid + 1;
        int x = 0;

        while (idx1 <= mid && idx2 <= end) {
            if (arr[idx1] <= arr[idx2]) {
                result[x++] = arr[idx1++];
            } else {
                ans[0] += (mid - idx1 + 1);
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

package SortingAlgos;

public class QuickSortTwo {
    public static void main(String[] args) {
        int[] arr = new int[] { 100, 10, 23, 14, 12, 9 };

        quickSort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    private static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivot = placePivot(arr, low, high);

            quickSort(arr, low, pivot - 1);
            quickSort(arr, pivot + 1, high);
        }
    }

    private static int placePivot(int[] arr, int low, int high) {
        int pivot = high;
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < arr[pivot]) {
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;}}
        i++;
        int temp = arr[pivot];
        arr[pivot] = arr[i];
        arr[i] = temp;
        return i;
    }

}

/*
 * Sort the array using bubble sort
 */
package Array;

public class Array10 {
    public static void main(String[] args) {
        int[] arr = new int[] { 100, 10, 23, 14, 12, 9 };
        bubbleSort(arr);

    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            for (int k = 0; k < arr.length; k++) {
                System.out.print(arr[k] + " ");
            }
            System.out.println();
        }
    }
}

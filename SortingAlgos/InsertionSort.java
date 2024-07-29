/*
 * Sort the array using insertion sort
 */
package SortingAlgos;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = new int[] { 100, 10, 23, 14, 12, 9 };

        insertionSort(arr);
    }

    public static void insertionSort(int[] arr) {
        int n = arr.length;

        for(int i = 1;i<n;i++) {
            int current = arr[i];
            int j = i-1;
            while(j >= 0 && arr[j]>current) {
                arr[j+1] = arr[j];
                j--;
            }
<<<<<<< HEAD
            arr[j+1] = current;

            for(int r = 0;r<arr.length;r++) {
                System.out.print(arr[r]+ " ");
            }
            System.out.println();
=======
            arr[j + 1] = current;
>>>>>>> 1fd1a8d9cbd398a9cae27489697c73597177c50e
        }

    }

}

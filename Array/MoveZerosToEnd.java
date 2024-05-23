/*
 * Given an array of integers, write a function to move all 0's to end of it while maintaining the relative order of the non zero elements.
 * https://www.youtube.com/watch?v=aayNRwUN3Do
 */
package Array;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        int arr[] = new int[] { 0, 1, 0, 4, 12, 0, 0, 7, 79, 0, 0, 0 };
        int[] result = moveZerosToEnd(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

    public static int[] moveZerosToEnd(int[] arr) {
        int n = arr.length;
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j++] = temp;
            }
        }
        return arr;
    }
}

/*
 * Find minimum value in array
 */
package Array;

public class FindMinimumInArray {
    public static void main(String[] args) {
        int[] arr = new int[] { 2, 5, 1, 6, 4, 7, -3 };

        System.out.println(findMinimumInArray(arr));
    }

    public static int findMinimumInArray(int[] arr) {
        int n = arr.length;
        int min = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}

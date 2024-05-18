/*
 * Find second maximum value in array. Provided that second maximum value exists.
 */
package Array;

public class FindSecondMaximumInArray {
    public static void main(String[] args) {
        int[] arr = new int[] {
                -1, 3, 55, 66, 5, 6, 43, 21, 433, 68
        };
        System.out.println(findSecondMaximum(arr));
    }

    public static int findSecondMaximum(int[] arr) {
        int max = arr[0];
        int secondMax = arr[0];
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax && arr[i] < max) {
                secondMax = arr[i];
            }
        }
        return secondMax;
    }

}

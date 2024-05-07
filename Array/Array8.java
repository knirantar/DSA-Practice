/*
 * Find a peak element which is not smaller than its neighbours. Array must be strictly increasing and then
 * maybe strictly decreasing. Find the maximum element in the array.
 */
package Array;

public class Array8 {
    public static void main(String[] args) {
        int[] arr = new int[] { 10, 2 };
        findPeakElement(arr);
    }

    public static void findPeakElement(int[] arr) {
        int n = arr.length;
        int peak = arr[0];
        int flag = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] >= peak) {
                peak = arr[i];
                flag = 1;
            } else if (flag == 1) {
                flag = 0;
                System.out.println(peak);
            }
        }
        if (flag == 1) {
            System.out.println(peak);
        }
    }

}

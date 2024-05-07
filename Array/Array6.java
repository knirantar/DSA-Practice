/*
 * 
 * Given an array of n-1 distinct numbers in the range of 1 to n. Find the missing number in it.
 * 
 */
package Array;

public class Array6 {
    public static void main(String[] args) {
        int[] arr = new int[] { 2, 4, 10, 5, 9, 8, 6, 3, 7 };
        System.out.println(findMissingNumber(arr));
    }

    public static int findMissingNumber(int[] arr) {
        int n = arr.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
        }
        return ((n + 1) * (n + 2) / 2) - sum;
    }

}

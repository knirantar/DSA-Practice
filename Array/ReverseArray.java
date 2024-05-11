/*
 * Reverse an array
 * 
 */
package Array;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = new int[] { 22, 223, 5, 6, 7 };
        int[] result = reverseArray(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }

    }

    public static int[] reverseArray(int[] arr) {
        int n = arr.length;
        int j = n - 1;
        for (int i = 0; i < j; i++) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            j--;
        }
        return arr;
    }

}

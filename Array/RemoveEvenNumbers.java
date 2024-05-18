/*
 * Remove even number from given array of integers
 * 
 */

package Array;

class RemoveEvenNumbers {

    public static void main(String ags[]) {
        int arr[] = new int[] {
                3, 5, 4, 2, 79, 8, 1
        };
        int[] result = removeEven(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

    public static int[] removeEven(int[] arr) {
        int n = arr.length;
        int oddCount = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 1) {
                oddCount++;
            }
        }
        int result[] = new int[oddCount];
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 1) {
                result[j] = arr[i];
                j++;
            }
        }
        return result;
    }
}
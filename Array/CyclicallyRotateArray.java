package Array;

//Right Rotate
public class CyclicallyRotateArray {
    public static void main(String[] args) {
        int[] arr = new int[] { 12, 3, 5, 7, 19, 23 };
        int k = 3;
        rotateArray(arr, k);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        // 5,3,12,7,19,23
        // 5,3,12,23,19,7
        // 7,19,23,12,3,5
    }

    private static void rotateArray(int[] arr, int k) {
        // First find out the actual number of rotations in the array using a modulo
        // operator with length of array
        int r = k % arr.length;
        int i = 0;
        int j = r - 1;

        // Reverse an array till rotations -1 element
        while (i < j) {
            swap(arr, i, j);
            i++;
            j--;
        }
        i = r;
        j = arr.length - 1;
        while (i < j) {
            swap(arr, i, j);
            i++;
            j--;
        }

        i = 0;
        j = arr.length - 1;
        while (i < r) {
            swap(arr, i, j);
            i++;
            j--;
        }
    }

    private static void swap(int[] arr, int i, int r) {
        int temp = arr[i];
        arr[i] = arr[r];
        arr[r] = temp;
    }

}

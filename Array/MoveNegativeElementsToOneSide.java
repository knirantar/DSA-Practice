package Array;

public class MoveNegativeElementsToOneSide {
    public static void main(String[] args) {
        int[] arr = new int[] { -5, 7, -3, -4, 9, 10, -1, 11 };
        moveNegativeElements(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    private static void moveNegativeElements(int[] arr) {
        int l = 0;
        int r = arr.length - 1;
        while (l < r) {
            if (arr[l] < 0) {
                int temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
                r--;
            } else {
                l++;
            }
        }
    }
}
package Array;

public class Sort012 {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 0, 2, 1, 2, 0 };
        sortTheElements(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

    private static void sortTheElements(int[] arr) {
        int l = 0;
        int mid = 0;
        int r = arr.length - 1;

        while (mid < r) {
            if (arr[mid] == 2) {
                int temp = arr[r];
                arr[r] = arr[mid];
                arr[mid] = temp;
                r--;
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                int temp = arr[l];
                arr[l] = arr[mid];
                arr[mid] = temp;
                l++;
            }
        }

    }

}

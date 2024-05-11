package Array;

import java.util.Arrays;

public class MinimizeMaximumDifferenceBetweenHeights {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 5, 8, 10};
        Arrays.sort(arr);
        int k = 2;
        int res = findMinimumMaxDifferenceBetweenHeights(arr, k);
        System.out.println(res);
    }

    private static int findMinimumMaxDifferenceBetweenHeights(int[] arr, int k) {
        if (arr.length == 1)
            return 0;
        int maxDiff = arr[arr.length - 1] - arr[0];

        int min, max;
        for (int i = 1; i < arr.length; i++) {
            if ((arr[i] - k) < 0)
                continue;
            max = Math.max(arr[arr.length - 1] - k, arr[i - 1] + k);
            min = Math.min(arr[0] + k, arr[i] - k);

            maxDiff = Math.min(maxDiff, max - min);
        }
        return maxDiff;

    }
}

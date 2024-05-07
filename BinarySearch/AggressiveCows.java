package BinarySearch;

/*
 * Place k cows such that minimum distance between any two cows is maximum
 * Pattern - Min of max and Max of min
 */

public class AggressiveCows {
    public static void main(String[] args) {
        int[] arr = new int[] { 0, 3, 4, 7, 9, 10 };
        int cows = 4;
        arr = sort(arr);
        int result = findMinimumDistanceWhichIsMaximum(arr, cows);
        System.out.println(result);

    }

    private static int findMinimumDistanceWhichIsMaximum(int[] arr, int cows) {
        int low = 0, high = arr[arr.length - 1] - arr[0];
        while (low <= high) {
            int mid = (low + high) / 2;
            if (canWePlace(arr, mid, cows)) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return high;
    }

    private static boolean canWePlace(int[] arr, int dist, int cows) {
        int countCows = 1, last = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - last >= dist) {
                countCows++;
                last = arr[i];
            }
            if (countCows >= cows)
                return true;
        }
        return false;
    }

    private static int[] sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        return arr;
    }

}

package BinarySearch;

public class LeastCapacityOfShipToDeliverPackagesInDDays {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int d = 10;
        int result = findLeastCapacityOfShip(arr, d);
        System.out.println(result);
    }

    private static int findLeastCapacityOfShip(int[] arr, int d) {
        int maxInt = -1;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxInt) {
                maxInt = arr[i];
            }
            sum = sum + arr[i];
        }
        int low = maxInt;
        int high = sum;
        while (low <= high) {
            int mid = (low + high) / 2;
            int ndays = findNumberOfDays(arr, mid);
            if (ndays <= d) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    private static int findNumberOfDays(int[] arr, int mid) {
        int sum = 0;
        int d = 1;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            if (sum > mid) {
                d++;
                sum = arr[i];
            }
        }
        return d;
    }

}

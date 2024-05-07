package BinarySearch;

public class FindSmallestDivisorForGivenThreshold {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 5, 9 };
        int threshold = 6;
        int result = findSmallestDivisorForGivenThreshold(arr, threshold);
        System.out.println(result);
    }

    public static int findSmallestDivisorForGivenThreshold(int[] arr, int threshold) {

        int low = 1, high = 1, ans = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > high) {
                high = arr[i];
            }
        }
        while (low <= high) {
            int mid = (low + high) / 2;
            double sum = findDivisorSum(arr, mid);
            if (sum <= threshold) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;

    }

    private static double findDivisorSum(int[] arr, int mid) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + Math.ceil((double) arr[i] / (double) mid);
        }
        return sum;
    }

}

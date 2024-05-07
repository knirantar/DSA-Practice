/*
 * Given the coordinates of gas stations in sorted order
 * Need to add k new gas stations such that maximum distance between any two gas stations is minimum
 * 
 * Answers within 10^-6 of the actual value will be accepted
 * 
 */

package BinarySearch;

public class MnimizeMaximumDistanceBetweenGasStations {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 13, 17, 23 };
        int k = 5;
        double result = findMinimumOfMaximumDistanceWithNewStations(arr, k);
        System.out.println(result);
    }

    // bruteForce
    private static double findMinimumOfMaximumDistanceWithNewStations(int[] arr, int k) {
        int n = arr.length;
        int[] howMany = new int[n - 1];
        for (int i = 1; i <= k; i++) {
            double maxSection = -1;
            int maxInd = -1;
            for (int j = 0; j < n - 1; j++) {
                double diff = arr[j + 1] - arr[j];
                double sectionLength = diff / (double) (howMany[j] + 1);
                if (sectionLength > maxSection) {
                    maxSection = sectionLength;
                    maxInd = j;
                }
            }
            howMany[maxInd]++;
        }
        double maxAns = -1;
        for (int i = 0; i < n - 1; i++) {
            double diff = arr[i + 1] - arr[i];
            double sectionLength = diff / (double) (howMany[i] + 1);
            maxAns = max(maxAns, sectionLength);
        }
        return maxAns;
    }

    private static double max(double maxAns, double sectionLength) {
        if (maxAns > sectionLength)
            return maxAns;
        else
            return sectionLength;
    }

    // Can be solved by priority queue as well reducing time complexity
    // Can be solved by Binary search as well but slightly differently as it
    // involves double

}
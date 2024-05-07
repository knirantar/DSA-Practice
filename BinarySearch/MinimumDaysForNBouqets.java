package BinarySearch;

public class MinimumDaysForNBouqets {
    public static void main(String[] args) {
        int[] bloomDay = new int[] { 7, 7, 7, 7, 13, 11, 12, 7 };
        int m = 2;// Bouquets
        int k = 3;// k adjacent flowers
        int ans = findMinimumDays(bloomDay, m, k);
        System.out.println(ans);
    }

    private static int findMinimumDays(int[] bloomDay, int m, int k) {
        if (m * k > bloomDay.length)
            return -1;

        int maxFlowers = Integer.MIN_VALUE;
        int minFlowers = Integer.MAX_VALUE;
        for (int i = 0; i < bloomDay.length; i++) {
            if (bloomDay[i] > maxFlowers) {
                maxFlowers = bloomDay[i];
            }
            if (bloomDay[i] < minFlowers) {
                minFlowers = bloomDay[i];
            }
        }
        int low = minFlowers;
        int high = maxFlowers;
        int ans = -1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int b = findNumberOfBouqets(bloomDay, mid, k);
            if (b >= m) {
                ans = mid;
                high = mid - 1;
            } else
                low = mid + 1;
        }
        return ans;
    }

    private static int findNumberOfBouqets(int[] bloomDay, int mid, int k) {
        int count = 0;
        int b = 0;
        for (int i = 0; i < bloomDay.length; i++) {
            if (bloomDay[i] <= mid) {
                count++;
            } else {
                b = b + (count / k);
                count = 0;
            }
        }
        b = b + (count / k);
        return b;
    }

}

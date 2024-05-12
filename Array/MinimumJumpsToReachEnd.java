package Array;

public class MinimumJumpsToReachEnd {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 3, 5, 8, 9, 2, 6, 7, 6, 8 };
        int res = findMinimumJumps(arr);
        System.out.println(res);
    }

    // Greedy solution

    private static int findMinimumJumps(int[] arr) {
        int res = 0;
        int l = 0, r = 0;

        while (r < arr.length) {
            int farthest = 0;
            for (int i = l; i < r + 1; i++) {
                farthest = Math.max(farthest, i + arr[i]);
            }
            l = r + 1;
            r = farthest;
            res += 1;
        }
        return res;
    }

}

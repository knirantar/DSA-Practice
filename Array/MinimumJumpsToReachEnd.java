package Array;

public class MinimumJumpsToReachEnd {
    public static void main(String[] args) {
        int[] arr = new int[] { 2, 3, 1, 2, 3, 1, 1, 2 };
        int res = findMinimumJumps(arr);
        System.out.println(res);
    }

    // Greedy solution

    private static int findMinimumJumps(int[] arr) {
        int destination = arr.length - 1;
        int jumps = 0;
        int coverage = 0;
        int lastJumpIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            coverage = Math.max(coverage, i + arr[i]);

            if (i == lastJumpIndex) {
                lastJumpIndex = coverage;
                jumps++;
                if (coverage >= destination) {
                    return jumps;
                }
            }
        }
        return jumps;
    }

}

package Array;

public class MaxConsecutiveOnesWithZeroFlips {
    public static void main(String[] args) {
        int k = 4;
        int[] a = new int[] { 0, 0, 0, 1 };
        int ans = findMaximumConsecutive(a, k);
        System.out.println(ans);
    }

    private static int findMaximumConsecutive(int[] a, int k) {
        int l = 0;
        int r = 0;
        int maxLength = 0;
        int n = a.length;
        int zeros = k;

        while (r < n) {
            if (a[r] == 1) {
                r++;
            } else {
                if (zeros > 0) {
                    r++;
                    zeros--;
                } else {
                    maxLength = Math.max(r - l, maxLength);
                    if (a[l] == 0) {
                        zeros++;
                    }
                    l++;
                }
            }
        }
        return Math.max(maxLength, r - l);
    }

}

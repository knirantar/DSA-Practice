package Recursion;

import java.util.ArrayList;
import java.util.List;

public class CountSubsequencesWithSumK {
    public static void main(String[] args) {
        int[] a = new int[] { 2, 5, 1, 6, 4, 7, -3 };
        List<Integer> ans = new ArrayList<>();
        int n = a.length;
        int k = 6;
        System.out.println(countSubsequencesWithSumK(0, ans, 0, k, a, n));
    }

    private static int countSubsequencesWithSumK(int i, List<Integer> ans, int sum, int k, int[] a, int n) {
        if (i == n) {
            if (sum == k) {
                return 1;
            } else {
                return 0;
            }

        }
        // Include the current element
        ans.add(a[i]);
        sum = sum + a[i];
        int l = countSubsequencesWithSumK(i + 1, ans, sum, k, a, n);

        // Exclude the current element backtrack
        sum = sum - a[i];
        ans.remove(ans.size() - 1);
        int r = countSubsequencesWithSumK(i + 1, ans, sum, k, a, n);

        return l + r;

    }

}

package Recursion;

import java.util.ArrayList;
import java.util.List;

public class SubsequenceWithSumKOnlyOne {
    public static void main(String[] args) {
        int[] a = new int[] { 2, 5, 1, 6, 4, 7, -3 };
        List<Integer> ans = new ArrayList<>();
        int n = a.length;
        int k = 5;
        subsequenceWithSumKOnlyOne(0, ans, 0, k, a, n);
    }

    private static Boolean subsequenceWithSumKOnlyOne(int i, List<Integer> ans, int sum, int k, int[] a, int n) {
        if (i == n) {
            if (sum == k) {
                for (int r = 0; r < ans.size(); r++) {
                    System.out.print(ans.get(r) + " ");
                }
                System.out.println();
                return true;
            } else {
                return false;
            }

        }
        // Include the current element
        ans.add(a[i]);
        sum = sum + a[i];
        if (subsequenceWithSumKOnlyOne(i + 1, ans, sum, k, a, n) == true) {
            return true;
        }

        // Exclude the current element backtrack
        sum = sum - a[i];
        ans.remove(ans.size() - 1);
        if (subsequenceWithSumKOnlyOne(i + 1, ans, sum, k, a, n) == true) {
            return true;
        }

        return false;
    }

}

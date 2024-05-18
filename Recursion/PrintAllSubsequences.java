package Recursion;

import java.util.ArrayList;
import java.util.List;

public class PrintAllSubsequences {
    public static void main(String[] args) {
        int[] a = new int[] { 3, 1, 2 };
        int n = a.length;
        List<Integer> ans = new ArrayList<>();
        printAllSubsequences(a, 0, ans, n);
    }

    private static void printAllSubsequences(int[] a, int i, List<Integer> ans, int n) {
        if (i == n) {
            for (int j = 0; j < ans.size(); j++) {
                System.out.print(ans.get(j) + " ");
            }
            System.out.println();
            return;
        }
        ans.add(a[i]);
        printAllSubsequences(a, i + 1, ans, n);
        ans.remove(ans.size() - 1);
        printAllSubsequences(a, i + 1, ans, n);
    }

}

package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
 * Given a collection of candidate numbers (candidates) and a target number (target), find all unique combinations in candidates where the candidate numbers sum to target.

Each number in candidates may only be used once in the combination.

Note: The solution set must not contain duplicate combinations.
 */
public class CombinationSumUnique {
    public static void main(String[] args) {
        int[] a = new int[] { 3, 2, 5, 6, 4 };
        int target = 8;

        combinationSum(a, target);
    }

    private static void combinationSum(int[] a, int target) {
        Set<List<Integer>> ans = new HashSet<>();
        Arrays.sort(a);
        findCombinations(0, a, target, ans, new ArrayList<>());
        System.out.println(ans);

    }

    private static void findCombinations(int ind, int[] a, int target, Set<List<Integer>> ans,
            ArrayList<Integer> arrayList) {
        if (target == 0) {
            ans.add(new ArrayList<>(arrayList));
            return;
        }

        for (int i = ind; i < a.length; i++) {
            if (i > ind && a[i] == a[i - 1])
                continue;
            if (a[i] > target)
                break;

            arrayList.add(a[i]);
            findCombinations(ind + 1, a, target - a[i], ans, arrayList);
            arrayList.remove(arrayList.size() - 1);
        }
    }

}

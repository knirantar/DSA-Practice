package Recursion;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public static void main(String[] args) {
        int[] a = new int[] { 3, 2, 5, 6, 4 };
        int target = 50;
        combinationSum(a, target);
    }

    private static void combinationSum(int[] a, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        findCombinations(0, a, target, ans, new ArrayList<>());
        for (int i = 0; i < ans.size(); i++) {
            System.out.println(ans.get(i));
        }
    }

    private static void findCombinations(int i, int[] a, int target, List<List<Integer>> ans,
            ArrayList<Integer> arrayList) {
        if (i == a.length) {
            if (target == 0) {
                ans.add(new ArrayList<Integer>(arrayList));
            }
            return;
        }

        if (a[i] <= target) {
            arrayList.add(a[i]);
            findCombinations(i, a, target - a[i], ans, arrayList);
            arrayList.remove(arrayList.size() - 1);
        }
        findCombinations(i + 1, a, target, ans, arrayList);
    }

}

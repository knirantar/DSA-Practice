package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSum {
    public static void main(String[] args) {
        int[] a = new int[] { -2, 0, 0, 2, 2 };
        Arrays.sort(a);
        findTriplets(a);
    }

    private static void findTriplets(int[] a) {
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            if (i != 0 && a[i] == a[i - 1])
                continue;

            int j = i + 1;
            int k = a.length - 1;

            while (j < k) {
                int sum = a[i] + a[j] + a[k];
                if (sum == 0) {
                    ans.add(new ArrayList<>(Arrays.asList(a[i], a[j], a[k])));
                    j++;
                    k--;
                } else if (sum < 0) {
                    j++;
                } else {
                    k--;
                }
            }
        }
        Set<List<Integer>> set = new HashSet<>(ans);
        ans.clear();
        ans.addAll(set);
        System.out.println(ans);
    }

}

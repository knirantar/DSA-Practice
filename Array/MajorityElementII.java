package Array;

import java.util.ArrayList;
import java.util.List;

public class MajorityElementII {
    public static void main(String[] args) {
        int[] a = new int[] { 1, 2, 2, 3, 2 };
        findMajorityElements(a);
    }

    private static void findMajorityElements(int[] a) {
        int count1 = 0;
        int count2 = 0;
        int elem1 = Integer.MIN_VALUE;
        int elem2 = Integer.MIN_VALUE;

        for (int i = 0; i < a.length; i++) {
            if (count1 == 0 && a[i] != elem2) {
                count1 = 1;
                elem1 = a[i];
            } else if (count2 == 0 && a[i] != elem1) {
                count2 = 1;
                elem2 = a[i];
            } else if (a[i] == elem1) {
                count1++;
            } else if (a[i] == elem2) {
                count2++;
            } else {
                count1--;
                count2--;
            }
        }
        count1 = 0;
        count2 = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == elem1)
                count1++;
            if (a[i] == elem2)
                count2++;
        }
        List<Integer> ans = new ArrayList<>();
        int min = (int) (a.length / 3) + 1;
        if (count1 >= min)
            ans.add(elem1);
        if (count2 >= min)
            ans.add(elem2);

    }

}

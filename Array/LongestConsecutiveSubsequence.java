package Array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/*
 * Input:
N = 7
a[] = {2,6,1,9,4,5,3}
Output:
6
Explanation:
The consecutive numbers here
are 1, 2, 3, 4, 5, 6. These 6 
 */
public class LongestConsecutiveSubsequence {
    public static void main(String[] args) {
        int[] a = new int[] { 2, 10, 1, 9, 8, 7, 3 };
        findConsecutiveSubsequence(a);
    }

    private static void findConsecutiveSubsequence(int[] a) {
        Set<Integer> s = new HashSet();

        for (int i = 0; i < a.length; i++) {
            s.add(a[i]);
        }
        int j = 0;
        int maxLength = 0;
        for (int i : s) {
            if (s.contains(i - 1)) {
                continue;
            } else {
                while (s.contains(i + j)) {
                    j++;
                }
            }
            if (maxLength < j) {
                maxLength = j;
            }
            j = 0;
        }
        System.out.println(maxLength);
    }
}

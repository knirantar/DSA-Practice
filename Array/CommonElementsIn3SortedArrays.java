package Array;

import java.util.Arrays;

public class CommonElementsIn3SortedArrays {
    public static void main(String[] args) {
        int[] a = new int[] { 7, 6, 4, 3, 1 };
        int[] b = new int[] { 2, 4, 6, 8, 10 };
        int[] c = new int[] { 3, 6, 9, 12, 15 };
        Arrays.sort(a);
        Arrays.sort(b);
        Arrays.sort(c);
        intersection(a, b, c);
    }

    private static void intersection(int[] a, int[] b, int[] c) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < a.length && j < b.length && k < c.length) {
            if (a[i] == b[j] && b[j] == c[k]) {
                System.out.println(a[i]);
                i++;
                j++;
                k++;
            } else if (a[i] < b[j]) {
                i++;
            } else if (b[j] < c[k]) {
                j++;
            } else {
                k++;
            }
        }
    }

}

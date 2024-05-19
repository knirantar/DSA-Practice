package TwoDArray;

import java.util.Arrays;

public class MedianInRowWiseSortedMatrix {

    public static void main(String[] args) {
        int[][] a = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        int median = findMedian(a);
        System.out.println(median);
    }

    private static int findMedian(int[][] a) {
        int[] res = new int[a.length * a[0].length];
        int k = 0;
        int n = a.length * a[0].length;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                res[k++] = a[i][j];
            }
        }
        Arrays.sort(res);
        return res[n / 2];
    }

}

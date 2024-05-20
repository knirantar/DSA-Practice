package TwoDArray;

import java.util.Arrays;

public class PrintSortedMatrix {
    public static void main(String[] args) {
        int[][] a = {
                { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 39, 50 }
        };
        sortedMatrix(a);
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void sortedMatrix(int[][] a) {
        int rows = a.length;
        int cols = a[0].length;
        int[] ans = new int[rows * cols];
        int k = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                ans[k++] = a[i][j];
            }
        }
        k = 0;
        Arrays.sort(ans);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                a[i][j] = ans[k++];
            }
        }

    }

}

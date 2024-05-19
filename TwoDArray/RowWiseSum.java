package TwoDArray;

import java.util.ArrayList;
import java.util.List;

public class RowWiseSum {
    public static void main(String[] args) {
        int[][] twoDArray = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        int k = 14;
        System.out.println(rowWiseSum(twoDArray, k));
    }

    private static List<Integer> rowWiseSum(int[][] a, int k) {
        List<Integer> li = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            int sum = 0;
            for (int j = 0; j < a[0].length; j++) {
                sum = sum + a[i][j];
            }
            li.add(sum);
        }
        return li;
    }

}

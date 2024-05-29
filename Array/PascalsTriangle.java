package Array;

public class PascalsTriangle {
    public static void main(String[] args) {
        int r = 5;
        int c = 3;

        // To find the xth column in yth row
        // findNcR(r - 1, c - 1);

        // Print the nth row of pascal's triangle
        printNthRow(10);

    }

    private static void printNthRow(int n) {
        int ans = 1;
        System.out.print(ans);
        for (int i = 1; i < n; i++) {
            ans = ans * (n - i);
            ans = ans / i;
            System.out.print(" " + ans);
        }
    }

    private static void findNcR(int r, int c) {
        int res = 1;
        for (int i = 0; i < c; i++) {
            res = res * (r - i);
            res = res / (i + 1);
        }
        System.out.println(res);
    }

}

package Array;

public class AlternateSignNumbers {
    public static void main(String[] args) {
        int[] a = new int[] { 9, 4, -2, -1, 5, 0, -5, -3, 2 };
        makeAlternatePositiveAndNegative(a);

    }

    private static void makeAlternatePositiveAndNegative(int[] a) {
        int[] ans = new int[a.length];
        int pos = 0;
        int neg = 1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) {
                ans[neg] = a[i];
                neg = neg + 2;
            } else {
                ans[pos] = a[i];
                pos = pos + 2;
            }
        }

        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }

}

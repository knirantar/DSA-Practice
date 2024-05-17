package Recursion;

public class ReverseAnArray {
    public static void main(String[] args) {
        int[] a = new int[] { 2, 5, 1, 6, 4, 7, -3 };
        reverse(a, 0, a.length - 1);

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    private static void reverse(int[] a, int l, int r) {
        if (l >= r) {
            return;
        }

        int temp = a[l];
        a[l] = a[r];
        a[r] = temp;

        reverse(a, l + 1, r - 1);
    }

}

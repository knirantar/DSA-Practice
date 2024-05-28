package Array;

/*
 * A permutation of an array of integers is an arrangement of its members into a sequence or linear order.

For example, for arr = [1,2,3], the following are all the permutations of arr: [1,2,3], [1,3,2], [2, 1, 3], [2, 3, 1], [3,1,2], [3,2,1].
For example, the next permutation of arr = [1,2,3] is [1,3,2].
Similarly, the next permutation of arr = [2,3,1] is [3,1,2].
 */
public class NextPermutation {
    public static void main(String[] args) {
        int[] a = new int[] { 2, 3, 1 };

        nextPermutation(a);

    }

    private static void nextPermutation(int[] a) {
        int n = a.length;
        int i = n - 2;
        int j = a.length - 1;

        while (i >= 0 && a[i] >= a[i + 1]) {
            i--;
        }

        if (i == -1) {
            reverse(a, 0, a.length - 1);
            for (int l = 0; l < a.length; l++) {
                System.out.println(a[l]);
            }
        } else {

            while (j >= 0 && a[j] <= a[i]) {
                j--;
            }
            int temp = a[j];
            a[j] = a[i];
            a[i] = temp;
        }
        reverse(a, i + 1, a.length - 1);
        for (int l = 0; l < a.length; l++) {
            System.out.println(a[l]);
        }

    }

    private static void reverse(int[] a, int i, int j) {
        while (i < j) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }
    }
}
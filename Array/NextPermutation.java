package Array;

/*
 * A permutation of an array of integers is an arrangement of its members into a sequence or linear order.

For example, for arr = [1,2,3], the following are all the permutations of arr: [1,2,3], [1,3,2], [2, 1, 3], [2, 3, 1], [3,1,2], [3,2,1].
For example, the next permutation of arr = [1,2,3] is [1,3,2].
Similarly, the next permutation of arr = [2,3,1] is [3,1,2].
 */
public class NextPermutation {
    public static void main(String[] args) {
        int[] a = new int[] { 1, 2, 3, 4 };

        int[] b = nextPermutation(a);
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
    }

    private static int[] nextPermutation(int[] a) {
        int n = a.length;
        int i = n - 2;

        while (i >= 0) {
            if (a[i] < a[i + 1]) {
                break;
            }
            i--;
        }

        if (i == -1) {
            reverse(a);
            return a;
        } else {
            int j = i + 1;
            while (j < n) {
                if (a[i] < a[j]) {
                    int temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                    break;
                }
                j++;
            }
        }
        return a;

    }

    private static void reverse(int[] a) {
        int i = 0;
        int j = a.length - 1;
        while (i < j) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }
    }
}
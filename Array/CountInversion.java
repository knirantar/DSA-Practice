package Array;

/*
 * Inversion Count: For an array, inversion count indicates how far (or close) the array is from being sorted. If the array is already sorted then the inversion count is 0.
If an array is sorted in the reverse order then the inversion count is the maximum. 
 */
public class CountInversion {
    public static void main(String[] args) {
        int[] a = new int[] { 2, 4, 1, 3, 5 };

        int res = countInversion(a);
        System.out.println(res);
    }

    private static int countInversion(int[] a) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    count++;
                }
            }
        }
        return count;
    }

}

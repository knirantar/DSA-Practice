package BinarySearch;

public class FindNumberOfRotations {
    public static void main(String[] args) {
        int[] arr = new int[] { 26, 43, 7, 12, 21 };
        int ans = findRotations(arr);
        System.out.println(ans);
    }

    private static int findRotations(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                return i + 1;
            }
        }
        return -1;
    }

}

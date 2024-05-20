package TwoDArray;

public class RotateMatrix90Degrees {
    public static void main(String[] args) {
        int[][] a = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        rotateMatrix(a);
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void rotateMatrix(int[][] a) {
        int rows = a.length;
        int cols = a[0].length;

        // Create a transpose of a matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i <= j) {
                    continue;
                } else {
                    int temp = a[i][j];
                    a[i][j] = a[j][i];
                    a[j][i] = temp;
                }
            }
        }
        // Reverse each row
        for (int i = 0; i < rows; i++) {
            reverse(a[i]);
        }
    }

    private static void reverse(int[] b) {
        int low = 0;
        int high = b.length - 1;
        while (low < high) {
            int temp = b[low];
            b[low] = b[high];
            b[high] = temp;
            low++;
            high--;
        }
    }

}

package TwoDArray;

public class SpiralPrint {
    public static void main(String[] args) {
        int[][] twoDArray = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        spiralPrint(twoDArray);
    }

    private static void spiralPrint(int[][] a) {
        int rows = a.length;
        int cols = a[0].length;

        int count = 0;
        int total = rows * cols;

        int startingRow = 0;
        int startingCol = 0;
        int endingRow = rows - 1;
        int endingCol = cols - 1;

        while (count < total) {

            // Print starting row
            for (int i = startingCol; count < total && i <= endingCol; i++) {
                System.out.println(a[startingRow][i]);
                count++;
            }
            startingRow++;

            // Print ending col
            for (int i = startingRow; count < total && i <= endingRow; i++) {
                System.out.println(a[i][endingCol]);
                count++;
            }
            endingCol--;

            // Print ending row
            for (int i = endingCol; count < total && i >= startingCol; i--) {
                System.out.println(a[endingRow][i]);
                count++;
            }
            endingRow--;

            // Print starting col
            for (int i = endingRow; count < total && i >= startingRow; i--) {
                System.out.println(a[i][startingCol]);
                count++;
            }
            startingCol++;

        }
    }

}

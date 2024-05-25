package Graph;

/*
 * An image is represented by an m x n integer grid image where image[i][j] represents the pixel value of the image.

You are also given three integers sr, sc, and color. You should perform a flood fill on the image starting from the pixel image[sr][sc].

To perform a flood fill, consider the starting pixel, plus any pixels connected 4-directionally to the starting pixel of the same color as the starting pixel, plus any pixels connected 4-directionally to those pixels (also with the same color), and so on. Replace the color of all of the aforementioned pixels with color.

Return the modified image after performing the flood fill.
 */
public class FloodFillAlgorithm {
    public static void main(String[] args) {
        int grid[][] = {
                { 1, 2, 2 },
                { 2, 2, 0 },
                { 2, 2, 2 } };
        int sr = 2;
        int sc = 0;
        int newColor = 3;
        floodFill(grid, sr, sc, newColor);
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static int[][] floodFill(int[][] grid, int sr, int sc, int newColor) {
        int intialColor = grid[sr][sc];
        int[][] ans = grid;
        int[] deltaRow = { -1, 0, 1, 0 };
        int[] deltaCol = { 0, 1, 0, -1 };
        dfs(sr, sc, grid, ans, intialColor, newColor, deltaRow, deltaCol);
        return ans;
    }

    private static void dfs(int row, int col, int[][] grid, int[][] ans, int intialColor, int newColor, int[] deltaRow,
            int[] deltaCol) {
        ans[row][col] = newColor;

        for (int i = 0; i < 4; i++) {
            int nrow = row + deltaRow[i];
            int ncol = col + deltaCol[i];

            if (nrow >= 0 && nrow < grid.length && ncol >= 0 && ncol < grid[0].length && grid[nrow][ncol] == intialColor
                    && ans[nrow][ncol] != newColor) {
                dfs(nrow, ncol, grid, ans, intialColor, newColor, deltaRow, deltaCol);
            }
        }

    }

}

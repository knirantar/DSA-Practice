package Graph;

import java.util.Queue;
import java.util.LinkedList;

class Pair {
    int first;
    int second;

    public Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }
}

public class NumberOfIslands {
    public static void main(String[] args) {
        int grid[][] = {
                { 1, 1, 0, 1, 1 },
                { 1, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 1 },
                { 1, 1, 0, 1, 1 } };

        countDistinctIslands(grid);
    }

    private static void countDistinctIslands(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int count = 0;
        int[][] vis = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (vis[i][j] != 1 && grid[i][j] == 1) {
                    count++;
                    bfs(i, j, vis, grid);
                }
            }
        }
        System.out.println(count);
    }

    private static void bfs(int i, int j, int[][] vis, int[][] grid) {
        vis[i][j] = 1;
        Queue<Pair> q = new LinkedList<Pair>();
        q.add(new Pair(i, j));

        while (!q.isEmpty()) {
            int row = q.peek().first;
            int col = q.peek().second;
            q.poll();

            // traverse in the neighbours and mark them if its a land that is 1
            for (int deltarow = -1; deltarow < 2; deltarow++) {
                for (int deltacol = -1; deltacol < 2; deltacol++) {
                    int nrow = row + deltarow;
                    int ncol = col + deltacol;

                    if (nrow >= 0 && nrow < grid.length && ncol >= 0 && ncol < grid[0].length
                            && grid[nrow][ncol] == 1 && vis[nrow][ncol] == 0) {
                        vis[nrow][ncol] = 1;
                        q.add(new Pair(nrow, ncol));
                    }
                }
            }

        }

    }

}

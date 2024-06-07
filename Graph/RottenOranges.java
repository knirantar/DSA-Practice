package Graph;

import java.util.LinkedList;
import java.util.Queue;

class NodePair {
    int row;
    int col;
    int tm;

    NodePair(int row, int col, int tm) {
        this.row = row;
        this.col = col;
        this.tm = tm;
    }
}

public class RottenOranges {
    public static void main(String[] args) {
        int[][] grid = new int[][] { { 2, 1, 1 }, { 1, 1, 0 }, { 0, 1, 1 } };
        int ans = orangesRotting(grid);
        System.out.println(ans);
    }

    public static int orangesRotting(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        Queue<NodePair> q = new LinkedList<NodePair>();
        int[][] vis = new int[n][m];
        int countFresh = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 2) {
                    vis[i][j] = 2;
                    q.add(new NodePair(i, j, 0));
                } else {
                    vis[i][j] = 0;
                }
                if (grid[i][j] == 1)
                    countFresh++;
            }
        }

        int tm = 0;
        int[] delRow = { -1, 0, 1, 0 };
        int[] delCol = { 0, -1, 0, 1 };
        int count = 0;

        while (!q.isEmpty()) {
            int r = q.peek().row;
            int c = q.peek().col;
            int t = q.peek().tm;
            tm = Math.max(tm, t);

            q.remove();

            for (int i = 0; i < 4; i++) {
                int nrow = r + delRow[i];
                int ncol = c + delCol[i];
                if (nrow >= 0 && nrow < n && ncol >= 0 && ncol < m &&
                        vis[nrow][ncol] == 0 && grid[nrow][ncol] == 1) {
                    q.add(new NodePair(nrow, ncol, t + 1));
                    vis[nrow][ncol] = 2;
                    count++;
                }
            }
        }

        if (count != countFresh)
            return -1;
        return tm;
    }

}

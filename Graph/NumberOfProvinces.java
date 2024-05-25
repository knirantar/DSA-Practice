package Graph;

import java.util.ArrayList;
import java.util.List;

public class NumberOfProvinces {

    public static void main(String[] args) {
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            adj.add(new ArrayList<>());
        }

        adj.get(0).add(1);
        adj.get(1).add(0);
        adj.get(0).add(2);
        adj.get(2).add(0);
        adj.get(3).add(0);
        adj.get(0).add(3);
        adj.get(4).add(5);
        adj.get(5).add(4);
        adj.get(6).add(7);
        adj.get(7).add(6);
        adj.get(7).add(8);
        adj.get(8).add(7);

        int count = 0;
        boolean[] vis = new boolean[9];

        for (int i = 0; i < 9; i++) {
            if (!vis[i]) {
                count++;
                dfs(i, vis, adj);
            }
        }
        System.out.println(count);

    }

    private static void dfs(int node, boolean[] vis, List<List<Integer>> adj) {
        vis[node] = true;
        for (int i : adj.get(node)) {
            if (!vis[i]) {
                dfs(i, vis, adj);
            }
        }
    }

}

package Graph;

import java.util.ArrayList;
import java.util.List;

public class DepthFirstTraversal {
    public static void main(String[] args) {
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            adj.add(new ArrayList<>());
        }
        adj.get(0).add(1);
        adj.get(1).add(0);
        adj.get(0).add(4);
        adj.get(4).add(0);
        adj.get(1).add(2);
        adj.get(2).add(1);
        adj.get(1).add(3);
        adj.get(3).add(1);

        boolean[] vis = new boolean[5];
        List<Integer> ans = new ArrayList<Integer>();
        List<Integer> res = dfs(0, vis, adj, ans);
        for (int i : res) {
            System.out.println(i);
        }
    }

    private static List<Integer> dfs(int node, boolean[] vis, List<List<Integer>> adj, List<Integer> ans) {
        vis[node] = true;
        ans.add(node);

        for (int i : adj.get(node)) {
            if (!vis[i]) {
                dfs(i, vis, adj, ans);
            }

        }

        return ans;

    }

}

package Graph;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

import java.util.LinkedList;

// To store graph we are going to use Matrix and List which are called 
// Adjacency Matrix and Adjacency list
// If we have 1 based idexing nodes then we will define the matrix with [n+1][n+1] dimensions
// But we don't use Matrix as it wastes lot of space. We use List of list

public class BreadthFirstSearchTraversal {
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

        bfs(5, adj);
    }

    private static void bfs(int V, List<List<Integer>> adj) {
        List<Integer> bfs = new ArrayList<>();
        boolean[] vis = new boolean[V];
        Queue<Integer> q = new LinkedList<>();

        q.add(0);
        vis[0] = true;

        while (!q.isEmpty()) {
            int node = q.poll();
            bfs.add(node);

            for (int i : adj.get(node)) {
                if (!vis[i]) {
                    q.add(i);
                    vis[i] = true;
                }
            }
        }
        System.out.println(bfs);

    }

}

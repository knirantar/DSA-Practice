package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

class Node {
    int first;
    int second;

    public Node(int first, int second) {
        this.first = first;
        this.second = second;
    }
}

public class DetectCycleInUndirectedGraph {
    public static void main(String[] args) {
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            adj.add(new ArrayList<>());
        }

        adj.get(1).add(2);
        adj.get(1).add(3);
        adj.get(2).add(1);
        adj.get(2).add(5);
        adj.get(3).add(4);
        adj.get(3).add(6);
        adj.get(4).add(3);
        adj.get(5).add(2);
        adj.get(5).add(7);
        adj.get(6).add(3);
        adj.get(6).add(7);
        adj.get(7).add(6);
        adj.get(7).add(5);

        System.out.println(adj);

       System.out.println(isCyclePresent(adj));
    }

    private static boolean isCyclePresent(List<List<Integer>> adj) {

        boolean[] vis = new boolean[adj.size()];
        int[] parent = new int[adj.size()];
        for (int i = 0; i < adj.size(); i++) {
            if (vis[i] == false) {
                if (checkCycle(adj, i, vis, parent)) {
                    return true;
                }
            }
        }
        return false;

    }

    private static boolean checkCycle(List<List<Integer>> adj, int s, boolean[] vis, int[] parent) {
        Queue<Node> q = new LinkedList<>(); // BFS
        q.add(new Node(s, -1));
        vis[s] = true;

        // until the queue is empty
        while (!q.isEmpty()) {
            // source node and its parent node
            int node = q.peek().first;
            int par = q.peek().second;
            q.remove();

            // go to all the adjacent nodes
            for (Integer it : adj.get(node)) {
                if (vis[it] == false) {
                    q.add(new Node(it, node));
                    vis[it] = true;
                }

                // if adjacent node is visited and is not its own parent node
                else if (par != it)
                    return true;
            }
        }

        return false;
    }

}

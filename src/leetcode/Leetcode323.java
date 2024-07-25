package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Leetcode323 {
    public int countComponents(int n, int[][] edges) {
        List<Integer>[] graph = new List[n];
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int[] edge : edges) {
            graph[edge[0]].add(edge[1]);
            graph[edge[1]].add(edge[0]);
        }
        boolean[] visited = new boolean[n];
        int connectedComponents = 0;
        for (int i = 0; i < n; i++) {
            if (visited[i]) {
                continue;
            }
            connectedComponents++;
            dfs(graph, i, visited);
        }
        return connectedComponents;
    }

    private void dfs(List<Integer>[] graph, int i, boolean[] visited) {
        if (visited[i]) {
            return;
        }
        visited[i] = true;
        for (int next : graph[i]) {
            dfs(graph, next, visited);
        }
    }
}

package leetcode;

public class LeetCode785 {

  public boolean isBipartite(int[][] graph) {
    int[] visited = new int[graph.length];
    for (int i = 0; i < graph.length; i++) {
      if (visited[i] == 0 && !dfs(graph, i, 1, visited)) {
        return false;
      }
    }
    return true;
  }

  private boolean dfs(int[][] graph, int index, int color, int[] visited) {
    if (visited[index] != 0) {
      return visited[index] == color;
    }
    visited[index] = color;
    for (int adj : graph[index]) {
      if (!dfs(graph, adj, -color, visited)) {
        return false;
      }
    }
    return true;
  }
}

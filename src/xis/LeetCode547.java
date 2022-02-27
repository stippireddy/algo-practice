package xis;

public class LeetCode547 {

  public int findCircleNum(int[][] isConnected) {
    int count = 0;
    boolean[] visited = new boolean[isConnected.length];
    for (int i = 0; i < isConnected.length; i++) {
      if (visited[i]) {
        continue;
      }
      dfs(isConnected, visited, i);
      count++;
    }
    return count;
  }

  private void dfs(int[][] isConnected, boolean[] visited, int index) {
    if (visited[index]) {
      return;
    }
    visited[index] = true;
    for (int j = 0; j < isConnected.length; j++) {
      if (isConnected[index][j] == 1 && !visited[j]) {
        dfs(isConnected, visited, j);
      }
    }
  }
}

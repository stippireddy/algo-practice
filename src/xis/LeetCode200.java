package xis;

public class LeetCode200 {

  public int numIslands(char[][] grid) {
    boolean[][] visited = new boolean[grid.length][grid[0].length];
    int count = 0;
    for (int i = 0; i < grid.length; i++) {
      for (int j = 0; j < grid[0].length; j++) {
        if (grid[i][j] == '1' && !visited[i][j]) {
          count++;
          dfs(grid, visited, i, j);
        }
      }
    }
    return count;
  }

  private void dfs(char[][] grid, boolean[][] visited, int i, int j) {
    if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || visited[i][j]
        || grid[i][j] == '0') {
      return;
    }
    visited[i][j] = true;
    dfs(grid, visited, i + 1, j);
    dfs(grid, visited, i - 1, j);
    dfs(grid, visited, i, j + 1);
    dfs(grid, visited, i, j - 1);
  }
}

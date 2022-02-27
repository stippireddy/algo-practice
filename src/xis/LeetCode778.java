package xis;

import java.util.PriorityQueue;

public class LeetCode778 {

  public int swimInWater(int[][] grid) {
    int n = grid.length;
    boolean[][] visited = new boolean[n][n];
    PriorityQueue<int[]> pq = new PriorityQueue<>(
        (a, b) -> Integer.compare(grid[a[0]][a[1]], grid[b[0]][b[1]]));
    int time = 0;
    int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
    for (int[] direction : directions) {
      if (validIndex(direction, visited)) {
        pq.add(direction);
      }
    }
    int currentMaxHeight = grid[0][0];
    visited[0][0] = true;
    while (!pq.isEmpty()) {
      int[] current = pq.poll();
      visited[current[0]][current[1]] = true;
      if (grid[current[0]][current[1]] > currentMaxHeight) {
        currentMaxHeight = grid[current[0]][current[1]];
        time = currentMaxHeight;
      }
      if (current[0] == n - 1 && current[1] == n - 1) {
        return time;
      }
      for (int[] direction : directions) {
        int[] next = {current[0] + direction[0], current[1] + direction[1]};
        if (validIndex(next, visited)) {
          pq.add(next);
        }
      }
    }
    return -1;
  }

  private boolean validIndex(int[] direction, boolean[][] visited) {
    int x = direction[0];
    int y = direction[1];
    if (x < 0 || y < 0 || x == visited.length || y == visited[0].length || visited[x][y]) {
      return false;
    }
    return true;
  }
}

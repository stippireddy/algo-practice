package leetCode;

import java.util.ArrayDeque;

public class LeetCode1091 {

  public static void main(String[] args) {
    LeetCode1091 l = new LeetCode1091();
    l.shortestPathBinaryMatrix(new int[][]{{0, 0, 0}, {1, 1, 0}, {1, 1, 0}});
  }

  public int shortestPathBinaryMatrix(int[][] grid) {
    if (grid[0][0] != 0) {
      return -1;
    }
    if (0 == grid.length - 1 && 0 == grid[0].length - 1) {
      return 1;
    }
    int[][] next = {{-1, -1}, {-1, 0}, {-1, 1}, {0, -1}, {0, 1}, {1, -1}, {1, 0}, {1, 1}};
    ArrayDeque<int[]> queue = new ArrayDeque<>();
    queue.add(new int[]{0, 0});
    grid[0][0] = -1;
    int path = 1;
    while (!queue.isEmpty()) {
      int size = queue.size();
      path++;
      for (int l = 0; l < size; l++) {
        int[] point = queue.poll();
        for (int[] n : next) {
          int x = point[0] + n[0];
          int y = point[1] + n[1];
          if (isValid(x, y, grid)) {
            if (x == grid.length - 1 && y == grid[0].length - 1) {
              return path;
            }
            grid[x][y] = -1;
            queue.add(new int[]{x, y});
          }
        }
      }
    }
    return -1;
  }

  private boolean isValid(int i, int j, int[][] grid) {
    return i >= 0 && i < grid.length && j >= 0 && j < grid[0].length && grid[i][j] == 0;
  }
}

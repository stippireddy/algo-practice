package leetcode;

/**
 * Created by Sarveswara Tippireddy on 5/19/2017.
 */
public class LeetCode463 {

  public int islandPerimeter(int[][] grid) {
    int[] sideCount = new int[5];
    for (int i = 0; i < grid.length; i++) {
      for (int j = 0; j < grid[0].length; j++) {
        if (grid[i][j] == 1) {
          sideCount[countNumberOfSurroundingSides(grid, i, j)]++;
        }
      }
    }
    return sideCount[0] * 4 + sideCount[1] * 3 + sideCount[2] * 2 + sideCount[3] * 1;
  }

  private int countNumberOfSurroundingSides(int[][] grid, int i, int j) {
    int count = 0;
    if (i - 1 >= 0) {
      if (grid[i - 1][j] == 1) {
        count++;
      }
    }
    if (j - 1 >= 0) {
      if (grid[i][j - 1] == 1) {
        count++;
      }
    }
    if (i + 1 < grid.length) {
      if (grid[i + 1][j] == 1) {
        count++;
      }
    }
    if (j + 1 < grid[0].length) {
      if (grid[i][j + 1] == 1) {
        count++;
      }
    }
    return count;
  }

  public int islandPerimeterDFS(int[][] grid) {
    if (grid.length == 0) {
      return 0;
    }
    for (int i = 0; i < grid.length; i++) {
      for (int j = 0; j < grid[0].length; j++) {
        if (grid[i][j] == 1) {
          return helper(grid, i, j);
        }
      }
    }
    return 0;
  }

  private int helper(int[][] grid, int i, int j) {
    grid[i][j] = -1;
    int count = 0;
    if (i - 1 < 0 || grid[i - 1][j] == 0) {
      count++;
    } else if (grid[i - 1][j] == 1) {
      count = count + helper(grid, i - 1, j);
    }
    if (i + 1 >= grid.length || grid[i + 1][j] == 0) {
      count++;
    } else if (grid[i + 1][j] == 1) {
      count = count + helper(grid, i + 1, j);
    }
    if (j - 1 < 0 || grid[i][j - 1] == 0) {
      count++;
    } else if (grid[i][j - 1] == 1) {
      count = count + helper(grid, i, j - 1);
    }
    if (j + 1 >= grid[0].length || grid[i][j + 1] == 0) {
      count++;
    } else if (grid[i][j + 1] == 1) {
      count = count + helper(grid, i, j + 1);
    }
    return count;
  }
}

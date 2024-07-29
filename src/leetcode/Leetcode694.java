package leetcode;

import java.util.HashSet;
import java.util.Set;

public class Leetcode694 {
    public int numDistinctIslands(int[][] grid) {
        Set<String> islands = new HashSet<>();
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    StringBuilder sb = new StringBuilder();
                    dfs(grid, i, j, islands, sb, "");
                    islands.add(sb.toString());
                }
            }
        }
        return islands.size();
    }

    private void dfs(int[][] grid, int i, int j, Set<String> islands, StringBuilder sb, String s) {
        if (i < 0 || i == grid.length || j < 0 || j == grid[0].length || grid[i][j] != 1) {
            return;
        }
        sb.append(s);
        grid[i][j] = 0;
        dfs(grid, i + 1, j, islands, sb, "u");
        dfs(grid, i - 1, j, islands, sb, "d");
        dfs(grid, i, j + 1, islands, sb, "r");
        dfs(grid, i, j - 1, islands, sb, "l");
        sb.append("0");
    }
}

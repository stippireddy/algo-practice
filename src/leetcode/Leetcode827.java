package leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


public class Leetcode827 {

    public int largestIsland(int[][] grid) {
        int color = 2;
        int m = grid.length;
        int n = grid[0].length;
        int max = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 0);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    int size = paint(grid, i, j, color);
                    max = Integer.max(max, size);
                    map.put(color, size);
                    color++;
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 0) {
                    int size = helper(grid, i, j, map);
                    max = Integer.max(max, size);
                }
            }
        }
        return max;
    }

    private int helper(int[][] grid, int i, int j, Map<Integer, Integer> map) {
        Set<Integer> colors = new HashSet<>();
        if (i - 1 >= 0) {
            colors.add(grid[i - 1][j]);
        }
        if (i + 1 < grid.length) {
            colors.add(grid[i + 1][j]);
        }
        if (j - 1 >= 0) {
            colors.add(grid[i][j - 1]);
        }
        if (j + 1 < grid[0].length) {
            colors.add(grid[i][j + 1]);
        }
        int size = 1;
        for (int color : colors) {
            size += map.get(color);
        }
        return size;
    }

    private int paint(int[][] grid, int i, int j, int color) {
        if (i < 0 || i == grid.length || j < 0 || j == grid[0].length || grid[i][j] != 1) {
            return 0;
        }
        grid[i][j] = color;
        return paint(grid, i - 1, j, color) + paint(grid, i + 1, j, color) + paint(grid, i, j - 1, color) +
                paint(grid, i, j + 1, color);
    }
}
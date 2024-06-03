package leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LeetCode827 {

    public int largestIsland(int[][] grid) {
        int color = 2;
        Map<Integer, Integer> map = new HashMap<>();
        int maxSize = 0;
        map.put(0, 0);
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    int paintedSize = paint(grid, i, j, color);
                    map.put(color, paintedSize);
                    maxSize = Integer.max(paintedSize, maxSize);
                }
                color++;
            }
        }
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 0) {
                    Set<Integer> set = new HashSet<>();
                    if (i - 1 >= 0) {
                        set.add(grid[i - 1][j]);
                    }
                    if (i + 1 < grid.length) {
                        set.add(grid[i + 1][j]);
                    }
                    if (j - 1 >= 0) {
                        set.add(grid[i][j - 1]);
                    }
                    if (j + 1 < grid[0].length) {
                        set.add(grid[i][j + 1]);
                    }
                    int size = 1;
                    for (int adj : set) {
                        size += map.get(adj);
                    }
                    maxSize = Integer.max(maxSize, size);
                }
            }
        }
        return maxSize;
    }

    private int paint(int[][] grid, int i, int j, int color) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] != 1) {
            return 0;
        }
        grid[i][j] = color;
        return 1 + paint(grid, i + 1, j, color) + paint(grid, i, j + 1, color) + paint(grid, i - 1, j, color) + paint(grid, i, j - 1, color);
    }
}

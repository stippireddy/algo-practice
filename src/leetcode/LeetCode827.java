package leetcode;

import java.util.HashMap;
import java.util.HashSet;

public class LeetCode827 {
    public int largestIsland(int[][] grid) {
        int maxArea = 0;
        HashMap<Integer, Integer> colorToSize = new HashMap<>();
        int color = 2;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                if (grid[i][j] == 1) {
                    colorToSize.put(color, paint(grid, i, j, color));
                    color++;
                }
            }
        }
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                int area = colorToSize.getOrDefault(grid[i][j], 0);
                if (grid[i][j] == 0) {
                    area = Integer.max(maxArea, 1 + getArea(colorToSize, i, j, grid));
                }
                maxArea = Integer.max(maxArea, area);
            }
        }
        return maxArea;
    }

    private int getArea(HashMap<Integer, Integer> colorToSize, int i, int j, int[][] grid) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length) {
            return 0;
        }
        HashSet<Integer> colors = new HashSet<>();
        if (i - 1 >= 0) {
            colors.add(grid[i - 1][j]);
        }
        if (j - 1 >= 0) {
            colors.add(grid[i][j - 1]);
        }
        if (i + 1 < grid.length) {
            colors.add(grid[i + 1][j]);
        }
        if (j + 1 < grid.length) {
            colors.add(grid[i][j + 1]);
        }
        int area = 0;
        for (int color : colors) {
            area += colorToSize.getOrDefault(color, 0);
        }
        return area;
    }

    private int paint(int[][] grid, int i, int j, int color) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] != 1) {
            return 0;
        }
        grid[i][j] = color;
        return 1 + paint(grid, i + 1, j, color) + paint(grid, i, j + 1, color) + paint(grid, i - 1, j, color) + paint(grid, i, j - 1, color);
    }
}

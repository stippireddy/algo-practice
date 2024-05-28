package leetcode;

import java.util.ArrayDeque;

public class Leetcode1091 {
    public int shortestPathBinaryMatrix(int[][] grid) {
        if (grid[0][0] != 0) {
            return -1;
        }
        int[][] directions = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}, {1, 1}, {-1, -1}, {1, -1}, {-1, 1}};
        ArrayDeque<int[]> q = new ArrayDeque<>();
        int steps = 1;
        q.add(new int[]{0, 0});
        grid[0][0] = 1;
        while (!q.isEmpty()) {
            int size = q.size();
            while (size-- > 0) {
                int[] current = q.poll();
                if (current[0] == grid.length - 1 && current[1] == grid[0].length - 1) {
                    return steps;
                }
                for (int[] d : directions) {
                    int[] next = new int[]{current[0] + d[0], current[1] + d[1]};
                    if (isValid(next, grid)) {
                        grid[next[0]][next[1]] = 1;
                        q.add(next);
                    }
                }
            }
            steps++;
        }
        return -1;
    }

    private boolean isValid(int[] next, int[][] grid) {
        return next[0] >= 0 && next[0] < grid.length && next[1] >= 0 && next[1] < grid[0].length && grid[next[0]][next[1]] == 0;
    }
}
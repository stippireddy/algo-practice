package leetcode;

import java.util.Arrays;

public class Leetcode490 {
    public boolean hasPath(int[][] maze, int[] start, int[] destination) {
        boolean[][] visited = new boolean[maze.length][maze[0].length];
        return hasPath(maze, visited, start, destination);
    }

    public boolean hasPath(int[][] maze, boolean[][] visited, int[] start, int[] destination) {
        if (visited[start[0]][start[1]]) {
            return false;
        }
        if (Arrays.equals(start, destination)) {
            return true;
        }
        int m = maze.length;
        int n = maze[0].length;

        int x = start[0];
        int y = start[1];
        while (x - 1 >= 0 && maze[x - 1][y] != 1) {
            x--;
        }
        visited[x][y] = true;
        if (hasPath(maze, visited, new int[]{x, y}, destination)) {
            return true;
        }

        while (x + 1 < m && maze[x + 1][y] != 1) {
            x++;
        }
        visited[x][y] = true;
        if (hasPath(maze, visited, new int[]{x, y}, destination)) {
            return true;
        }

        while (y - 1 >= 0 && maze[x][y - 1] != 1) {
            y--;
        }
        visited[x][y] = true;
        if (hasPath(maze, visited, new int[]{x, y}, destination)) {
            return true;
        }

        while (y + 1 < n && maze[x][y + 1] != 1) {
            y++;
        }
        visited[x][y] = true;
        if (hasPath(maze, visited, new int[]{x, y}, destination)) {
            return true;
        }

        return false;
    }
}

package leetcode;

import java.util.ArrayDeque;
import java.util.Queue;

public class LeetCode934 {

  public int shortestBridge(int[][] a) {
    Queue<int[]> queue = new ArrayDeque<>();
    getInitialQueue(a, queue);
    int steps = 0;
    while (!queue.isEmpty()) {
      int size = queue.size();
      for (int k = 0; k < size; k++) {
        int[] currentIndex = queue.poll();
        int i = currentIndex[0];
        int j = currentIndex[1];
        if (i - 1 >= 0) {
          if (a[i - 1][j] == 1) {
            return steps;
          } else if (a[i - 1][j] == 0) {
            a[i - 1][j] = 2;
            queue.add(new int[]{i - 1, j});
          }
        }
        if (i + 1 < a.length) {
          if (a[i + 1][j] == 1) {
            return steps;
          } else if (a[i + 1][j] == 0) {
            a[i + 1][j] = 2;
            queue.add(new int[]{i + 1, j});
          }
        }
        if (j - 1 >= 0) {
          if (a[i][j - 1] == 1) {
            return steps;
          } else if (a[i][j - 1] == 0) {
            a[i][j - 1] = 2;
            queue.add(new int[]{i, j - 1});
          }
        }
        if (j + 1 < a[0].length) {
          if (a[i][j + 1] == 1) {
            return steps;
          } else if (a[i][j + 1] == 0) {
            a[i][j + 1] = 2;
            queue.add(new int[]{i, j + 1});
          }
        }
      }
      steps++;
    }
    return steps;
  }

  private void getInitialQueue(int[][] a, Queue<int[]> queue) {
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a[0].length; j++) {
        if (a[i][j] == 1) {
          markTwo(a, i, j, queue);
          return;
        }
      }
    }
  }

  private void markTwo(int[][] a, int i, int j, Queue<int[]> queue) {
    if (i < 0 || i >= a.length || j < 0 || j >= a[0].length || a[i][j] == 0 || a[i][j] == 2) {
      return;
    }
    a[i][j] = 2;
    queue.add(new int[]{i, j});
    markTwo(a, i + 1, j, queue);
    markTwo(a, i - 1, j, queue);
    markTwo(a, i, j + 1, queue);
    markTwo(a, i, j - 1, queue);
  }
}
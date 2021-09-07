package leetCode;

import java.util.ArrayDeque;

public class LeetCode1306 {

  public boolean canReach(int[] arr, int start) {
    boolean[] visited = new boolean[arr.length];
    ArrayDeque<Integer> queue = new ArrayDeque<>();
    queue.add(start);
    visited[start] = true;
    while (!queue.isEmpty()) {
      int current = queue.pollFirst();
      if (arr[current] == 0) {
        return true;
      }

      int next = current + arr[current];
      if (next < arr.length && !visited[next]) {
        visited[next] = true;
        queue.add(next);
      }
      next = current - arr[current];
      if (next >= 0 && !visited[next]) {
        visited[next] = true;
        queue.add(next);
      }
    }
    return false;
  }
}

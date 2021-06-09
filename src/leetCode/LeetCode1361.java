package leetCode;

import java.util.ArrayDeque;

public class LeetCode1361 {

  public boolean validateBinaryTreeNodes(int n, int[] leftChild, int[] rightChild) {
    int[] indegree = new int[n];
    for (int i : leftChild) {
      if (i != -1) {
        indegree[i]++;
      }
    }
    for (int i : rightChild) {
      if (i != -1) {
        indegree[i]++;
      }
    }
    ArrayDeque<Integer> queue = new ArrayDeque<>();
    boolean[] visited = new boolean[n];
    for (int i = 0; i < n; i++) {
      if (indegree[i] == 0) {
        queue.add(i);
        visited[i] = true;
      }
    }
    if (queue.size() > 1) {
      return false;
    }
    while (!queue.isEmpty()) {
      int current = queue.poll();
      int left = leftChild[current];
      if (left != -1) {
        if (visited[left]) {
          return false;
        }
        visited[left] = true;
        queue.offer(left);
      }
      int right = rightChild[current];
      if (right != -1) {
        if (visited[right]) {
          return false;
        }
        visited[right] = true;
        queue.offer(right);
      }
    }
    for (boolean v : visited) {
      if (!v) {
        return false;
      }
    }
    return true;
  }
}

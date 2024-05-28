/**
 * Created by Sarveswara Tippireddy on Aug 23, 2017
 *
 * <p>This LeetCode problem can be found @ https://leetcode.com/problems/friend-circles/description/
 */
package leetcode;

import java.util.ArrayDeque;

public class LeetCode547 {

  public int findCircleNumUsingDFS(int[][] a) {
    int numberOfCircles = 0;
    boolean[] visited = new boolean[a.length];
    for (int i = 0; i < visited.length; i++) {
      if (visited[i] == false) {
        dfs(a, i, visited);
        numberOfCircles++;
      }
    }
    return numberOfCircles;
  }

  private void dfs(int[][] g, int i, boolean[] visited) {
    if (visited[i] == false) {
      visited[i] = true;
      for (int j = 0; j < visited.length; j++) {
        if (i != j && g[i][j] == 1 && visited[j] == false) {
          dfs(g, j, visited);
        }
      }
    }
  }

  public int findCircleNumUsingBFS(int[][] a) {
    int numberOfCircles = 0;
    boolean[] visited = new boolean[a.length];
    for (int i = 0; i < visited.length; i++) {
      if (visited[i] == false) {
        bfs(a, i, visited);
        numberOfCircles++;
      }
    }
    return numberOfCircles;
  }

  private void bfs(int[][] g, int i, boolean[] visited) {
    ArrayDeque<Integer> q = new ArrayDeque<>();
    q.add(i);
    visited[i] = true;
    while (!q.isEmpty()) {
      int vertex = q.poll();
      for (int j = 0; j < visited.length; j++) {
        if (vertex != j && g[vertex][j] == 1 && visited[j] == false) {
          visited[j] = true;
          q.add(j);
        }
      }
    }
  }
}

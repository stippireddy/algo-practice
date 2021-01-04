package leetCode;

import java.util.ArrayDeque;
import java.util.HashSet;

public class LeetCode785 {

  public boolean isBipartite(int[][] graph) {
    HashSet<Integer> visited = new HashSet<>();
    ArrayDeque<Integer> queue = new ArrayDeque<>();
    queue.add(0);
    HashSet<Integer> red = new HashSet<>();
    HashSet<Integer> black = new HashSet<>();
    red.add(0);
    while (!queue.isEmpty()) {
      int size = queue.size();
      for (int i = 0; i < size; i++) {
        int vertex = queue.poll();
        HashSet<Integer> other = red.contains(vertex) ? black : red;
        visited.add(vertex);
        for (int neighbor : graph[vertex]) {
          if (!visited.contains(neighbor)) {
            queue.offer(neighbor);
          }
        }
      }
    }
    return visited.size() == graph.length;
  }
}

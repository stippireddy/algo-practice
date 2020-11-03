package leetCode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LeetCode1462 {

  public static void main(String[] args) {
    LeetCode1462 l = new LeetCode1462();
    int n = 3;
    int[][] prerequisites = {{1, 2}, {1, 0}, {2, 0}};
    int[][] queries = {{1, 0}, {1, 2}};
    System.out.println(l.checkIfPrerequisite(n, prerequisites, queries));
  }

  public List<Boolean> checkIfPrerequisite(int n, int[][] prerequisites, int[][] queries) {
    int[] indegree = new int[n];
    Set<Integer>[] graph = new Set[n];
    Set<Integer>[] resultSet = new Set[n];
    for (int i = 0; i < n; i++) {
      resultSet[i] = new HashSet<>();
      graph[i] = new HashSet<>();
    }
    for (int[] p : prerequisites) {
      indegree[p[1]]++;
      graph[p[0]].add(p[1]);
    }

    List<Integer> starts = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      if (indegree[i] == 0) {
        starts.add(i);
      }
    }
    for (int i : starts) {
      dfs(i, graph, resultSet, new HashSet<>());
    }
    List<Boolean> result = new ArrayList<>();
    for (int[] q : queries) {
      result.add(resultSet[q[1]].contains(q[0]));
    }
    return result;
  }

  private void dfs(int node, Set<Integer>[] graph, Set<Integer>[] resultSet, Set<Integer> parents) {
    parents.add(node);
    for (int i : graph[node]) {
      resultSet[i].addAll(parents);
      dfs(i, graph, resultSet, new HashSet<>(parents));
    }
  }
}

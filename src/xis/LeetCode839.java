package xis;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LeetCode839 {

  public int numSimilarGroups(String[] strs) {
    boolean[] visited = new boolean[strs.length];
    int result = 0;
    for (int i = 0; i < strs.length; i++) {
      if (!visited[i]) {
        dfs(strs, i, visited);
        result++;
      }
    }
    return result;
  }

  private void dfs(String[] strs, int index, boolean[] visited) {
    if (visited[index]) {
      return;
    }
    visited[index] = true;
    for (int i = 0; i < strs.length; i++) {
      if (!visited[i] && isSimilar(strs[index], strs[i])) {
        dfs(strs, i, visited);
      }
    }
  }

  private boolean isSimilar(String a, String b) {
    int editDistance = 0;
    for (int i = 0; i < a.length(); i++) {
      if (a.charAt(i) != b.charAt(i)) {
        editDistance++;
      }
    }
    return editDistance == 0 || editDistance == 2;
  }
}

package leetCode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LeetCode797 {

  public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
    List<List<Integer>> result = new ArrayList<>();
    LinkedList<Integer> subResult = new LinkedList<>();
    subResult.add(0);
    helper(graph, 0, result, subResult);
    return result;
  }

  private void helper(int[][] graph, int index, List<List<Integer>> result,
      LinkedList<Integer> subResult) {
    if (graph[index].length == 0) {
      result.add(new ArrayList<>(subResult));
      return;
    }
    for (int nextNode : graph[index]) {
      subResult.add(nextNode);
      helper(graph, nextNode, result, subResult);
      subResult.removeLast();
    }
  }
}

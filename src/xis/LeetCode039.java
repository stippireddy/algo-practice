package xis;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class LeetCode039 {

  public List<List<Integer>> combinationSum(int[] candidates, int target) {
    List<List<Integer>> result = new ArrayList<>();
    helper(candidates, target, result, 0, new ArrayList<>());
    return result;
  }

  private void helper(int[] candidates, int target, List<List<Integer>> result, int index,
      ArrayList<Integer> subResult) {
    if (index == candidates.length || target < 0) {
      return;
    }
    if (target == 0) {
      result.add(new ArrayList<>(subResult));
      return;
    }
    helper(candidates, target, result, index + 1, subResult);
    subResult.add(candidates[index]);
    helper(candidates, target - candidates[index], result, index, subResult);
    subResult.remove(subResult.size() - 1);
  }


  public List<List<Integer>> combinationSum2(int[] candidates, int target) {
    List<List<Integer>> result = new ArrayList<>();
    helper2(candidates, target, result, 0, new ArrayList<>());
    return result;
  }

  private void helper2(int[] candidates, int target, List<List<Integer>> result, int index,
      ArrayList<Integer> subResult) {
    if (target < 0) {
      return;
    }
    if (target == 0) {
      result.add(new ArrayList<>(subResult));
      return;
    }
    for (int i = index; i < candidates.length; i++) {
      subResult.add(candidates[i]);
      helper(candidates, target - candidates[i], result, i, subResult);
      subResult.remove(subResult.size() - 1);
    }
  }
}

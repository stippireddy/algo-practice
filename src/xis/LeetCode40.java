package xis;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode40 {

  public List<List<Integer>> combinationSum2(int[] candidates, int target) {
    List<List<Integer>> result = new ArrayList<>();
    Arrays.sort(candidates);
    helper(candidates, target, result, 0, new ArrayList<Integer>());
    return result;
  }

  private void helper(int[] candidates, int target, List<List<Integer>> result, int index,
      ArrayList<Integer> subResult) {
    if (target < 0) {
      return;
    }
    if (target == 0) {
      result.add(new ArrayList<>(subResult));
      return;
    }

    for (int i = index; i < candidates.length; i++) {
      if (i == index || candidates[i - 1] != candidates[i]) {
        subResult.add(candidates[i]);
        helper(candidates, target - candidates[i], result, i + 1, subResult);
        subResult.remove(subResult.size() - 1);
      }
    }
  }
}

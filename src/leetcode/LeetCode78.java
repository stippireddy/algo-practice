package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LeetCode78 {

  public List<List<Integer>> subsets(int[] nums) {
    List<List<Integer>> result = new ArrayList<>();
    helper(nums, 0, result, new LinkedList<>());
    return result;
  }

  private void helper(int[] nums, int index, List<List<Integer>> result,
      LinkedList<Integer> subResult) {
    if (index == nums.length) {
      result.add(new ArrayList<>(subResult));
      return;
    }
    subResult.add(nums[index]);
    helper(nums, index + 1, result, subResult);
    subResult.removeLast();
    helper(nums, index + 1, result, subResult);
  }
}

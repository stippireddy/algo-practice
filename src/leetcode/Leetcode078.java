package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Leetcode078 {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums == null) {
            return null;
        }
        helper(nums, 0, result, new ArrayList<>());
        return result;
    }

    private void helper(int[] nums, int index, List<List<Integer>> result, ArrayList<Integer> subResult) {
        if (index == nums.length) {
            result.add(new ArrayList<>(subResult));
            return;
        }
        helper(nums, index + 1, result, subResult);
        subResult.add(nums[index]);
        helper(nums, index + 1, result, subResult);
        subResult.remove(subResult.size() - 1);
    }
}

package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Leetcode90 {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
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
        int next = index;
        while (next < nums.length && nums[next] == nums[index]) {
            next++;
        }
        int count = next - index;
        helper(nums, next, result, subResult);
        ArrayList<Integer> nextSubResult = new ArrayList<>(subResult);
        for (int i = 0; i < count; i++) {
            subResult.add(nums[index]);
            helper(nums, next, result, subResult);
        }
    }
}

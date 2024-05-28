package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Leetcode442 {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[Math.abs(nums[i]) - 1] < 0) {
                result.add(Math.abs(nums[i]));
            } else {
                nums[Math.abs(nums[i]) - 1] *= -1;
            }
        }
        return result;
    }
}

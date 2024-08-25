package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Leetcode442 {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();
        for (int num : nums) {
            if (nums[Math.abs(num) - 1] < 0) {
                result.add(Math.abs(num));
            } else {
                nums[Math.abs(num) - 1] = -nums[Math.abs(num) - 1];
            }
        }
        return result;
    }
}

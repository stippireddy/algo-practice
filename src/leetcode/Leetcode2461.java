package leetcode;

import java.util.HashMap;
import java.util.Map;

public class Leetcode2461 {
    public long maximumSubarraySum(int[] nums, int k) {
        long result = 0;
        long sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < k; i++) {
            sum += nums[i];
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        if (map.keySet().size() == k) {
            result = Long.max(sum, result);
        }
        for (int i = k; i < nums.length; i++) {
            sum += nums[i];
            sum -= nums[i - k];
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            if (map.get(nums[i - k]) == 1) {
                map.remove(nums[i - k]);
            } else {
                map.put(nums[i - k], map.get(nums[i - k]) - 1);
            }
            if (map.keySet().size() == k) {
                result = Long.max(sum, result);
            }
        }
        return result;
    }
}

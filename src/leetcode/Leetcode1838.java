package leetcode;

import java.util.Arrays;

public class Leetcode1838 {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        long total = 0;
        int left = 0;
        for (int right = 0; right < nums.length; right++) {
            total += nums[right];
            if (nums[right] * (right - left + 1L) > total + k) {
                total -= nums[left];
                left++;
            }
        }
        return nums.length - left;
    }
}

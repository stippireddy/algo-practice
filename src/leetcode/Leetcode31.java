package leetcode;

import java.util.Arrays;

public class Leetcode31 {
    public void nextPermutation(int[] nums) {
        int i = nums.length - 2;
        while (i >= 0) {
            if (nums[i + 1] > nums[i]) {
                break;
            }
            i--;
        }
        if (i < 0) {
            reverse(nums, 0, nums.length - 1);
            return;
        }
        int j = i + 1;
        while (j < nums.length && nums[j] > nums[i]) {
            j++;
        }
        int temp = nums[i];
        nums[i] = nums[j - 1];
        nums[j - 1] = temp;
        reverse(nums, i + 1, nums.length - 1);
    }

    private void reverse(int[] nums, int i, int j) {
        while (i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }

    public void nextPermutation2(int[] nums) {
        int i = nums.length - 1;
        for (; i > 0; i--) {
            if (nums[i] > nums[i - 1]) {
                break;
            }
        }
        Arrays.sort(nums, i, nums.length);
        if (i == 0) {
            return;
        }
        int j = i;
        while (j < nums.length && nums[j] <= nums[i - 1]) {
            j++;
        }
        int temp = nums[i - 1];
        nums[i - 1] = nums[j];
        nums[j] = temp;
    }
}

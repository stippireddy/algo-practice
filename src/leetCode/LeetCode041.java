/**
 * Created by Sarveswara Tippireddy on Aug 26, 2017
 *
 * <p>
 * This LeetCode problem can be found @ https://leetcode.com/problems/first-missing-positive/description/
 */
package leetCode;

public class LeetCode041 {

    public int firstMissingPositive(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            while (nums[i] > 0 && nums[i] <= nums.length && nums[i] != i + 1) {
                swap(nums, i, nums[i] - 1);
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }
        return nums.length + 1;
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
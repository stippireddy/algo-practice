/**
 * Created by Sarveswara Tippireddy on Sep 3, 2017
 *
 * <p>
 * This LeetCode problem can be found @ https://leetcode.com/problems/rotate-array/description/
 */
package leetCode;

public class LeetCode189 {

  public void rotate(int[] nums, int k) {
    if (nums.length < 2 || k == 0) {
      return;
    }
    reverse(nums, 0, nums.length - (k % nums.length) - 1);
    reverse(nums, nums.length - (k % nums.length), nums.length - 1);
    reverse(nums, 0, nums.length - 1);
  }

  private void reverse(int[] nums, int i, int j) {
    while (i < j) {
      nums[i] = nums[i] ^ nums[j];
      nums[j] = nums[i] ^ nums[j];
      nums[i] = nums[i] ^ nums[j];
      i++;
      j--;
    }
  }
}

/**
 * Created by Sarveswara Tippireddy on Aug 26, 2017
 *
 * <p>
 * This LeetCode problem can be found @ https://leetcode.com/problems/first-missing-positive/description/
 */
package leetCode;

public class LeetCode041 {

  public int firstMissingPositive(int[] nums) {
    for (int i = 0; i < nums.length; ) {
      if (nums[i] > 0 && nums[i] < nums.length + 1) {
        // The following condition takes care of the possibility
        // of infinite loop if the numbers being swapped are the same
        if (nums[i] != nums[nums[i] - 1]) {
          int temp = nums[nums[i] - 1];
          nums[nums[i] - 1] = nums[i];
          nums[i] = temp;
          continue;
        }
      }
      i++;
    }
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] != i + 1) {
        return i + 1;
      }
    }
    return nums.length + 1;
  }

  public int firstMissingPositive2(int[] nums) {
    for (int i = 0; i < nums.length; i++) {
      while (nums[i] != i + 1 && nums[i] > 0 && nums[i] <= nums.length
          && nums[nums[i] - 1] != nums[i]) {
        int temp = nums[nums[i] - 1];
        nums[nums[i] - 1] = nums[i];
        nums[i] = temp;
      }
    }
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] != i + 1) {
        return i + 1;
      }
    }
    return nums.length + 1;
  }
}
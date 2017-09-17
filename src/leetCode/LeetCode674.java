/**
 * Created by Sarveswara Tippireddy on Sep 17, 2017
 *
 * <p>
 * This LeetCode problem can be found @
 * https://leetcode.com/problems/longest-continuous-increasing-subsequence/description/
 * 
 */
package leetCode;

public class LeetCode674 {
  public int findLengthOfLCIS(int[] nums) {
    if (nums.length == 0) {
      return 0;
    }
    int length = 1, maxLength = 1;
    for (int i = 1; i < nums.length; i++) {
      if (nums[i] > nums[i - 1]) {
        length++;
        maxLength = Integer.max(maxLength, length);
      } else {
        length = 1;
      }
    }
    return maxLength;
  }
}

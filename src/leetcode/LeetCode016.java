/**
 * Created by Sarveswara Tippireddy on Aug 25, 2017
 *
 * <p>
 * This LeetCode problem can be found @ https://leetcode.com/problems/3sum-closest/description/
 */
package leetcode;

import java.util.Arrays;

public class LeetCode016 {

  public int threeSumClosest(int[] nums, int target) {
    Arrays.sort(nums);
    int minDiff = Integer.MAX_VALUE;
    int minDiffSum = Integer.MAX_VALUE;
    for (int i = 0; i < nums.length - 2; i++) {
      int sum = target - nums[i];
      int left = i + 1, right = nums.length - 1;
      while (left < right) {
        int currentSum = nums[left] + nums[right];
        if (currentSum == sum) {
          return target;
        } else if (currentSum < sum) {
          if (minDiff > sum - currentSum) {
            minDiff = sum - currentSum;
            minDiffSum = currentSum + nums[i];
          }
          left++;
        } else {
          if (minDiff > currentSum - sum) {
            minDiff = currentSum - sum;
            minDiffSum = currentSum + nums[i];
          }
          right--;
        }
      }
    }
    return minDiffSum;
  }
}

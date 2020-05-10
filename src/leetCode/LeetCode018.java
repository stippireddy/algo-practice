/**
 * Created by Sarveswara Tippireddy on Aug 25, 2017
 *
 * <p>
 * This LeetCode problem can be found @ https://leetcode.com/problems/4sum/description/
 */
package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode018 {

  public List<List<Integer>> fourSum(int[] nums, int target) {
    int n = nums.length;
    List<List<Integer>> result = new ArrayList<>();
    if (n < 4) {
      return result;
    }
    Arrays.sort(nums);
    for (int i = 0; i < n - 3; i++) {
      if (nums[i] * 4 > target) {
        break;
      }
      if (nums[i] + 3 * nums[n - 1] < target) {
        continue;
      }
      if (i == 0 || nums[i] != nums[i - 1]) {
        int targetTuple = target - nums[i];
        for (int j = i + 1; j < n - 2; j++) {
          if (nums[j] * 3 > targetTuple) {
            break;
          }
          if (nums[j] + 2 * nums[n - 1] < targetTuple) {
            continue;
          }
          if (j == i + 1 || nums[j] != nums[j - 1]) {
            int targetDouble = targetTuple - nums[j];
            int left = j + 1, right = n - 1;
            while (left < right) {
              int currDoubleSum = nums[left] + nums[right];
              if (currDoubleSum == targetDouble) {
                result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                while (left < right && nums[left] == nums[left + 1]) {
                  left++;
                }
                while (left < right && nums[right] == nums[right - 1]) {
                  right--;
                }
                left++;
                right--;
              } else if (currDoubleSum < targetDouble) {
                left++;
              } else {
                right--;
              }
            }
          }
        }
      }
    }
    return result;
  }
}

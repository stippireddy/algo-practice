/**
 * Created by Sarveswara Tippireddy on Aug 24, 2017
 *
 * <p>
 * This LeetCode problem can be found @ https://leetcode.com/problems/3sum/description/
 */
package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode015 {
  public List<List<Integer>> threeSum(int[] nums) {
    Arrays.sort(nums);
    List<List<Integer>> result = new ArrayList<>();
    for (int i = 0; i < nums.length - 2; i++) {
      if (i == 0 || nums[i] != nums[i - 1]) {
        int a = nums[i];
        int left = i + 1, right = nums.length - 1;
        while (left < right) {
          if (nums[left] + nums[right] == -a) {
            result.add(Arrays.asList(a, nums[left], nums[right]));
            while (left < right && nums[left] == nums[left + 1]) {
              left++;
            }
            while (left < right && nums[right] == nums[right - 1]) {
              right--;
            }
            left++;
            right--;
          } else if (nums[left] + nums[right] < -a) {
            left++;
          } else {
            right--;
          }
        }
      }
    }
    return result;
  }
}

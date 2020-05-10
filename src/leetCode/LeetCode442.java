/**
 * Created by Sarveswara Tippireddy on Sep 6, 2017
 *
 * <p>
 * This LeetCode problem can be found @ https://leetcode.com/problems/find-all-duplicates-in-an-array/description/
 */
package leetCode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode442 {

  public List<Integer> findDuplicates(int[] nums) {
    List<Integer> result = new ArrayList<>();
    for (int i = 0; i < nums.length; i++) {
      if (nums[Math.abs(nums[i]) - 1] < 0) {
        result.add(Math.abs(nums[i]));
      }
      nums[Math.abs(nums[i]) - 1] *= -1;
    }
    return result;
  }
}

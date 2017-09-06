/**
 * Created by Sarveswara Tippireddy on Sep 6, 2017
 *
 * <p>
 * This LeetCode problem can be found @ https://leetcode.com/problems/summary-ranges/description/
 * 
 */
package leetCode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode228 {
  public List<String> summaryRanges(int[] nums) {
    List<String> result = new ArrayList<>();
    if (nums.length == 0) {
      return result;
    }
    int i = 0;
    while (i < nums.length) {
      int start = nums[i];
      int end = start;
      while (++i < nums.length && nums[i] - nums[i - 1] == 1) {
        end = nums[i];
      }
      if (start != end) {
        result.add(start + "->" + end);
      } else {
        result.add(String.valueOf(start));
      }
    }
    return result;
  }
}

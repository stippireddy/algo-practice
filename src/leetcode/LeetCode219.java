/**
 * Created by Sarveswara Tippireddy on Sep 14, 2017
 *
 * <p>
 * This LeetCode problem can be found @ https://leetcode.com/problems/contains-duplicate-ii/description/
 */
package leetcode;

import java.util.HashSet;

public class LeetCode219 {

  public boolean containsNearbyDuplicate(int[] nums, int k) {
    HashSet<Integer> set = new HashSet<>();
    for (int i = 0; i < nums.length; i++) {
      if (i > k) {
        set.remove(nums[i - k - 1]);
      }
      if (!set.add(nums[i])) {
        return true;
      }
    }
    return false;
  }
}

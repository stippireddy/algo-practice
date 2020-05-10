/**
 * <p>
 * This LeetCode problem can be found @ https://leetcode.com/problems/contains-duplicate/description/
 */
package leetCode;

import java.util.Arrays;
import java.util.HashSet;

public class LeetCode217 {

  public boolean containsDuplicateUsingSort(int[] nums) {
    Arrays.sort(nums);
    for (int i = 0; i < nums.length - 1; i++) {
      if (nums[i] == nums[i + 1]) {
        return true;
      }
    }
    return false;
  }

  public boolean containsDuplicateUsingHashing(int[] nums) {
    HashSet<Integer> set = new HashSet<>();
    for (int i : nums) {
      if (!set.add(i)) {
        return true;
      }
    }
    return false;
  }
}

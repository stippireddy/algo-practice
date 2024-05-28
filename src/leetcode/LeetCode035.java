/**
 * Created by Sarveswara Tippireddy on Aug 30, 2017
 *
 * <p>
 * This LeetCode problem can be found @ https://leetcode.com/problems/search-insert-position/description/
 */
package leetcode;

public class LeetCode035 {

  public int searchInsert(int[] nums, int target) {
    int low = 0, high = nums.length - 1;
    while (low <= high) {
      int mid = low + (high - low) / 2;
      if (nums[mid] == target) {
        return low;
      } else if (target < nums[mid]) {
        high = mid - 1;
      } else {
        low = mid + 1;
      }
    }
    return low;
  }
}

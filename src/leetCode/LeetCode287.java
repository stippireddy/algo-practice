/**
 * Created by Sarveswara Tippireddy
 *
 * <p>
 * This LeetCode problem can be found @
 * https://leetcode.com/problems/find-the-duplicate-number/description/
 */
package leetCode;

import java.util.HashMap;

public class LeetCode287 {

  public int findDuplicateUsingHashMap(int[] nums) {
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int i : nums) {
      int count = map.getOrDefault(i, 0);
      if (count == 1) {
        return i;
      } else {
        map.put(i, count + 1);
      }
    }
    return -1;
  }

  public int findDuplicateBruteForce(int[] nums) {
    for (int i = 0; i < nums.length - 1; i++) {
      for (int j = i + 1; j < nums.length; j++) {
        if (nums[i] == nums[j]) {
          return nums[i];
        }
      }
    }
    return -1;
  }

  public int findDuplicateUsingBinarySearch(int[] nums) {
    int low = 1, high = nums.length - 1;
    while (low < high) {
      int mid = low + (high - low) / 2;
      int count = 0;
      for (int i : nums) {
        if (i <= mid) {
          count++;
        }
      }
      if (count > mid) {
        high = mid;
      } else {
        low = mid + 1;
      }
    }
    return low;
  }

  public int findDuplicateUsingCycleDetection(int[] nums) {
    int tortoise = nums[0];
    int hare = nums[nums[0]];
    while (hare != tortoise) {
      tortoise = nums[tortoise];
      hare = nums[nums[hare]];
    }
    hare = 0;
    while (hare != tortoise) {
      hare = nums[hare];
      tortoise = nums[tortoise];
    }
    return tortoise;
  }
}

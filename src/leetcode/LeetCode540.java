package leetcode;

public class LeetCode540 {

  /*
   * All elements before the required have first occurrence at even index (0, 2, ..) and next occurrence
   * at odd index (1, 3, �). And all elements after the required element have first occurrence at odd
   * index and next occurrence at even index.
   */
  public int singleNonDuplicate(int[] nums) {
    return singleNonDuplicate(nums, 0, nums.length - 1);
  }

  private int singleNonDuplicate(int[] nums, int i, int j) {
    if (i < j) {
      int mid = (i + j) / 2;
      if (mid % 2 == 0) {
        if (nums[mid] == nums[mid + 1]) {
          return singleNonDuplicate(nums, mid + 2, j);
        } else {
          return singleNonDuplicate(nums, i, mid);
        }
      } else {
        if (nums[mid - 1] == nums[mid]) {
          return singleNonDuplicate(nums, mid + 1, j);
        } else {
          return singleNonDuplicate(nums, i, mid - 1);
        }
      }
    }
    return nums[i];
  }
}

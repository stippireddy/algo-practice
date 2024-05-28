package leetcode;

public class LeetCode665 {

  public boolean checkPossibility(int[] nums) {
    return forward(nums) || backward(nums);
  }

  private boolean forward(int[] nums) {
    int prev = nums[0];
    boolean swap = false;
    for (int i = 1; i < nums.length; i++) {
      if (prev <= nums[i]) {
        prev = nums[i];
      } else {
        if (swap) {
          return false;
        }
        swap = true;
      }
    }
    return true;
  }

  private boolean backward(int[] nums) {
    int next = nums[nums.length - 1];
    boolean swap = false;
    for (int i = nums.length - 2; i >= 0; i--) {
      if (next >= nums[i]) {
        next = nums[i];
      } else {
        if (swap) {
          return false;
        }
        swap = true;
      }
    }
    return true;
  }
}

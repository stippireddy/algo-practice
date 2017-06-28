package leetCode;

public class LeetCode198 {
  public int rob(int[] nums) {
    int i = 0;
    int sum = 0;
    boolean skip = false;
    while (i + 1 < nums.length) {
      if (!skip) {
        if (nums[i] > nums[i + 1]) {
          sum += nums[i];
          skip = false;
        } else {
          sum += nums[i + 1];
          skip = true;
        }
      }
      i++;
    }
    if (i < nums.length && !skip) {
      sum += nums[i];
    }
    return sum;
  }
}

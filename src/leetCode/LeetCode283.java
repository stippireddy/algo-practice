package leetCode;

public class LeetCode283 {

  public void moveZeroes(int[] nums) {
    int i = 0;
    int length = nums.length;
    for (int j = 0; j < length; j++) {
      if (nums[j] != 0) {
        nums[i++] = nums[j];
      }
    }
    while (i < length) {
      nums[i++] = 0;
    }
  }
}

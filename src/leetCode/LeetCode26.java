package leetCode;

public class LeetCode26 {
  public int removeDuplicates(int[] nums) {
    int i = 1;
    int j = 1;
    while (j < nums.length) {
      if (nums[j - 1] != nums[j]) {
        nums[i++] = nums[j];
      }
      j++;
    }
    return i;
  }
}

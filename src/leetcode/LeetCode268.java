package leetcode;

public class LeetCode268 {

  public int missingNumber(int[] nums) {
    int temp = 0;
    for (int i = 0; i < nums.length; i++) {
      temp ^= i;
      temp ^= nums[i];
    }
    return temp ^ nums.length;
  }
}

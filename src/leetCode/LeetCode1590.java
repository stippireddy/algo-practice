package leetCode;

public class LeetCode1590 {

  public int minSubarray(int[] nums, int p) {
    int[] prefixSum = new int[nums.length];
    int sum = 0;
    for (int i = 0; i < nums.length; i++) {
      sum += nums[i];
      prefixSum[i] = sum;
    }
    for (int i = 0; i < nums.length; i++) {
    }
    return 0;
  }

}

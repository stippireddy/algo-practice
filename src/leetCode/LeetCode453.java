package leetCode;

public class LeetCode453 {
  public int minMoves(int[] nums) {
    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;
    for (int i : nums) {
      if (i > max) {
        max = i;
      }
      if (i < min) {
        min = i;
      }
    }
    int result = max - min - 1;
    result += (nums.length * (nums.length - 1)) / 2;
    return result;
  }
}

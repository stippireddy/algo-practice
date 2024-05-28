package leetcode;

public class LeetCode977 {

  public int[] sortedSquares(int[] nums) {
    int[] result = new int[nums.length];
    int i = 0, j = nums.length - 1, k = nums.length - 1;
    while (i <= j) {
      int a = nums[i] * nums[i];
      int b = nums[j] * nums[j];
      if (a > b) {
        result[k] = a;
        k--;
        i++;
      } else {
        result[k] = b;
        k--;
        j--;
      }
    }
    return result;
  }
}

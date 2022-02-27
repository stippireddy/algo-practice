package xis;

public class LeetCode1004 {

  public int longestOnes(int[] nums, int k) {
    int numberOfFlips = 0;
    int i = 0, j = 0;
    int result = 0;
    while (j < nums.length) {
      if (nums[j] == 0) {
        numberOfFlips++;
        while (i <= j && numberOfFlips > k) {
          if (nums[i] == 0) {
            numberOfFlips--;
          }
          i++;
        }
        result = Integer.max(result, j - i + 1);
      }
      j++;
    }
    return result;
  }
}

package xis;

import java.io.IOException;
import java.util.Arrays;

public class LeetCode300 {

  public int lengthOfLIS(int[] nums) {
    int result = 1;
    int[] dp = new int[nums.length + 1];
    Arrays.fill(dp, 1);
    dp[0] = 0;
    for (int i = 0; i < nums.length; i++) {
      for (int j = i - 1; j >= 0; j--) {
        if (nums[i] > nums[j]) {
          dp[i + 1] = Integer.max(dp[i + 1], dp[j + 1] + 1);
        }
      }
      result = Integer.max(result, dp[i + 1]);
    }
    return result;
  }

  public static void main(String[] args) {
    boolean bool = true;
    try {
      bool = getBoolValue();
    } catch (IOException e) {
      System.out.println(e.getMessage());
    }
    System.out.println("bool value is: " + bool);
  }

  private static boolean getBoolValue() throws IOException {
    throw new IOException("test exception");
  }
}

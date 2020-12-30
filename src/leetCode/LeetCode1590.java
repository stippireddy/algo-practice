package leetCode;

import java.util.Arrays;

public class LeetCode1590 {

  // int low = 0, high = nums.length - 1;
  // while (low <= high) {
  //   int mid = low + (high - low) / 2;
  //   if (isDivisible(nums, p, mid)) {
  //     high = mid - 1;
  //   }
  // }
  public int minSubarray(int[] nums, int p) {
    int sum = Arrays.stream(nums).sum();
    if (sum % p == 0) {
      return 0;
    }
    for (int i = 1; i < nums.length; i++) {
      int windowSum = 0;
      int j = 0;
      for (; j < i - 1; j++) {
        windowSum += nums[j];
      }
      for (; j < nums.length; j++) {
        windowSum += nums[j];
        if ((sum - windowSum) % p == 0) {
          return i;
        }
        windowSum -= nums[j - i + 1];
      }
    }
    return -1;
  }

}

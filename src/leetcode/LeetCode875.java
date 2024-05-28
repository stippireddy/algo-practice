package leetcode;

import java.util.Arrays;

public class LeetCode875 {

  public int minEatingSpeed(int[] piles, int hours) {
    int high = Arrays.stream(piles).max().getAsInt();
    int low = 1;
    while (low < high) {
      int mid = low + (high - low) / 2;
      if (isValid(piles, mid, hours)) {
        high = mid;
      } else {
        low = mid + 1;
      }
    }
    return low;
  }

  private boolean isValid(int[] piles, int rate, int hours) {
    int totalHours = 0;
    for (int i : piles) {
      totalHours += i % rate == 0 ? i / rate : i / rate + 1;
    }
    return totalHours <= hours;
  }
}

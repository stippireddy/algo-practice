package leetCode;

public class LeetCode1011 {

  public int shipWithinDays(int[] weights, int days) {
    int high = 0;
    int low = Integer.MIN_VALUE;
    for (int i : weights) {
      high += i;
      low = Integer.max(low, i);
    }
    while (low < high) {
      int mid = low + (high - low) / 2;
      if (isValid(weights, mid, days)) {
        high = mid;
      } else {
        low = mid + 1;
      }
    }
    return low;
  }

  private boolean isValid(int[] weights, int rate, int maxDays) {
    int shipDays = 1;
    int currentWeight = 0;
    for (int w : weights) {
      if (currentWeight + w <= rate) {
        currentWeight += w;
      } else {
        shipDays++;
        currentWeight = w;
      }
    }
    return shipDays <= maxDays;
  }
}

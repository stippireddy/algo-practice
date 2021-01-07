package leetCode;

public class LeetCode1452 {

  public int minDays(int[] bloomDay, int m, int k) {
    int min = bloomDay[0];
    int max = bloomDay[0];
    for (int day : bloomDay) {
      min = Integer.min(min, day);
      max = Integer.max(max, day);
    }
    while (min < max) {
      int mid = min + (max - min) / 2;
      if (canMakeBouquets(bloomDay, mid, m, k)) {
        max = mid;
      } else {
        min = mid + 1;
      }
    }
    return canMakeBouquets(bloomDay, min, m, k) ? min : -1;
  }

  private boolean canMakeBouquets(int[] bloomDay, int days, int m, int k) {
    int count = 0;
    int newBouquetSize = 0;
    for (int i : bloomDay) {
      if (i <= days) {
        newBouquetSize++;
      } else {
        newBouquetSize = 0;
      }
      if (newBouquetSize == k) {
        count++;
        newBouquetSize = 0;
      }
      if (count == m) {
        return true;
      }
    }
    return false;
  }
}

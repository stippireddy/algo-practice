package xis;

import java.util.Arrays;

public class LeetCode1094 {

  public boolean carPooling(int[][] trips, int capacity) {
    int[][] splitTrips = new int[trips.length * 2][2];
    int i = 0;
    for (int[] trip : trips) {
      splitTrips[i][0] = trip[0];
      splitTrips[i][1] = trip[1];
      splitTrips[i + 1][0] = -trip[0];
      splitTrips[i + 1][1] = trip[2];
      i += 2;
    }
    Arrays.sort(splitTrips,
        (a, b) -> a[1] == b[1] ? Integer.compare(a[0], b[0]) : Integer.compare(a[1], b[1]));
    int passengers = 0;
    for (int[] trip : splitTrips) {
      passengers += trip[0];
      if (passengers > capacity) {
        return false;
      }
    }
    return true;
  }
}

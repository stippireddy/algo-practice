package leetcode;

import java.util.Arrays;
import java.util.Comparator;

public class LeetCode1094 {

  public static void main(String[] args) {
    LeetCode1094 l = new LeetCode1094();
    int[][] trips = {{2, 1, 5}, {3, 3, 7}};
    l.carPooling(trips, 5);
  }

  public boolean carPooling(int[][] trips, int capacity) {
    Trip[] t = new Trip[trips.length * 2];
    int i = 0;
    for (int[] trip : trips) {
      t[i] = new Trip(trip[1], trip[0]);
      t[i + 1] = new Trip(trip[2], -trip[0]);
      i += 2;
    }
    Arrays.sort(t, Comparator.comparingInt(Trip::getDistance).thenComparingInt(Trip::getCapacity));
    int maxPeople = 0;
    for (Trip trip : t) {
      maxPeople += trip.getCapacity();
      if (maxPeople > capacity) {
        return false;
      }
    }
    return true;
  }

  private static class Trip {

    int capacity;
    int distance;

    public Trip(int distance, int capacity) {
      this.capacity = capacity;
      this.distance = distance;
    }

    public int getCapacity() {
      return capacity;
    }

    public int getDistance() {
      return distance;
    }
  }
}

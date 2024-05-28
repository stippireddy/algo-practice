package leetcode;

import java.util.PriorityQueue;

public class LeetCode871 {

  public static void main(String[] args) {
    LeetCode871 l = new LeetCode871();
    System.out.println(l.minRefuelStops(100,
        10,
        new int[][]{{10, 60}, {20, 30}, {30, 30}, {60, 40}}
    ));
  }

  public int minRefuelStops(int target, int startFuel, int[][] stations) {
    PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);
    int distanceCovered = 0;
    int fuelStops = 0;
    int i = 0;
    while (distanceCovered < target) {
      distanceCovered += startFuel;
      startFuel = 0;
      while (i < stations.length && stations[i][0] <= distanceCovered) {
        maxHeap.add(stations[i][1]);
        i++;
      }
    }
    return fuelStops;
  }
}

package leetCode;

import java.util.PriorityQueue;

public class LeetCode1642 {

  public int furthestBuilding(int[] heights, int bricksAvailable, int ladders) {
    PriorityQueue<Integer> heap = new PriorityQueue<>();
    int bricksUsed = 0;
    for (int i = 0; i < heights.length - 1; i++) {
      if (heights[i + 1] <= heights[i]) {
        continue;
      }
      heap.add(heights[i + 1] - heights[i]);
      while (heap.size() > ladders) {
        bricksUsed += heap.poll();
      }
      if (bricksUsed > bricksAvailable) {
        return i;
      }
    }
    return heights.length - 1;
  }
}

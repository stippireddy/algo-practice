package xis;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.PriorityQueue;

public class LeetCode774 {

  public double minmaxGasDist(int[] stations, int k) {
    PriorityQueue<Double> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
    for (int i = 0; i < stations.length - 1; i++) {
      priorityQueue.add((double) (stations[i + 1] - stations[i]));
    }
    for (int i = 0; i < k; i++) {
      if (!priorityQueue.isEmpty()) {
        double originalDistance = priorityQueue.poll();
        priorityQueue.add(originalDistance / 2.0);
        priorityQueue.add(originalDistance / 2.0);
      }
    }
    return priorityQueue.poll();
  }

  public static void main(String[] args) {
    LeetCode774 leetCode774 = new LeetCode774();
    leetCode774.minmaxGasDist(new int[]{10, 19, 25, 27, 56, 63, 70, 87, 96, 97},
        3);

  }
}

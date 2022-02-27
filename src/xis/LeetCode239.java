package xis;

import java.util.ArrayDeque;

public class LeetCode239 {

  public int[] maxSlidingWindow(int[] nums, int k) {
    ArrayDeque<Integer> queue = new ArrayDeque<>();
    int i = 0;
    for (; i < k - 1; i++) {
      while (!queue.isEmpty() && nums[i] > nums[queue.peekLast()]) {
        queue.removeLast();
      }
      queue.addLast(i);
    }
    int[] result = new int[nums.length - k + 1];
    for (int j = 0; i < nums.length; i++, j++) {
      while (!queue.isEmpty() && nums[i] > nums[queue.peekLast()]) {
        queue.removeLast();
      }
      queue.addLast(i);
      result[j] = nums[queue.peekFirst()];

      while (!queue.isEmpty() && queue.peekFirst() <= i - k + 1) {
        queue.removeFirst();
      }
    }
    return result;
  }
}

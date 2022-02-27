package xis;

import java.util.ArrayDeque;

public class LeetCode735 {

  public int[] asteroidCollision(int[] asteroids) {
    ArrayDeque<Integer> stack = new ArrayDeque<>();
    for (int i = 0; i < asteroids.length; ) {
      if (asteroids[i] > 0 || stack.isEmpty() || stack.peek() < 0) {
        stack.push(asteroids[i]);
        i++;
      } else {
        if (stack.peek() > -asteroids[i]) {
          i++;
        } else if (stack.peek() == -asteroids[i]) {
          stack.poll();
          i++;
        } else {
          stack.poll();
        }
      }
    }
    int[] result = new int[stack.size()];
    for (int i = result.length - 1; i >= 0; i--) {
      result[i] = stack.poll();
    }
    return result;
  }
}

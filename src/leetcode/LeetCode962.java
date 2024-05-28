package leetcode;

import java.util.ArrayDeque;

public class LeetCode962 {

  public int maxWidthRamp(int[] A) {
    ArrayDeque<Integer> stack = new ArrayDeque<>();
    for (int i = A.length - 1; i >= 0; i--) {
      if (stack.isEmpty() || A[stack.peek()] < A[i]) {
        stack.push(i);
      }
    }
    int maxRampWidth = 0;
    for (int i = 0; i < A.length && !stack.isEmpty(); i++) {
      while (!stack.isEmpty() && A[i] <= A[stack.peek()]) {
        maxRampWidth = Integer.max(maxRampWidth, stack.pop() - i);
      }
    }
    return maxRampWidth;
  }
}
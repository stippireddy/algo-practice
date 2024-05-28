package leetcode;

import java.util.ArrayDeque;

public class LeetCode946 {

  public boolean validateStackSequences(int[] pushed, int[] popped) {
    if (pushed.length != popped.length) {
      return false;
    }
    ArrayDeque<Integer> stack = new ArrayDeque<>();
    int i = 0, j = 0;
    while (i < pushed.length || j < popped.length) {
      if (stack.isEmpty() || stack.peek() != popped[j]) {
        if (i >= pushed.length) {
          return false;
        }
        stack.push(pushed[i]);
        i++;
      } else {
        stack.pop();
        j++;
      }
    }
    return true;
  }
}

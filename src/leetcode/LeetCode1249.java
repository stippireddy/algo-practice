package leetcode;

import java.util.ArrayDeque;

public class LeetCode1249 {

  public String minRemoveToMakeValid(String s) {
    ArrayDeque<Character> stack = new ArrayDeque<>();
    int leftCount = 0;
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == ')') {
        if (leftCount > 0) {
          stack.push(')');
          leftCount--;
        }
      } else if (s.charAt(i) == '(') {
        stack.push(s.charAt(i));
        leftCount++;
      } else {
        stack.push(s.charAt(i));
      }
    }
    StringBuilder sb = new StringBuilder();
    while (!stack.isEmpty()) {
      Character currentCharacter = stack.pop();
      if (currentCharacter == '(' && leftCount > 0) {
        leftCount--;
      } else {
        sb.append(currentCharacter);
      }
    }
    return sb.reverse().toString();
  }
}

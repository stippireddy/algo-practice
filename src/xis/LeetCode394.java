package xis;

import java.util.ArrayDeque;

public class LeetCode394 {

  public String decodeString(String s) {
    ArrayDeque<Integer> intStack = new ArrayDeque<>();
    ArrayDeque<String> stringStack = new ArrayDeque<>();
    stringStack.push("");
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      if (c == '[') {

      } else if (c == ']') {

      } else if (Character.isDigit(c)) {

      } else {

      }
    }
    return stringStack.poll();
  }
}

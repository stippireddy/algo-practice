/**
 * Created by Sarveswara Tippireddy on Aug 31, 2017
 *
 * <p>
 * This LeetCode problem can be found @ https://leetcode.com/problems/valid-parentheses/description/
 * 
 */
package leetCode;

import java.util.ArrayDeque;
import java.util.HashMap;

public class LeetCode020 {
  public boolean isValid(String s) {
    ArrayDeque<Character> stack = new ArrayDeque<>();
    HashMap<Character, Character> map = new HashMap<>();
    map.put('}', '{');
    map.put(']', '[');
    map.put(')', '(');
    for (int i = 0; i < s.length(); i++) {
      char currentChar = s.charAt(i);
      if (map.containsKey(currentChar)) {
        if (stack.isEmpty()) {
          return false;
        } else {
          if (stack.pop() != map.get(currentChar)) {
            return false;
          }
        }
      } else {
        stack.push(currentChar);
      }
    }
    return stack.isEmpty();
  }
}

/**
 * Created by Sarveswara Tippireddy on Aug 23, 2017
 *
 * <p>This LeetCode problem can be found @
 * https://leetcode.com/problems/roman-to-integer/description/
 */
package leetCode;

import java.util.HashMap;

public class LeetCode013 {

  private static final HashMap<Character, Integer> keyMap = new HashMap<>();

  static {
    keyMap.put('M', 1000);
    keyMap.put('D', 500);
    keyMap.put('C', 100);
    keyMap.put('L', 50);
    keyMap.put('X', 10);
    keyMap.put('V', 5);
    keyMap.put('I', 1);
  }

  public int romanToInt(String s) {
    int result = 0;
    int prev = keyMap.get(s.charAt(0));
    for (int i = 1; i < s.length(); i++) {
      int curr = keyMap.get(s.charAt(i));
      if (prev < curr) {
        result -= prev;
      } else {
        result += prev;
      }
      prev = curr;
    }
    result += prev;
    return result;
  }
}

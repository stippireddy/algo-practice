package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class LeetCode017 {

  private static final Map<Character, char[]> map = Map.of(
      '2', new char[]{'a', 'b', 'c'},
      '3', new char[]{'d', 'e', 'f'},
      '4', new char[]{'g', 'h', 'i'},
      '5', new char[]{'j', 'k', 'l'},
      '6', new char[]{'m', 'n', 'o'},
      '7', new char[]{'p', 'q', 'r', 's'},
      '8', new char[]{'t', 'u', 'v'},
      '9', new char[]{'w', 'x', 'y', 'z'});

  public List<String> letterCombinations(String digits) {
    List<String> result = new ArrayList<>();
    if (digits == null || digits.length() == 0) {
      return result;
    }
    helper(digits, 0, new StringBuilder(), result);
    return result;
  }

  private void helper(String digits, int index, StringBuilder sb, List<String> result) {
    if (index == digits.length()) {
      result.add(sb.toString());
      return;
    }
    for (char c : map.get(digits.charAt(index))) {
      sb.append(c);
      helper(digits, index + 1, sb, result);
      sb.deleteCharAt(sb.length() - 1);
    }
  }
}

package leetCode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode241 {

  public List<Integer> diffWaysToCompute(String input) {
    return helper(input, 0, input.length());
  }

  private List<Integer> helper(String input, int start, int end) {
    List<Integer> result = new ArrayList<>();
    boolean hasOperator = false;
    for (int i = start; i < end; i++) {
      if (!Character.isDigit(input.charAt(i))) {
        hasOperator = true;
        result.addAll(calculate(helper(input, start, i), helper(input, i + 1, end),
            input.charAt(i)));
      }
    }
    if (!hasOperator) {
      result.add(Integer.parseInt(input.substring(start, end)));
    }
    return result;
  }

  private List<Integer> calculate(List<Integer> left, List<Integer> right, char c) {
    List<Integer> result = new ArrayList<>();
    for (int i : left) {
      for (int j : right) {
        if (c == '+') {
          result.add(i + j);
        } else if (c == '-') {
          result.add(i - j);
        } else if (c == '*') {
          result.add(i * j);
        } else if (c == '/') {
          result.add(i / j);
        }
      }
    }
    return result;
  }
}

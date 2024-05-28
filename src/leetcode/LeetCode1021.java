package leetcode;

public class LeetCode1021 {

  public String removeOuterParentheses(String s) {
    int left = 0;
    int right = 0;
    int count = 0;
    StringBuilder sb = new StringBuilder();
    while (right < s.length()) {
      if (s.charAt(right) == ')') {
        count--;
      } else {
        count++;
      }
      if (count == 0) {
        sb.append(s.substring(left, right));
      }
    }
    return sb.toString();
  }
}

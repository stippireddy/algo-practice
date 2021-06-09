package leetCode;

public class LeetCode032 {

  public int longestValidParentheses(String s) {
    int maxLength = 0;
    for (int i = 0; i < s.length(); i++) {
      for (int j = i + 1; j < s.length(); j++) {
        if (isValidParentheses(s, i, j)) {
          maxLength = Integer.max(maxLength, j - i + 1);
        }
      }
    }
    return maxLength;
  }

  private boolean isValidParentheses(String s, int i, int j) {
    int openBracketCount = 0;
    while (i <= j) {
      if (s.charAt(i) == '(') {
        openBracketCount++;
      } else {
        if (openBracketCount < 1) {
          return false;
        }
        openBracketCount--;
      }
      i++;
    }
    return openBracketCount == 0;
  }
}

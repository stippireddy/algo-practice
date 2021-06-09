package leetCode;

public class LeetCode921 {

  public int minAddToMakeValid(String s) {
    int openBraces = 0;
    int result = 0;
    for (char c : s.toCharArray()) {
      if (c == '(') {
        openBraces++;
      } else {
        if (openBraces > 0) {
          openBraces--;
        } else {
          result++;
        }
      }
    }
    return result + openBraces;
  }
}

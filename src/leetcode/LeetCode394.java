package leetcode;

import java.util.ArrayDeque;

public class LeetCode394 {

  public static void main(String[] args) {
    LeetCode394 l = new LeetCode394();
    System.out.println(l.decodeString("2[abc]3[cd]ef"));
  }

  public String decodeString(String s) {
    ArrayDeque<String> resultStack = new ArrayDeque<>();
    resultStack.push("");
    ArrayDeque<Integer> countStack = new ArrayDeque<>();
    int i = 0;
    while (i < s.length()) {
      char c = s.charAt(i);
      if (Character.isDigit(c)) {
        int j = i + 1;
        while (j < s.length() && Character.isDigit(s.charAt(j))) {
          j++;
        }
        countStack.push(Integer.valueOf(s.substring(i, j)));
        i = j;
      } else if (Character.isAlphabetic(c)) {
        int j = i + 1;
        while (j < s.length() && Character.isAlphabetic(s.charAt(j))) {
          j++;
        }
        resultStack.push(s.substring(i, j));
        i = j;
      } else {
        if (c == ']') {
          StringBuilder sb = new StringBuilder();
          int count = countStack.pop();
          String repeatedPart = resultStack.pop();
          sb.append(resultStack.pop());
          while (count > 0) {
            sb.append(repeatedPart);
            count--;
          }
          resultStack.push(sb.toString());
        }
        i++;
      }
    }
    StringBuilder sb = new StringBuilder();
    while (!resultStack.isEmpty()) {
      sb.append(resultStack.pollFirst());
    }
    return sb.toString();
  }
}

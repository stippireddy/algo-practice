package leetCode;

import java.util.Arrays;
import java.util.Comparator;

public class LeetCode1451 {

  public String arrangeWords(String text) {
    String[] strings = text.split(" ");
    Arrays.sort(strings, Comparator.comparingInt(String::length));
    StringBuilder sb = new StringBuilder();
    for (String s : strings) {
      sb.append(s.toLowerCase()).append(" ");
    }
    if (sb.length() > 0) {
      sb.deleteCharAt(sb.length() - 1);
      sb.setCharAt(0, Character.toUpperCase(sb.charAt(0)));
    }
    return sb.toString();
  }
}

package xis;

import java.util.Arrays;

public class LeetCode859 {

  public boolean buddyStrings(String s, String goal) {
    if (s.length() != goal.length()) {
      return false;
    }
    int[] sFreq = new int[26];
    int[] goalFreq = new int[26];
    int distance = 0;
    for (int i = 0; i < s.length(); i++) {
      sFreq[s.charAt(i) - 'a']++;
      goalFreq[goal.charAt(i) - 'a']++;
      if (s.charAt(i) != goal.charAt(i)) {
        distance++;
      }
    }
    if (!Arrays.equals(sFreq, goalFreq)) {
      return false;
    }
    if (distance == 2) {
      return true;
    }
    for (int i : sFreq) {
      if (i > 1) {
        return true;
      }
    }
    return false;
  }
}

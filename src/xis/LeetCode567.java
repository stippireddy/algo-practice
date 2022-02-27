package xis;

import java.util.Arrays;

public class LeetCode567 {

  public boolean checkInclusion(String p, String s) {
    if (s.length() < p.length()) {
      return false;
    }
    int[] pArray = new int[26];
    for (char c : p.toCharArray()) {
      pArray[c - 'a']++;
    }
    int[] sArray = new int[26];
    int i = 0;
    for (; i < p.length() - 1; i++) {
      sArray[s.charAt(i) - 'a']++;
    }
    for (; i < s.length(); i++) {
      sArray[s.charAt(i) - 'a']++;
      if (Arrays.equals(sArray, pArray)) {
        return true;
      }
      sArray[s.charAt(i - p.length() + 1) - 'a']--;
    }
    return false;
  }
}

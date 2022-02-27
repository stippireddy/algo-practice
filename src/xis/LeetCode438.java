package xis;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode438 {

  public List<Integer> findAnagrams(String s, String p) {
    List<Integer> result = new ArrayList<>();
    if (s.length() < p.length()) {
      return result;
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
        result.add(i - p.length() + 1);
      }
      sArray[s.charAt(i - p.length() + 1) - 'a']--;
    }
    return result;
  }
}

package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode438 {

  public List<Integer> findAnagrams(String s, String p) {
    int[] pFreq = new int[26];
    for (char c : p.toCharArray()) {
      pFreq[c - 'a']++;
    }
    int i = 0;
    int[] sFreq = new int[26];
    while (i < p.length() - 1) {
      sFreq[s.charAt(i) - 'a']++;
      i++;
    }
    List<Integer> result = new ArrayList<>();
    while (i < s.length()) {
      sFreq[s.charAt(i) - 'a']++;
      if (Arrays.equals(pFreq, sFreq)) {
        result.add(i - p.length() + 1);
      }
      sFreq[s.charAt(i - p.length() + 1) - 'a']--;
      i++;
    }
    return result;
  }
}

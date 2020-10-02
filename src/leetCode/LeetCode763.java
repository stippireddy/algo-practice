package leetCode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LeetCode763 {

  public List<Integer> partitionLabels(String s) {
    if (s == null || s.length() == 0) {
      return new ArrayList<>();
    }
    int[] frequency = new int[26];
    for (char c : s.toCharArray()) {
      frequency[c - 'a']++;
    }
    Set<Character> charactersInCurrentSubstring = new HashSet<>();
    int start = 0;
    List<Integer> result = new ArrayList<>();
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      frequency[c - 'a']--;
      if (frequency[c - 'a'] == 0) {
        charactersInCurrentSubstring.remove(c);
      } else {
        charactersInCurrentSubstring.add(c);
      }
      if (charactersInCurrentSubstring.isEmpty()) {
        result.add(i - start + 1);
        start = i + 1;
      }
    }
    return result;
  }
}

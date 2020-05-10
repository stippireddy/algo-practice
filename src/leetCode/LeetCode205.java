package leetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class LeetCode205 {

  public boolean isIsomorphicUsingHashMap(String s, String t) {
    if (s.length() != t.length()) {
      return false;
    }
    HashMap<Character, Character> map = new HashMap<>();
    HashSet<Character> mappedSet = new HashSet<>();
    for (int i = 0; i < s.length(); i++) {
      if (map.containsKey(s.charAt(i))) {
        if (map.get(s.charAt(i)) != t.charAt(i)) {
          return false;
        }
      } else {
        if (mappedSet.contains(t.charAt(i))) {
          return false;
        }
        map.put(s.charAt(i), t.charAt(i));
        mappedSet.add(t.charAt(i));
      }
    }
    return true;
  }

  // This solution can lead to overflow if the s.length()>= Integer.Max_Value
  public boolean isIsomorphicUsingArray(String s, String t) {
    if (s.length() != t.length()) {
      return false;
    }
    int[] sArray = new int[256];
    Arrays.fill(sArray, -1);
    int[] tArray = new int[256];
    Arrays.fill(tArray, -1);
    for (int i = 0; i < s.length(); i++) {
      if (sArray[s.charAt(i)] != tArray[t.charAt(i)]) {
        return false;
      }
      sArray[s.charAt(i)] = i;
      tArray[t.charAt(i)] = i;
    }
    return true;
  }

  // @morrischen2008's solution of leetcode forum to handle overflow issue
  public boolean isIsomorphic(String s, String t) {
    int[] m1 = new int[256], m2 = new int[256];
    int count = 1;
    for (int i = 0; i < s.length(); i++) {
      if (m1[s.charAt(i)] != m2[t.charAt(i)]) {
        return false;
      }
      if (m1[s.charAt(i)] == 0) {
        m1[s.charAt(i)] = count;
        m2[t.charAt(i)] = count;
        count++;
      }
    }
    return true;
  }

}

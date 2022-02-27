package xis;

import java.util.Arrays;

public class LeetCode1657 {

  public boolean closeStrings(String s, String t) {
    int[] sFreq = getFrequency(s);
    int[] tFreq = getFrequency(t);
    for (int i = 0; i < 26; i++) {
      if ((sFreq[i] != 0 && tFreq[i] == 0) || (sFreq[i] == 0 && tFreq[i] != 0)) {
        return false;
      }
    }
    Arrays.sort(sFreq);
    Arrays.sort(tFreq);
    return Arrays.equals(sFreq, tFreq);
  }

  private int[] getFrequency(String t) {
    int[] result = new int[26];
    for (char c : t.toCharArray()) {
      result[c - 'a']++;
    }
    return result;
  }
}

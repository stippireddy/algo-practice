package xis;

public class LeetCode1347 {

  public int minSteps(String s, String t) {
    int[] sFreq = getFrequency(s);
    int[] tFreq = getFrequency(t);
    int result = 0;
    for (int i = 0; i < 26; i++) {
      if (tFreq[i] > sFreq[i]) {
        result += tFreq[i] - sFreq[i];
      }
    }
    return result;
  }

  private int[] getFrequency(String t) {
    int[] result = new int[26];
    for (char c : t.toCharArray()) {
      result[c - 'a']++;
    }
    return result;
  }
}

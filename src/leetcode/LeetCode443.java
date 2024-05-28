package leetcode;

public class LeetCode443 {

  public int compress(char[] chars) {
    int i = 0;
    int j = 0;
    while (j < chars.length) {
      int frequency = 1;
      char c = chars[j];
      j++;
      while (j < chars.length && chars[j] == c) {
        frequency++;
        j++;
      }
      chars[i] = c;
      i++;
      if (frequency != 1) {
        String f = String.valueOf(frequency);
        for (int k = 0; k < f.length(); k++) {
          chars[i] = f.charAt(k);
          i++;
        }
      }
    }
    return i;
  }
}

package leetCode;

import java.util.Arrays;

public class LeetCode621 {

  public int leastInterval(char[] tasks, int n) {
    int[] freq = new int[26];
    for (char c : tasks) {
      freq[c - 'A']++;
    }
    Arrays.sort(freq);
    return -1;
  }
}

package leetCode;

import java.util.HashMap;

public class LeetCode1027 {

  public int longestArithSeqLength(int[] a) {
    HashMap<Integer, Integer>[] array = new HashMap[a.length];
    int result = 2;
    for (int i = 0; i < a.length; i++) {
      array[i] = new HashMap<>();
      for (int j = 0; j < i; j++) {
        int diff = a[i] - a[j];
        array[i].put(diff, array[j].getOrDefault(diff, 1) + 1);
        result = Integer.max(array[i].get(diff), result);
      }
    }
    return result;
  }
}
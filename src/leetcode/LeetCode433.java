package leetcode;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class LeetCode433 {

  public int minMutation(String start, String end, String[] bank) {
    Set<String> set = new HashSet<>();
    Collections.addAll(set, bank);
    if (!set.contains(end)) {
      return -1;
    }
    char[] geneCharacters = {'A', 'C', 'G', 'T'};
    ArrayDeque<String> transformations = new ArrayDeque<>();
    transformations.add(start);
    int result = 0;
    while (!transformations.isEmpty()) {
      result += 1;
      ArrayDeque<String> nextTransformations = new ArrayDeque<>();
      while (!transformations.isEmpty()) {
        char[] currentTransformation = transformations.poll().toCharArray();
        for (int i = 0; i < currentTransformation.length; i++) {
          char actual = currentTransformation[i];
          for (char c : geneCharacters) {
            currentTransformation[i] = c;
            String nextTransformation = String.valueOf(currentTransformation);
            if (end.equals(nextTransformation)) {
              return result;
            }
            if (set.contains(nextTransformation)) {
              nextTransformations.add(nextTransformation);
              set.remove(nextTransformation);
            }
          }
          currentTransformation[i] = actual;
        }
      }
      transformations = nextTransformations;
    }
    return -1;
  }
}
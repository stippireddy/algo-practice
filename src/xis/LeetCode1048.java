package xis;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LeetCode1048 {

  public int longestStrChain(String[] input) {
    Map<String, Integer> dp = new HashMap<>();
    Set<String> words = new HashSet<>();
    Collections.addAll(words, input);
    for (String word : words) {
      dp.putIfAbsent(word, dfs(word, words, dp));
    }
    return dp.values().stream().max(Integer::compare).get();
  }

  private int dfs(String word, Set<String> words, Map<String, Integer> dp) {
    if (dp.containsKey(word)) {
      return dp.get(word);
    }
    int max = 1;
    dp.put(word, max);
    for (int i = 0; i < word.length(); i++) {
      String child = word.substring(0, i) + word.substring(i + 1);
      if (words.contains(child)) {
        max = Integer.max(max, dfs(child, words, dp) + 1);
      }
    }
    dp.put(word, max);
    return max;
  }
}

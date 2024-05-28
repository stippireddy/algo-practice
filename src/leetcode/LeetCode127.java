package leetcode;

import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LeetCode127 {

  public int ladderLength(String beginWord, String endWord, List<String> wordList) {
    Set<String> set = new HashSet<>(wordList);
    if (!set.contains(endWord)) {
      return 0;
    }
    ArrayDeque<String> queue = new ArrayDeque<>();
    queue.add(beginWord);
    set.remove(beginWord);
    int transformations = 1;
    while (!queue.isEmpty()) {
      int size = queue.size();
      transformations++;
      for (int i = 0; i < size; i++) {
        char[] charArray = queue.poll().toCharArray();
        for (int k = 0; k < charArray.length; k++) {
          char temp = charArray[k];
          for (int j = 0; j < 26; j++) {
            charArray[k] = (char) ('a' + j);
            String nextString = String.valueOf(charArray);
            if (nextString.equals(endWord)) {
              return transformations;
            }
            if (set.contains(nextString)) {
              queue.add(nextString);
              set.remove(nextString);
            }
          }
          charArray[k] = temp;
        }
      }
    }
    return 0;
  }
}

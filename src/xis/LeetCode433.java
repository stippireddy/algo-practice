package xis;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class LeetCode433 {

  // "cde"

  public int minMutation(String start, String end, String[] inputBank) {
    if (start.equals(end)) {
      return 0;
    }
    Set<String> bank = new HashSet<>(Arrays.asList(inputBank));
    if (!bank.contains(end)) {
      return -1;
    }
    ArrayDeque<String> queue = new ArrayDeque<>();
    queue.add(start);
    int count = 0;
    char[] charSet = {'A', 'C', 'G', 'T'};
    while (!queue.isEmpty()) {
      count++;
      int size = queue.size();
      for (int i = 0; i < size; i++) {
        char[] current = queue.poll().toCharArray();
      }
    }
    return count;
  }
}

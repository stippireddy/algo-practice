package leetCode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

public class LeetCode692 {

  public List<String> topKFrequent(String[] words, int k) {
    HashMap<String, Integer> frequency = new HashMap<>();
    for (String s : words) {
      frequency.put(s, frequency.getOrDefault(s, 0) + 1);
    }
    PriorityQueue<String> pq = new PriorityQueue<>((a, b) -> frequency.get(a).compareTo(
        frequency.get(b)) == 0 ? b.compareTo(a) : frequency.get(a).compareTo(frequency.get(b)));
    for (String s : frequency.keySet()) {
      pq.offer(s);
      if (pq.size() > k) {
        pq.poll();
      }
    }
    LinkedList<String> result = new LinkedList<>();
    while (!pq.isEmpty()) {
      result.addFirst(pq.poll());
    }
    return result;
  }

}

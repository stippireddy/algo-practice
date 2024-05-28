package leetcode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class LeetCode332 {

  public List<String> findItinerary(List<List<String>> tickets) {
    Map<String, PriorityQueue<String>> flights = new HashMap<>();
    for (List<String> ticket : tickets) {
      flights.putIfAbsent(ticket.get(0), new PriorityQueue<>());
      flights.get(ticket.get(0)).add(ticket.get(1));
    }
    LinkedList<String> result = new LinkedList<>();
    dfs(flights, "JFK", result);
    return result;
  }

  private void dfs(Map<String, PriorityQueue<String>> flights, String current,
      LinkedList<String> result) {
    PriorityQueue<String> arrivals = flights.get(current);
    while (arrivals != null && !arrivals.isEmpty()) {
      dfs(flights, arrivals.poll(), result);
    }
    result.addFirst(current);
  }
}

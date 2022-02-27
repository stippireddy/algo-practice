package xis;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class ComparatorExample {

  public static void main(String[] args) {
    Integer[] array = {9, 8, 7, 1, 2, 3};
    PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> Integer.compare(array[b], array[a]));
    for (int i = 0; i < array.length; i++) {
      pq.add(i);
    }
    while (!pq.isEmpty()) {
      System.out.println(pq.poll());
    }
  }
}

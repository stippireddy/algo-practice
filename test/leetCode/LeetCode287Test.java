package leetCode;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class LeetCode287Test {

  @Test
  public void findDuplicateUsingHashMap() {
    LeetCode287 l = new LeetCode287();
    assertEquals(l.findDuplicateUsingHashMap(new int[] {1, 1}), 1);
    assertEquals(l.findDuplicateUsingHashMap(new int[] {1, 2, 3, 1, 4, 5}), 1);
    assertEquals(l.findDuplicateUsingHashMap(new int[] {10, 8, 7, 9, 4, 7, 7, 2, 7, 1, 3}), 7);
    assertEquals(l.findDuplicateUsingHashMap(new int[] {1, 3, 4, 2, 2}), 2);
  }

  @Test
  public void findDuplicateBruteForce() {
    LeetCode287 l = new LeetCode287();
    assertEquals(l.findDuplicateBruteForce(new int[] {1, 1}), 1);
    assertEquals(l.findDuplicateBruteForce(new int[] {1, 2, 3, 1, 4, 5}), 1);
    assertEquals(l.findDuplicateBruteForce(new int[] {10, 8, 7, 9, 4, 7, 7, 2, 7, 1, 3}), 7);
    assertEquals(l.findDuplicateBruteForce(new int[] {1, 3, 4, 2, 2}), 2);
  }

  @Test
  public void findDuplicateUsingBinarySearch() {
    LeetCode287 l = new LeetCode287();
    assertEquals(l.findDuplicateUsingBinarySearch(new int[] {1, 1}), 1);
    assertEquals(l.findDuplicateUsingBinarySearch(new int[] {1, 2, 3, 1, 4, 5}), 1);
    assertEquals(l.findDuplicateUsingBinarySearch(new int[] {10, 8, 7, 9, 4, 7, 7, 2, 7, 1, 3}), 7);
    assertEquals(l.findDuplicateUsingBinarySearch(new int[] {1, 3, 4, 2, 2}), 2);
  }

  @Test
  public void findDuplicateUsingCycleDetection() {
    LeetCode287 l = new LeetCode287();
    assertEquals(l.findDuplicateUsingCycleDetection(new int[] {1, 1}), 1);
    assertEquals(l.findDuplicateUsingCycleDetection(new int[] {1, 2, 3, 1, 4, 5}), 1);
    assertEquals(l.findDuplicateUsingCycleDetection(new int[] {10, 8, 7, 9, 4, 7, 7, 2, 7, 1, 3}),
        7);
    assertEquals(l.findDuplicateUsingCycleDetection(new int[] {1, 3, 4, 2, 2}), 2);
  }
}

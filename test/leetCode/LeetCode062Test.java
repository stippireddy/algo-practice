package leetCode;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class LeetCode062Test {

  @Test
  public void uniquePaths() {
    LeetCode062 l = new LeetCode062();
    assertEquals(l.uniquePaths(1, 2), 1);
    assertEquals(l.uniquePaths(10, 10), 48620);
    assertEquals(l.uniquePaths(20, 20), 985525432);
    assertEquals(l.uniquePaths(24, 23), 2136694232);
  }
}

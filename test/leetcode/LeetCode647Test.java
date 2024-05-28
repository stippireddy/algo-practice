package leetcode;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class LeetCode647Test {

  @Test
  public void countSubstringsBruteForce() {
    LeetCode647 l = new LeetCode647();
    assertEquals(l.countSubstringsBruteForce("abc"), 3);
    assertEquals(l.countSubstringsBruteForce("aaa"), 6);
    assertEquals(l.countSubstringsEfficient("aaaaa"), 15);
  }

  @Test
  public void countSubstringsEfficient() {
    LeetCode647 l = new LeetCode647();
    assertEquals(l.countSubstringsEfficient("abc"), 3);
    assertEquals(l.countSubstringsEfficient("aaa"), 6);
    assertEquals(l.countSubstringsEfficient("aaaaa"), 15);
  }
}

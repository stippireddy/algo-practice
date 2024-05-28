package leetcode;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class LeetCode205Test {

  @Test
  public void isIsomorphicUsingHashMap() {
    LeetCode205 l = new LeetCode205();
    assertTrue(l.isIsomorphicUsingHashMap("egg", "add"));
    assertFalse(l.isIsomorphicUsingHashMap("foo", "bar"));
    assertTrue(l.isIsomorphicUsingHashMap("egg", "add"));
    assertFalse(l.isIsomorphicUsingHashMap("ab", "aa"));
  }

  @Test
  public void isIsomorphicUsingArray() {
    LeetCode205 l = new LeetCode205();
    assertTrue(l.isIsomorphicUsingArray("egg", "add"));
    assertFalse(l.isIsomorphicUsingArray("foo", "bar"));
    assertTrue(l.isIsomorphicUsingArray("egg", "add"));
    assertFalse(l.isIsomorphicUsingArray("ab", "aa"));
  }
}

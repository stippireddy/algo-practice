package leetCode;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class LeetCode234Test {

  @Test
  public void isPalindrome() {
    LeetCode234 l = new LeetCode234();
    assertTrue(l.isPalindrome(ListUtils.createList(new int[] {1, 2, 3, 2, 1})));
    assertTrue(l.isPalindrome(ListUtils.createList(new int[] {1})));
    assertTrue(l.isPalindrome(ListUtils.createList(new int[] {})));
    assertTrue(l.isPalindrome(ListUtils.createList(new int[] {1, 2, 3, 4, 4, 3, 2, 1})));
    assertFalse(l.isPalindrome(ListUtils.createList(new int[] {1, 2, 3, 2, 1, 4})));
    assertFalse(l.isPalindrome(ListUtils.createList(new int[] {1, 2, 3})));
    assertFalse(l.isPalindrome(ListUtils.createList(new int[] {1, 2})));
  }
}

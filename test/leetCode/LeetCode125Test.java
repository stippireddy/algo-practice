package leetCode;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class LeetCode125Test {

  @Test
  public void isPalindrome() {
    LeetCode125 l = new LeetCode125();
    assertTrue(l.isPalindrome("A man, a plan, a canal: Panama"));
    assertTrue(l.isPalindrome("race e car"));
    assertTrue(l.isPalindrome("race 1,  2 :1e car"));
    assertFalse(l.isPalindrome("race a car"));
  }
}

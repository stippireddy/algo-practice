package leetCode;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LeetCode520Test {

  @Test
  public void detectCapitalUse() {
    LeetCode520 l = new LeetCode520();
    Assert.assertTrue(l.detectCapitalUse("USA"));
    Assert.assertTrue(l.detectCapitalUse("Google"));
    Assert.assertTrue(l.detectCapitalUse("leetcode"));
    Assert.assertTrue(l.detectCapitalUse("L"));
    Assert.assertTrue(l.detectCapitalUse("l"));
    Assert.assertFalse(l.detectCapitalUse("lA"));
    Assert.assertFalse(l.detectCapitalUse("leetCode"));
    Assert.assertFalse(l.detectCapitalUse("LEETCODe"));
    Assert.assertFalse(l.detectCapitalUse("FlaG"));
  }

  @Test
  public void detectCapitalUseEfficient() {
    LeetCode520 l = new LeetCode520();
    Assert.assertTrue(l.detectCapitalUseUsingCapitalCount("USA"));
    Assert.assertTrue(l.detectCapitalUseUsingCapitalCount("Google"));
    Assert.assertTrue(l.detectCapitalUseUsingCapitalCount("leetcode"));
    Assert.assertTrue(l.detectCapitalUseUsingCapitalCount("L"));
    Assert.assertTrue(l.detectCapitalUseUsingCapitalCount("l"));
    Assert.assertFalse(l.detectCapitalUseUsingCapitalCount("lA"));
    Assert.assertFalse(l.detectCapitalUseUsingCapitalCount("leetCode"));
    Assert.assertFalse(l.detectCapitalUseUsingCapitalCount("LEETCODe"));
    Assert.assertFalse(l.detectCapitalUseUsingCapitalCount("FlaG"));
  }

  @Test
  public void detectCapitalUseUsingStringMethods() {
    LeetCode520 l = new LeetCode520();
    Assert.assertTrue(l.detectCapitalUseUsingStringMethods("USA"));
    Assert.assertTrue(l.detectCapitalUseUsingStringMethods("Google"));
    Assert.assertTrue(l.detectCapitalUseUsingStringMethods("leetcode"));
    Assert.assertTrue(l.detectCapitalUseUsingStringMethods("L"));
    Assert.assertTrue(l.detectCapitalUseUsingStringMethods("l"));
    Assert.assertFalse(l.detectCapitalUseUsingStringMethods("lA"));
    Assert.assertFalse(l.detectCapitalUseUsingStringMethods("leetCode"));
    Assert.assertFalse(l.detectCapitalUseUsingStringMethods("LEETCODe"));
    Assert.assertFalse(l.detectCapitalUseUsingStringMethods("FlaG"));
  }
}

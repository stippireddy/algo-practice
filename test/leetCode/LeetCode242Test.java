package leetCode;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LeetCode242Test {

  @Test
  public void isAnagram() {
    LeetCode242 l = new LeetCode242();
    Assert.assertTrue(l.isAnagram("", ""));
    Assert.assertTrue(l.isAnagram("anagram", "nagaram"));
    Assert.assertTrue(l.isAnagram("facebook", "bookacef"));
    Assert.assertTrue(l.isAnagram("google", "elggoo"));
    Assert.assertFalse(l.isAnagram("rat", "car"));
    Assert.assertFalse(l.isAnagram("aaaa", "aa"));
  }
}

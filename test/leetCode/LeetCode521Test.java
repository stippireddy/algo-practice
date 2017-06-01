package leetCode;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LeetCode521Test {

  @Test
  public void findLUSlength() {
    LeetCode521 l = new LeetCode521();
    Assert.assertEquals(l.findLUSlength("abc", "abcd"), 4);
    Assert.assertEquals(l.findLUSlength("abc", "abc"), -1);
    Assert.assertEquals(l.findLUSlength("abc", ""), 3);
    Assert.assertEquals(l.findLUSlength("", ""), -1);
  }
}

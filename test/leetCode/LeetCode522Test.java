package leetCode;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LeetCode522Test {

  @Test
  public void findLUSlength() {
    LeetCode522 l = new LeetCode522();
    Assert.assertEquals(l.findLUSlength(new String[] {"abc", "abcd"}), 4);
    Assert.assertEquals(l.findLUSlength(new String[] {"abc", "abc"}), -1);
    Assert.assertEquals(l.findLUSlength(new String[] {"abc", ""}), 3);
    Assert.assertEquals(l.findLUSlength(new String[] {"", ""}), -1);
    Assert.assertEquals(l.findLUSlength(new String[] {"aba", "abade", "abad"}), 5);
    Assert.assertEquals(l.findLUSlength(new String[] {"aba", "aba", "abad"}), 4);
    Assert.assertEquals(l.findLUSlength(new String[] {"aba", "aba", "eae"}), 3);
    Assert.assertEquals(l.findLUSlength(new String[] {"aaa", "aaa", "aa"}), 3);
    
  }
}

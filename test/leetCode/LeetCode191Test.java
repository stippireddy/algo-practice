package leetCode;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LeetCode191Test {

  @Test
  public void hammingWeight() {
    LeetCode191 l = new LeetCode191();
    Assert.assertEquals(l.hammingWeight(Integer.MAX_VALUE + 1), 1);
    Assert.assertEquals(l.hammingWeight(Integer.MAX_VALUE + Integer.MAX_VALUE), 31);
    Assert.assertEquals(l.hammingWeight(Integer.MAX_VALUE + 2), 2);
    Assert.assertEquals(l.hammingWeight(4096), 1);
    Assert.assertEquals(l.hammingWeight(4095), 12);
  }
}
